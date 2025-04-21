package com.example.badminton_record

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.badminton_record.ui.HomeScreen
import com.example.badminton_record.viewmodel.HomeViewModel
import com.example.badminton_record.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    HomeScreen(viewModel = viewModel)
                }
            }
        }
    }
}


