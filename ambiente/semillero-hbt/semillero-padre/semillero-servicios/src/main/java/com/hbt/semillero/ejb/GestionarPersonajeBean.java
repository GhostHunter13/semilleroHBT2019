package com.hbt.semillero.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.Personaje;


/**
 * <b>Descripción:<b> Clase que determina el bean para realizar las gestion de
 * los personajes de los comics
 * 
 * @author Pierre Laurens 
 * @version
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarPersonajeBean implements IGestionarPersonajeLocal {
	
	final static Logger logger = Logger.getLogger(GestionarPersonajeBean.class);

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void crearPersonaje() {
		logger.debug("Se ejecuta el create del CRUD");
		logger.debug("Finaliza el create del CRUD");
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<PersonajeDTO> consultarPersonaje(Long idComic) {
		logger.debug("Se ejecuta el read del CRUD");
		
		String query = "SELECT personaje " 
				+	"FROM Personaje personae";
		
		List<Personaje> listaPersonajes = EntityManager.createQuery(query)
				.setParameter("idComic",  idComic).getResultList();
		
		List<PersonajeDTO> listaPersonajesDTO = new ArrayList<>();
		
		for ( Personaje personaje : listaPersonajes ) {
			listaPersonajesDTO.add(convertirEntidadDTO(personaje));
		}
		
		logger.debug("Finaliza el read del CRUD");
		return listaPersonajesDTO;
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
	
	private Personaje convertirDTOEntidad(PersonajeDTO personajeDTO) {
		Personaje personaje = new Personaje();
		personaje.setId(personajeDTO.getId());
		personaje.setComic(new Comic());
		personaje.getComic().setId(personajeDTO.getIdComic());
		personaje.setEstado(personajeDTO.getEstado());
		personaje.setSuperPoder(personajeDTO.getSuperPoder());
		return personaje;
		
	}
	
	private PersonajeDTO convertirEntidadDTO(Personaje personaje) {
		PersonajeDTO personajeDTO = new PersonajeDTO();
		personajeDTO.setId(personajeDTO.getId());
		personajeDTO.setIdComic(personaje.getComic().getId());
		personajeDTO.setEstado(personajeDTO.getEstado());
		personajeDTO.setSuperPoder(personajeDTO.getSuperPoder());
		return personajeDTO;
		
	}

	@Override
	public List<PersonajeDTO> consultarPersonaje() {
		// TODO Auto-generated method stub
		return null;
	}

}