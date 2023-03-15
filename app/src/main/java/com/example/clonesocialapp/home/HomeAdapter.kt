package com.example.clonesocialapp.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.clonesocialapp.R
import com.squareup.picasso.Picasso

class HomeAdapter(val takeAllPicture:List<PicturesData>): RecyclerView.Adapter<HomeAdapter.HomeFragmentVH>() {
    class HomeFragmentVH(itemView:View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFragmentVH {
        val inflater= LayoutInflater.from(parent.context)
        val viewHolder=inflater.inflate(R.layout.images_raw,parent,false)
        return HomeFragmentVH(viewHolder)
    }

    override fun getItemCount(): Int {
        return takeAllPicture.size
    }

    override fun onBindViewHolder(holder: HomeFragmentVH, position: Int) {

        val imageView=holder.itemView.findViewById<ImageView>(R.id.imageView)
        val holderPictures=takeAllPicture[position]
        Picasso.get().load(holderPictures.pictures).into(imageView);
    }
}