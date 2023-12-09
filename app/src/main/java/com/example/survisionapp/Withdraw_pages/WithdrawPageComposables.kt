package com.example.survisionapp.Withdraw_pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.survisionapp.R



@Composable
fun SurveyNewsItem(title:String,subtitle:String ){
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
                text = subtitle,
                fontFamily = FontFamily(Font(R.font.gotham_medium)),
                fontWeight = FontWeight(300),
                color = Color(0xFF585858),
                fontSize = 18.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
            )

            Text(
                text = title,
                fontFamily = FontFamily(Font(R.font.gotham_bold)),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                textAlign = TextAlign.Start,
                color = Color.Black
            )


        }
    }
}

@Preview
@Composable
fun PreviewSurveyNewsItem(){
    SurveyNewsItem(title = "Survey Title", subtitle = "Survey Description")
}