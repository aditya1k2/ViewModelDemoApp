package com.example.viewmodeldemoapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {


    var defaultCount = 0;
//    val count: LiveData<Int>


    fun plusCounter():Int{
        defaultCount++;
        return defaultCount
    }

    override fun onCleared() {
        Log.d("ViewModel","OnCleared Called in ViewModel")
        super.onCleared()
    }
}