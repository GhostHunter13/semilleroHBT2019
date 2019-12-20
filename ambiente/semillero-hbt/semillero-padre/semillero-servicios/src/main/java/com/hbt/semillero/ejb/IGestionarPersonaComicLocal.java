package com.hbt.semillero.ejb;

import javax.ejb.Local;

import com.hbt.semillero.dto.PersonaComicDTO;

/**
 * Expone los métodos del EJB GestionarPersonaComic 
 * Las interfaces determinan una especie de contrato donde se define las firmas 
 * de los metodos, define que se necesita implementar pero no el como eso 
 * lo realiza la clase que la implementa 
 * Palabras claves interface e implements
 * 
 * @author Pierre Laurens
 *
 */
@Local
public interface IGestionarPersonaComicLocal {

	/**
	 * 
	 * Metodo encargado de crear una compra de un comic y persistirlo
	 * 
	 * @author Pierre Laurens
	 * 
	 * @param comicPersona informacion nueva a crear
	 */
	public void comprarComic(PersonaComicDTO personaComicNuevo);

	
}
