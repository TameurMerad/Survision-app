package com.example.survisionapp.home_pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.survisionapp.R
import com.example.survisionapp.ui.theme.orangeMain

@Composable
fun WithdrawCard (Amount:Int , WhithdrawDate:String){
    Card (
        shape = RoundedCornerShape(15.dp),
        colors = CardDefaults.cardColors(
            contentColor = orangeMain,
            containerColor = orangeMain
        ),
        elevation = CardDefaults.cardElevation(10.dp)

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(15.dp)
        ) {

            Text(
                text ="",
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily(Font(R.font.gotham_bold)),
                fontSize = 19.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White
            )
            Text(
                text ="$Amount DA",
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily(Font(R.font.gotham_bold)),
                fontSize = 48.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                textAlign = TextAlign.Center,
                color = Color.White
                )
            Text(
                text ="withdraw on $WhithdrawDate",
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily(Font(R.font.gotham_bold)),
                fontSize = 19.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(10.dp))


        }


    }

}

@Composable
fun SurveysAvailableCard (num:Int){
    Card(

        shape = RoundedCornerShape(15.dp),
        colors = CardDefaults.cardColors(
            contentColor = orangeMain,
            containerColor = orangeMain
        ),
        elevation = CardDefaults.cardElevation(10.dp)

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)


        ){
            Text(
                text ="Surveys Available",
                fontWeight = FontWeight.SemiBold,
                fontSize = 19.sp,
                textAlign = TextAlign.Start,
                color = Color.White
            )
            Text(
                text ="$num",
                fontWeight = FontWeight.SemiBold,
                fontSize = 19.sp,
                textAlign = TextAlign.End,
                color = Color.White
            )

        }
    }

}


@Composable
fun SurveyNewsItem(title:String,description:String ){
        Card (
            shape = RoundedCornerShape(15.dp),
            elevation = CardDefaults.cardElevation(3.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),

            ){
            Column (
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            ){
                Text(
                    text = title,
                    fontFamily = FontFamily(Font(R.font.gotham_bold)),
                    fontWeight = FontWeight.Bold,
                    fontSize = 19.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    textAlign = TextAlign.Start,
                    color = Color.Black
                )

                Text(
                    text = description,
                    fontFamily = FontFamily(Font(R.font.gotham_light)),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    color = Color.Black
                )


            }
        }
    }








@Preview
@Composable
fun Previeww (){
    WithdrawCard(Amount = 1000, WhithdrawDate = "12/12")

}