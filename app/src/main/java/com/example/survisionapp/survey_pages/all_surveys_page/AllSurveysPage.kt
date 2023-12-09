package com.example.survisionapp.survey_pages.all_surveys_page

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.survisionapp.globale_composables.BigButton

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllSurveysPage () {
    Scaffold {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ) {
            Column(Modifier.verticalScroll(rememberScrollState())) {
                Spacer(modifier = Modifier.height(70.dp))
                BigButton(title = "General Guide" , onClick = {})
                Spacer(modifier = Modifier.height(10.dp))
                SurveyGoCard(name = "My First Survey" , responseAvailable = "15" , time ="5" , price ="200" , onClick = {})

            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewAllSurveysPage() {
    AllSurveysPage()
}