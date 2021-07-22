package com.terence.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController
import com.terence.fragments.databinding.FragmentABinding


class AFragment : Fragment() {
    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentABinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.moveBtn.setOnClickListener {
            var action = AFragmentDirections.actionAFragmentToBFragment("gooooooo")
            findNavController().navigate(action)

            }
        }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}