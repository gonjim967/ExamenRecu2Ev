package com.example.examenrecu2ev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BookDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_display)

        var titulo_libro = intent.getStringExtra("titulo_libro")
        var paginas = intent.getStringExtra("paginas")
        var nombre_autor = intent.getStringExtra("nombre_autor")
        var año_lanzamiento = intent.getStringExtra("año_lanzamiento")

        var titulolibro = findViewById<TextView>(R.id.textView)
        var pags = findViewById<TextView>(R.id.textView2)
        var autor = findViewById<TextView>(R.id.textView3)
        var año = findViewById<TextView>(R.id.textView4)

        titulolibro.setText(titulo_libro)
        pags.setText(paginas)
        autor.setText(nombre_autor)
        año.setText(año_lanzamiento)
    }
}