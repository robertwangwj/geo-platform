//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.17 at 04:41:23 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20060504.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.AbstractObjectType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for DQ_Scope_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DQ_Scope_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="level" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType"/>
 *         &lt;element name="extent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" minOccurs="0"/>
 *         &lt;element name="levelDescription" type="{http://www.isotc211.org/2005/gmd}MD_ScopeDescription_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_Scope_Type", propOrder = {
    "level",
    "extent",
    "levelDescription"
})
public class DQScopeType
    extends AbstractObjectType
    implements ToString
{

    @XmlElement(required = true)
    protected MDScopeCodePropertyType level;
    protected EXExtentPropertyType extent;
    protected List<MDScopeDescriptionPropertyType> levelDescription;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link MDScopeCodePropertyType }
     *     
     */
    public MDScopeCodePropertyType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDScopeCodePropertyType }
     *     
     */
    public void setLevel(MDScopeCodePropertyType value) {
        this.level = value;
    }

    public boolean isSetLevel() {
        return (this.level!= null);
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link EXExtentPropertyType }
     *     
     */
    public EXExtentPropertyType getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXExtentPropertyType }
     *     
     */
    public void setExtent(EXExtentPropertyType value) {
        this.extent = value;
    }

    public boolean isSetExtent() {
        return (this.extent!= null);
    }

    /**
     * Gets the value of the levelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeDescriptionPropertyType }
     * 
     * 
     */
    public List<MDScopeDescriptionPropertyType> getLevelDescription() {
        if (levelDescription == null) {
            levelDescription = new ArrayList<MDScopeDescriptionPropertyType>();
        }
        return this.levelDescription;
    }

    public boolean isSetLevelDescription() {
        return ((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()));
    }

    public void unsetLevelDescription() {
        this.levelDescription = null;
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
            MDScopeCodePropertyType theLevel;
            theLevel = this.getLevel();
            strategy.appendField(locator, this, "level", buffer, theLevel);
        }
        {
            EXExtentPropertyType theExtent;
            theExtent = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theExtent);
        }
        {
            List<MDScopeDescriptionPropertyType> theLevelDescription;
            theLevelDescription = (this.isSetLevelDescription()?this.getLevelDescription():null);
            strategy.appendField(locator, this, "levelDescription", buffer, theLevelDescription);
        }
        return buffer;
    }

    public void setLevelDescription(List<MDScopeDescriptionPropertyType> value) {
        this.levelDescription = null;
        List<MDScopeDescriptionPropertyType> draftl = this.getLevelDescription();
        draftl.addAll(value);
    }

}