package com.example.mobpr0g.frame4

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
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'frame_4'.
 * Generated code; do not edit directly
 */
@Composable
fun Frame4(
    modifier: Modifier = Modifier,
    onGetStartedTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Splash2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        Image1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -756.0.dp
                )
            )
        )
        Ellipse1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 200.0.dp,
                    y = -200.0.dp
                )
            )
        )
        Welcome(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 90.0.dp,
                    y = 435.0.dp
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
        GetStarted(
            onGetStartedTapped = onGetStartedTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 150.0.dp,
                    y = 600.0.dp
                )
            )
        ) {
            Rectangle7(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -4.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            GetStarted(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        SMARTMANAGER36(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.59375.dp,
                    y = -162.4901123046875.dp
                )
            )
        )
    }
}

@Preview(widthDp = 480, heightDp = 900)
@Composable
private fun Frame4Preview() {
    MaterialTheme {
        RelayContainer {
            Frame4(
                onGetStartedTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Splash2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_splash2),
        modifier = modifier.requiredWidth(480.0.dp).requiredHeight(900.0.dp)
    )
}

@Composable
fun Image1(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(430.0.dp).requiredHeight(548.0.dp))
}

@Composable
fun Ellipse1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_ellipse_1),
        modifier = modifier.requiredWidth(500.0.dp).requiredHeight(500.0.dp)
    )
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
fun Rectangle7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_4_rectangle_7),
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(45.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 25.0.dp,
            blur = 4.0.dp,
            offsetX = 0.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun GetStarted(modifier: Modifier = Modifier) {
    RelayText(
        content = "Get Started",
        fontSize = 26.0.sp,
        fontFamily = poppins,
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(45.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun GetStarted(
    onGetStartedTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 25.0,
        content = content,
        modifier = modifier.tappable(onTap = onGetStartedTapped).requiredWidth(200.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun SMARTMANAGER36(modifier: Modifier = Modifier) {
    RelayText(
        content = "SMART MANAGER ",
        fontSize = 64.0.sp,
        fontFamily = adventPro,
        height = 1.1959999799728394.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(480.0.dp).requiredHeight(124.980224609375.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
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
