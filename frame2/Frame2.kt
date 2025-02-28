package com.example.mobpr0g.frame2

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.mobpr0g.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage

/**
 * This composable was generated from the UI Package 'frame_2'.
 * Generated code; do not edit directly
 */
@Composable
fun Frame2(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Airplane(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -45.5560302734375.dp
                )
            )
        )
    }
}

@Preview(widthDp = 480, heightDp = 900)
@Composable
private fun Frame2Preview() {
    MaterialTheme {
        RelayContainer {
            Frame2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Airplane(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_2_airplane),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(480.0.dp).requiredHeight(700.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
