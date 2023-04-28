package com.gvpce.birthdaycardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.gvpce.birthdaycardapp.ui.theme.BirthdaycardappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdaycardappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Nishanth","Sai")


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,from:String) {
    Box(Modifier.fillMaxSize()) {
        Image(painter = painterResource(id =R.drawable.birthdaycard) , contentDescription = null, contentScale = ContentScale.FillBounds)
        Text(text = "Happy Birthday $name!", modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "From :- $from", modifier = Modifier.align(Alignment.Center))
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdaycardappTheme {
        Greeting("Nishanth","Sai")

    }
}