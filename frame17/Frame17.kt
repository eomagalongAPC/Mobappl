package com.example.mobpr0g.frame17

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
import com.google.relay.compose.Case
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'frame_17'.
 * Generated code; do not edit directly
 */
@Composable
fun Frame17(
    modifier: Modifier = Modifier,
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
        BgDesign(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 26.837890625.dp,
                    y = 179.5.dp
                )
            )
        )
        Time(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -375.0.dp
                )
            )
        )
        Class0000(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -274.0.dp
                )
            )
        )
        Recents(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -159.5.dp,
                    y = 101.5.dp
                )
            )
        )
        Class500(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -118.3310546875.dp,
                    y = 154.0.dp
                )
            )
        )
        Countdown(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 76.0.dp,
                    y = 252.0.dp
                )
            )
        ) {
            CdBg(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            OHours2Min32Sec(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        StartElipse(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 320.0.dp,
                    y = 383.0.dp
                )
            )
        ) {
            Start30(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Start(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        CancelElipse(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 76.0.dp,
                    y = 383.0.dp
                )
            )
        ) {
            Cancel30(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Cancel(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Start(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 361.6689453125.dp,
                    y = 586.0.dp
                )
            )
        ) {
            Rectangle22(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Start1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = -0.5.dp
                    )
                )
            )
        }
        Frame108(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 411.0.dp,
                    y = 37.0.dp
                )
            )
        ) {
            Image()
        }
    }
}

@Preview(widthDp = 480, heightDp = 900)
@Composable
private fun Frame17Preview() {
    MaterialTheme {
        RelayContainer {
            Frame17(
                onArrowBackTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LOGINBG(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_17_loginbg),
        modifier = modifier.requiredWidth(480.0.dp).requiredHeight(900.0.dp)
    )
}

@Composable
fun Icon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_17_icon),
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
fun BgDesign(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_17_bg_design),
        modifier = modifier.requiredWidth(375.0.dp).requiredHeight(2.0.dp)
    )
}

@Composable
fun Time(modifier: Modifier = Modifier) {
    RelayText(
        content = "Timer",
        fontSize = 40.0.sp,
        fontFamily = adventPro,
        color = Color(
            alpha = 255,
            red = 71,
            green = 74,
            blue = 44
        ),
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
fun Class0000(modifier: Modifier = Modifier) {
    RelayText(
        content = "00:00",
        fontSize = 40.0.sp,
        fontFamily = albertSans,
        color = Color(
            alpha = 255,
            red = 99,
            green = 105,
            blue = 64
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(118.0.dp).requiredHeight(55.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Recents(modifier: Modifier = Modifier) {
    RelayText(
        content = "Recents",
        fontSize = 35.0.sp,
        fontFamily = adventPro,
        height = 1.196000017438616.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(123.0.dp).requiredHeight(41.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Class500(modifier: Modifier = Modifier) {
    RelayText(
        content = "5:00",
        fontSize = 30.0.sp,
        fontFamily = adventPro,
        height = 1.1960000356038412.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(80.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun CdBg(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_17_cd_bg),
        modifier = modifier.requiredWidth(335.0.dp).requiredHeight(70.0.dp)
    )
}

@Composable
fun OHours2Min32Sec(modifier: Modifier = Modifier) {
    RelayText(
        content = "O hours 2 min 32 sec",
        fontSize = 40.0.sp,
        fontFamily = adventPro,
        height = 1.1960000038146972.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(335.0.dp).requiredHeight(70.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Countdown(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.requiredWidth(335.0.dp).requiredHeight(70.0.dp)
    )
}

@Composable
fun Start30(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_17_start_30),
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(100.0.dp)
    )
}

@Composable
fun Start(modifier: Modifier = Modifier) {
    RelayText(
        content = "Start",
        fontSize = 24.0.sp,
        fontFamily = adventPro,
        color = Color(
            alpha = 255,
            red = 0,
            green = 191,
            blue = 0
        ),
        height = 1.1959999402364094.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        case = Case.Upper,
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(100.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun StartElipse(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(100.0.dp)
    )
}

@Composable
fun Cancel30(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_17_cancel_30),
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(100.0.dp)
    )
}

@Composable
fun Cancel(modifier: Modifier = Modifier) {
    RelayText(
        content = "Cancel",
        fontSize = 24.0.sp,
        fontFamily = adventPro,
        color = Color(
            alpha = 255,
            red = 255,
            green = 0,
            blue = 0
        ),
        height = 1.1959999402364094.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        case = Case.Upper,
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(100.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun CancelElipse(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(100.0.dp)
    )
}

@Composable
fun Rectangle22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_17_rectangle_22),
        modifier = modifier.requiredWidth(78.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun Start1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Start",
        fontSize = 17.0.sp,
        fontFamily = adventPro,
        height = 1.1959999308866613.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(55.0.dp).requiredHeight(21.0.dp)
    )
}

@Composable
fun Start(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 20.0,
        content = content,
        modifier = modifier.requiredWidth(78.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun Image(modifier: Modifier = Modifier) {
    RelayImage(
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(43.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun Frame108(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(43.0.dp).requiredHeight(38.0.dp)
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
