package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandRingFinger: ImageVector
    get() {
        if (_handRingFinger != null) return _handRingFinger!!
        _handRingFinger = tablerOutlineIcon(
            name = "HandRingFinger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 13v-2.5C8 9.672 8.672 9 9.5 9 10.328 9 11 9.672 11 10.5v1.5")
            addPathData("M17 11.5C17 10.672 17.672 10 18.5 10c.828 0 1.5 .672 1.5 1.5v4.5c0 3.314-2.686 6-6 6h-2 .208C10.19 22 8.306 20.986 7.196 19.3 7.13 19.2 7.065 19.1 7 19 6.688 18.521 5.593 16.612 3.714 13.272c-.398-.708-.161-1.604 .536-2.022 .734-.441 1.674-.325 2.28 .28L8 13")
            addPathData("M11 11.5v-2C11 8.672 11.672 8 12.5 8 13.328 8 14 8.672 14 9.5v2.5")
            addPathData("M14 12v-6.5C14 4.672 14.672 4 15.5 4 16.328 4 17 4.672 17 5.5v6.5")
        }
        return _handRingFinger!!
    }

private var _handRingFinger: ImageVector? = null
