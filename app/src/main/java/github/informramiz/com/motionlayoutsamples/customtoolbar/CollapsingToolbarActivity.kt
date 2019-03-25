package github.informramiz.com.motionlayoutsamples.customtoolbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import github.informramiz.com.motionlayoutsamples.R

class CollapsingToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsible_toolbar)
//        setSupportActionBar(toolbar)
    }
}
