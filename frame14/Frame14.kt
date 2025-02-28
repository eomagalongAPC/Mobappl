package com.example.mobpr0g.frame14

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
 * This composable was generated from the UI Package 'frame_14'.
 * Generated code; do not edit directly
 */
@Composable
fun Frame14(
    modifier: Modifier = Modifier,
    onMobrogNotesTapped: () -> Unit = {},
    onPhysicsNotesTapped: () -> Unit = {},
    onNotesTapped: () -> Unit = {},
    onArrowBackTapped: () -> Unit = {}
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
        BackBg34(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -50.0.dp
                )
            )
        )
        MobrogNotes(
            onMobrogNotesTapped = onMobrogNotesTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 70.0.dp,
                    y = 325.0.dp
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
                        x = 5.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        PhysicsNotes(
            onPhysicsNotesTapped = onPhysicsNotesTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 270.0.dp,
                    y = 325.0.dp
                )
            )
        ) {
            P6bg34(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            PHYSICS2Time130pmRepeatYESPriorityLevelMedium(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 5.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Notes(
            onNotesTapped = onNotesTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 255.0.dp,
                    y = 720.0.dp
                )
            )
        ) {
            Notesbg35(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            TIMER(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Notes1(
            onNotesTapped = onNotesTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 14.1341552734375.dp,
                    y = 720.0.dp
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
            NOTES(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        ArrowBack(
            onArrowBackTapped = onArrowBackTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -195.0.dp,
                    y = -400.0.dp
                )
            )
        ) {
            Icon(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 480, heightDp = 900)
@Composable
private fun Frame14Preview() {
    MaterialTheme {
        RelayContainer {
            Frame14(
                onMobrogNotesTapped = {},
                onPhysicsNotesTapped = {},
                onNotesTapped = {},
                onArrowBackTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LOGINBG(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_14_loginbg),
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
fun BackBg34(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_14_back_bg_34),
        modifier = modifier.requiredWidth(480.0.dp).requiredHeight(180.0.dp)
    )
}

@Composable
fun Uibg34(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_14_uibg34),
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(150.0.dp)
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
                    fontSize = 17.0.sp
                )
            ) {
                append("MOGPROG UI\n\n")
            }
            append("Time: 7:30 AM\nRepeat: YES\nPriority level: Medium")
        },
        fontSize = 15.0.sp,
        fontFamily = akshar,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.3800000508626302.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(150.0.dp).wrapContentHeight(
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
        modifier = modifier.tappable(onTap = onMobrogNotesTapped).requiredWidth(150.0.dp).requiredHeight(150.0.dp)
    )
}

@Composable
fun P6bg34(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_14_p6bg34),
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(150.0.dp)
    )
}

@Composable
fun PHYSICS2Time130pmRepeatYESPriorityLevelMedium(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 71,
                        green = 74,
                        blue = 44
                    )
                )
            ) {
                append("PHYSICS 2\n")
            }
            append("\n")
            withStyle(style = SpanStyle(fontSize = 15.0.sp)) {
                append("Time: 1:30pm\nRepeat: YES\nPriority level: Medium")
            }
        },
        fontSize = 17.0.sp,
        fontFamily = akshar,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.3799999461454504.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(150.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun PhysicsNotes(
    onPhysicsNotesTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.tappable(onTap = onPhysicsNotesTapped).requiredWidth(150.0.dp).requiredHeight(150.0.dp)
    )
}

@Composable
fun Notesbg35(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_14_notesbg35),
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun TIMER(modifier: Modifier = Modifier) {
    RelayText(
        content = "TIMER",
        fontSize = 32.0.sp,
        fontFamily = albertSans,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.2000000476837158.em,
        fontWeight = FontWeight(800.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(75.0.dp).wrapContentHeight(
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
        modifier = modifier.tappable(onTap = onNotesTapped).requiredWidth(200.0.dp).requiredHeight(75.0.dp).relayDropShadow(
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
fun Notesbg33(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_14_notesbg33),
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun NOTES(modifier: Modifier = Modifier) {
    RelayText(
        content = "NOTES",
        fontSize = 32.0.sp,
        fontFamily = albertSans,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.2000000476837158.em,
        fontWeight = FontWeight(800.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(75.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Notes1(
    onNotesTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 25.0,
        content = content,
        modifier = modifier.tappable(onTap = onNotesTapped).requiredWidth(200.0.dp).requiredHeight(75.0.dp).relayDropShadow(
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
fun Icon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_14_icon),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ArrowBack(
    onArrowBackTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onArrowBackTapped).requiredWidth(50.0.dp).requiredHeight(40.0.dp)
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
