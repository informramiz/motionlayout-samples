package github.informramiz.com.motionlayoutsamples.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import github.informramiz.com.motionlayoutsamples.R
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        setSupportActionBar(toolbar)

        val adapter = ViewPagerAdapter()
        view_pager.adapter = adapter
    }
}
