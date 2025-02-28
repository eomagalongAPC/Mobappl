package com.example.mobpr0g.frame13

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
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'frame_13'.
 * Generated code; do not edit directly
 */
@Composable
fun Frame13(
    modifier: Modifier = Modifier,
    onArrowBackTapped: () -> Unit = {},
    onDoneButtonTapped: () -> Unit = {}
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
        BgDesign(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 112.5.dp
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
        PriorityLevel(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 18.0.dp,
                    y = 68.0.dp
                )
            )
        )
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
        LowButton(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 165.0.dp,
                    y = 550.0.dp
                )
            )
        ) {
            LowButtonBg(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Low(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        MediumButton(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 165.0.dp,
                    y = 600.0.dp
                )
            )
        ) {
            MediumButtonBg(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Medium(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        HighButton(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 165.0.dp,
                    y = 650.0.dp
                )
            )
        ) {
            HighBg32(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            High(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        DoneButton(
            onDoneButtonTapped = onDoneButtonTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 215.0.dp,
                    y = 750.0.dp
                )
            )
        ) {
            DoneButtonBg(
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
        Title(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 65.0.dp,
                    y = 260.0.dp
                )
            )
        ) {
            TitleBg(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 40.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Title(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -140.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Title1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 65.0.dp,
                    y = 340.0.dp
                )
            )
        ) {
            TitleBg1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 40.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Time(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -140.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            LineTime1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -4.5.dp,
                        y = 0.0.dp
                    )
                )
            )
            LineTime2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 84.5.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Repeat(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 65.0.dp,
                    y = 420.0.dp
                )
            )
        ) {
            RepeatBg(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 40.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Repeat(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -140.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Every(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -10.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            YesOrNo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 90.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            LineRepeat(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 40.5.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 480, heightDp = 900)
@Composable
private fun Frame13Preview() {
    MaterialTheme {
        RelayContainer {
            Frame13(
                onArrowBackTapped = {},
                onDoneButtonTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LOGINBG(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_loginbg),
        modifier = modifier.requiredWidth(480.0.dp).requiredHeight(900.0.dp)
    )
}

@Composable
fun BgDesign(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_bg_design),
        modifier = modifier.requiredWidth(480.0.dp).requiredHeight(675.0.dp)
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
fun PriorityLevel(modifier: Modifier = Modifier) {
    RelayText(
        content = "Priority level",
        fontSize = 25.0.sp,
        fontFamily = aleo,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.2000000762939453.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(178.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun Icon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_icon),
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
fun LowButtonBg(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_low_button_bg),
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Low(modifier: Modifier = Modifier) {
    RelayText(
        content = "Low",
        fontSize = 20.0.sp,
        fontFamily = albertSans,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(30.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun LowButton(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun MediumButtonBg(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_medium_button_bg),
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Medium(modifier: Modifier = Modifier) {
    RelayText(
        content = "Medium",
        fontSize = 20.0.sp,
        fontFamily = albertSans,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(30.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun MediumButton(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun HighBg32(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_high_bg_32),
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun High(modifier: Modifier = Modifier) {
    RelayText(
        content = "High",
        fontSize = 20.0.sp,
        fontFamily = albertSans,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(30.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun HighButton(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun DoneButtonBg(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_done_button_bg),
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun DONE(modifier: Modifier = Modifier) {
    RelayText(
        content = "DONE",
        fontSize = 24.0.sp,
        fontFamily = aleo,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.2000000476837158.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(30.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun DoneButton(
    onDoneButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onDoneButtonTapped).requiredWidth(100.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun TitleBg(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_title_bg),
        modifier = modifier.requiredWidth(270.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Title(modifier: Modifier = Modifier) {
    RelayText(
        content = "Title:",
        fontSize = 25.0.sp,
        fontFamily = aleo,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.2000000762939453.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(70.0.dp).requiredHeight(30.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Title(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.requiredWidth(350.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun TitleBg1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_title_bg1),
        modifier = modifier.requiredWidth(270.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Time(modifier: Modifier = Modifier) {
    RelayText(
        content = "Time:",
        fontSize = 20.0.sp,
        fontFamily = aleo,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(70.0.dp).requiredHeight(30.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun LineTime1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_line_time_1),
        modifier = modifier.requiredWidth(30.0.dp).requiredHeight(1.0.dp)
    )
}

@Composable
fun LineTime2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_line_time_2),
        modifier = modifier.requiredWidth(30.0.dp).requiredHeight(1.0.dp)
    )
}

@Composable
fun Title1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.requiredWidth(350.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun RepeatBg(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_repeat_bg),
        modifier = modifier.requiredWidth(270.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Repeat(modifier: Modifier = Modifier) {
    RelayText(
        content = "Repeat:",
        fontSize = 20.0.sp,
        fontFamily = aleo,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(70.0.dp).requiredHeight(30.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Every(modifier: Modifier = Modifier) {
    RelayText(
        content = "Every....",
        fontSize = 15.0.sp,
        fontFamily = aleo,
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(30.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun YesOrNo(modifier: Modifier = Modifier) {
    RelayText(
        content = "Yes or No",
        fontSize = 15.0.sp,
        fontFamily = aleo,
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(30.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun LineRepeat(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_13_line_repeat),
        modifier = modifier.requiredWidth(30.0.dp).requiredHeight(1.0.dp)
    )
}

@Composable
fun Repeat(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.requiredWidth(350.0.dp).requiredHeight(30.0.dp)
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
