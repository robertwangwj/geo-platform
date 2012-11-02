//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.02 at 06:49:13 PM CET 
//
package org.geosdi.geoplatform.xml.xsd.v2001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 * <p>Java class for restrictionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="restrictionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;group ref="{http://www.w3.org/2001/XMLSchema}typeDefParticle"/>
 *           &lt;group ref="{http://www.w3.org/2001/XMLSchema}simpleRestrictionModel"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.w3.org/2001/XMLSchema}attrDecls"/>
 *       &lt;/sequence>
 *       &lt;attribute name="base" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restrictionType", propOrder = {
    "group",
    "all",
    "choice",
    "sequence",
    "simpleType",
    "facets",
    "attributeOrAttributeGroup",
    "anyAttribute"
})
@XmlSeeAlso({
    ComplexRestrictionType.class,
    SimpleRestrictionType.class
})
public class RestrictionType
        extends Annotated
        implements ToString {

    protected GroupRef group;
    protected All all;
    protected ExplicitGroup choice;
    protected ExplicitGroup sequence;
    protected LocalSimpleType simpleType;
    @XmlElementRefs({
        @XmlElementRef(name = "whiteSpace", namespace = "http://www.w3.org/2001/XMLSchema", type = WhiteSpace.class),
        @XmlElementRef(name = "totalDigits", namespace = "http://www.w3.org/2001/XMLSchema", type = TotalDigits.class),
        @XmlElementRef(name = "enumeration", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class),
        @XmlElementRef(name = "minInclusive", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class),
        @XmlElementRef(name = "fractionDigits", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class),
        @XmlElementRef(name = "maxInclusive", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class),
        @XmlElementRef(name = "length", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class),
        @XmlElementRef(name = "maxLength", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class),
        @XmlElementRef(name = "minLength", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class),
        @XmlElementRef(name = "minExclusive", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class),
        @XmlElementRef(name = "pattern", namespace = "http://www.w3.org/2001/XMLSchema", type = Pattern.class),
        @XmlElementRef(name = "maxExclusive", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class)
    })
    protected List<Object> facets;
    @XmlElements({
        @XmlElement(name = "attribute", type = Attribute.class),
        @XmlElement(name = "attributeGroup", type = AttributeGroupRef.class)
    })
    protected List<Annotated> attributeOrAttributeGroup;
    protected Wildcard anyAttribute;
    @XmlAttribute(name = "base", required = true)
    protected QName base;

    /**
     * Gets the value of the group property.
     *
     * @return possible object is {@link GroupRef }
     *
     */
    public GroupRef getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     *
     * @param value allowed object is {@link GroupRef }
     *
     */
    public void setGroup(GroupRef value) {
        this.group = value;
    }

    public boolean isSetGroup() {
        return (this.group != null);
    }

    /**
     * Gets the value of the all property.
     *
     * @return possible object is {@link All }
     *
     */
    public All getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     *
     * @param value allowed object is {@link All }
     *
     */
    public void setAll(All value) {
        this.all = value;
    }

    public boolean isSetAll() {
        return (this.all != null);
    }

    /**
     * Gets the value of the choice property.
     *
     * @return possible object is {@link ExplicitGroup }
     *
     */
    public ExplicitGroup getChoice() {
        return choice;
    }

    /**
     * Sets the value of the choice property.
     *
     * @param value allowed object is {@link ExplicitGroup }
     *
     */
    public void setChoice(ExplicitGroup value) {
        this.choice = value;
    }

    public boolean isSetChoice() {
        return (this.choice != null);
    }

    /**
     * Gets the value of the sequence property.
     *
     * @return possible object is {@link ExplicitGroup }
     *
     */
    public ExplicitGroup getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     *
     * @param value allowed object is {@link ExplicitGroup }
     *
     */
    public void setSequence(ExplicitGroup value) {
        this.sequence = value;
    }

    public boolean isSetSequence() {
        return (this.sequence != null);
    }

    /**
     * Gets the value of the simpleType property.
     *
     * @return possible object is {@link LocalSimpleType }
     *
     */
    public LocalSimpleType getSimpleType() {
        return simpleType;
    }

    /**
     * Sets the value of the simpleType property.
     *
     * @param value allowed object is {@link LocalSimpleType }
     *
     */
    public void setSimpleType(LocalSimpleType value) {
        this.simpleType = value;
    }

    public boolean isSetSimpleType() {
        return (this.simpleType != null);
    }

    /**
     * Gets the value of the facets property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the facets property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getFacets().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list      {@link WhiteSpace }
     * {@link TotalDigits }
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * {@link JAXBElement }{@code <}{@link NoFixedFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * {@link Pattern }
     *
     *
     */
    public List<Object> getFacets() {
        if (facets == null) {
            facets = new ArrayList<Object>();
        }
        return this.facets;
    }

    public boolean isSetFacets() {
        return ((this.facets != null) && (!this.facets.isEmpty()));
    }

    public void unsetFacets() {
        this.facets = null;
    }

    /**
     * Gets the value of the attributeOrAttributeGroup property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the attributeOrAttributeGroup property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeOrAttributeGroup().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list      {@link Attribute }
     * {@link AttributeGroupRef }
     *
     *
     */
    public List<Annotated> getAttributeOrAttributeGroup() {
        if (attributeOrAttributeGroup == null) {
            attributeOrAttributeGroup = new ArrayList<Annotated>();
        }
        return this.attributeOrAttributeGroup;
    }

    public boolean isSetAttributeOrAttributeGroup() {
        return ((this.attributeOrAttributeGroup != null) && (!this.attributeOrAttributeGroup.isEmpty()));
    }

    public void unsetAttributeOrAttributeGroup() {
        this.attributeOrAttributeGroup = null;
    }

    /**
     * Gets the value of the anyAttribute property.
     *
     * @return possible object is {@link Wildcard }
     *
     */
    public Wildcard getAnyAttribute() {
        return anyAttribute;
    }

    /**
     * Sets the value of the anyAttribute property.
     *
     * @param value allowed object is {@link Wildcard }
     *
     */
    public void setAnyAttribute(Wildcard value) {
        this.anyAttribute = value;
    }

    public boolean isSetAnyAttribute() {
        return (this.anyAttribute != null);
    }

    /**
     * Gets the value of the base property.
     *
     * @return possible object is {@link QName }
     *
     */
    public QName getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     *
     * @param value allowed object is {@link QName }
     *
     */
    public void setBase(QName value) {
        this.base = value;
    }

    public boolean isSetBase() {
        return (this.base != null);
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
            GroupRef theGroup;
            theGroup = this.getGroup();
            strategy.appendField(locator, this, "group", buffer, theGroup);
        }
        {
            All theAll;
            theAll = this.getAll();
            strategy.appendField(locator, this, "all", buffer, theAll);
        }
        {
            ExplicitGroup theChoice;
            theChoice = this.getChoice();
            strategy.appendField(locator, this, "choice", buffer, theChoice);
        }
        {
            ExplicitGroup theSequence;
            theSequence = this.getSequence();
            strategy.appendField(locator, this, "sequence", buffer, theSequence);
        }
        {
            LocalSimpleType theSimpleType;
            theSimpleType = this.getSimpleType();
            strategy.appendField(locator, this, "simpleType", buffer, theSimpleType);
        }
        {
            List<Object> theFacets;
            theFacets = (this.isSetFacets() ? this.getFacets() : null);
            strategy.appendField(locator, this, "facets", buffer, theFacets);
        }
        {
            List<Annotated> theAttributeOrAttributeGroup;
            theAttributeOrAttributeGroup = (this.isSetAttributeOrAttributeGroup() ? this.getAttributeOrAttributeGroup() : null);
            strategy.appendField(locator, this, "attributeOrAttributeGroup", buffer, theAttributeOrAttributeGroup);
        }
        {
            Wildcard theAnyAttribute;
            theAnyAttribute = this.getAnyAttribute();
            strategy.appendField(locator, this, "anyAttribute", buffer, theAnyAttribute);
        }
        {
            QName theBase;
            theBase = this.getBase();
            strategy.appendField(locator, this, "base", buffer, theBase);
        }
        return buffer;
    }

    public void setFacets(List<Object> value) {
        this.facets = null;
        List<Object> draftl = this.getFacets();
        draftl.addAll(value);
    }

    public void setAttributeOrAttributeGroup(List<Annotated> value) {
        this.attributeOrAttributeGroup = null;
        List<Annotated> draftl = this.getAttributeOrAttributeGroup();
        draftl.addAll(value);
    }
}
