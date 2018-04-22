/**
 * 
 */
package com.ibm.clothingfactory.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author andressanchez
 *
 */
public class OrderDTO implements Serializable {

	/** serialVersionUID **/
	private static final long serialVersionUID = -1459188854217826384L;
	
	private String name;	
	private String docType;	
	private Integer docNumber;	
	private String date;	
	private String address;	
	private Integer quantity;	
	private List<ProductDTO> detail;	
	private Double totalValue;

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
	 * @return the docType
	 */
	public String getDocType() {
		return docType;
	}

	/**
	 * @param docType the docType to set
	 */
	public void setDocType(String docType) {
		this.docType = docType;
	}

	/**
	 * @return the docNumber
	 */
	public Integer getDocNumber() {
		return docNumber;
	}

	/**
	 * @param docNumber the docNumber to set
	 */
	public void setDocNumber(Integer docNumber) {
		this.docNumber = docNumber;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
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
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the detail
	 */
	public List<ProductDTO> getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(List<ProductDTO> detail) {
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
