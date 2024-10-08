package tz.co.pesalock.HowToUse

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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

fun HowToLeft(){
    Column(
        modifier = Modifier
            .fillMaxWidth(.4f)
            .fillMaxHeight().
            border(1.dp, color = Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(10.dp)) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .border(
                            color = Color(0xFF2F4858),
                            width = 5.dp,
                            shape = CircleShape
                        )

                ) {
                    Image(
                        modifier = Modifier
                            .size(100.dp),
                        painter = painterResource(Res.drawable.agree),
                        contentDescription = "agreement representation",
                    )
                }

                Text(
                    text = "1. Agree On What To Exchange",
                    color = Color(0xFF2F4858),
                    fontSize = 20.sp,
                    fontWeight = FontWeight(900),
                    textAlign = TextAlign.Center,
                    lineHeight = 15.sp
                )
                Text(
                    text = "Business and customer agree prior to everything on what to sell/buy",
                    color = Color(0xFF2F4858),
                    fontSize = 15.sp,
                    fontWeight = FontWeight(700),
                    textAlign = TextAlign.Center,
                    lineHeight = 15.sp
                )
            }

            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .border(
                            color = Color(0xFF2F4858),
                            width = 5.dp,
                            shape = CircleShape
                        )

                ) {
                    Image(
                        modifier = Modifier
                            .size(100.dp),
                        painter = painterResource(Res.drawable.agree),
                        contentDescription = "agreement representation",
                    )
                }

                Text(
                    text = "1. Agree On What To Exchange",
                    color = Color(0xFF2F4858),
                    fontSize = 20.sp,
                    fontWeight = FontWeight(900),
                    textAlign = TextAlign.Center,
                    lineHeight = 15.sp
                )
                Text(
                    text = "Business and customer agree prior to everything on what to sell/buy",
                    color = Color(0xFF2F4858),
                    fontSize = 15.sp,
                    fontWeight = FontWeight(700),
                    textAlign = TextAlign.Center,
                    lineHeight = 15.sp
                )
            }

        }
    }
}