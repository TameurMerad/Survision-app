package com.example.survisionapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.survisionapp.User_pages.UserPage
import com.example.survisionapp.Withdraw_pages.WithdrawPage
import com.example.survisionapp.home_pages.Home
import com.example.survisionapp.home_pages.itemList
import com.example.survisionapp.survey_pages.all_surveys_page.AllSurveysPage

@Composable
fun Navigation (navController:NavHostController = rememberNavController()){

NavHost(navController = navController, startDestination = BtmNavGraph.HomeScreen.route ){

    composable(route = BtmNavGraph.HomeScreen.route){
        Home(navController, amount = 2000, withdrawDate ="21/05" , itemsList = itemList.toMutableList() )
    }
    composable(route = BtmNavGraph.AllSurveyScreen.route){
        AllSurveysPage()
    }
    composable(route = BtmNavGraph.WithdrawScreen.route){
        WithdrawPage()
    }
    composable(route = BtmNavGraph.UserScreen.route){
        UserPage()
    }




}

}