package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        
            Column (
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(text = "Main: the screen time")
                Spacer(modifier = Modifier.size(16.dp))



            }
                Button(onClick = { }) {
                    Text(text = "Submit")
                }
                Button(onClick = {
                    val nav = Intent(this@MainScreen, Datailscreen::class.java)
                    startActivity(nav)
                }) {
                    Text(text = "View Details")

                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "clear")

                }

            }
    }

    private fun OutlinedTextField(
        value: MutableSet<String>,
        onValueChange: Any,
        placeholder: () -> Unit
    ) {

    }
}







