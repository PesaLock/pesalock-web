package tz.co.pesalock.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Navigation() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.15f)
            .padding(vertical = 16.dp, horizontal = 36.dp),

        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ){
        LogoAndTitle()
        MenuList()
    }
}