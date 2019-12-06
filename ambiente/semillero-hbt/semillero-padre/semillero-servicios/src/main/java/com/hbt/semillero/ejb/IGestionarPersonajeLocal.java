package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;


/**
 * Expone los métodos del EJB InformacionPersonajesComic
 * 
 * @author Pierre Laurens
 *
 */
@Local
public interface IGestionarPersonajeLocal {

	/**
	 * 
	 * Metodo encargado del create (del CRUD)
	 * 
	 * @author Pierre Laurens
	 */
	public void crearPersonaje();

	/**
	 * 
	 * Metodo encargado del read (del CRUD)
	 * 
	 * @author Pierre Laurens
	 */
	public void consultarPersonaje();

	/**
	 * 
	 * Metodo encargado del update (del CRUD)
	 * 
	 * @author Pierre Laurens
	 */
	public void editarPersonaje();

	/**
	 * 
	 * Metodo encargado del delete (del CRUD)
	 * 
	 * @author Pierre Laurens
	 */
	public void eliminarPersonaje();


}