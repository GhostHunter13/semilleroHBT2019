package com.hbt.semillero.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.RolDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.ejb.IGestionarRolLocal;

/**
 * <b>Descripción:<b> Clase que determina el servicio rest para el CRUD de roles
 * 
 * @author Pierre Laurens
 * @version
 */
@Path("/GestionarRoles")
public class GestionarRolRest {

	/**
	 * Atriburo que permite gestionar el CRUD
	 */
	@EJB
	private IGestionarRolLocal gestionarRoles;


	/**
	 * 
	 * Metodo encargado del create del CRUD
	 * http://localhost:8085/semillero-servicios/rest/GestionarRol/create
	 * 
	 * @return
	 */
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearRol(RolDTO rolDTO) {
		gestionarRoles.crearRol(rolDTO);
		ResultadoDTO resultadoDTO = new ResultadoDTO(Boolean.TRUE, "Rol creado exitosamente");
		return resultadoDTO;
	}

	/**
	 * 
	 * Metodo encargado del read del CRUD
	 * http://localhost:8085/semillero-servicios/rest/GestionarRol/read
	 * 
	 * @return
	 */
	@GET
	@Path("/read")
	@Produces(MediaType.APPLICATION_JSON)
	public RolDTO consultarRol(@QueryParam("idRol") Long idRol) {
		if(idRol != null) {
			RolDTO rolDTO = gestionarRoles.consultarRol(idRol);
			return rolDTO;
		}
		
		return null;
	}

	/**
	 * 
	 * Metodo encargado del update del CRUD
	 * http://localhost:8085/semillero-servicios/rest/GestionarRol/update
	 * 
	 * @return
	 */
	@GET
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public String editarRol() {
		gestionarRoles.editarRol();
		return "Rol editado Correctamente";
	}

	/**
	 * 
	 * Metodo encargado del delete del CRUD
	 * http://localhost:8085/semillero-servicios/rest/GestionarRol/delete
	 * 
	 * @return
	 */
	@GET
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public String eliminarRol() {
		gestionarRoles.eliminarRol();
		return "Ejecuto Correctamente";
	}
}