package com.example.examenrecu2ev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BookTitleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_title)

        var titulo = findViewById<EditText>(R.id.editTextTextPersonName)
        var pags = findViewById<EditText>(R.id.editTextTextPersonName2)
        var button_siguiente = findViewById<Button>(R.id.button_siguiente)

        var titulo_libro = titulo.text.toString()
        var paginas = pags.text.toString()

        button_siguiente.setOnClickListener(){
            var siguientePag = Intent(this, BookDetailsActivity::class.java)
            siguientePag.putExtra("titulo_libro", titulo_libro)
            siguientePag.putExtra("paginas", paginas)
            startActivity(siguientePag)
        }
    }

}