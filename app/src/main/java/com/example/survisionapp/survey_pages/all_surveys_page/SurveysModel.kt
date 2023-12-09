package com.example.survisionapp.survey_pages.all_surveys_page

data class SurveyItem(
    val name: String,
    val responseAvailable: String,
    val time: String,
    val price: String
)

val allSurveysList = listOf(
    SurveyItem(name = "Survey 1", responseAvailable = "20", time = "7", price = "150"),
    SurveyItem(name = "Survey 2", responseAvailable = "12", time = "4", price = "100"),
    SurveyItem(name = "Survey 3", responseAvailable = "25", time = "8", price = "180"),
    SurveyItem(name = "Survey 4", responseAvailable = "18", time = "6", price = "120"),
    SurveyItem(name = "Survey 5", responseAvailable = "30", time = "10", price = "200"),
    SurveyItem(name = "Survey 6", responseAvailable = "15", time = "5", price = "160"),
    SurveyItem(name = "Survey 7", responseAvailable = "22", time = "7", price = "140"),
    // Add more items as needed
)