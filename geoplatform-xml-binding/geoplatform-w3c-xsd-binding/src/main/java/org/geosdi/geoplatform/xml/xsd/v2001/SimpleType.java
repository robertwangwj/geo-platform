//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.02 at 06:49:13 PM CET 
//
package org.geosdi.geoplatform.xml.xsd.v2001;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 * <p>Java class for simpleType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="simpleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated">
 *       &lt;group ref="{http://www.w3.org/2001/XMLSchema}simpleDerivation"/>
 *       &lt;attribute name="final" type="{http://www.w3.org/2001/XMLSchema}simpleDerivationSet" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleType", propOrder = {
    "restriction",
    "list",
    "union"
})
@XmlSeeAlso({
    TopLevelSimpleType.class,
    LocalSimpleType.class
})
public abstract class SimpleType
        extends Annotated
        implements ToString {

    protected Restriction restriction;
    protected org.geosdi.geoplatform.xml.xsd.v2001.List list;
    protected Union union;
    @XmlAttribute(name = "final")
    @XmlSchemaType(name = "simpleDerivationSet")
    protected java.util.List<String> _final;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    /**
     * Gets the value of the restriction property.
     *
     * @return possible object is {@link Restriction }
     *
     */
    public Restriction getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     *
     * @param value allowed object is {@link Restriction }
     *
     */
    public void setRestriction(Restriction value) {
        this.restriction = value;
    }

    public boolean isSetRestriction() {
        return (this.restriction != null);
    }

    /**
     * Gets the value of the list property.
     *
     * @return possible object is
     *     {@link org.geosdi.geoplatform.xml.xsd.v2001.List }
     *
     */
    public org.geosdi.geoplatform.xml.xsd.v2001.List getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     *
     * @param value allowed object is
     *     {@link org.geosdi.geoplatform.xml.xsd.v2001.List }
     *
     */
    public void setList(org.geosdi.geoplatform.xml.xsd.v2001.List value) {
        this.list = value;
    }

    public boolean isSetList() {
        return (this.list != null);
    }

    /**
     * Gets the value of the union property.
     *
     * @return possible object is {@link Union }
     *
     */
    public Union getUnion() {
        return union;
    }

    /**
     * Sets the value of the union property.
     *
     * @param value allowed object is {@link Union }
     *
     */
    public void setUnion(Union value) {
        this.union = value;
    }

    public boolean isSetUnion() {
        return (this.union != null);
    }

    /**
     * Gets the value of the final property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the final property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getFinal().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public java.util.List<String> getFinal() {
        if (_final == null) {
            _final = new ArrayList<String>();
        }
        return this._final;
    }

    public boolean isSetFinal() {
        return ((this._final != null) && (!this._final.isEmpty()));
    }

    public void unsetFinal() {
        this._final = null;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name != null);
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
            Restriction theRestriction;
            theRestriction = this.getRestriction();
            strategy.appendField(locator, this, "restriction", buffer, theRestriction);
        }
        {
            org.geosdi.geoplatform.xml.xsd.v2001.List theList;
            theList = this.getList();
            strategy.appendField(locator, this, "list", buffer, theList);
        }
        {
            Union theUnion;
            theUnion = this.getUnion();
            strategy.appendField(locator, this, "union", buffer, theUnion);
        }
        {
            java.util.List<String> theFinal;
            theFinal = (this.isSetFinal() ? this.getFinal() : null);
            strategy.appendField(locator, this, "_final", buffer, theFinal);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        return buffer;
    }

    public void setFinal(java.util.List<String> value) {
        this._final = null;
        java.util.List<String> draftl = this.getFinal();
        draftl.addAll(value);
    }
}
