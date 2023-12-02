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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.survisionapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Register (){
val policyText = buildAnnotatedString {
    withStyle(style = SpanStyle(color = Color.Black)) {
        append("I agree on ")
    }
    withStyle(style = SpanStyle(color = Color(0xFFF26E23))) {
        append("Privacy Policy and Laws")
    }
}


    Box (
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
            .background(Color.White)
    ){


        Column {
            Spacer(modifier = Modifier.height(25.dp))
            Image(painter = painterResource(
                id = R.drawable.logo_with_type),
                contentDescription = "",
                Modifier
                    .fillMaxWidth()
                    .padding(25.dp)
                    .size(127.dp, 27.dp)
            )

            Spacer(modifier = Modifier.fillMaxHeight(0.04f))
            AuthTextField("First Name")
            Spacer(modifier = Modifier.fillMaxHeight(0.02f))
            AuthTextField( "Last Name")
            Spacer(modifier = Modifier.fillMaxHeight(0.02f))
            AuthTextField(  "Email")
            Spacer(modifier = Modifier.fillMaxHeight(0.02f))
            AuthTextField(  "Password")
            Spacer(modifier = Modifier.fillMaxHeight(0.02f))
            AuthTextField( "Confirm Password")
            Spacer(modifier = Modifier.fillMaxHeight(0.05f))
            AuthCheckBox(buildAnnotatedString { append("I agree on receiving emails and sms") },false)
            Spacer(modifier = Modifier.fillMaxHeight(0.02f))
            AuthCheckBox(policyText,true)
            Spacer(modifier = Modifier.fillMaxHeight(0.1f))
            SignButton(text = "Sign Up")
//            Spacer(modifier = Modifier.fillMaxHeight(0.1f))
//            Text(
//                modifier = Modifier.fillMaxWidth(),
//                text = "login",
//                fontWeight = FontWeight.Bold,
//                fontSize = 20.sp,
//                color = Color(0xFFF26E23),
//                textAlign = TextAlign.Center
//
//                )








        }



    }


}


