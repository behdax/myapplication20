package controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import utilities.LEAGUE_EXTRA
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_skill.*
import utilities.SKILL_EXTRA

class SkillActivity : BaseActivity() {
var league=""
    var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
    league=intent.getStringExtra(LEAGUE_EXTRA)
        println(league)
    }
    fun onbeginners(view: View){
     ballers.isChecked=false
        skill="beginner"
    }
    fun onballers(view: View){
        beginners.isChecked=false
        skill="baller"
    }
    fun onfinishes(view:View){
if(skill!=""){
        val x=Intent(this,FinishActivity::class.java)
    x.putExtra(LEAGUE_EXTRA,league)
    x.putExtra(SKILL_EXTRA,skill)
        startActivity(x)}
        else{
    Toast.makeText(this,"please again  hurry up what are you doin",Toast.LENGTH_LONG).show()
        }
    }
}
