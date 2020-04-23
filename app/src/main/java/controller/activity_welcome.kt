package controller

import android.content.Intent
import android.os.Bundle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_welcome.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    getstartedbutton.setOnClickListener {
        val leagueintent=Intent(this, Leagueactivity::class.java)
        startActivity(leagueintent)
    }
    }
}
