/**
 * 
 */
package com.ibm.clothingfactory.dao.impl;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.ibm.clothingfactory.dao.IOrderDAO;
import com.ibm.clothingfactory.dao.IProductDAO;
import com.ibm.clothingfactory.dto.ProductDTO;
import com.ibm.clothingfactory.exception.ClothingFactoryException;

/**
 * Implementacion de {@link IOrderDAO} IBM Global Business Services GBS Colombia
 * 
 * @author Andrés Ceballos Sánchez - andres.ceballos@ibm.com
 * @since 22/04/2018
 * @version 1.0
 */
@Stateless
@Local(IProductDAO.class)
@TransactionManagement(TransactionManagementType.BEAN)
public class ProductDAOImpl implements IProductDAO {

	private static final String PERSISTENCE_UNIT_NAME = "PU_CLOTHINGFACTORY";

	/* Entity Handler */
	@PersistenceContext(unitName = PERSISTENCE_UNIT_NAME)
	private EntityManager em;	

	/**
	 * Retorna la lista de productos de la base de datos
	 * @see com.ibm.clothingfactory.dao.IProductDAO#getProducts()
	 */
	@Override
	public List<ProductDTO> getProducts() throws ClothingFactoryException {
		List<ProductDTO> productsList = null;
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<ProductDTO> cq = cb.createQuery(ProductDTO.class);
			cq.from(ProductDTO.class);
			productsList = em.createQuery(cq).getResultList();
		} catch(Exception e) {
			throw new ClothingFactoryException("Error consultando en la base de datos", e);
		}
		
		return productsList;
	}

}
