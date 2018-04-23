/**
 * 
 */
package com.ibm.clothingfactory.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ibm.clothingfactory.dao.IProductDAO;
import com.ibm.clothingfactory.dto.ProductDTO;
import com.ibm.clothingfactory.exception.ClothingFactoryException;

/**
 * Clase para probar los metodos creados en el OrderDAO
 * @author Andres Ceballos Sanchez - andres.ceballos@ibm.com
 * @version 1.0
 */
public class ProductDAOTest {
	
	private IProductDAO productDAO;

	/**
	 * Test method for {@link com.ibm.clothingfactory.dao.impl.ProductDAOImpl#getProducts()}.
	 */
	@Test
	public void testGetProducts() {
		List<ProductDTO> products = null;
		productDAO = new ProductDAOImpl();
		try {
			products = productDAO.getProducts();
			assertTrue(products.size() > 0);
		} catch(ClothingFactoryException e) {
			fail(e.getMessage());
		}
	}

}
