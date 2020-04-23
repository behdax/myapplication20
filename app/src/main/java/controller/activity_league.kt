package controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import utilities.LEAGUE_EXTRA
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_league.*

class Leagueactivity : BaseActivity() {
var selectedleague =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun onmens(view: View){
        womens.isChecked=false
        coeds.isChecked=false
        selectedleague="mens"


    }
    fun onwomens(view: View){
       mens.isChecked=false
        coeds.isChecked=false
        selectedleague="womens"

    }
    fun oncoeds(view:View){
mens.isChecked=false
        womens.isChecked=false
        selectedleague="coeds"
    }
    fun leagueNextClicked(view: View) {
        if (selectedleague != "") {
            val intentnextleague = Intent(this, SkillActivity::class.java)
            intentnextleague.putExtra(LEAGUE_EXTRA,selectedleague)
            startActivity(intentnextleague)

        }
        else
        {
            Toast.makeText(this, "please hurry up and select the league ", Toast.LENGTH_SHORT).show()
        }
    }}