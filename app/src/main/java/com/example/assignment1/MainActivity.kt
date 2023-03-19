package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_click_me = findViewById(R.id.button) as Button
        btn_click_me.setOnClickListener {
            Toast.makeText(this@MainActivity, "coming soon", Toast.LENGTH_SHORT).show()

            val genres = resources.getStringArray(R.array.Genres)
            val spinner = findViewById<Spinner>(R.id.spinner)
            if (spinner != null) {
                val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, genres)
                spinner.adapter = adapter
                spinner.onItemSelectedListener = object :
                    AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(
                        parent: AdapterView<*>,
                        view: View, position: Int, id: Long
                    ) {
                        Toast.makeText(
                            this@MainActivity,
                            getString(R.string.selected_item) + " " +
                                    "" + genres[position], Toast.LENGTH_SHORT
                        ).show()
                    }

                    override fun onNothingSelected(parent: AdapterView<*>) {

                    }

                }
            }
        }

    }
}