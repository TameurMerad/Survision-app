package com.example.survisionapp.survey_pages.all_surveys_page

import android.widget.Toast
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.survisionapp.R
import com.example.survisionapp.ui.theme.PurpleGrad
import com.example.survisionapp.ui.theme.orangeMain








@Composable
fun SurveyGoCard (name:String, responseAvailable:String , time:String,price:String , onClick: () -> Unit){
    Card (
        shape = RoundedCornerShape(15.dp),
        colors = CardDefaults.cardColors(
            contentColor = Color.Black,
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp)
            .border(
                2.dp,
                Brush.horizontalGradient(listOf(Color(0xFF9BE3F2), PurpleGrad)),
                RoundedCornerShape(15.dp)
            )
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
            ){
                Text(text = name,fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.gotham_medium)) , fontWeight = FontWeight(800), color = Color.Black, modifier = Modifier.padding( 5.dp))
                Text(text = "$responseAvailable Responses Available",fontSize = 14.sp, fontFamily = FontFamily(Font(R.font.gotham_medium)), fontWeight = FontWeight(300), color = Color(0xFF585858), modifier = Modifier.padding( 5.dp))
                Row (modifier = Modifier.padding( 5.dp)){
                    Text(text = "$time min",fontSize = 14.sp, fontFamily = FontFamily(Font(R.font.gotham_medium)), fontWeight = FontWeight(300), color = Color(0xFF585858) , modifier = Modifier.padding(end = 5.dp) )
                    Text(text = "$price DA / person",fontSize = 14.sp, fontFamily = FontFamily(Font(R.font.gotham_medium)), fontWeight = FontWeight(300), color = Color(0xFF585858))
                }
            }

            Icon(painter = painterResource(id = R.drawable.go_icon), contentDescription = null , modifier = Modifier.padding( 8.dp))


        }






        }
    }















@Preview
@Composable
fun PreviewSurveyGo (){
    val context = LocalContext.current
    SurveyGoCard(name = "Survey Name", responseAvailable = "10", time = "10", price = "2000", onClick = {
        Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
    })
}