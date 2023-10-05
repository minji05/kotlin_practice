package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnSave.setOnClickListener{
            saveData()
            Toast.makeText(this, "Data Saved.", Toast.LENGTH_SHORT).show()
        }
        loadData()
    }

    private fun saveData() {

        val pref = getSharedPreferences("pref",0)
        val edit = pref.edit()
        edit.putString("name",binding.etHello.text.toString())
        edit.apply()

    }

    private fun loadData() {

        val pref = getSharedPreferences("pref",0)
        binding.etHello.setText(pref.getString("",""))

    }
}
