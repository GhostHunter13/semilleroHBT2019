/**
 * Comic.java
 */
package com.hbt.semillero.entidad;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * <b>Descripción:<b> Clase que determina la entidad que permite representar la
 * tabla "DB_SEMILLERO"."PERSONA_COMIC"
 * 
 * @author Pierre Laurens
 * @version
 */
@Entity
@Table(name = "PERSONA_COMIC")
public class PersonaComic implements Serializable {

	/**
	 * Serializar es pasar un Objeto a un array de bytes y viceversa. Atributo que
	 * determina serialVersionUID es el id único que identifica una clase cuando lo
	 * serializamos. ;ediante este id podemos identificar el objeto convertido en un
	 * array de bytes.
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long documentoPersona;
	private Long idComic;
	private LocalDateTime fechaVenta;

	/**
	 * Constructor de la clase.
	 */
	public PersonaComic() {

	}

	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * 
	 * @return El id asociado a la clase
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "PERSONA_COMIC_SPCID_GENERATOR", sequenceName = "SEQ_PERSONA_COMIC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSONA_COMIC_SPCID_GENERATOR")
	@Column(name = "SPCID")
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
	 * Metodo encargado de obtener el valor del atributo doucmentoPersona
	 * @param documento persona del que compra un comic
	 */

	public Long getDocumentoPersona() {
		return documentoPersona;
	}

	/**
	 * Metodo encargado de setear el documento de la persona que compró el comic
	 * @param documentoPersona
	 */
	
	public void setDocumentoPersona(Long documentoPersona) {
		this.documentoPersona = documentoPersona;
	}

	/**
	 * Metodo encargado de obtener el id del comic comprado
	 * @param id del comic
	 */
	public Long getIdComic() {
		return idComic;
	}

	/**
	 * Metodo encargado de setear el id del comic comprado
	 * @param idComic
	 */
	public void setIdComic(Long idComic) {
		this.idComic = idComic;
	}

	/**
	 * Metodo encargado de obtener la fecha de venta del comic
	 * @return
	 */
	
	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}

	/**
	 * Metodo encargado de setear la fecha de venta del comic
	 * @param fechaVenta
	 */
	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	/**
	 * @see java.lang.Object#toString() Metodo que permite asociar al objeto un
	 *      texto representativo
	 */
	@Override
	public String toString() {
		return "PersonaComic [id=" + id + ", documentoPersona=" + documentoPersona + ", "
				+ "idComic=" + idComic + ", fechaVenta=" + fechaVenta + "]";
	}


	/**
	 * @see java.lang.Object#equals(java.lang.Object) Metodo que permite comparar
	 *      objetos
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaComic other = (PersonaComic) obj;
		if (documentoPersona == null) {
			if (other.documentoPersona != null)
				return false;
		} else if (!documentoPersona.equals(other.documentoPersona))
			return false;
		if (idComic == null) {
			if (other.idComic != null)
				return false;
		} else if (!idComic.equals(other.idComic))
			return false;
		if (fechaVenta == null) {
			if (other.fechaVenta != null)
				return false;
		} else if (!fechaVenta.equals(other.fechaVenta))
			return false;
		return true;
	}

}
