package com.example.clonesocialapp.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.clonesocialapp.R

class HomeAdapter(val takeAllPicture:ArrayList<PicturesData>): RecyclerView.Adapter<HomeAdapter.HomeFragmentVH>() {
    class HomeFragmentVH(itemView:View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFragmentVH {
        val inflater= LayoutInflater.from(parent.context)
        val viewHolder=inflater.inflate(R.layout.pictures_raw,parent,false)
        return HomeFragmentVH(viewHolder)
    }

    override fun getItemCount(): Int {
        return takeAllPicture.size
    }

    override fun onBindViewHolder(holder: HomeFragmentVH, position: Int) {
        TODO("Not yet implemented")
    }
}