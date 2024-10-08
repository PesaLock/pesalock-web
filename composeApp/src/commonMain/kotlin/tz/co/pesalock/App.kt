package tz.co.pesalock

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import pesalock.composeapp.generated.resources.Res
import pesalock.composeapp.generated.resources.herobgimage
import tz.co.pesalock.navigation.Navigation

@Composable
@Preview
fun App() {
    MaterialTheme(
        content = { Content() }
    )
}

