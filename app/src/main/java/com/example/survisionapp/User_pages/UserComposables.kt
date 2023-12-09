package com.example.survisionapp.User_pages

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.survisionapp.R


@Composable
fun UserDocumentsCard(subtitle:String,title:String , onC: () -> Unit ){
    Card (
        modifier = Modifier
            .clickable {
                       onC()
            },
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(3.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),

        ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(15.dp)
            ) {

                Text(
                    text = subtitle,
                    fontFamily = FontFamily(Font(R.font.gotham_medium)),
                    fontWeight = FontWeight(300),
                    color = Color(0xFF585858),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .padding(5.dp),
                )

                Text(
                    text = title,
                    fontFamily = FontFamily(Font(R.font.gotham_bold)),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(5.dp),
                    textAlign = TextAlign.Start,
                    color = Color.Black
                )


            }

            Icon(painter = painterResource(id = R.drawable.go_icon), contentDescription = null , modifier =  Modifier.padding( 9.dp))

        }
    }
}

@Preview
@Composable
fun UserDocumentsCardPreview(){
    UserDocumentsCard(subtitle = "Your documents", title = "Upload your documents", onC = {})
}