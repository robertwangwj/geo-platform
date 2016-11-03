package org.geosdi.geoplatform.support.primitive.bridge.implementor.time;

import org.geosdi.geoplatform.support.primitive.bridge.implementor.GPPrimitiveImplementor;
import org.geosdi.geoplatform.support.primitive.operator.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public abstract class GPTimeImplementor<Time extends Object> extends GPPrimitiveImplementor<Time> {

    protected GPOperator.GPOperatorLoader operatorLoader;

    protected GPTimeImplementor(Class<Time> thePrimitiveClass) {
        super(thePrimitiveClass);
    }

    /**
     * @return {@link GPOperator.GPOperatorLoader}
     */
    @Override
    public GPOperator.GPOperatorLoader getOperatorLoader() {
        return this.operatorLoader = ((this.operatorLoader != null)
                ? this.operatorLoader : () -> Stream.of(new EqualToOperator(),
                new NotEqualToOperator(), new GreaterThanOperator(),
                new GreaterThanOrEqualToOperator(), new LessThanOperator(),
                new LessThanOrEqualToOperator()).collect(Collectors.toList()));
    }
}
