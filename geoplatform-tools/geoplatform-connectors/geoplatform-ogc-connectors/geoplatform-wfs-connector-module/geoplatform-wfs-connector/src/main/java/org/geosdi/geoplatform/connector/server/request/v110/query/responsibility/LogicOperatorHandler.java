/**
 * geo-platform
 * Rich webgis framework
 * http://geo-platform.org
 * ====================================================================
 * <p>
 * Copyright (C) 2008-2017 geoSDI Group (CNR IMAA - Potenza - ITALY).
 * <p>
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details. You should have received a copy of the GNU General
 * Public License along with this program. If not, see http://www.gnu.org/licenses/
 * <p>
 * ====================================================================
 * <p>
 * Linking this library statically or dynamically with other modules is
 * making a combined work based on this library. Thus, the terms and
 * conditions of the GNU General Public License cover the whole combination.
 * <p>
 * As a special exception, the copyright holders of this library give you permission
 * to link this library with independent modules to produce an executable, regardless
 * of the license terms of these independent modules, and to copy and distribute
 * the resulting executable under terms of your choice, provided that you also meet,
 * for each linked independent module, the terms and conditions of the license of
 * that module. An independent module is a module which is not derived from or
 * based on this library. If you modify this library, you may extend this exception
 * to your version of the library, but you are not obligated to do so. If you do not
 * wish to do so, delete this exception statement from your version.
 */
package org.geosdi.geoplatform.connector.server.request.v110.query.responsibility;

import org.geosdi.geoplatform.connector.server.request.v110.query.repository.QueryRestrictionStrategy;
import org.geosdi.geoplatform.connector.wfs.response.QueryDTO;
import org.geosdi.geoplatform.connector.wfs.response.QueryRestrictionDTO;
import org.geosdi.geoplatform.gui.shared.wfs.OperatorType;
import org.geosdi.geoplatform.xml.filter.v110.FilterType;
import org.geosdi.geoplatform.xml.filter.v110.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public abstract class LogicOperatorHandler implements ILogicOperatorHandler {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    //
    protected static final ObjectFactory filterFactory = QueryRestrictionStrategy.filterFactory;
    private LogicOperatorHandler successor;

    /**
     * @param queryDTO
     * @param filter
     * @throws IllegalStateException
     */
    protected void forwardBuildLogicFilterOperator(QueryDTO queryDTO, FilterType filter) throws IllegalStateException {
        if (this.successor != null) {
            this.successor.buildLogicFilterOperator(queryDTO, filter);
        }
    }

    /**
     * @param theLogicOperator
     * @return {@link Boolean}
     */
    protected Boolean canBuildLogicOperator(String theLogicOperator) {
        return this.getOperatorValue().equalsIgnoreCase(theLogicOperator);
    }

    /**
     * @param queryRestrictionDTOs
     * @return {@link List<JAXBElement<?>>} list
     */
    protected List<JAXBElement<?>> buildJAXBElementList(List<QueryRestrictionDTO> queryRestrictionDTOs) {
        List<JAXBElement<?>> elements = new ArrayList<>(queryRestrictionDTOs.size());
        for (QueryRestrictionDTO queryRestrictionDTO : queryRestrictionDTOs) {
            OperatorType operatorType = queryRestrictionDTO.getOperator();
            if (operatorType != null) {
                QueryRestrictionStrategy<?> queryRestrictionStrategy = QUERY_RESTRICTION_REPOSITORY.getQueryRestrictionStrategy(
                        operatorType);
                if (queryRestrictionStrategy != null) {
                    elements.add(queryRestrictionStrategy.create(queryRestrictionDTO));
                } else {
                    logger.debug("###############{} doesn't found QueryRestrictionStrategy<?> " +
                            "for " + "OperatorType : {}\n", getFilterName(), operatorType);
                }
            }
        }
        return elements;
    }


    /**
     * @param filter
     * @param queryRestrictionDTOs
     */
    protected abstract void processQueryRestrictions(FilterType filter, List<QueryRestrictionDTO> queryRestrictionDTOs);

    /**
     * <p>We have three Operator type see {@link org.geosdi.geoplatform.gui.shared.wfs.LogicOperatorType}</p>
     *
     * @return the Operator
     */
    protected abstract String getOperatorValue();

    /**
     * @param successor
     */
    public void setSuccessor(LogicOperatorHandler successor) {
        this.successor = successor;
    }

    /**
     * @return {@link String}
     */
    @Override
    public String getFilterName() {
        return getClass().getSimpleName();
    }
}
