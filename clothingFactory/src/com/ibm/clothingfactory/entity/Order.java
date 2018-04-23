/**
 * 
 */
package com.ibm.clothingfactory.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 * Entidad que representa un pedido
 * IBM - Global Business Services Colombia
 * @author Andres Ceballos Sanchez - andres.ceballos@ibm.com
 * @since 22/04/2018
 * @version 1.0
 */
@Entity
@Table(name = "PEDIDO")
public class Order implements Serializable {

	/** serialVersionUID**/
	private static final long serialVersionUID = 954530965737661676L;
	
	/** Id del pedido **/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	/** Nombre de la persona que hace el pedido **/
	@Column(name = "NOMBRE")
	@Size(max = 40)
	private String name;
	
	/** Tipo de identificacion de la persona que hace el pedido **/
	@Column(name = "TIPOIDENTIFICACION")
	@Size(max = 25)
	private String documentType;
	
	/** Numero de identificacion de la persona que hace el pedido **/
	@Column(name = "NUMEROIDENTIFICACION")
	@Size(max = 16)
	private String documentNumber;
	
	/** Fecha de entrega del pedido **/
	@Column(name = "FECHAPEDIDO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	/** Direccion de entrega del pedido **/
	@Column(name = "DIRECCION")
	@Size(max = 60)
	private String address;
	
	/** Cantidad total de productos **/
	@Column(name = "CANTIDADTOTAL")
	private Integer totalQuantity;
	
	/** Detalle de los productos del pedido **/
	@OneToMany(mappedBy = "order")
	private List<ProductByOrder> detail;
	
	/** Valor total del pedido **/
	@Column(name = "VALORTOTAL")
	private Double totalValue;
	
	/** Getters & Setters **/

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the documentType
	 */
	public String getDocumentType() {
		return documentType;
	}

	/**
	 * @param documentType the documentType to set
	 */
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	/**
	 * @return the documentNumber
	 */
	public String getDocumentNumber() {
		return documentNumber;
	}

	/**
	 * @param documentNumber the documentNumber to set
	 */
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the totalQuantity
	 */
	public Integer getTotalQuantity() {
		return totalQuantity;
	}

	/**
	 * @param totalQuantity the totalQuantity to set
	 */
	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	/**
	 * @return the detail
	 */
	public List<ProductByOrder> getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(List<ProductByOrder> detail) {
		this.detail = detail;
	}

	/**
	 * @return the totalValue
	 */
	public Double getTotalValue() {
		return totalValue;
	}

	/**
	 * @param totalValue the totalValue to set
	 */
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}	
}
