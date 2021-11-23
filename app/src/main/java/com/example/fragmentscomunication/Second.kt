package com.example.fragmentscomunication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentscomunication.databinding.FragmentSecondBinding

class Second : Fragment() {
    private var _binding:FragmentSecondBinding? = null
    private val binding get() = _binding!!
    var message: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater,container,false)

        message = arguments?.getString("message")
        binding.tvGetMessage.text = message

        return binding.root
    }

}