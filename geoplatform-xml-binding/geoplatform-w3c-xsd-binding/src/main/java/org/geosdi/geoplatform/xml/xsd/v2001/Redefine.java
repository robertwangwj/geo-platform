//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.02 at 06:49:13 PM CET 
//
package org.geosdi.geoplatform.xml.xsd.v2001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}openAttrs">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.w3.org/2001/XMLSchema}annotation"/>
 *         &lt;group ref="{http://www.w3.org/2001/XMLSchema}redefinable"/>
 *       &lt;/choice>
 *       &lt;attribute name="schemaLocation" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "annotationOrSimpleTypeOrComplexType"
})
@XmlRootElement(name = "redefine")
public class Redefine
        extends OpenAttrs
        implements ToString {

    @XmlElements({
        @XmlElement(name = "annotation", type = Annotation.class),
        @XmlElement(name = "simpleType", type = TopLevelSimpleType.class),
        @XmlElement(name = "complexType", type = TopLevelComplexType.class),
        @XmlElement(name = "group", type = NamedGroup.class),
        @XmlElement(name = "attributeGroup", type = NamedAttributeGroup.class)
    })
    protected List<OpenAttrs> annotationOrSimpleTypeOrComplexType;
    @XmlAttribute(name = "schemaLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String schemaLocation;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the annotationOrSimpleTypeOrComplexType property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the annotationOrSimpleTypeOrComplexType
     * property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationOrSimpleTypeOrComplexType().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list      {@link Annotation }
     * {@link TopLevelSimpleType }
     * {@link TopLevelComplexType }
     * {@link NamedGroup }
     * {@link NamedAttributeGroup }
     *
     *
     */
    public List<OpenAttrs> getAnnotationOrSimpleTypeOrComplexType() {
        if (annotationOrSimpleTypeOrComplexType == null) {
            annotationOrSimpleTypeOrComplexType = new ArrayList<OpenAttrs>();
        }
        return this.annotationOrSimpleTypeOrComplexType;
    }

    public boolean isSetAnnotationOrSimpleTypeOrComplexType() {
        return ((this.annotationOrSimpleTypeOrComplexType != null) && (!this.annotationOrSimpleTypeOrComplexType.isEmpty()));
    }

    public void unsetAnnotationOrSimpleTypeOrComplexType() {
        this.annotationOrSimpleTypeOrComplexType = null;
    }

    /**
     * Gets the value of the schemaLocation property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSchemaLocation() {
        return schemaLocation;
    }

    /**
     * Sets the value of the schemaLocation property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSchemaLocation(String value) {
        this.schemaLocation = value;
    }

    public boolean isSetSchemaLocation() {
        return (this.schemaLocation != null);
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id != null);
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
            List<OpenAttrs> theAnnotationOrSimpleTypeOrComplexType;
            theAnnotationOrSimpleTypeOrComplexType = (this.isSetAnnotationOrSimpleTypeOrComplexType() ? this.getAnnotationOrSimpleTypeOrComplexType() : null);
            strategy.appendField(locator, this, "annotationOrSimpleTypeOrComplexType", buffer, theAnnotationOrSimpleTypeOrComplexType);
        }
        {
            String theSchemaLocation;
            theSchemaLocation = this.getSchemaLocation();
            strategy.appendField(locator, this, "schemaLocation", buffer, theSchemaLocation);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        return buffer;
    }

    public void setAnnotationOrSimpleTypeOrComplexType(List<OpenAttrs> value) {
        this.annotationOrSimpleTypeOrComplexType = null;
        List<OpenAttrs> draftl = this.getAnnotationOrSimpleTypeOrComplexType();
        draftl.addAll(value);
    }
}
