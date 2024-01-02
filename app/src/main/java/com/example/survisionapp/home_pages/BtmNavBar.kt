package com.example.survisionapp.home_pages

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.example.survisionapp.navigation.BtmNavGraph
import com.example.survisionapp.ui.theme.orangeMain

@Composable
fun BtmNavBar(
    navController:NavController,
    itemList: List<Painter>,
    modifier: Modifier = Modifier,
    inialSelectedItemIndex: Int = 0
) {
    val context = LocalContext.current
    var selectedItemIndex by remember { mutableStateOf(inialSelectedItemIndex) }
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(15.dp)
    ) {
        itemList.forEachIndexed { index, btmNavData ->
            BtmNavBarItem(
                item = btmNavData,
                isSelected = index == selectedItemIndex,
                onItemClick = {
                    selectedItemIndex = index // to do : navigate to the selected screen
                    when (index){
                        0 -> navController.navigate(BtmNavGraph.HomeScreen.route){
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                        1 -> navController.navigate(BtmNavGraph.AllSurveyScreen.route){
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                        2 -> navController.navigate(BtmNavGraph.WithdrawScreen.route){
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                        3 -> navController.navigate(BtmNavGraph.UserScreen.route){
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }

                    }


                }
            )
        }


    }


}

@Composable
fun BtmNavBarItem(
    item: Painter,
    isSelected: Boolean = false,
    onItemClick: () -> Unit
) {
    Icon(
        painter = item,
        contentDescription = "icon",
        tint = if (isSelected) orangeMain else Color.Black,
        modifier = Modifier
            .size(34.dp)
            .clickable {
                onItemClick()
            }
    )

}
