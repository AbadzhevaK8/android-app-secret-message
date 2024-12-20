package com.abadzheva.secretmessage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.abadzheva.secretmessage.databinding.FragmentEncryptBinding

class EncryptFragment : Fragment(R.layout.fragment_encrypt) {
    private val binding by viewBinding(FragmentEncryptBinding::bind)

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)
        val message = EncryptFragmentArgs.fromBundle(requireArguments()).message
        binding.encryptedMessage.text = message.reversed()
    }
}
