package com.example.arearectangulo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var Base: Double = 0.0
    var Altura: Double = 0.0
    var Resultado: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CalularArea() {
        if (etBase.text.isEmpty()) {
            Toast.makeText(this, "Falta la Base", Toast.LENGTH_LONG).show()
            etBase.requestFocus()
        } else if (etAltura.text.isEmpty()) {
            Toast.makeText(this, "Falta la Altura", Toast.LENGTH_LONG).show()
            etAltura.requestFocus()
        }else {
            Altura = etAltura.text.toString().toDouble()
            Base = etBase.text.toString().toDouble()
            Resultado = (Altura*Base)
        }

    }
    fun EnviarRes(v: View){
        this.CalularArea()
        val enviar = Intent (this,MainActivityResultadoArea::class.java)
        enviar.putExtra(MainActivityResultadoArea.ENTRA_ALTURA,Altura)
        enviar.putExtra(MainActivityResultadoArea.ENTRA_BASE,Base)
        enviar.putExtra(MainActivityResultadoArea.ENTRA_RESULTADO,Resultado)
        startActivity(enviar)

    }
}
