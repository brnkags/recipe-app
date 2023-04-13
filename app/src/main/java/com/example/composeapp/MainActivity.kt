package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            Column{
                TopAppBar(title = {
                    Text("My Recipes")
                })
                RecipeList(recipes = defaultRecipes)
            }
        }
    }


    @Preview
    @Composable
    fun greeting() {

        Text(
            "Brian",
            style = TextStyle(color = Color.Red, fontWeight = FontWeight.Bold)
        )
        Text("Duke", style = TextStyle(color = Color.Red, fontWeight = FontWeight.Light))
        Text("Debbie", style = TextStyle(color = Color.Red, fontSize = 20.sp))
    }


    @Preview
    @Composable
    fun greeting2() {
//        inside this function we can declare composable units // widgets need meta data // unit in composable called the column composable
        Column {
            Text(
                "Brian",
                style = TextStyle(color = Color.Black, fontStyle = FontStyle.Italic)
            )
            Text(
                "Duke",
                style = TextStyle(color = Color.Black),
                modifier = Modifier.padding(all = 20.dp)
            )
            Text("Debbie", style = TextStyle(color = Color.Black))
        }
    }
    // https://www.tutorialkart.com/android-jetpack-compose/  :  check button , image, card

}
