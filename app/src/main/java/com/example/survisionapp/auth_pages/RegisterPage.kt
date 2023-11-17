package com.example.survisionapp.auth_pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.survisionapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Register (){
    var textfieldstate by remember { mutableStateOf("") }
    Box (
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ){
        Column {
            Image(painter = painterResource(
                id = R.drawable.logo_with_type),
                contentDescription = "",
                Modifier
                    .fillMaxWidth()
                    .padding(25.dp)
                    .size(127.dp, 27.dp)
            )
//            BasicTextField(
//                modifier=Modifier
//                    .background(Color.LightGray)
//                    .size(300.dp,55.dp)
//                    .padding(16.dp)
//                ,
//
//                value = textfieldstate,
//                onValueChange = {it->
//                    textfieldstate=it
//                },
//
//            )
            OutlinedTextField(
                value = textfieldstate,
                onValueChange = {textfieldstate = it },
                placeholder = {
                    Text(text = "write here")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .clip( RoundedCornerShape(20.dp))
                    .shadow(5.dp)
                    .background(Color.White)
                ,
                colors = outlinedTextFieldColors(
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    cursorColor = Color.LightGray

                )
            )
            
            
        }



    }

}