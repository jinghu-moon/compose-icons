package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Man: ImageVector
    get() {
        if (_man != null) return _man!!
        _man = tablerOutlineIcon(
            name = "Man",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16v5")
            addPathData("M14 16v5")
            addPathData("M9 9h6l-1 7h-4L9 9")
            addPathData("M5 11C6.333 9.667 7.667 9 9 9")
            addPathData("M19 11C17.667 9.667 16.333 9 15 9")
            addPathData("M10 4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 2.895 13.105 2 12 2c-1.105 0-2 .895-2 2")
        }
        return _man!!
    }

private var _man: ImageVector? = null
