/**
 * 
 */
package com.ibm.clothingfactory.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entidad que referencia los productos por pedido
 * IBM - Global Business Services Colombia
 * @author Andres Ceballos Sanchez - andres.ceballos@ibm.com
 * @since 22/04/2018
 * @version 1.0
 */
@Entity
@Table(name = "PRODUCTOXPEDIDO")
public class ProductByOrder implements Serializable {	
	
	/** serialVersionUID **/
	private static final long serialVersionUID = 3104526694594369886L;

	/** Id de la tabla **/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	/** Id del pedido **/
	@ManyToOne
	@JoinColumn(name = "ID")
	private Order order;
	
	/** Id del producto **/
	@ManyToOne
	@JoinColumn(name = "ID")
	private Product product;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
}
