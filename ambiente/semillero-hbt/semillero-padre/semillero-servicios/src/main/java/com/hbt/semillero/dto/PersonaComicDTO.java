package com.hbt.semillero.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <b>Descripción:<b> Clase que determina el dto a usar para modificar,
 * consultar y posteriormente eliminar una compra de un Comic
 * 
 * @author Pierre Laurens
 */
public class PersonaComicDTO implements Serializable {

	/**
	 * Atributo que determina la version del serializable 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long documentoPersona;
	private Long idComic;
	private LocalDateTime fechaVenta;

	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * 
	 * @return El id asociado a la clase
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * 
	 * @param id El nuevo id a modificar.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Metodo encargado de retornar el documento de la persona que compra el comic
	 * @return
	 */

	public Long getDocumentoPersona() {
		return documentoPersona;
	}
	
	/**
	 * Metodo encargado de setear el documento de una persona que compra el comic
	 * @param documentoPersona
	 */

	public void setDocumentoPersona(Long documentoPersona) {
		this.documentoPersona = documentoPersona;
	}

	/**
	 * Metodo encargado de retornar el id del comic comprado
	 * @return
	 */
	
	public Long getIdComic() {
		return idComic;
	}

	/**
	 * Metodo encargado de retornar el id del comic comprado
	 * @param idComic
	 */
	
	public void setIdComic(Long idComic) {
		this.idComic = idComic;
	}

/**
 * Metodo encargado de retornar la fecha de venta del comic
 * @return
 */
	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}
	
	/**
	 * 
	 * Metodo encargado de setear la fecha de venta del comic
	 * @param fechaVenta
	 */

	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	/**
	 * Método encargado de convertir los datos recibidos en JSON al tipo PersonaComicDTO.
	 * <b>Caso de Uso:</b>
	 * 
	 * @param arg Cadena que representa el objeto complejo JSON.
	 * @return Instancia con los datos recibidos.
	 */
	public static PersonaComicDTO valueOf(String arg) {
		return JsonUtils.valueOf(arg, PersonaComicDTO.class);
	}

	/**
	 * Método encargado de convertir los datos recibidos en PersonaComicDTO al JSON
	 * esperado
	 * 
	 * @param dto DTO
	 * 
	 * @return Json
	 */
	@Override
	public String toString() {
		return JsonUtils.toStringJson(this);
	}

}
