/**
 * 
 */
package com.ibm.clothingfactory.dao;

import com.ibm.clothingfactory.dto.OrderDTO;
import com.ibm.clothingfactory.exception.ClothingFactoryException;

/**
 * Interface para definir los metodos de acceso a la base de datos de los pedidos
 * IBM Global Business Services GBS Colombia
 * @author Andres Ceballos Sanchez - andres.ceballos@ibm.com
 * @since 22/04/2018
 * @version 1.0
 */
public interface IOrderDAO {
	
	/**
	 * Registra un pedido en la base de datos
	 * @param orderDTO - DTO con la informacion del pedido
	 * @throws ClothingFactoryException si ocurre un error
	 */
	public void addOrder(OrderDTO orderDTO) throws ClothingFactoryException;
}
