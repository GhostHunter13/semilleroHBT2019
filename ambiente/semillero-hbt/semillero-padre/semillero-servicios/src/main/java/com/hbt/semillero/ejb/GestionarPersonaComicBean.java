/**
 * GestionarPersonaComicBean.java
 */
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

import com.hbt.semillero.dto.PersonaComicDTO;
import com.hbt.semillero.entidad.PersonaComic;

/**
 * <b>Descripción:<b> Clase que determina el bean para realizar las gestion de
 * las compras de comic por personas
 * 
 * @author Pierre Laurens 
 * @version
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarPersonaComicBean implements IGestionarPersonaComicLocal {

	final static Logger logger = Logger.getLogger(GestionarPersonaComicBean.class);
	
	/**
	 * Atributo em que se usa para interacturar con el contexto de persistencia.
	 */
	@PersistenceContext
	private EntityManager em;
	


	/**
	 * 
	 * @see com.hbt.semillero.ejb.IGestionarPersonaComicLocal#crearPersonaComic(com.hbt.semillero.dto.ComicDTO)
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void comprarComic(PersonaComicDTO personaComicNuevo) {
		// Entidad nueva
		PersonaComic personaComic = convertirPersonaComicDTOToPersonaComic(personaComicNuevo);
		// Se almacena la informacion y se maneja la entidad personaComic
		em.persist(personaComic);
	}

	
	/**
	 * 
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#consultarComic(java.lang.String)
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public PersonaComicDTO consultarPersonaComic(String docPersona) {
		PersonaComic personaComic = null;
		personaComic = new PersonaComic();
		personaComic = em.find(PersonaComic.class, Long.parseLong(docPersona));
		PersonaComicDTO personaComicDTO = convertirPersonaComicToPersonaComicDTO(personaComic);
		return personaComicDTO;
	}

	/**
	 * 
	 * Metodo encargado de transformar una personaComic a un personaComicDTO
	 * 
	 * @param personaComic
	 * @return
	 */
	private PersonaComicDTO convertirPersonaComicToPersonaComicDTO(PersonaComic personaComic) {
		PersonaComicDTO personaComicDTO = new PersonaComicDTO();
		if(personaComic.getId()!=null) {
		 personaComicDTO.setId(personaComic.getId());
		}
		personaComicDTO.setDocumentoPersona(personaComic.getDocumentoPersona());
		personaComicDTO.setIdComic(personaComicDTO.getIdComic());
		personaComicDTO.setFechaVenta(personaComicDTO.getFechaVenta());
		return personaComicDTO;
	}

	/**
	 * 
	 * Metodo encargado de transformar un personaComicDTO a un personaComic
	 * 
	 * @param personaComic
	 * @return
	 */
	private PersonaComic convertirPersonaComicDTOToPersonaComic(PersonaComicDTO personaComicDTO) {
		PersonaComic personaComic = new PersonaComic();
		if(personaComicDTO.getId()!=null) {
			personaComic.setId(personaComicDTO.getId());
		}
		personaComic.setDocumentoPersona(personaComicDTO.getDocumentoPersona());
		personaComic.setIdComic(personaComicDTO.getIdComic());
		personaComic.setFechaVenta(personaComicDTO.getFechaVenta());
		return personaComic;
	}



}
