package com.ajdaakter.ubcov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goSymptoms(view: View) {
        val intent = Intent(this, SymActivity::class.java)
        startActivity(intent)
    }

    fun goProtection(view: View) {
        val intent = Intent(this, ProtectionActivity::class.java)
        startActivity(intent)
    }
}
