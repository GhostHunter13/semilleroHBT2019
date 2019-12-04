/**
 * Importacion de componentes de angular
 */
import { Component, OnInit } from '@angular/core';
import { ComicDTO } from '../../dto/comic.dto';

/**
 * Se coloca cual es la funcionalidad del componente y el autor. 
 * @description La clase CrearPersonaComponent permite crear personas
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
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

    public nombre : String;
    public nombre2 : String;

    /**
     * No se inicializan variables en el constructor, solo se inyectan componentes, 
     * servicios o librerias necesarias de angular.
     */
    constructor () {
        
    }

    /**
     * El evento OnInit se llama cuando se invoca el componente, este evento
     * inicializa las variables globales, inicializa el constructor, se preparan los elementos
     * del componente. 
     */
    ngOnInit(): void {
        
    }
     


}