package com.example.survisionapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.navigation.compose.rememberNavController
import com.example.survisionapp.home_pages.BtmNavBar
import com.example.survisionapp.home_pages.Home
import com.example.survisionapp.home_pages.itemList
import com.example.survisionapp.navigation.Navigation
import com.example.survisionapp.survey_pages.all_surveys_page.AllSurveysPage
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
                val navController = rememberNavController()
                val colorStatusBar = Color(ContextCompat.getColor(this,R.color.orange_main))
                rememberSystemUiController().setStatusBarColor(colorStatusBar)
            Box(modifier = Modifier.fillMaxSize()){
                Navigation(navController)
            }

// app bar box
            Box (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                contentAlignment = Alignment.TopCenter
            ){
                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp)
                ){
                    Image(painter = painterResource(
                        id = R.drawable.logo_with_type),
                        contentDescription = "",
                        Modifier
                            .size(127.dp, 27.dp)
                    )
                    Row(horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(painter = painterResource(id = R.drawable.map_svg),
                            contentDescription ="",
                            Modifier
                                .size(25.dp, 25.dp)
                                .padding(end = 5.dp)
                        )
                        Text(text = "Amizour",
                            fontFamily = FontFamily(Font(R.font.gotham_medium)),
                            fontWeight = FontWeight.Medium,
                            fontSize = 19.sp
                        )
                    }


                }

            }
 // btm nav bar
            Box(modifier = Modifier
                .fillMaxSize()
                ,
                contentAlignment = Alignment.BottomEnd ){


//                BtmNavBar(
//                    navController,
//                    itemList = listOf(
//                    painterResource(id = R.drawable.home),
//                    painterResource(id = R.drawable.survey_icon),
//                    painterResource(id = R.drawable.dollar_sign_icon),
//                    painterResource(id = R.drawable.user_icon)
//                ),
//                    modifier = Modifier.height(70.dp)
//
//                )

                NavigationBar {
                    BottomNavigationIte
                }
            }

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

