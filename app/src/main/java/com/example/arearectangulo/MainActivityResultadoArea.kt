package com.example.arearectangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_resultado_area.*

class MainActivityResultadoArea : AppCompatActivity() {
    companion object{
        var Base : Double = 0.0
        var Altura : Double = 0.0
        var Resultado : Double = 0.0

        val ENTRA_ALTURA = "altura"
        val ENTRA_BASE = "base"
        val ENTRA_RESULTADO = "resultado"
        private val DEFAULT_DOUBLE=-1.0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_resultado_area)
        val recibir = intent
        Base = recibir.getDoubleExtra(ENTRA_BASE, DEFAULT_DOUBLE)
        Altura = recibir.getDoubleExtra(ENTRA_ALTURA, DEFAULT_DOUBLE)
        Resultado = recibir.getDoubleExtra(ENTRA_RESULTADO, DEFAULT_DOUBLE)
        tvAltura.setText("La Altura es :" + Altura.toString())
        tvBase.setText("La Base es :" + Base.toString())
        tvArea.setText("El resultado es :" + Resultado.toString())
    }
}
