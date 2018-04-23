/**
 * 
 */
package com.ibm.clothingfactory.rest;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ibm.clothingfactory.dao.IOrderDAO;
import com.ibm.clothingfactory.dto.OrderDTO;

/**
 * Controlador para exponer los diferentes servicios
 * IBM Global Business Services GBS Colombia
 * @author Andres Ceballos Sanchez - andres.ceballos@ibm.com
 * @since 22/04/2018
 * @version 1.0
 */
@Stateless(mappedName = "ClothingFactoryResource")
@Path("services")
public class ClothingFactoryResource implements Serializable {

	/** serialVersionUID**/
	private static final long serialVersionUID = 1903804341139347970L;
	
	private static final String ENCODING = "UTF-8";
	
	@EJB
	private IOrderDAO orderDAO;
	
	@POST
	@Path("order")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON + "charset="  + ENCODING)
	public Response addOrder(OrderDTO orderDTO) {
		try {
			/*Registrar el pedido en base de datos*/
			//System.out.println(orderDTO);
			//orderDAO.addOrder(orderDTO);
			return Response.status(Response.Status.OK).entity("Registro exitoso").build();
		} catch(Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	

}
