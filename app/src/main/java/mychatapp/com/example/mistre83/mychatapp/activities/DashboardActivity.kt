package mychatapp.com.example.mistre83.mychatapp.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import mychatapp.com.example.mistre83.mychatapp.R

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        supportActionBar!!.title = "Dashboard"

        if (intent.extras != null) {
            var username = intent.extras.get("name")

            Toast.makeText(this, username.toString(), Toast.LENGTH_LONG).show()
        }
    }
}
