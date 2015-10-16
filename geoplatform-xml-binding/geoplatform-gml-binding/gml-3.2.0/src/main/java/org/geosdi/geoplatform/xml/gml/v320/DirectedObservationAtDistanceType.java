//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.06.18 alle 12:52:42 AM CEST 
//


package org.geosdi.geoplatform.xml.gml.v320;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom;
import org.jvnet.jaxb2_commons.lang.MergeStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Classe Java per DirectedObservationAtDistanceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DirectedObservationAtDistanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}DirectedObservationType">
 *       &lt;sequence>
 *         &lt;element name="distance" type="{http://www.opengis.net/gml}MeasureType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectedObservationAtDistanceType", propOrder = {
    "distance"
})
public class DirectedObservationAtDistanceType
    extends DirectedObservationType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected MeasureType distance;

    /**
     * Recupera il valore della proprietà distance.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDistance() {
        return distance;
    }

    /**
     * Imposta il valore della proprietà distance.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDistance(MeasureType value) {
        this.distance = value;
    }

    public boolean isSetDistance() {
        return (this.distance!= null);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            MeasureType theDistance;
            theDistance = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theDistance);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DirectedObservationAtDistanceType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DirectedObservationAtDistanceType that = ((DirectedObservationAtDistanceType) object);
        {
            MeasureType lhsDistance;
            lhsDistance = this.getDistance();
            MeasureType rhsDistance;
            rhsDistance = that.getDistance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distance", lhsDistance), LocatorUtils.property(thatLocator, "distance", rhsDistance), lhsDistance, rhsDistance)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            MeasureType theDistance;
            theDistance = this.getDistance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distance", theDistance), currentHashCode, theDistance);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof DirectedObservationAtDistanceType) {
            final DirectedObservationAtDistanceType copy = ((DirectedObservationAtDistanceType) draftCopy);
            if (this.isSetDistance()) {
                MeasureType sourceDistance;
                sourceDistance = this.getDistance();
                MeasureType copyDistance = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "distance", sourceDistance), sourceDistance));
                copy.setDistance(copyDistance);
            } else {
                copy.distance = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DirectedObservationAtDistanceType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof DirectedObservationAtDistanceType) {
            final DirectedObservationAtDistanceType target = this;
            final DirectedObservationAtDistanceType leftObject = ((DirectedObservationAtDistanceType) left);
            final DirectedObservationAtDistanceType rightObject = ((DirectedObservationAtDistanceType) right);
            {
                MeasureType lhsDistance;
                lhsDistance = leftObject.getDistance();
                MeasureType rhsDistance;
                rhsDistance = rightObject.getDistance();
                target.setDistance(((MeasureType) strategy.merge(LocatorUtils.property(leftLocator, "distance", lhsDistance), LocatorUtils.property(rightLocator, "distance", rhsDistance), lhsDistance, rhsDistance)));
            }
        }
    }

    public DirectedObservationAtDistanceType withDistance(MeasureType value) {
        setDistance(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withDirection(DirectionPropertyType value) {
        setDirection(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withValidTime(TimePrimitivePropertyType value) {
        setValidTime(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withUsing(ProcedurePropertyType value) {
        setUsing(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withTarget(JAXBElement<TargetPropertyType> value) {
        setTarget(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withResultOf(ResultType value) {
        setResultOf(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withBoundedBy(BoundingShapeType value) {
        setBoundedBy(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withLocation(JAXBElement<? extends LocationPropertyType> value) {
        setLocation(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withMetaDataProperty(MetaDataPropertyType... values) {
        if (values!= null) {
            for (MetaDataPropertyType value: values) {
                getMetaDataProperty().add(value);
            }
        }
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withMetaDataProperty(Collection<MetaDataPropertyType> values) {
        if (values!= null) {
            getMetaDataProperty().addAll(values);
        }
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withDescription(StringOrRefType value) {
        setDescription(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withDescriptionReference(ReferenceType value) {
        setDescriptionReference(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withIdentifier(CodeWithAuthorityType value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withName(CodeType... values) {
        if (values!= null) {
            for (CodeType value: values) {
                getName().add(value);
            }
        }
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withName(Collection<CodeType> values) {
        if (values!= null) {
            getName().addAll(values);
        }
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withMetaDataProperty(List<MetaDataPropertyType> value) {
        setMetaDataProperty(value);
        return this;
    }

    @Override
    public DirectedObservationAtDistanceType withName(List<CodeType> value) {
        setName(value);
        return this;
    }

}