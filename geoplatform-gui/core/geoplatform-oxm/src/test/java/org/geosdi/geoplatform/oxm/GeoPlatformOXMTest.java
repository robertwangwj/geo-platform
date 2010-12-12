/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-plartform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2010 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 * This program is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version. This program is distributed in the 
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR 
 * A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details. You should have received a copy of the GNU General 
 * Public License along with this program. If not, see http://www.gnu.org/licenses/ 
 *
 * ====================================================================
 *
 * Linking this library statically or dynamically with other modules is 
 * making a combined work based on this library. Thus, the terms and 
 * conditions of the GNU General Public License cover the whole combination. 
 * 
 * As a special exception, the copyright holders of this library give you permission 
 * to link this library with independent modules to produce an executable, regardless 
 * of the license terms of these independent modules, and to copy and distribute 
 * the resulting executable under terms of your choice, provided that you also meet, 
 * for each linked independent module, the terms and conditions of the license of 
 * that module. An independent module is a module which is not derived from or 
 * based on this library. If you modify this library, you may extend this exception 
 * to your version of the library, but you are not obligated to do so. If you do not 
 * wish to do so, delete this exception statement from your version. 
 *
 */
package org.geosdi.geoplatform.oxm;

import org.geosdi.geoplatform.mock.ClassToXMLMap;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 * @author giuseppe
 * 
 */
public class GeoPlatformOXMTest extends
		AbstractDependencyInjectionSpringContextTests {

	@Autowired
	private GeoPlatformMarshall castor;

	@Autowired
	private GeoPlatformMarshall jax;

	@Autowired
	private GeoPlatformMarshall xtream;

	private ClassToXMLMap message;

	@SuppressWarnings("deprecation")
	@Override
	protected void onSetUp() throws Exception {
		// TODO Auto-generated method stub
		message = new ClassToXMLMap();
		message.setData("I am data");
		message.setHistory("in the past");
		super.onSetUp();
	}

	@Test
	public void testCastor() throws Exception {
		String castorFile = "castor.xml";
		castor.saveXML(message, castorFile);
		assertNotNull(castor.loadXML(castorFile));
	}

	@Test
	public void testJaxB() throws Exception {
		String jaxbFile = "jaxb.xml";
		jax.saveXML(message, jaxbFile);
		assertNotNull(jax.loadXML(jaxbFile));
	}

	@Test
	public void testXStream() throws Exception {
		String xtreamFile = "xtream.xml";
		xtream.saveXML(message, xtreamFile);
		assertNotNull(xtream.loadXML(xtreamFile));
	}

	protected String[] getConfigLocations() {
		return new String[] { "classpath:org/geosdi/geoplatform/oxm/applicationContext.xml" };
	}

}
