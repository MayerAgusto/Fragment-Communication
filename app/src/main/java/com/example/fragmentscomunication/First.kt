package com.example.fragmentscomunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentscomunication.databinding.FragmentFirstBinding


class First : Fragment() {
    private var _binding:FragmentFirstBinding? = null
    private val binding get() = _binding!!
    private lateinit var comunicador: Comunicador

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater,container,false)

        comunicador = activity as Comunicador
        binding.btEnviar.setOnClickListener {
            comunicador.enviarMensaje(binding.etMessage.text.toString())

        }
        return binding.root
    }

}