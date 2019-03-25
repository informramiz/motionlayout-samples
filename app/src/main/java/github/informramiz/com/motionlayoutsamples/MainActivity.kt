package github.informramiz.com.motionlayoutsamples

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import github.informramiz.com.motionlayoutsamples.customtoolbar.CollapsingToolbarActivity
import github.informramiz.com.motionlayoutsamples.viewpager.ViewPagerActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { startActivity(Intent(this, CollapsingToolbarActivity::class.java)) }
        button_viewpager.setOnClickListener { startActivity(Intent(this, ViewPagerActivity::class.java)) }
    }
}
