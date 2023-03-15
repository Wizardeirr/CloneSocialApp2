package com.example.clonesocialapp.home

import android.media.Image
import android.os.Bundle
import android.provider.MediaStore.Images
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clonesocialapp.R
import com.example.clonesocialapp.databinding.FragmentHomeBinding
import com.example.clonesocialapp.databinding.FragmentProfileBinding

class HomeFragment : Fragment() {
    private lateinit var adapter: HomeAdapter
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val images= listOf<PicturesData>(
            PicturesData(R.drawable.other),
            PicturesData(R.drawable.man),
            PicturesData(R.drawable.another),
            PicturesData(R.drawable.post),
            PicturesData(R.drawable.other),
            PicturesData(R.drawable.man),
            PicturesData(R.drawable.another),
            PicturesData(R.drawable.post),
            PicturesData(R.drawable.other),
            PicturesData(R.drawable.man),
            PicturesData(R.drawable.another),
            PicturesData(R.drawable.post),

        )
        val layoutManager = LinearLayoutManager(activity)
        binding.homeRV.layoutManager = layoutManager
        adapter = HomeAdapter(images)
        binding.homeRV.adapter=adapter
        //span count kaç tane görsel gösterileceği !!
        binding.homeRV.layoutManager= GridLayoutManager(requireContext(),3)



        /* swipe callback
         val swipeCallback=object :ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder,
            ): Boolean {
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val layoutPosition=viewHolder.layoutPosition
                val selectedArt=adapter.takeAllPicture[layoutPosition]
                //viewModel.deleteArt(selectedArt)
            }

          */
    }

}
