package mychatapp.com.example.mistre83.mychatapp.activities

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dashboard.*
import mychatapp.com.example.mistre83.mychatapp.R
import mychatapp.com.example.mistre83.mychatapp.adapters.SectionPagerAdapter

class DashboardActivity : AppCompatActivity() {

    lateinit var sectionAdapter: SectionPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        supportActionBar!!.title = "Dashboard"

        sectionAdapter = SectionPagerAdapter(supportFragmentManager)
        dashViewPagerId.adapter = sectionAdapter
        mainTabs.setupWithViewPager(dashViewPagerId)
        mainTabs.setTabTextColors(Color.WHITE, Color.GREEN)

        if (intent.extras != null) {
            var username = intent.extras.get("name")

            Toast.makeText(this, username.toString(), Toast.LENGTH_LONG).show()
        }
    }
}
