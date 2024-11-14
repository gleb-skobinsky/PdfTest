package com.example.pdftest

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pdftest.ui.theme.PdfTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var isOpen by remember { mutableStateOf(false) }
            PdfTestTheme {
                Box(Modifier.fillMaxSize(), Alignment.Center) {
                    Button(
                        onClick = {
                            isOpen = !isOpen
                        }
                    ) {
                        Text("Open pdf")
                    }
                    if (isOpen) {

                    }
                }
            }
        }
    }

    private fun getFileUri(): Uri {
        return Uri.parse("file:///android_asset/advocall_instructions.pdf")
    }
}
