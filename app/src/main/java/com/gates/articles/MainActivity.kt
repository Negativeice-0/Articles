package com.gates.articles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.gates.articles.ui.theme.ArticlesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticlesTheme {
                // A surface container using the 'background' color from the theme
              Column(
                  modifier = Modifier
                      .fillMaxSize()
                      .background(androidx.compose.ui.graphics.Color.Cyan)
              ) {

              }
                }
            }
        }
    }
// PROFILE header to start, notificaion bell to finish
@Composable
fun HeaderProfileComponent() {
    Row(
        // To create space off the top and between ui elements
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, top = 15.dp)
    ) {
        // For composables to bias to the center
        Row(verticalAlignment = Alignment.CenterVertically)
         Image(
             painter = painterResource(id = R.drawable.profile_picture),
             contentDescription = "Profile Picture" )
    }
}