package com.example.composeproject

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.content.MediaType.Companion.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeproject.ui.theme.ComposeProjectTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("hello world")
                }
            }
        }


@Composable
fun textCompose(name: String) {
    Row (
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(Color.Green)
            .fillMaxSize()

    )
    {
        Text (
            text="Hello $name!",
            color = Color.Blue,
            fontSize = 20.sp,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(20.dp)
                .background(Color.Green)
                .alpha(0.8f),
                textAlign = TextAlign.Center
        )
        Text (
            text="some other text",
            color = Color.Blue,
            fontSize = 20.sp,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(20.dp)
                .background(Color.Green)
        )
    }

}

@Composable
fun imageCompose() {
    Image(
        painter = painterResource(id = R.drawable.heart),
        contentDescription = "Image of heart",

    )
}



@Preview(showBackground = true)
@Composable
private fun preview() {
    imageCompose()
}
