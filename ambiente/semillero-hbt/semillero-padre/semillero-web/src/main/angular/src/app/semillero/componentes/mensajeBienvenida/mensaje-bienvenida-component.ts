import { Component, OnInit } from "@angular/core"

@Component({
    selector : 'mensaje-bienvenida',
    templateUrl : './mensaje-bienvenida-component.html',
    styleUrls : ['./mensaje-bienvenida-component.css']
})


export class MensajeBienvenidaComponent implements OnInit {

    constructor () {

    }

    ngOnInit(): void {
        console.log("Bienvenido al componente 'mensaje-bienvenida'")
    }

}