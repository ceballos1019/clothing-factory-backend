/**
 * 
 */
package com.ibm.clothingfactory.dao;

import java.util.List;

import com.ibm.clothingfactory.dto.ProductDTO;
import com.ibm.clothingfactory.exception.ClothingFactoryException;

/**
 * Interface para definir los metodos de acceso a la base de datos de los productos
 * IBM Global Business Services GBS Colombia
 * @author Andres Ceballos Sanchez - andres.ceballos@ibm.com
 * @since 22/04/2018
 * @version 1.0
 */
public interface IProductDAO {
	
	/**
	 * Entrega la lista de productos registrados en la base de datos
	 * @return lista de productos
	 * @throws ClothingFactoryException si ocurre un error
	 */
	public List<ProductDTO> getProducts() throws ClothingFactoryException;
}
