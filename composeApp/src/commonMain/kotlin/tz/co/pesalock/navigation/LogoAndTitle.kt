package tz.co.pesalock.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pesalock.composeapp.generated.resources.Res
import pesalock.composeapp.generated.resources.pesalocklogo

@Composable
fun LogoAndTitle(){
    Row(
        modifier = Modifier
            .wrapContentWidth()
            .fillMaxHeight()
            .padding(start = 32.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(.035f)
                .padding(end = 8.dp)
            ,
            painter = painterResource(Res.drawable.pesalocklogo),
            contentDescription = null,
        )
        Text(
            text = "Pesa",
            fontSize = 28.sp,
            color = Color(0xFF2F4858),
            fontWeight = FontWeight(900)
        )
        Text(
            text = "Lock",
            fontSize = 28.sp,
            color = Color(0xFF168C2A),
            fontWeight = FontWeight(900)
        )

    }
}
