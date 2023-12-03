package com.example.survisionapp.home_pages

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.survisionapp.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(location:String){
    Scaffold {
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
           ){




            Column (Modifier.verticalScroll(rememberScrollState())){
                Spacer(modifier = Modifier.height(70.dp))
                WithdrawCard(Amount = 2000)
                Spacer(modifier = Modifier.height(10.dp))
                SurveysAvailableCard(num = 5)
                Spacer(modifier = Modifier.height(9.dp))

//                LazyColumn(){
//                    items(itemList){
//                        SurveyNewsItem(title = it.title, description =it.description )
//
//                    }
//                }
                Column(){
                    for (index in itemList){
                        SurveyNewsItem(title = index.title, description =index.description )
                        Spacer(modifier = Modifier.height(7.dp))

                    }
                }

            }




        }

        
        
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            contentAlignment = Alignment.TopCenter
        ){
            Column {
//                Spacer(modifier = Modifier.height(25.dp))
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
                        Text(text = location,
                            fontWeight = FontWeight.Medium,
                            fontSize = 19.sp
                            )
                    }


                }
            }
        }


        
        
    }
    
    
    
}


@Preview
@Composable
fun Preview (){
    Home(location = "Azazga")
}