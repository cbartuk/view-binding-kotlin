package com.canbartukilic.viewbindingkotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.canbartukilic.viewbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // private lateinit var textView: TextView

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // binding.textView.text = " On Create Altindaki Kod"
        // textView = findViewById<TextView>(R.id.textView)
    }

    fun ismiDegistir(view : View) {
        println("degistir tiklandi")
        // val textView = findViewById<TextView>(R.id.textView)
        binding.textView.text ="Merhaba Kotlin"
    }
}