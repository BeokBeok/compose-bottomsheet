package com.beok.compose_bottomsheet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.beok.compose_bottomsheet.ui.theme.ComposebottomsheetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposebottomsheetTheme {
                HomeScreen()
            }
        }
    }
}
