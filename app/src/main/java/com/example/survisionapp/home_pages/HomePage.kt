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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
            .background(Color.LightGray))

        
        
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