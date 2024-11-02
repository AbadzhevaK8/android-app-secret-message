package com.abadzheva.secretmessage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.abadzheva.secretmessage.databinding.FragmentMessageBinding

class MessageFragment : Fragment(R.layout.fragment_message) {
    private val binding by viewBinding(FragmentMessageBinding::bind)

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)
        binding.next.setOnClickListener {
            findNavController().navigate(R.id.action_messageFragment_to_encryptFragment)
        }
    }
}
