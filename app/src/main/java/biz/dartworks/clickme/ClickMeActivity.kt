/**
 * Simple app to use as a target to test UI automation performance.
 */

package biz.dartworks.clickme

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_click_me.*


class ClickMeActivity : Activity() {

    var clickCount: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_me)
        clickcount.text = clickCount.toString()
        button.setOnClickListener {
            updateCount()
        }
    }

    private fun updateCount() {
        clickCount += 1
        clickcount.text = clickCount.toString()
    }
}

