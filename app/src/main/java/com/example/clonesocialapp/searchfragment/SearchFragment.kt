package com.example.clonesocialapp.searchfragment

import android.os.Bundle
import android.transition.Slide
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.clonesocialapp.R
import com.example.clonesocialapp.databinding.FragmentHomeBinding
import com.example.clonesocialapp.databinding.FragmentSearchBinding
import com.google.android.exoplayer2.database.ExoDatabaseProvider
import com.google.android.exoplayer2.upstream.cache.SimpleCache

class SearchFragment : Fragment() {

    private var _binding:FragmentSearchBinding?=null
    private val binding get()=_binding!!
    private lateinit var mViewPager:ViewPager2
    private lateinit var viewPagerAdapter:SliderAdapter
    private val mImageList= listOf<String>(
    "https://images.pexels.com/photos/2446655/pexels-photo-2446655.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
    "https://images.pexels.com/photos/3757428/pexels-photo-3757428.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
    "https://images.pexels.com/photos/2421373/pexels-photo-2421373.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
    "https://images.pexels.com/photos/2453237/pexels-photo-2453237.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"


    )

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
        mViewPager=binding.vpHomeImageSlider
        viewPagerAdapter= SliderAdapter(mImageList)
        mViewPager.apply {
            adapter=viewPagerAdapter
        }


}

}