package com.example.clonesocialapp.searchfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.clonesocialapp.R
import com.example.clonesocialapp.databinding.FragmentHomeBinding
import com.example.clonesocialapp.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private var _binding:FragmentSearchBinding?=null
    private val binding get()=_binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



}

}