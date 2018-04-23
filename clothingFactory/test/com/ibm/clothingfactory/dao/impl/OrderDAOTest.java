/**
 * 
 */
package com.ibm.clothingfactory.dao.impl;

import static org.junit.Assert.fail;

import javax.inject.Inject;

import org.junit.Test;

import com.ibm.clothingfactory.dao.IOrderDAO;
import com.ibm.clothingfactory.dto.OrderDTO;
import com.ibm.clothingfactory.exception.ClothingFactoryException;

/**
 * @author andressanchez
 *
 */
public class OrderDAOTest {
	
	
	private IOrderDAO orderDAO;	

	/**
	 * Test method for {@link com.ibm.clothingfactory.dao.impl.OrderDAOImpl#addOrder(com.ibm.clothingfactory.dto.OrderDTO)}.
	 */
	@Test	
	public void testAddOrder() {
		OrderDTO order = null;
		orderDAO = new OrderDAOImpl();
		try {
			/*Crear pedido y settear los atributos*/
			order = new OrderDTO();
			order.setName("TestName");
			order.setDocType("CC");
			order.setDocNumber(1023313);
			order.setDate("12-02-2018");
			order.setAddress("Calle X");
			order.setQuantity(2);
			order.setTotalValue(120000d);
			
			orderDAO.addOrder(order);
		} catch(ClothingFactoryException e) {			
			fail(e.getMessage());
		}
	}

}
