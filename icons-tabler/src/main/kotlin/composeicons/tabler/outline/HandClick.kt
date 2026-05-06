package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandClick: ImageVector
    get() {
        if (_handClick != null) return _handClick!!
        _handClick = tablerOutlineIcon(
            name = "HandClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 13v-8.5C8 3.672 8.672 3 9.5 3 10.328 3 11 3.672 11 4.5v7.5")
            addPathData("M11 11.5v-2C11 8.672 11.672 8 12.5 8 13.328 8 14 8.672 14 9.5v2.5")
            addPathData("M14 10.5C14 9.672 14.672 9 15.5 9 16.328 9 17 9.672 17 10.5v1.5")
            addPathData("M17 11.5C17 10.672 17.672 10 18.5 10c.828 0 1.5 .672 1.5 1.5v4.5c0 3.314-2.686 6-6 6h-2 .208C10.19 22 8.306 20.986 7.196 19.3L7 19C6.688 18.521 5.593 16.612 3.714 13.272c-.398-.708-.161-1.604 .536-2.022 .734-.441 1.674-.325 2.28 .28L8 13")
            addPathData("M5 3 4 2")
            addPathData("M4 7h-1")
            addPathData("M14 3 15 2")
            addPathData("M15 6h1")
        }
        return _handClick!!
    }

private var _handClick: ImageVector? = null
