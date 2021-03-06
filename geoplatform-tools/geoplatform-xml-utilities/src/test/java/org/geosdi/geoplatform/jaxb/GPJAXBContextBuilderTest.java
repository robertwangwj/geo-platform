package org.geosdi.geoplatform.jaxb;

import com.google.common.base.Preconditions;
import org.geosdi.geoplatform.jaxb.function.AttributeFunction;
import org.geosdi.geoplatform.jaxb.function.CarPartFunction;
import org.geosdi.geoplatform.jaxb.model.Attribute;
import org.geosdi.geoplatform.jaxb.model.AttributeStore;
import org.geosdi.geoplatform.jaxb.model.Car;
import org.geosdi.geoplatform.jaxb.model.CarPart;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GPJAXBContextBuilderTest {

    private static final Logger logger = LoggerFactory.getLogger(GPJAXBContextBuilderTest.class);
    //
    private static final IGPJAXBContextBuilder GP_JAXB_CONTEXT_BUILDER = GPJAXBContextBuilder.newInstance();

    @Test
    public void a_writeCarAsStringTest() throws Exception {
        Car car = new Car();
        car.setModel("AUDI A4");
        car.setPlat("yht6656");
        car.setCarParts(createCarParts(25));
        StringWriter writer = new StringWriter();
        GP_JAXB_CONTEXT_BUILDER.marshal(car, writer);
        logger.info("###########################MARSHALL_CAR_AS_STRING : \n{}\n", writer.toString());
    }

    @Test
    public void b_writeCarAsFileTest() throws Exception {
        Car car = new Car();
        car.setModel("MERCEDES BENZ");
        car.setPlat("yht6656");
        car.setCarParts(createCarParts(50));
        GP_JAXB_CONTEXT_BUILDER.marshal(car, new File("./target/Car.xml"));
    }

    @Test
    public void c_readCarFromFileTest() throws Exception {
        logger.info("###########################UNMARSHALL_CAR_FROM_FILE : {}\n", GP_JAXB_CONTEXT_BUILDER
                .unmarshal(new File("./src/test/resources/Car.xml"), Car.class));
    }

    @Test
    public void d_readCarFromStringTest() throws Exception {
        logger.info("@@@@@@@@@@@@@@@@@@@@@@@@UNMARSHALL_CAR_FROM_STRING : {}\n", GP_JAXB_CONTEXT_BUILDER
                .unmarshal(new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                        "<Car>\n" +
                        "    <plat>yht6656</plat>\n" +
                        "    <model>FIAT PUNTO</model>\n" +
                        "    <carParts>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_0</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_1</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_2</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_3</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_4</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_5</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_6</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_7</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_8</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_9</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_10</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_11</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_12</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_13</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_14</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_15</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_16</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_17</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_18</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_19</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_20</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_21</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_22</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_23</partName>\n" +
                        "        </carPart>\n" +
                        "        <carPart>\n" +
                        "            <partName>PART_NAME_TEST_24</partName>\n" +
                        "        </carPart>\n" +
                        "    </carParts>\n" +
                        "</Car>"), Car.class));
    }

    @Test
    public void e_writeAttributeStoreAsStringTest() throws Exception {
        AttributeStore attributeStore = new AttributeStore();
        attributeStore.setAttributes(createAttributes(25));
        StringWriter writer = new StringWriter();
        GP_JAXB_CONTEXT_BUILDER.marshal(attributeStore, writer);
        logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@MARSHALL_ATTRIBUTE_STORE_AS_STRING : \n{}\n", writer.toString());
    }

    @Test
    public void f_writeAttributeStoreAsFileTest() throws Exception {
        AttributeStore attributeStore = new AttributeStore();
        attributeStore.setAttributes(createAttributes(50));
        GP_JAXB_CONTEXT_BUILDER.marshal(attributeStore, new File("./target/AttributeStore.xml"));
    }

    @Test
    public void g_readAttributeStoreFromFileTest() throws Exception {
        logger.info("#######################UNMARSHALL_ATTRIBUTE_STORE_FROM_FILE : {}\n",
                GP_JAXB_CONTEXT_BUILDER.unmarshal(new File("./src/test/resources/AttributeStore.xml"),
                        AttributeStore.class));
    }

    @Test
    public void h_readAttributeStoreFromStringTest() throws Exception {
        logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@UNMARSHALL_ATTRIBUTE_STORE_FROM_STRING : {}\n",
                GP_JAXB_CONTEXT_BUILDER.unmarshal(new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                        "<AttributeStore>\n" +
                        "    <attributes>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_0</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_0</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_1</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_1</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_2</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_2</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_3</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_3</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_4</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_4</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_5</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_5</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_6</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_6</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_7</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_7</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_8</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_8</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_9</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_9</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_10</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_10</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_11</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_11</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_12</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_12</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_13</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_13</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_14</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_14</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_15</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_15</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_16</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_16</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_17</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_17</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_18</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_18</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_19</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_19</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_20</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_20</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_21</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_21</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_22</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_22</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_23</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_23</type>\n" +
                        "        </attribute>\n" +
                        "        <attribute>\n" +
                        "            <name>ATTRIBUTE_NAME_TEST_24</name>\n" +
                        "            <type>ATTRIBUTE_TYPE_TEST_24</type>\n" +
                        "        </attribute>\n" +
                        "    </attributes>\n" +
                        "</AttributeStore>"), AttributeStore.class));
    }

    @Test
    public void i_simpleDurationTest() throws Exception {
        logger.info("{}\n", TimeUnit.MILLISECONDS.toMinutes(100L * 60L * 20L));
    }

    /**
     * @param number
     * @return {@link List<CarPart>}
     * @throws Exception
     */
    public static List<CarPart> createCarParts(int number) throws Exception {
        Preconditions.checkArgument((number > 0), "The Number of CarParts must " +
                "be greather than 0.");
        return IntStream.iterate(0, n -> n + 1)
                .limit(number)
                .boxed()
                .map(new CarPartFunction())
                .collect(Collectors.toList());
    }

    /**
     * @param number
     * @return {@link List<Attribute>}
     * @throws Exception
     */
    public static List<Attribute> createAttributes(int number) throws Exception {
        Preconditions.checkArgument((number > 0), "The Number of Attributes must " +
                "be greather than 0.");
        return IntStream.iterate(0, n -> n + 1)
                .limit(number)
                .boxed()
                .map(new AttributeFunction())
                .collect(Collectors.toList());
    }
}
