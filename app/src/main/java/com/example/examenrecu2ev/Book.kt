package com.example.examenrecu2ev

import java.io.Serializable

class Book: Serializable {

    private var titulo=""
    private var pags = ""
    private var autor = ""
    private var año_publicacion = ""

    constructor(titulo: String, pags: String, autor: String, año_publicacion: String){
        this.titulo=titulo
        this.pags=pags
        this.autor=autor
        this.año_publicacion=año_publicacion
    }

    companion object {
        var bookList = ArrayList<Book>()
    }
}