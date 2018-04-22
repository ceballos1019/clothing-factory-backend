/**
 * 
 */
package com.ibm.clothingfactory.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * Entidad que representa un producto dentro de un pedido
 * IBM - Global Business Services Colombia
 * @author Andres Ceballos Sanchez - andres.ceballos@ibm.com
 * @since 22/04/2018
 * @version 1.0
 */
@Entity
@Table(name = "PRODUCTO")
public class Product implements Serializable {

	/** serialVersionUID **/
	private static final long serialVersionUID = 6904257646182723930L;
	
	/** Id del producto **/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	/** Tipo de producto: Camisa formal, Pantalon formal o Chaqueta **/
	@Column(name = "TIPOPRODUCTO")
	@Size(max = 40)
	private String productType;
	
	/** Precio del producto **/
	@Column(name = "PRECIO")	
	private Double price;
	
	/** Cantidad del producto dentro del pedido **/
	@Column(name = "CANTIDAD")	
	private Integer quantity;
	
	@OneToMany(mappedBy = "product")
	private List<ProductByOrder> productsByOrder;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the productsByOrder
	 */
	public List<ProductByOrder> getProductsByOrder() {
		return productsByOrder;
	}

	/**
	 * @param productsByOrder the productsByOrder to set
	 */
	public void setProductsByOrder(List<ProductByOrder> productsByOrder) {
		this.productsByOrder = productsByOrder;
	}
}
