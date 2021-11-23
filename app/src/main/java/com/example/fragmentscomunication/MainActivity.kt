package com.example.fragmentscomunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), Comunicador {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val SendMesage = First()
        supportFragmentManager.beginTransaction().replace(R.id.messager,SendMesage).commit()

    }

    override fun enviarMensaje(mensaje: String) {
        val bundle = Bundle()
        bundle.putString("message", mensaje)
        val transaccion = this.supportFragmentManager.beginTransaction()
        val RecieveMessage = Second()
        RecieveMessage.arguments = bundle
        transaccion.replace(R.id.container, RecieveMessage).commit()
    }

}