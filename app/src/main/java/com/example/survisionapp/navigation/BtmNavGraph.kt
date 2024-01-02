package com.example.survisionapp.navigation

sealed class BtmNavGraph(val route:String) {

 object HomeScreen:BtmNavGraph("home_screen")
 object AllSurveyScreen:BtmNavGraph("all_surveys_screen")
 object WithdrawScreen:BtmNavGraph("withdraw_screen")
 object UserScreen:BtmNavGraph("user_screen")

}