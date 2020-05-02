package school.portal.appdev

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    private lateinit var mViewPager: ViewPager
    private lateinit var firstBtn: Button
    private lateinit var secondBtn: Button
    private lateinit var thirdBtn: Button
    private lateinit var fourthBtn: Button
    private lateinit var mPagerViewAdapter: PagerAdapter
    private lateinit var navText: TextView
    private lateinit var submit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pageNavigation()
    }

    private fun pageNavigation() {
        //init view

        navText = findViewById(R.id.currentNavigationText)

        mViewPager = findViewById(R.id.mViewPager)
        firstBtn = findViewById(R.id.homeButton)
        secondBtn = findViewById(R.id.gradesButton)
        thirdBtn = findViewById(R.id.scheduleButton)
        fourthBtn = findViewById(R.id.profileButton)
        resetButtonColor(firstBtn)
        mPagerViewAdapter = PagerViewAdapter(supportFragmentManager)
        mViewPager.adapter = mPagerViewAdapter
        mViewPager.offscreenPageLimit = 4

        firstBtn.setOnClickListener {
            mViewPager.currentItem = 0

        }
        secondBtn.setOnClickListener {
            mViewPager.currentItem = 1

        }
        thirdBtn.setOnClickListener {
            mViewPager.currentItem = 2

        }
        fourthBtn.setOnClickListener {
            mViewPager.currentItem = 3

        }

        mViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                changeTabs(position)
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })
        mViewPager.currentItem = 0
    }

    private fun changeTabs(position: Int) {

        if (position == 0) {
            resetButtonColor(firstBtn)
            navText.text = "Home"
        }
        if (position == 1) {
            resetButtonColor(secondBtn)
            navText.text = "Grades"
        }
        if (position == 2) {
            resetButtonColor(thirdBtn)
            navText.text = "Schedule"
        }
        if (position == 3) {
            resetButtonColor(fourthBtn)
            navText.text = "Profile"
        }
    }
    private fun resetButtonColor(button: Button) {

        val color = 497274
        firstBtn.setBackgroundColor(color)
        secondBtn.setBackgroundColor(color)
        thirdBtn.setBackgroundColor(color)
        fourthBtn.setBackgroundColor(color)

        firstBtn.setTextColor(Color.WHITE)
        secondBtn.setTextColor(Color.WHITE)
        thirdBtn.setTextColor(Color.WHITE)
        fourthBtn.setTextColor(Color.WHITE)

//        button.setOnClickListener{
//            Toast.makeText(applicationContext, "fail", Toast.LENGTH_SHORT)
//                .show()
//        }
        button.setTextColor(Color.BLACK)
        button.setBackgroundColor(Color.WHITE)
    }
}
    