package com.tuanchung.halloandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tuanchung.halloandroid.ui.theme.HalloAndroidTheme
import androidx.compose.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            HalloAndroidTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GetLayout(
                        "Trang chu",
                        innerPadding
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GetLayout(title: String = "Trang chu", innerPadding: PaddingValues? = PaddingValues(10.dp)) {
    var count by rememberSaveable {
        mutableIntStateOf(0)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GetTextTitle(count.toString(), innerPadding)
        Button(onClick = {
            count++
        }) {
            Text(text = "Click me!")
        }
    }
}

@Composable
fun GetTextTitle(title: String = "Trang chu", innerPadding: PaddingValues? = PaddingValues(0.dp)) {
    Text(
        text = title,
        modifier = Modifier.padding(10.dp).fillMaxWidth(),
        fontSize = 30.sp,
        color = Color.Red,
        textAlign = TextAlign.Center
    )
}