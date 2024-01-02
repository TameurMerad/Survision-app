package com.example.survisionapp.User_pages

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
import com.example.survisionapp.Withdraw_pages.InfoCard
import com.example.survisionapp.globale_composables.BigButton

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserPage() {
    Scaffold {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ) {
            Column(Modifier.verticalScroll(rememberScrollState())) {
                Spacer(modifier = Modifier.height(70.dp))
                InfoCard("Name", "Soufyan Merad")
                Spacer(modifier = Modifier.height(10.dp))
                UserDocumentsCard(subtitle = "documents", title ="Not Verified" , onC = {})
                Spacer(modifier = Modifier.height(10.dp))
                InfoCard("Phone", "0675772266")
                Spacer(modifier = Modifier.height(10.dp))
                InfoCard("Email", "t_merad@survision.io")
                Spacer(modifier = Modifier.height(10.dp))
                InfoCard("Total Withdrawed", "95000 DA")
                Spacer(modifier = Modifier.height(10.dp))
                InfoCard("Total Responses", "200")
                Spacer(modifier = Modifier.height(10.dp))
                BigButton("Edit", onClick = {})
                Spacer(modifier = Modifier.height(47.dp))


            }

        }
    }
}

@Preview
@Composable
fun PreviewUserPage() {
    UserPage()
}