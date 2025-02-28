package com.example.mobpr0g.frame3

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.mobpr0g.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'frame_3'.
 * Generated code; do not edit directly
 */
@Composable
fun Frame3(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Image1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -756.1395263671875.dp
                )
            )
        )
        Welcome(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 10.0.dp,
                    y = -196.0.dp
                )
            )
        ) {
            Welcome(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -20.0.dp
                    )
                )
            )
            AreYouReadyToTakeOff(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 20.0.dp
                    )
                )
            )
        }
        Ellipse1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 10.0.dp,
                    y = 450.0.dp
                )
            )
        )
        Airplane(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -100.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 480, heightDp = 900)
@Composable
private fun Frame3Preview() {
    MaterialTheme {
        RelayContainer {
            Frame3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Image1(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(480.0.dp).requiredHeight(611.720947265625.dp))
}

@Composable
fun Welcome(modifier: Modifier = Modifier) {
    RelayText(
        content = "Welcome",
        fontSize = 52.0.sp,
        fontFamily = poppins,
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(300.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun AreYouReadyToTakeOff(modifier: Modifier = Modifier) {
    RelayText(
        content = "Are you ready to take off?",
        fontSize = 19.0.sp,
        fontFamily = poppins,
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        italic = true,
        maxLines = -1,
        modifier = modifier.requiredWidth(300.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Welcome(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(300.0.dp).requiredHeight(80.0.dp)
    )
}

@Composable
fun Ellipse1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_3_ellipse_1),
        modifier = modifier.requiredWidth(500.0.dp).requiredHeight(500.0.dp)
    )
}

@Composable
fun Airplane(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.frame_3_airplane),
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
