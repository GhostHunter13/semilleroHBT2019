import { Component, OnInit } from "@angular/core";

/**
 * 
 * @description Componente creado para mostrar una lista de los comics.
 * @author Pierre Laurens Florez 
 */

@Component({
    selector: 'listar-comics',
    templateUrl: './listar-comics.html',
    styleUrls: ['./listar-comics.css']
})

export class ListarComicsComponent implements OnInit{


    /**
     * Varibale usada para adicionar los comics en la lista.
     */
    public comics: Array<any>;

    /**
     * Variable usada para guardar la informacion del comic que se va a eliminar
     */
    public comicBorrado;

    /**
     * Variable usada para determinar si existe un error.
     */
    public mostrarMensajeError : boolean;

    /**
     * Constructor que permite inyectar e inicializar dependencias.
     */
    constructor () {
    }

    /**
    * Evento angular que se ejecuta al iniciar el componente,
    * Inicializa los comics.
    */
    ngOnInit(): void {

        this.comics = [
            {
                id : 1,
                nombre : "Mr Spiderman",
                editorial : "Norma",
                tematica : "Accion",
                numeroPaginas : 100,
                precio : 23.900,
                autores : "Pierre, Tulio, Cristian",
                aColor : false,
                fechaVenta : "2019-10-05",
                portada : "https://cdn.normacomics.com/media/catalog/product/cache/1/thumbnail/9df78eab33525d08d6e5fb8d27136e95/3/1/31240171301_G.jpg",
                estado : "ACTIVO"
            },
            {
                id : 2,
                nombre : "Batman Arkham City",
                editorial : "Libros Gloria",
                tematica : "Accion",
                numeroPaginas : 254,
                precio : 63.900,
                autores : "Pierre, Tulio, Cristian",
                aColor : true,
                fechaVenta : "2019-08-02",
                portada : "http://mmm.vistoenpantalla.com/imagenes-productos/calendario-batman-comics-2019-large2.jpg",
                estado : "ACTIVO"
            },
            {
                id : 3,
                nombre : "Detective Comic",
                editorial : "Buhomag",
                tematica : "Suspenso",
                numeroPaginas : 150,
                precio : 32.900,
                autores : "Pierre, Tulio, Cristian",
                aColor : false,
                fechaVenta : "2019-05-01",
                portada : "https://media.nidux.net/pull/599/800/3475/132787_product_5d1281a23aa7c_1_130565.jpg",
                estado : "INACTIVO"
            },
            {
                id : 4,
                nombre : "Extremity",
                editorial : "Planeta Comic",
                tematica : "Accion",
                numeroPaginas : 49,
                precio : 11.900,
                autores : "Pierre, Tulio, Cristian",
                aColor : true,
                fechaVenta : "2019-11-02",
                portada : "http://2.bp.blogspot.com/Rdr53XLaWDYrt6vizrWMp3YgZ0NuHjLPSJJiJNMkSp_W_Zun86ZjywzepZ3NwG-Zg1qup428mPa6Xt77fxBOlhoxwPUQDp35S2AA0b-JqyjPuiFsD2xuDs-GoeKs0mzxsoYc=s1600",
                estado : "ACTIVO"
            },
            {
                id : 5,
                nombre : "Caupolicán",
                editorial : "Blustack",
                tematica : "Accion",
                numeroPaginas : 320,
                precio : 52.900,
                autores : "Pierre, Tulio, Cristian",
                aColor : false,
                fechaVenta : "2019-02-08",
                portada : "https://los40.cl/wp-content/uploads/2019/06/14-actualidad-1560532479_052521_1560532576_noticia_normal.jpg",
                estado : "ACTIVO"
            }
        ]

    }

    /**
     * Metodo encargado de eliminar un comic, teniendo en cuenta la posicion del comic.
     * @param indiceComic Valor que indica el indice del comic que se desea eliminar de la lista.
     */
    eliminarComic(indiceComic){

        this.comicBorrado = this.comics[indiceComic];

        //Se usa la funcion filter, para sacar de la lista, todos los elementos con indiceComic
        // que se trae por parametro en la funcion.
        this.comics = this.comics.filter((value,i) => i !== indiceComic);

        this.mostrarMensajeError = !this.comicBorrado;
        
        //Pasados 2 segundos se ejecuta la funcion.
        setTimeout(()=> {

            //El valor de comicBorrado se vuelve undefined para que se 
            //desaparezca del template, el div que contiene el comicBorrado.
            this.comicBorrado = undefined;

            //El valor del mostrarMensajeError se convierte en false, para desaparecer
            //de la vista del template, el div que contiene el mensajeError.
            this.mostrarMensajeError = false;
        }, 2000);
    }

} 