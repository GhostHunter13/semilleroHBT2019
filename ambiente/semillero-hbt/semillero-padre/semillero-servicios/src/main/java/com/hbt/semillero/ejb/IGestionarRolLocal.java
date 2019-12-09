package com.hbt.semillero.ejb;

import java.util.List;

import com.hbt.semillero.dto.RolDTO;

public interface IGestionarRolLocal {

	/**
	 * 
	 * Metodo encargado del create (del CRUD)
	 * 
	 * @author Pierre Laurens
	 */
	public void crearRol(RolDTO rol);

	/**
	 * 
	 * Metodo encargado del read (del CRUD)
	 * 
	 * @author Pierre Laurens
	 */
	public RolDTO consultarRol(Long id);

	/**
	 * 
	 * Metodo encargado del update (del CRUD)
	 * 
	 * @author Pierre Laurens
	 */
	public void editarRol();

	/**
	 * 
	 * Metodo encargado del delete (del CRUD)
	 * 
	 * @author Pierre Laurens
	 */
	public void eliminarRol();
	
}
