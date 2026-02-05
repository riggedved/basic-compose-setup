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
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var count by remember {
                mutableStateOf(0)
            }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = count.toString(),
                    fontSize = 30.sp
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(onClick = {
                        count++
                    })
                    {
                        Text(
                            text = "Click me"
                        )
                    }
                    Button(onClick = {
                        count=0
                    })
                    {
                        Text(
                            text="Reset"
                        )
                    }
                }
            }

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
fun imageCompose(color: String) {
    if (color == "black") {
        Image(
            painter = painterResource(id = R.drawable.heart),
            contentDescription = "Image of heart",
            modifier = Modifier
                .background(Color.Black)
        )
    } else {
        Image(
            painter = painterResource(id = R.drawable.heart),
            contentDescription = "Image of heart",
            modifier = Modifier
                .background(Color.Green)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun preview() {
    ComponentActivity()
}
