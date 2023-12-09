package com.example.survisionapp.auth_pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.survisionapp.R
import com.example.survisionapp.globale_composables.BigButton

@Composable
fun Login (){

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(15.dp)
        .background(Color.White),

        contentAlignment = Alignment.Center
    ){
        Column {
            AuthTextField(  "Email")
            Spacer(modifier = Modifier.fillMaxHeight(0.02f))
            AuthTextField(  "Password")
            Spacer(modifier = Modifier.fillMaxHeight(0.02f))
            Text(
                modifier = Modifier.fillMaxWidth().padding(start = 5.dp),
                text = "Forgot your password ?",
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp,
                color = Color(0xFFF26E23),
                textAlign = TextAlign.Start

                )
            Spacer(modifier = Modifier.fillMaxHeight(0.02f))

            BigButton(title = "Login", onClick = {})





        }



    }



    Box(modifier = Modifier
        .fillMaxSize()
        .padding(15.dp),
        contentAlignment = Alignment.TopCenter
    ){

        Spacer(modifier = Modifier.height(25.dp))
        Image(painter = painterResource(
            id = R.drawable.logo_with_type),
            contentDescription = "",
            Modifier
                .fillMaxWidth()
                .padding(25.dp)
                .size(127.dp, 27.dp)
        )


    }


}