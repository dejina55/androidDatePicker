package com.dejina.datepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity2 : AppCompatActivity() {
    private lateinit var btnLoadCalender: Button
    private lateinit var  tvDate: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnLoadCalender = findViewById(R.id.btnLoadCalender)
        tvDate = findViewById(R.id.tvDate)

        btnLoadCalender.setOnClickListener{
            loadCalendar()
        }

    }
    private fun loadCalendar(){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this, DatePickerDialog.OnDateSetListener{
                    view, year, month, dayOfMonth ->
                tvDate.text = "Selected date : $dayOfMonth/${month+1}/$year"
            }, year, month, day
        )

        datePickerDialog.show()
    }
}