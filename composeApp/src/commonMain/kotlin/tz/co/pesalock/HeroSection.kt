package tz.co.pesalock

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.material.TextField
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
import pesalock.composeapp.generated.resources.homescreen

@Composable
fun HeroSection(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.4f)
            ,
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Top
    ) {
         Column(
             modifier = Modifier
                 .fillMaxWidth(.4f)
                 .fillMaxHeight()
                 .padding(top = 200.dp)

             ,
             verticalArrangement = Arrangement.Center,
             horizontalAlignment = Alignment.Start
         ) {
             Column(
                 modifier = Modifier
                     .fillMaxSize(),
                 horizontalAlignment = Alignment.Start,
                 verticalArrangement = Arrangement.SpaceEvenly
             ) {
                 Text(
                     text = "SELL AND BUY",
                     color = Color(0xFF2F4858),
                     fontSize = 40.sp,
                     fontWeight = FontWeight(900),
                     textAlign = TextAlign.Start,
                 )
                 Row(
                     modifier = Modifier,
                     verticalAlignment = Alignment.CenterVertically,
                     horizontalArrangement = Arrangement.Start
                 ) {
                     Text(
                         modifier = Modifier.padding(vertical = 8.dp),
                         text = "ONLINE ",
                         color = Color(0xFF2F4858),
                         fontSize = 40.sp,
                         fontWeight = FontWeight(900),
                         textAlign = TextAlign.Start,
                     )
                     Text(
                         modifier = Modifier.padding(vertical = 8.dp),
                         text = "SECURELY",
                         color = Color(0xFF39B54A),
                         fontSize = 40.sp,
                         fontWeight = FontWeight(900),
                         textAlign = TextAlign.Start,
                     )
                 }
                 Text(
                     modifier = Modifier.padding(vertical = 8.dp),
                     text = "Say goodbye to uncertainties and embrace a new era of trust and convenience. Download our app now to experience the future of online commerce!",
                     color = Color(0xFF2F4858),
                     fontSize = 15.sp,
                     fontWeight = FontWeight(600),
                     textAlign = TextAlign.Start,
                     lineHeight = 30.sp
                 )
             }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(vertical = 16.dp)
                ,
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                elevation = ButtonDefaults.elevation(6.dp, 0.dp),
                onClick = {  },
                modifier = Modifier
                    .height(50.dp)
                    .width(200.dp)
                    .clip(
                        shape = RoundedCornerShape(
                            8.dp
                        )
                    )
                    .border(1.dp, Color(0xFF39B54A), shape = RoundedCornerShape(8.dp)),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xFF39B54A),
                    contentColor = Color.White
                ),
                enabled = true
            ){
                Text(
                    text = "Join Waitlist",
                    color = Color(0xFFFFFFFF),
                    fontSize = 15.sp,
                    fontWeight = FontWeight(500),
                    textAlign = TextAlign.Center,
                    lineHeight = 15.sp
                )
            }
//            Button(
//                elevation = ButtonDefaults.elevation(6.dp, 0.dp),
//                onClick = {  },
//                modifier = Modifier
//                    .padding(start = 16.dp)
//                    .height(50.dp)
//                    .width(200.dp)
//                    .clip(
//                        shape = RoundedCornerShape(
//                            8.dp
//                        )
//                    )
//                    .border(1.dp, Color(0xFF2F4858), shape = RoundedCornerShape(8.dp)),
//                    colors = ButtonDefaults.buttonColors(
//                        backgroundColor = Color(0xFFFFFFFF),
//                        contentColor = Color.White
//                    )
//            ){
//                Text(
//                    text = "Learn More",
//                    color = Color(0xFF2F4858),
//                    fontSize = 15.sp,
//                    fontWeight = FontWeight(500),
//                    textAlign = TextAlign.Center,
//                    lineHeight = 15.sp
//                )
//            }
        }
        }
        //the second panel of the hero section
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(.5f)
            ,
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.End
        ) {
          Image(
              painter = painterResource(Res.drawable.homescreen),
              contentDescription = "The pesalock landing page",
              modifier = Modifier
                  .fillMaxWidth()
                  .fillMaxHeight(.6f),
              alignment = Alignment.TopCenter
          )
        }
    }
}