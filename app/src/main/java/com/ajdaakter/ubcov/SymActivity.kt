package com.ajdaakter.ubcov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
class SymActivity : AppCompatActivity() {
    var   temp=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sym)

    }
    fun changeFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }

    fun changeFragment(view: View) {

        temp++;

        if(temp==0){
            val intent = Intent(this, SymActivity::class.java)
            startActivity(intent)
        }
        if(temp==1){
            changeFragment(FragmentSymptom())
        }
        if(temp==2){
            changeFragment(FragmentSymptomOne())
        }
        if(temp==3||temp>3){
            changeFragment(FragmentSymptomTwo())
            temp=3;
        }

    }

    fun changeFragmentBack(view: View) {
        temp--;

        if(temp==0){
            val intent = Intent(this, SymActivity::class.java)
            startActivity(intent)
        }
        if(temp<0){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        if(temp==1){
            changeFragment(FragmentSymptom())
        }
        if(temp==2){
            changeFragment(FragmentSymptomOne())
        }
    }
}
