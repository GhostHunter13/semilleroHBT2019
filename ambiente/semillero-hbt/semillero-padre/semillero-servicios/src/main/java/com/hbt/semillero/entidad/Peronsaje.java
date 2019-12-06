package com.hbt.semillero.entidad;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "PERSONAJE")
public class Peronsaje implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(allocationSize = 1, name = "PERSONAJE_ID_GENERATOR", sequenceName = "SEQ_PERSONAJE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSONAJE_ID_GENERATOR")
	@Column(name = "PERS_ID")
	private Long id;
	
	@Column(name = "PERS_NOMBRE")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "PERS_ID_COMIC")
	private Comic comic;
	
	@Column(name = "PERS_ESTADO")
	private EstadoEnum estado;
	
	@Column(name = "PERS_SUPERPODER")
	private String superPoder;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Comic getComic() {
		return comic;
	}

	public void setComic(Comic comic) {
		this.comic = comic;
	}

	public EstadoEnum getEstado() {
		return estado;
	}

	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}

	public String getSuperPoder() {
		return superPoder;
	}

	public void setSuperPoder(String superPoder) {
		this.superPoder = superPoder;
	}	

}
