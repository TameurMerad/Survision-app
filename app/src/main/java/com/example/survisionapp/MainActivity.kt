package com.example.survisionapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.survisionapp.auth_pages.Register
import com.example.survisionapp.home_pages.Home
import com.example.survisionapp.models.home_page_models.itemList
import com.example.survisionapp.ui.theme.SurvisionappTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
                val colorStatusBar = Color(ContextCompat.getColor(this,R.color.orange_main))
                rememberSystemUiController().setStatusBarColor(colorStatusBar)
                Home(location = "Amizour", amount =2000  , withdrawDate ="12/02" , itemsList = itemList.toMutableList() )


        }
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
fun Preview (){

}

