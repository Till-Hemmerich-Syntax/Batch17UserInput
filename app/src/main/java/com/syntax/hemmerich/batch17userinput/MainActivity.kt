package com.syntax.hemmerich.batch17userinput

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.transition.Visibility

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ed_name = findViewById<EditText>(R.id.ed_name)
        val btn_printName = findViewById<Button>(R.id.btn_printName)
        val tv_greeting = findViewById<TextView>(R.id.tv_greeting)
        val rg_options = findViewById<RadioGroup>(R.id.rg_options)
        val tv_selectedoption = findViewById<TextView>(R.id.tv_selectedoption)
        val sw_polite = findViewById<Switch>(R.id.sw_polite)

        btn_printName.setOnClickListener {
            val name = ed_name.text

            if(sw_polite.isChecked){
                tv_greeting.text = "Hallo $name schön das du heute hier bist! :) "
            }else {
                tv_greeting.text = "Hallo $name"
            }

            val checkedOption = rg_options.checkedRadioButtonId
            when(checkedOption){
                R.id.rb_option_1 -> tv_selectedoption.text = "Option 1 wurde gewählt"
                R.id.rb_option_2 -> tv_selectedoption.text = "Option 2 wurde gewählt"
                R.id.rb_option_3 -> tv_selectedoption.text = "Option 3 wurde gewählt"
                else -> tv_selectedoption.text = "Bitte wähle eine Option"

            }
        }
    }
}