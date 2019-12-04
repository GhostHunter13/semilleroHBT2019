import { Component, OnInit } from "@angular/core";

/**
 * 
 * @description Componente creado para mostrar el nombre y la ciudad de una persona. 
 * @author Pierre Laurens Florez 
 */

@Component({
    selector: 'mostrar-nombre-ciudad',
    templateUrl: './mostrar-nombre-ciudad.html',
    styleUrls: ['./mostrar-nombre-ciudad.css']
})

export class MostrarNombreCiudadComponent implements OnInit{
    
    /**
     * Atributo que contiene un nombre de una persona.
     */
    public nombre : string;

    /**
     * Atributo que contiene la ciudad donde donde vive una persona.
     */
    public ciudad : string;

    /**
    * Constructor de la clase
    */
    constructor () {
    }

    /**
    * Evento angular que se ejecuta al iniciar el componente,
    * Inicializa las variables nombre y ciudad.
    */
    ngOnInit(): void {
        this.nombre = "Pierre Laurens Florez";
        this.ciudad = "Monteria";
    }

} 