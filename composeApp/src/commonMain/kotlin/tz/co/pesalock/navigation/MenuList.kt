package tz.co.pesalock.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuList(){
    Row(
        modifier = Modifier
            .fillMaxWidth(.5f)
            .fillMaxHeight()
            .padding(start = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "Home",
            fontSize = 16.sp,
            color = Color(0xFF2F4858),
            fontWeight = FontWeight(800)
        )
        Text(
            text = "How It Works",
            fontSize = 16.sp,
            color =Color(0xFF2F4858),
            fontWeight = FontWeight(800)
        )
        Text(
            text = "Services",
            fontSize = 16.sp,
            color = Color(0xFF2F4858),
            fontWeight = FontWeight(800)
        )
        Text(
            text = "About",
            fontSize = 16.sp,
            color = Color(0xFF2F4858),
            fontWeight = FontWeight(800)
        )
        Text(
            text = "Contact",
            fontSize = 16.sp,
            color = Color(0xFF2F4858),
            fontWeight = FontWeight(800)
        )


    }
}