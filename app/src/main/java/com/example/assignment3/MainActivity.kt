package com.example.assignment3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {
    val min = 1
    val max = 100
    var total = 0
    var counter = 0
    var btn1value = 0
    var btn2value = 0

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var counterResult: TextView
    private lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        result = findViewById(R.id.result)
        counterResult = findViewById(R.id.counterResult)
        setText()
        btn1.setOnClickListener {


            if (counter < 10) {
                counter += 1
                counterResult.text = "Count:$counter"

                if (btn1value > btn2value) {

                    total += 1
                }

                setText()
                if(counter == 10){
                    result.text = "Your total correct answer is $total"
                }


            }

        }

        btn2.setOnClickListener {


            if (counter < 10) {
                counter += 1
                counterResult.text = "Count:$counter"

                if (btn2value > btn1value) {

                    total += 1
                }


                setText()
                if(counter == 10){
                    result.text = "Your total correct answer is $total"
                }
            }


        }
    }


    private fun getRandomNumber(min: Int, max: Int): Int {
        return Random().nextInt(max - min + 1) + min
    }

    private fun setText() {
        btn1value = getRandomNumber(min, max)
        btn2value = getRandomNumber(min, max)
        btn1.text = btn1value.toString()
        btn2.text = btn2value.toString()
    }
}