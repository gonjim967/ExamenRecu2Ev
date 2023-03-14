package com.example.examenrecu2ev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BookDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        var titulo_libro = intent.getStringExtra("titulo_libro")
        var paginas = intent.getStringExtra("paginas")
        println(titulo_libro)
        println(paginas)
        var autor = findViewById<EditText>(R.id.editTextTextPersonName3)
        var año = findViewById<EditText>(R.id.editTextTextPersonName4)
        var button_siguiente = findViewById<Button>(R.id.button_siguiente2)
        var button_atras = findViewById<Button>(R.id.button_atras2)

        var nombre_autor = autor.text.toString()
        var año_lanzamiento = año.text.toString()

        button_siguiente.setOnClickListener{
            var siguientepag = Intent(this, BookDisplayActivity::class.java)
            siguientepag.putExtra("nombre_autor", nombre_autor)
            siguientepag.putExtra("año_lanzamiento", año_lanzamiento)
            siguientepag.putExtra("titulo_libro", titulo_libro)
            siguientepag.putExtra("paginas", paginas)
            startActivity(siguientepag)
        }

        button_atras.setOnClickListener{
            var volveratras = Intent(this, BookTitleActivity::class.java)
            startActivity(volveratras)
        }
    }
}