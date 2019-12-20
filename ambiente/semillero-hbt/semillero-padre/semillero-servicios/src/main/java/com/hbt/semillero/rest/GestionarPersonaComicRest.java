/**
 * GestionarPersonaComicRest.java
 */
package com.hbt.semillero.rest;

import java.util.List;


import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.PersonaComicDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.ejb.IGestionarPersonaComicLocal;

/**
 * <b>Descripción:<b> Clase que determina el servicio rest que permite gestionar
 * la venta de un comic a una persona
 * 
 * @author Pierre Laurens
 * @version
 */
@Path("/GestionarComicPersona")
public class GestionarPersonaComicRest {

	/**
	 * Atributo que permite gestionar la comprar de un comic por una persona
	 */
	@EJB
	private IGestionarPersonaComicLocal gestionarPersonaComicEJB;

	
	
	/**
	 * Metodo encargado de ejecutar la compra de un comic por una persona
	 * http://localhost:8085/semillero-servicios/rest/GestionarComic/comprarComic
	 * @param persona
	 * @return
	 */
	@POST
	@Path("/comprarComic")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResultadoDTO comprarComic(PersonaComicDTO personaComicDTO) {
		gestionarPersonaComicEJB.comprarComic(personaComicDTO);
		ResultadoDTO resultadoDTO = new ResultadoDTO(Boolean.TRUE, "Se ha realizado la compra exitosamente");
		return resultadoDTO;
		
	}
	
	/**
	 * 
	 * Metodo encargado de mostrar un saludo
	 * http://localhost:8085/semillero-servicios/rest/GestionarComic/saludo
	 * 
	 * @param idComic
	 * @return
	 */	
	
	@GET
	@Path("/saludo")
	@Produces(MediaType.APPLICATION_JSON)
	public String primerRest() {
		return "Prueba inicial servicios rest en el semillero java hbt";
	}

}
