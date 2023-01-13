package com.pbjournal.greetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pbjournal.greetings.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.greetingButton.setOnClickListener {
            val greetingText = getString(R.string.greeting_tet)
            Toast.makeText(applicationContext, greetingText, Toast.LENGTH_LONG).show()
        }
        binding.messageButton.setOnClickListener {
            val messageText = getString(R.string.message_text)
            Toast.makeText(applicationContext, messageText, Toast.LENGTH_LONG).show()
        }
    }
}