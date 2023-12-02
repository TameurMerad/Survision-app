package com.example.survisionapp.home_pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.survisionapp.ui.theme.orangeMain

@Composable
fun WithdrawCard (Amount:Int){
    Card (
        modifier = Modifier
            .padding(20.dp),
        shape = RoundedCornerShape(15.dp),
        colors = CardDefaults.cardColors(
            contentColor = orangeMain,
            containerColor = orangeMain
        ),
        elevation = CardDefaults.cardElevation(22.dp)

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(15.dp)
        ) {
            Text(
                text =" ",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(
                text ="2,000 Da",
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                textAlign = TextAlign.Center,
                color = Color.White
                )
            Text(
                text ="withdraw on 18/07",
                fontWeight = FontWeight.SemiBold,
                fontSize = 19.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White
            )


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
        elevation = CardDefaults.cardElevation(22.dp)

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



@Preview
@Composable
fun Previeww (){
    SurveysAvailableCard(num = 5)
}