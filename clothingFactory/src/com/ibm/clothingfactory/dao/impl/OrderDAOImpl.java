/**
 * 
 */
package com.ibm.clothingfactory.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Status;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import com.ibm.clothingfactory.dao.IOrderDAO;
import com.ibm.clothingfactory.dto.OrderDTO;
import com.ibm.clothingfactory.entity.Order;
import com.ibm.clothingfactory.exception.ClothingFactoryException;

/**
 * Implementacion de {@link IOrderDAO}
 * IBM Global Business Services GBS Colombia
 * @author Andrés Ceballos Sánchez - andres.ceballos@ibm.com
 * @since 22/04/2018
 * @version 1.0
 */
@Stateless
@Local(IOrderDAO.class)
@TransactionManagement(TransactionManagementType.BEAN)
public class OrderDAOImpl implements IOrderDAO {
	
	private static final String PERSISTENCE_UNIT_NAME = "PU_CLOTHINGFACTORY";
	
	/*Entity Handler*/
	@PersistenceContext(unitName = PERSISTENCE_UNIT_NAME)
	private EntityManager em;
	
	/*Transaction Handler*/
	@Resource
	private UserTransaction userTransaction = null;
	
	
	/**
	 * Registra en base de datos un pedido
	 * @see com.ibm.clothingfactory.dao.IOrderDAO#addOrder(OrderDTO)
	 */
	@Override
	public void addOrder(OrderDTO orderDTO) throws ClothingFactoryException {
		try {
			/*Populate the entity*/
			Order order = new Order();			
			order.setName(orderDTO.getName());
			order.setDocumentType(orderDTO.getDocType());
			order.setDocumentNumber(String.valueOf(orderDTO.getDocNumber()));
			
			/*Format the order date*/
			SimpleDateFormat format = new SimpleDateFormat("DD-MM-YY HH:mm:ss");
			Date orderDate = format.parse(orderDTO.getDate());
			order.setDate(orderDate);
			
			order.setAddress(orderDTO.getAddress());
			order.setTotalQuantity(orderDTO.getQuantity());			
			order.setTotalValue(orderDTO.getTotalValue());
			
			/*Transaction*/
			userTransaction.begin();
			em.persist(order);
			userTransaction.commit();
		} catch(Exception e) {
			try {
				/* Rollback the transaction if something fails*/
				if(userTransaction.getStatus() == Status.STATUS_ACTIVE) {
					userTransaction.rollback();
				}
			} catch(SystemException e1) {
				throw new ClothingFactoryException(e1);
			}
			throw new ClothingFactoryException("Error registrando en base de datos", e);
		}
	}

}
