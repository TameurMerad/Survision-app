package com.example.survisionapp.home_pages

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
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
import com.example.survisionapp.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(location:String,amount:Int, withdrawDate:String,itemsList: MutableList<Item>){
    Scaffold {
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
           ){
            Column (Modifier.verticalScroll(rememberScrollState())){
                Spacer(modifier = Modifier.height(70.dp))
                WithdrawCard(amount,withdrawDate)
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
                    for (index in itemsList){
                        SurveyNewsItem(title = index.title, description =index.description )
                        Spacer(modifier = Modifier.height(7.dp))
                    }
                    Spacer(modifier = Modifier.height(47.dp))

                }

            }
        }





    }
    
    
    
}


@Preview
@Composable
fun Preview (){
    Home(location = "Azazga",5000,"15/04", itemList.toMutableList())
}