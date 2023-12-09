package com.example.survisionapp.globale_composables

import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.survisionapp.R
import com.example.survisionapp.ui.theme.orangeMain

@Composable
fun BigButton (title : String , onClick :()->Unit){
    Card(

        shape = RoundedCornerShape(15.dp),
        colors = CardDefaults.cardColors(
            contentColor = orangeMain,
            containerColor = orangeMain
        ),
        elevation = CardDefaults.cardElevation(13.dp)

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            contentAlignment = Alignment.Center

        ){
            Text(
                text =title,
                fontFamily = FontFamily(Font(R.font.gotham_medium)),
                fontWeight = FontWeight(700),
                fontSize = 19.sp,
                textAlign = TextAlign.Start,
                color = Color.White
            )


        }
    }
}