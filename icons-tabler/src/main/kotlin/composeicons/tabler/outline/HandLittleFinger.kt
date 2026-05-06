package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandLittleFinger: ImageVector
    get() {
        if (_handLittleFinger != null) return _handLittleFinger!!
        _handLittleFinger = tablerOutlineIcon(
            name = "HandLittleFinger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 13v-2.5C8 9.672 8.672 9 9.5 9 10.328 9 11 9.672 11 10.5v1.5")
            addPathData("M11 11.5v-1C11 9.672 11.672 9 12.5 9 13.328 9 14 9.672 14 10.5v1.5")
            addPathData("M17 12v-5.5C17 5.672 17.672 5 18.5 5 19.328 5 20 5.672 20 6.5v9.5c0 3.314-2.686 6-6 6h-2 .208C10.19 22 8.306 20.986 7.196 19.3 7.13 19.2 7.065 19.1 7 19 6.688 18.521 5.593 16.612 3.714 13.272c-.398-.708-.161-1.604 .536-2.022 .734-.441 1.674-.325 2.28 .28L8 13")
            addPathData("M14 10.5C14 9.672 14.672 9 15.5 9 16.328 9 17 9.672 17 10.5v1.5")
        }
        return _handLittleFinger!!
    }

private var _handLittleFinger: ImageVector? = null
