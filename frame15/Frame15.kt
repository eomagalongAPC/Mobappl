package com.example.mobpr0g.frame15

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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
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
 * This composable was generated from the UI Package 'frame_15'.
 * Generated code; do not edit directly
 */
@Composable
fun Frame15(
    modifier: Modifier = Modifier,
    onNotesTapped: () -> Unit = {},
    onMobrogNotesTapped: () -> Unit = {}
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
        MobrogNotes(
            onMobrogNotesTapped = onMobrogNotesTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 97.158935546875.dp,
                    y = 277.709716796875.dp
                )
            )
        ) {
            Uibg34(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            MOGPROGUITime730AMRepeatYESPriorityLevelMedium(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 9.164474487304688.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 480, heightDp = 900)
@Composable
private fun Frame15Preview() {
    MaterialTheme {
        RelayContainer {
            Frame15(
                onNotesTapped = {},
                onMobrogNotesTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LOGINBG(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_15_loginbg),
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
        vector = painterResource(R.drawable.frame_15_notesbg33),
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
fun Uibg34(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_15_uibg34),
        modifier = modifier.requiredWidth(274.938720703125.dp).requiredHeight(204.44140625.dp)
    )
}

@Composable
fun MOGPROGUITime730AMRepeatYESPriorityLevelMedium(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 71,
                        green = 74,
                        blue = 44
                    ),
                    fontSize = 24.0.sp
                )
            ) {
                append("MOGPROG UI\n\n")
            }
            withStyle(style = SpanStyle(fontSize = 24.0.sp)) {
                append("Time: 7:30 AM\nRepeat: YES\nPriority level: Medium")
            }
        },
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
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(256.6094665527344.dp).requiredHeight(204.44140625.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun MobrogNotes(
    onMobrogNotesTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.tappable(onTap = onMobrogNotesTapped).requiredWidth(274.938720703125.dp).requiredHeight(204.44140625.dp)
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
