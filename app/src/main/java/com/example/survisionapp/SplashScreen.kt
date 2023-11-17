package com.example.survisionapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Animatable
import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.Animatable
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.delay

class SplashScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent {
                val statbar = rememberSystemUiController()
                statbar.setStatusBarColor(Color(ContextCompat.getColor(this,R.color.orange_main)))
                splashScreen()
            }

    }
    @SuppressLint("RememberReturnType")
    @Composable
    fun splashScreen(){
        val alpha = remember{
            androidx.compose.animation.core.Animatable(0f)
        }
        LaunchedEffect(key1 = true, block = {
            alpha.animateTo(1f,
                animationSpec = tween(1200)
                )
            startActivity(Intent(this@SplashScreen , MainActivity::class.java))
        })
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(

                id = R.drawable.splash_bg),
                contentDescription ="",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
                )
            Image(painter = painterResource(
                id = R.drawable.logo),
                contentDescription ="",
                Modifier
                    .size(100.dp, 100.dp)
                    .alpha(alpha.value)
            )
        }
    }





}