package com.example.clonesocialapp.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.clonesocialapp.R
import com.example.clonesocialapp.databinding.BottomSheetsWindowBinding
import com.example.clonesocialapp.databinding.FragmentProfileBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.snackbar.Snackbar

class ProfileFragment : Fragment() {
    private var _binding:FragmentProfileBinding?=null
    private val binding get()=_binding!!
    private var notifySettings: Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _binding= FragmentProfileBinding.inflate(inflater,container,false)
        val view=binding.root
        return view
    }

    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        notifySettings=requireView().findViewById(R.layout.bottom_sheets_window)
        binding.notifySettings.setOnClickListener {
            Toast.makeText(requireContext(), "Working", Toast.LENGTH_SHORT).show()
            val dialog = BottomSheetDialog(requireContext())
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setContentView(R.layout.bottom_sheets_window)
            dialog.show()
        }








        binding.unfollowButton.visibility=View.INVISIBLE
        binding.followButton.setOnClickListener{
            binding.followButton.visibility=View.INVISIBLE
            binding.unfollowButton.visibility=View.VISIBLE
            binding.notifySettings.visibility=View.VISIBLE

        }
        binding.unfollowButton.setOnClickListener {
            binding.followButton.visibility=View.VISIBLE
            binding.unfollowButton.visibility=View.GONE
            binding.notifySettings.visibility=View.INVISIBLE
        }





    }








}