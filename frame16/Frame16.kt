package com.example.mobpr0g.frame16

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'frame_16'.
 * Generated code; do not edit directly
 */
@Composable
fun Frame16(
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
        Notes(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -394.0.dp
                )
            )
        )
        Title(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -173.0.dp,
                    y = -327.0.dp
                )
            )
        )
        Line(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -165.000732421875.dp,
                    y = 36.5.dp
                )
            )
        ) {
            BgDesign(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 35.000732421875.dp,
                        y = 262.5.dp
                    )
                )
            )
            BgDesign1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 35.000732421875.dp,
                        y = 187.5.dp
                    )
                )
            )
            BgDesign2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 35.000732421875.dp,
                        y = 112.5.dp
                    )
                )
            )
            BgDesign3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 35.000732421875.dp,
                        y = 37.5.dp
                    )
                )
            )
            BgDesign4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 35.000732421875.dp,
                        y = -37.5.dp
                    )
                )
            )
            BgDesign5(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 35.000732421875.dp,
                        y = -112.5.dp
                    )
                )
            )
            BgDesign6(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 35.000732421875.dp,
                        y = -187.5.dp
                    )
                )
            )
            BgDesign7(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 35.000732421875.dp,
                        y = -262.5.dp
                    )
                )
            )
            BgDesign8(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 35.000732421875.dp,
                        y = -337.5.dp
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
private fun Frame16Preview() {
    MaterialTheme {
        RelayContainer {
            Frame16(
                onArrowBackTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LOGINBG(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_16_loginbg),
        modifier = modifier.requiredWidth(480.0.dp).requiredHeight(900.0.dp)
    )
}

@Composable
fun Notes(modifier: Modifier = Modifier) {
    RelayText(
        content = "Notes ",
        fontSize = 40.0.sp,
        fontFamily = adventPro,
        height = 1.1960000038146972.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        case = Case.Upper,
        maxLines = -1,
        modifier = modifier.requiredWidth(120.0.dp).requiredHeight(50.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Title(modifier: Modifier = Modifier) {
    RelayText(
        content = "Title:",
        fontSize = 28.0.sp,
        fontFamily = adventPro,
        height = 1.1959999629429408.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(50.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BgDesign(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_16_bg_design),
        modifier = modifier.requiredWidth(220.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun BgDesign1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_16_bg_design1),
        modifier = modifier.requiredWidth(220.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun BgDesign2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_16_bg_design2),
        modifier = modifier.requiredWidth(220.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun BgDesign3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_16_bg_design3),
        modifier = modifier.requiredWidth(220.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun BgDesign4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_16_bg_design4),
        modifier = modifier.requiredWidth(220.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun BgDesign5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_16_bg_design5),
        modifier = modifier.requiredWidth(220.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun BgDesign6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_16_bg_design6),
        modifier = modifier.requiredWidth(220.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun BgDesign7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_16_bg_design7),
        modifier = modifier.requiredWidth(220.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun BgDesign8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_16_bg_design8),
        modifier = modifier.requiredWidth(220.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun Line(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.00146484375.dp).requiredHeight(675.0.dp)
    )
}

@Composable
fun Icon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_16_icon),
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
