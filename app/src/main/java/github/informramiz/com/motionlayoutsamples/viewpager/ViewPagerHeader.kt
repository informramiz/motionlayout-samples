package github.informramiz.com.motionlayoutsamples.viewpager

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.viewpager.widget.ViewPager

/**
 * Created by Ramiz Raja on 25/03/2019
 */
class ViewPagerHeader @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : MotionLayout(context, attrs, defStyleAttr), ViewPager.OnPageChangeListener {
    override fun onPageScrollStateChanged(state: Int) {

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        val numOfPages = 3
        progress = (position + positionOffset) / (numOfPages - 1)
    }

    override fun onPageSelected(position: Int) {

    }
}