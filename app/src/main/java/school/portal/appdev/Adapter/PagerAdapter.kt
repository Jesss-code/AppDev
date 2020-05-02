package school.portal.appdev

 import school.portal.appdev.Fragment.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


@Suppress("DEPRECATION")
internal class PagerViewAdapter (fm:FragmentManager?):
        FragmentPagerAdapter(fm!!){
    override fun getItem(position: Int): Fragment {
        return when(position)
            {0->{
            FirstFragment()
            }1->{
                SecondFragment()
            }2->{
                ThirdFragment()
            }3->{
            FourthFragment()
        }else -> FirstFragment()
        }
    }

    override fun getCount(): Int {
        return 4
    }
}