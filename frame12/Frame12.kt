package com.example.mobpr0g.frame12

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
 * This composable was generated from the UI Package 'frame_12'.
 * Generated code; do not edit directly
 */
@Composable
fun Frame12(
    modifier: Modifier = Modifier,
    onAddScheduleTapped: () -> Unit = {},
    onEditScheduleTapped: () -> Unit = {},
    onDeleteScheduleTapped: () -> Unit = {},
    onCloseTapped: () -> Unit = {}
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
        Options(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 17.0.dp
                )
            )
        ) {
            Rectangle8(
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
                        y = -67.0.dp
                    )
                )
            )
            BgDesign1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -17.0.dp
                    )
                )
            )
            BgDesign2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 33.0.dp
                    )
                )
            )
            AddSchedule(
                onAddScheduleTapped = onAddScheduleTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 2.5.dp,
                        y = -92.0.dp
                    )
                )
            )
            EditSchedule(
                onEditScheduleTapped = onEditScheduleTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 2.5.dp,
                        y = -42.0.dp
                    )
                )
            )
            DeleteSchedule(
                onDeleteScheduleTapped = onDeleteScheduleTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 2.5.dp,
                        y = 8.0.dp
                    )
                )
            )
            Frame110(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 250.0.dp,
                        y = 18.0.dp
                    )
                )
            ) {
                Close(
                    onCloseTapped = onCloseTapped,
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
}

@Preview(widthDp = 480, heightDp = 900)
@Composable
private fun Frame12Preview() {
    MaterialTheme {
        RelayContainer {
            Frame12(
                onAddScheduleTapped = {},
                onEditScheduleTapped = {},
                onDeleteScheduleTapped = {},
                onCloseTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LOGINBG(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_12_loginbg),
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
fun Rectangle8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_12_rectangle_8),
        modifier = modifier.requiredWidth(300.0.dp).requiredHeight(334.0.dp)
    )
}

@Composable
fun BgDesign(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_12_bg_design),
        modifier = modifier.requiredWidth(300.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun BgDesign1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_12_bg_design1),
        modifier = modifier.requiredWidth(300.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun BgDesign2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_12_bg_design2),
        modifier = modifier.requiredWidth(300.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun AddSchedule(
    onAddScheduleTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "Add Schedule",
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
        fontWeight = FontWeight(500.0.toInt()),
        case = Case.Upper,
        maxLines = -1,
        modifier = modifier.tappable(onTap = onAddScheduleTapped).requiredWidth(295.0.dp).requiredHeight(30.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun EditSchedule(
    onEditScheduleTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "Edit Schedule",
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
        fontWeight = FontWeight(500.0.toInt()),
        case = Case.Upper,
        maxLines = -1,
        modifier = modifier.tappable(onTap = onEditScheduleTapped).requiredWidth(295.0.dp).requiredHeight(30.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun DeleteSchedule(
    onDeleteScheduleTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "Delete Schedule",
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
        fontWeight = FontWeight(500.0.toInt()),
        case = Case.Upper,
        maxLines = -1,
        modifier = modifier.tappable(onTap = onDeleteScheduleTapped).requiredWidth(295.0.dp).requiredHeight(30.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Close(
    onCloseTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = onCloseTapped).requiredWidth(30.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Frame110(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(30.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Options(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(300.0.dp).requiredHeight(334.0.dp)
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
