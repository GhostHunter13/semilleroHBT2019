package com.hbt.semillero.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.dto.RolDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.Personaje;
import com.hbt.semillero.entidad.Rol;

public class GestionarRolBean {

	final static Logger logger = Logger.getLogger(GestionarRolBean.class);

	@PersistenceContext
	private EntityManager em;
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void crearRol() {
		logger.debug("Se ejecuta el create del CRUD");
		logger.debug("Finaliza el create del CRUD");
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<RolDTO> consultarRol(Long idRol) {
		logger.debug("Se ejecuta el read del CRUD");
		
		String query = "SELECT rol " 
				+	"FROM Rol rol";
		
		List<Rol> listaRol = em.createQuery(query)
				.setParameter("idRol",  idRol).getResultList();
		
		List<RolDTO> listaRolDTO = new ArrayList<>();
		
		for ( Rol rol : listaRol ) {
			listaRolDTO.add(convertirEntidadDTO(rol));
		}
		
		logger.debug("Finaliza el read del CRUD");
		return listaRolDTO;
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void editarPersonaje() {
		logger.debug("Se ejecuta el update del CRUD");
		logger.debug("Finaliza el update del CRUD");
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void eliminarPersonaje() {
		logger.debug("Se ejecuta el delete del CRUD");
		logger.debug("Finaliza el delete del CRUD");
	}
	
	private Rol convertirDTOEntidad(RolDTO rolDTO) {
		Rol rol = new Rol();
		rol.setId(rolDTO.getId());
		rol.setEstado(rolDTO.getEstado());
		rol.setNombre(rolDTO.getNombre());
		return rol;
		
	}
	
	private RolDTO convertirEntidadDTO(Rol rol) {
		RolDTO rolDTO = new RolDTO();
		rolDTO.setId(rol.getId());
		rolDTO.setNombre(rol.getEstado());
		rolDTO.setEstado(rol.getNombre());
		return rolDTO;
		
	}

	public List<RolDTO> consultarRol() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
