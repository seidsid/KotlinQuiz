package com.example.kotlinquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
import java.text.SimpleDateFormat
import java.util.Date

class MainActivity : AppCompatActivity() {
    var radioGroup1: RadioGroup? = null;
    var radioGroup2: RadioGroup? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioGroup1 = findViewById(R.id.radioGroup);
        radioGroup2 = findViewById(R.id.radioGroup2);
        findViewById<Button>(R.id.button2).setOnClickListener{
            radioGroup1?.clearCheck();
            radioGroup2?.clearCheck();
        }

        findViewById<Button>(R.id.button).setOnClickListener{
            var total = 0;
            if(radioGroup1?.checkedRadioButtonId==R.id.radioButton13) {
                total+=50;
            }
            if(radioGroup2?.checkedRadioButtonId==R.id.radioButton21) {
                total+=50;
            }

            val alertDialogBuilder = AlertDialog.Builder(this);

            alertDialogBuilder.setTitle("Congrats! You submitted on ${SimpleDateFormat("yyyy-MM HH").format(Date())} you achieved $total %")
            alertDialogBuilder.show();
        }
    }
}