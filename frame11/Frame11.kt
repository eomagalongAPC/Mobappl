package com.example.mobpr0g.frame11

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
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'frame_11'.
 * Generated code; do not edit directly
 */
@Composable
fun Frame11(
    modifier: Modifier = Modifier,
    onNotesTapped: () -> Unit = {},
    onPin1Tapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        LOGINBG(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        SMARTMANAGER(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -375.0.dp
                )
            )
        )
        Notes(
            onNotesTapped = onNotesTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 165.0.dp,
                    y = 650.0.dp
                )
            )
        ) {
            Notesbg33(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            DONE(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Pin1(
            onPin1Tapped = onPin1Tapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 65.0.dp,
                    y = 227.32432556152344.dp
                )
            )
        ) {
            Pinbg35(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -2.485198974609375.dp,
                        y = 0.0.dp
                    )
                )
            )
            IWillFollowMyScheduleAndBeConsistent(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 480, heightDp = 900)
@Composable
private fun Frame11Preview() {
    MaterialTheme {
        RelayContainer {
            Frame11(
                onNotesTapped = {},
                onPin1Tapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LOGINBG(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_11_loginbg),
        modifier = modifier.requiredWidth(480.0.dp).requiredHeight(900.0.dp)
    )
}

@Composable
fun SMARTMANAGER(modifier: Modifier = Modifier) {
    RelayText(
        content = "SMART MANAGER ",
        fontSize = 40.0.sp,
        fontFamily = adventPro,
        height = 1.1960000038146972.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(350.0.dp).requiredHeight(50.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Notesbg33(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_11_notesbg33),
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun DONE(modifier: Modifier = Modifier) {
    RelayText(
        content = "DONE",
        fontSize = 32.0.sp,
        fontFamily = albertSans,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(50.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Notes(
    onNotesTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 25.0,
        content = content,
        modifier = modifier.tappable(onTap = onNotesTapped).requiredWidth(150.0.dp).requiredHeight(50.0.dp).relayDropShadow(
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
fun Pinbg35(modifier: Modifier = Modifier) {
    RelayImage(
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(345.02960205078125.dp).requiredHeight(350.0.dp)
    )
}

@Composable
fun IWillFollowMyScheduleAndBeConsistent(modifier: Modifier = Modifier) {
    RelayText(
        content = "I will follow my schedule and be consistent!",
        fontSize = 24.0.sp,
        fontFamily = akshar,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.3799999554951983.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(350.0.dp).requiredHeight(350.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Pin1(
    onPin1Tapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onPin1Tapped).requiredWidth(350.0.dp).requiredHeight(350.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 0.0.dp,
            blur = 4.0.dp,
            offsetX = 0.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
