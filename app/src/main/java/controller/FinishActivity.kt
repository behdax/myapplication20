package controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_finish.*
import utilities.LEAGUE_EXTRA
import utilities.SKILL_EXTRA

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
    val league=intent.getStringExtra(LEAGUE_EXTRA)
        val skill=intent.getStringExtra(SKILL_EXTRA)
    search.text="this is it $league $skill"
    }
}
