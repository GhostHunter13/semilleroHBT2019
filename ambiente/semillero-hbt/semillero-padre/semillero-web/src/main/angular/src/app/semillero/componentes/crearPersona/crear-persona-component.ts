/**
 * Importacion de componentes de angular
 */
import { Component, OnInit } from '@angular/core';
import { PersonaDTO } from '../../dto/persona.dto';

import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { PersonaService } from '../../services/persona.service';

/**
 * Se coloca cual es la funcionalidad del componente y el autor. 
 * @description La clase CrearPersonaComponent permite crear personas
 * @author Pierre Laurens
 */

/**
 * @author Pierre Laurens Florez
 * Etiqueta para referenciar el componente. Las etiquetas:
 * -selector : usada para referenciar al componente.
 * -templateUrl : usada para referenciar el archivo HTML del componente.
 * -styleUrls : usada para referenciar la hoja de estilo usada por el componente.
 */
@Component({
    selector: 'crear-persona',
    templateUrl: './crear-persona-component.html',
    styleUrls: ['./crear-persona-component.css']
})

/**
 * la estructura del nombre de la clase es : verbo + objeto + "component".
 * El componente como minimo debe implementar el evento OnInit.
 */
export class CrearPersonaComponent implements OnInit{
    
    /**
     * Se declaran las variables, los metodos y el constructor
     * con su respectiva documentacion de la siguiente forma:
     * 1. Declaracacion de variables globales.
     * 2. Constructor
     * 3. Evento OnInit
     * 4. Metodos a utilizar.
     * 
     */
    /**
     * Atributo que contiene los controles del formulario
     */
    public gestionarPersonaForm : FormGroup;

    /**
     * Atributo que contendra la informacion de la persona
     */
    public persona: PersonaDTO;

    /**
     * Atributo que contendra la lista de personas creadas
     */
    public listaPersonas : Array<PersonaDTO>;
        
    /**
     * Atributo que dirá si se creó la persona
     */

    public creacionExitosa : boolean;

    /**
     * Atributo que indica si se envio a validar el formulario
     */
    public submitted : boolean;

    /**
     * No se inicializan variables en el constructor, solo se inyectan componentes, 
     * servicios o librerias necesarias de angular.
     */
    constructor(private personaService: PersonaService,
        private fb : FormBuilder,
        private router : Router) {
        this.gestionarPersonaForm = this.fb.group({
            nombrePersona : [null, Validators.required],
            documentoPersona : [null, Validators.required],
            tipoDocumento : [null, Validators.required],
            fechaNacimiento : [null, Validators.required]
        });
    }

    /**
     * El evento OnInit se llama cuando se invoca el componente, este evento
     * inicializa las variables globales, inicializa el constructor, se preparan los elementos
     * del componente. 
     */
    ngOnInit(): void {
        this.persona = new PersonaDTO();
        this.listaPersonas = new Array<PersonaDTO>();
        
    }

    /**
     * @description Metodo que permite validar el formulario y crear o actulizar un comic
     */
    public crearPersona() : void {
        this.submitted = true;
        if(this.gestionarPersonaForm.invalid) {
            return;
        }
        this.persona = new PersonaDTO();
        this.persona.documento = this.gestionarPersonaForm.controls.documentoPersona.value;
        this.persona.nombre = this.gestionarPersonaForm.controls.nombrePersona.value;
        this.persona.tipoDocumento = this.gestionarPersonaForm.controls.tipoDocumento.value;
        this.persona.fechaNacimiento = this.gestionarPersonaForm.controls.fechaNacimiento.value;
        
        this.listaPersonas.push(this.persona);

        this.personaService.crearPersona(this.persona).subscribe(respuesta => {
            console.log(respuesta);
            if(respuesta.exitoso == true){
                this.creacionExitosa = true;
                this.limpiarFormulario();
            }else{
                this.creacionExitosa = false;
            }
            setTimeout(()=> {
            }, 3000);
        }); 

        this.limpiarFormulario();
        
    }

    private limpiarFormulario() : void {
        this.submitted = false;
        this.gestionarPersonaForm.controls.documentoPersona.setValue(null);
        this.gestionarPersonaForm.controls.nombrePersona.setValue(null);
        this.gestionarPersonaForm.controls.tipoDocumento.setValue(null);
        this.gestionarPersonaForm.controls.fechaNacimiento.setValue(null);
    }

     


}