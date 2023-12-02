package com.example.survisionapp.auth_pages

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.survisionapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthTextField (title: String){
    var textfieldstate by remember { mutableStateOf("") }

    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 3.dp
        )
    ){
        OutlinedTextField(
            value = textfieldstate,
            onValueChange = {textfieldstate = it },
            placeholder = {
                Text(text = "$title")
            },
            colors = ExposedDropdownMenuDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.White,
                cursorColor = Color.LightGray)
            ,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
            ,
        )

    }
}


@Composable
fun AuthCheckBox(text: AnnotatedString, checked : Boolean){
    val checkedState = remember { mutableStateOf(checked) }

    Row(
        modifier = Modifier
            .clickable (
                interactionSource = MutableInteractionSource(),
                indication = null,
                onClick = { checkedState.value = !checkedState.value }
                ),
        verticalAlignment = Alignment.CenterVertically,

    ) {
        RadioButton(selected = checkedState.value, onClick  = {checkedState.value = !checkedState.value},
            colors = RadioButtonDefaults.colors(
                selectedColor = Color(0xFFF26E23),
                unselectedColor = Color(R.color.orange_main),
                disabledSelectedColor = Color(R.color.orange_main),
                disabledUnselectedColor = Color(R.color.orange_main)
            ),
            modifier = Modifier.size(30.dp)


        )
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 5.dp),
            fontSize = 17.sp
            )

    }


}

@Composable
fun SignButton (text:String){
    Button (
        onClick = {},
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFF26E23),
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(12.dp),
        elevation = ButtonDefaults.buttonElevation(20.dp)


        ){
        Text(text = text, fontWeight = FontWeight.Bold, fontSize = 20.sp)

    }

}