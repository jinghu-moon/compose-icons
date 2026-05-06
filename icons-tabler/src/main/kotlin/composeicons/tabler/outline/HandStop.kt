package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandStop: ImageVector
    get() {
        if (_handStop != null) return _handStop!!
        _handStop = tablerOutlineIcon(
            name = "HandStop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 13v-7.5C8 4.672 8.672 4 9.5 4 10.328 4 11 4.672 11 5.5v6.5")
            addPathData("M11 5.5v-2C11 2.672 11.672 2 12.5 2 13.328 2 14 2.672 14 3.5v8.5")
            addPathData("M14 5.5C14 4.672 14.672 4 15.5 4 16.328 4 17 4.672 17 5.5v6.5")
            addPathData("M17 7.5C17 6.672 17.672 6 18.5 6 19.328 6 20 6.672 20 7.5v8.5c0 3.314-2.686 6-6 6h-2 .208C10.19 22 8.306 20.986 7.196 19.3 7.13 19.2 7.065 19.1 7 19 6.688 18.521 5.593 16.612 3.714 13.272c-.398-.708-.161-1.604 .536-2.022 .734-.441 1.674-.325 2.28 .28L8 13")
        }
        return _handStop!!
    }

private var _handStop: ImageVector? = null
