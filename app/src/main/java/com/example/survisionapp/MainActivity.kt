package com.example.survisionapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import com.example.survisionapp.survey_pages.all_surveys_page.AllSurveysPage
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
                val colorStatusBar = Color(ContextCompat.getColor(this,R.color.orange_main))
                rememberSystemUiController().setStatusBarColor(colorStatusBar)
//                Home(location = "Amizour", amount =2000  , withdrawDate ="12/02" , itemsList = itemList.toMutableList() )
                AllSurveysPage()

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

