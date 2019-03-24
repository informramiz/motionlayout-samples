package github.informramiz.com.motionlayoutsamples.customtoolbar

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.appbar.AppBarLayout

/**
 * Created by Ramiz Raja on 24/03/2019
 */
class CollapsibleToolbar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : MotionLayout(context, attrs, defStyleAttr), AppBarLayout.OnOffsetChangedListener {
    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        //set motion layout progress
        progress = -verticalOffset / appBarLayout!!.totalScrollRange.toFloat()
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        (parent as? AppBarLayout)?.addOnOffsetChangedListener(this)
    }
}