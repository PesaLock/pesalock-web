package tz.co.pesalock.HowToUse

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pesalock.composeapp.generated.resources.Res
import pesalock.composeapp.generated.resources.agree


@Composable
fun HowToUseApp(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.5f)
            .padding(vertical = 200.dp, horizontal = 12.dp)
            .border(
                width = 1.dp,
                color = Color.Black,
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "How To Use App",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(vertical = 20.dp, horizontal = 12.dp),
        )
        //underline
        Row(
            modifier = Modifier
            .fillMaxWidth(.1f)
            .height(5.dp)
            .background(color = Color(0xFF39B54A))
            .border(
                shape = RoundedCornerShape(15.dp),
                width = 1.dp,
                color = Color(0xFF39B54A)
            )
            .padding(vertical = 20.dp, horizontal = 12.dp),
            content = {}
        )
        //underline

    }
}