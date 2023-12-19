package com.example.iorgaelysgabriela_practicapmdm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.iorgaelysgabriela_practicapmdm.ui.theme.IorgaElysGabriela_practicaPMDMTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val btnExplora: Button = findViewById(R.id.btnExplora)

        btnExplora.setOnClickListener {
            val intent = Intent(this, SegundaPantalla::class.java)
            startActivity(intent)
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        IorgaElysGabriela_practicaPMDMTheme {
            Greeting("Android")
        }
    }
}
