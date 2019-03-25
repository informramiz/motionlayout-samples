package github.informramiz.com.motionlayoutsamples.viewpager

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.DimenRes
import androidx.viewpager.widget.PagerAdapter
import github.informramiz.com.motionlayoutsamples.R

/**
 * Created by Ramiz Raja on 25/03/2019
 */
class ViewPagerAdapter : PagerAdapter() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return 3
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageView = ImageView(container.context)
        imageView.layoutParams = ViewGroup.LayoutParams(
            container.context.getDimensionPixelSize(R.dimen.image_width),
            container.context.getDimensionPixelSize(R.dimen.image_height)
        )

        imageView.setImageResource(R.drawable.monterey)
        container.addView(imageView)
        return imageView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView((`object` as View))
    }

    private fun Context.getDimensionPixelSize(@DimenRes dimenRes: Int): Int {
        return resources.getDimensionPixelSize(dimenRes)
    }
}