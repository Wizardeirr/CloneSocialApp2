package com.example.clonesocialapp.searchfragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.bumptech.glide.Glide
import com.example.clonesocialapp.R
import com.google.android.material.imageview.ShapeableImageView

class SliderAdapter(private var mImageList:List<String>):
    RecyclerView.Adapter<SliderAdapter.ImageViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.image_shaper,parent,false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mImageList.size

    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(mImageList[position])
    }
    class ImageViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        private val sliderImageView=itemView.findViewById<ShapeableImageView>(R.id.sliderImageView  )
        fun bind(data:String){
            Glide.with(itemView.context).load(data).into(sliderImageView)
        }
    }
}