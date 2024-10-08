package tz.co.pesalock

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import org.jetbrains.compose.resources.painterResource
import pesalock.composeapp.generated.resources.Res
import pesalock.composeapp.generated.resources.herobgimage
import tz.co.pesalock.HowToUse.HowToUseApp
import tz.co.pesalock.navigation.Navigation

@Composable
fun Content() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color.White
            )
            .verticalScroll(
                state = rememberScrollState(0),
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.TopStart
        ) {
            Image(
                painter = painterResource(Res.drawable.herobgimage),
                contentDescription = "hero background",
                contentScale = ContentScale.Fit
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = Color(0xFFFFFFF)
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Navigation()
                HeroSection()
                HowToUseApp()
            }


        }

    }
}