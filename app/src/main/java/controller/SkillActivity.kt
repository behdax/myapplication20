package controller

import android.os.Bundle
import utilities.LEAGUE_EXTRA
import com.example.myapplication.R

class SkillActivity : BaseActivity() {
var league=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
    league=intent.getStringExtra(LEAGUE_EXTRA)
        println(league)
    }
}
