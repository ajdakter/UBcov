package com.ajdaakter.ubcov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class ProtectionActivity : AppCompatActivity() {
    var temp=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_protection)


    }
    fun changeFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }

    fun changeFragment(view: View) {

        temp++;

        if(temp==0){
            val intent = Intent(this, ProtectionActivity::class.java)
            startActivity(intent)
        }
        if(temp==1){
            changeFragment(FragmentProtection())
        }
        if(temp==2){
            changeFragment(FragmentProtectionOne())
        }
        if(temp==3){
            changeFragment(FragmentProtectionTwo())
        }
        if(temp==4){
            changeFragment(FragmentProtectionThree())
        }
        if(temp==5||temp>5){
            changeFragment(FragmentProtectionFour())
            temp=5;
        }


    }

    fun changeFragmentBack(view: View) {
        temp--;

        if(temp==0){
            val intent = Intent(this, ProtectionActivity::class.java)
            startActivity(intent)
        }
        if(temp<0){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        if(temp==1){
            changeFragment(FragmentProtection())
        }
        if(temp==2){
            changeFragment(FragmentProtectionOne())
        }
        if(temp==3){
            changeFragment(FragmentProtectionTwo())
        }
        if(temp==4){
            changeFragment(FragmentProtectionThree())
        }
    }
}
