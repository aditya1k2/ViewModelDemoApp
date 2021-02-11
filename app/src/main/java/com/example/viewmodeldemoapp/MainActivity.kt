package com.example.viewmodeldemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {
    //private lateinit var viewModel: ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: ViewModel = ViewModelProvider(this).get(ViewModel::class.java)
        //viewModel = ViewModelProvider(this).get(viewModel::class.java)


        val text = findViewById<TextView>(R.id.textCounter)
        val button = findViewById<Button>(R.id.AddButton)




        text.text = viewModel.defaultCount.toString()

        button.setOnClickListener {

            var counter = viewModel.plusCounter()
            text.text = counter.toString()

        }


    }

    override fun onStart() {
        Log.d("ViewModel", "OnStart Called in MainActivity")
        super.onStart()
    }

    override fun onResume() {
        Log.d("ViewModel", "OnResume Called in MainActivity")
        super.onResume()
    }

    override fun onPause() {
        Log.d("ViewModel", "OnPause Called in MainActivity")
        super.onPause()
    }

    override fun onStop() {
        Log.d("ViewModel", "OnStop Called in MainActivity")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("ViewModel", "OnDestroy Called in MainActivity")
        super.onDestroy()
    }

    override fun finish() {
        Log.d("ViewModel", "Finish Called in MainActivity")
        super.finish()
    }

    override fun onRestart() {
        Log.d("ViewModel", "OnRestart Called in MainActivity")
        super.onRestart()
    }
}