package com.example.clonesocialapp.searchfragment

import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.text.Html
import android.transition.Slide
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.graphics.convertTo
import androidx.lifecycle.lifecycleScope
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.clonesocialapp.R
import com.example.clonesocialapp.databinding.FragmentHomeBinding
import com.example.clonesocialapp.databinding.FragmentSearchBinding
import com.google.android.exoplayer2.database.ExoDatabaseProvider
import com.google.android.exoplayer2.upstream.cache.SimpleCache
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.w3c.dom.Text

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
    private var line:Array<TextView?> = arrayOfNulls<TextView>(mImageList.size)
    private var onImageChangeCallBack=object :ViewPager2.OnPageChangeCallback(){
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            addLineView(position)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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
            registerOnPageChangeCallback(onImageChangeCallBack)
        }
        startFirstPicture()
        lifecycleScope.launch {
            while (true){
                for (i in 0..mImageList.size){
                    delay(10000000000)

                    if (i==0){
                        mViewPager.setCurrentItem(i,false)


                    }else{
                        mViewPager.setCurrentItem(i,true)


                    }
                }
            }
        }


}
    private fun addLineView(currentPage:Int){
        binding.progressLine.removeAllViews()
        for(i in mImageList.indices){
            line[i]= TextView(activity)
            if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.N){
                line[i]?.text = Html.fromHtml("&#8226",Html.FROM_HTML_MODE_LEGACY)
            }else{
                line[i]?.text = Html.fromHtml("",Html.FROM_HTML_MODE_LEGACY)
            }
            line[i]?.textSize=50f
            line[i]?.setTextColor(ContextCompat.getColor(requireContext(),R.color.white))
            binding.progressLine.addView(line[i])
        }

    }
    fun startFirstPicture(){
        val countDownTimer=object :CountDownTimer(20000,2000){
            override fun onTick(p0: Long) {
                if (binding.progressBar.progress<binding.progressBar.max){
                    binding.progressBar.progress+=10
                }else{
                    binding.progressBar.progress=5
                }
                if (binding.progressBar.secondaryProgress<binding.progressBar.max){
                    binding.progressBar.secondaryProgress+=1
                }else{
                    binding.progressBar.secondaryProgress=0
                }
            }


            override fun onFinish() {
                startSecondPicture()

            }

        }
        countDownTimer.start()
    }
    fun startSecondPicture(){
        val countDownTimer=object :CountDownTimer(20000,2000){
            override fun onTick(p0: Long) {
                if (binding.progressBar2.progress<binding.progressBar2.max){
                    binding.progressBar2.progress+=10
                }else{
                    binding.progressBar2.progress=0
                }
                if (binding.progressBar2.secondaryProgress<binding.progressBar2.max){
                    binding.progressBar2.secondaryProgress+=1
                }else{
                    binding.progressBar2.secondaryProgress=0
                }
            }


            override fun onFinish() {
                startThirdPicture()
            }

        }
        countDownTimer.start()
    }
    fun startThirdPicture(){
        val countDownTimer=object :CountDownTimer(20000,2000){
            override fun onTick(p0: Long) {
                if (binding.progressBar3.progress<binding.progressBar3.max){
                    binding.progressBar3.progress+=10
                }else{
                    binding.progressBar3.progress=0
                }
                if (binding.progressBar3.secondaryProgress<binding.progressBar3.max){
                    binding.progressBar3.secondaryProgress+=1
                }else{
                    binding.progressBar3.secondaryProgress=0
                }
            }


            override fun onFinish() {
                startFourthPicture()
            }

        }
        countDownTimer.start()
    }
    fun startFourthPicture(){
        val countDownTimer=object :CountDownTimer(20000,2000){
            override fun onTick(p0: Long) {
                if (binding.progressBar4.progress<binding.progressBar4.max){
                    binding.progressBar4.progress+=10
                }else{
                    binding.progressBar4.progress=0
                }
                if (binding.progressBar4.secondaryProgress<binding.progressBar4.max){
                    binding.progressBar4.secondaryProgress+=1
                }else{
                    binding.progressBar4.secondaryProgress=0
                }
            }


            override fun onFinish() {
                Toast.makeText(activity, "Stories Done", Toast.LENGTH_SHORT).show()
            }
        }
        countDownTimer.start()
    }


}