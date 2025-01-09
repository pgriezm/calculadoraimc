package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
        // Criar uma variavele associar o componente de UI <EditText>
        // Recuperar o botao da tela

        // Colocar ação no botao = setOnCLickListener
        // Recuperar o texto digitado no edt peso


        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCAlcular = findViewById<Button>(R.id.btn_calcular)


        btnCAlcular.setOnClickListener {


            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
                //Mostrar mensagem para o usuario
                Snackbar
                    .make(
                        edtPeso,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG

                    )
                    .show()


            }   else {
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2


            println("Pedro ação do botão" + resultado)

            }

        }




    }
}