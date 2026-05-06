package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Woman: ImageVector
    get() {
        if (_woman != null) return _woman!!
        _woman = tablerOutlineIcon(
            name = "Woman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16v5")
            addPathData("M14 16v5")
            addPathData("M8 16h8L14 9h-4L8 16")
            addPathData("M5 11C6.667 9.667 8.333 9 10 9")
            addPathData("M19 11C17.333 9.667 15.667 9 14 9")
            addPathData("M10 4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 2.895 13.105 2 12 2c-1.105 0-2 .895-2 2")
        }
        return _woman!!
    }

private var _woman: ImageVector? = null
