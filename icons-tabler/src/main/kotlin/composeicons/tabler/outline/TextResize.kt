package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextResize: ImageVector
    get() {
        if (_textResize != null) return _textResize!!
        _textResize = tablerOutlineIcon(
            name = "TextResize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5c0 1.105 .895 2 2 2C6.105 7 7 6.105 7 5 7 3.895 6.105 3 5 3 3.895 3 3 3.895 3 5")
            addPathData("M17 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 3.895 20.105 3 19 3c-1.105 0-2 .895-2 2")
            addPathData("M3 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 17.895 6.105 17 5 17c-1.105 0-2 .895-2 2")
            addPathData("M17 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M5 7v10")
            addPathData("M7 5h10")
            addPathData("M7 19h10")
            addPathData("M19 7v10")
            addPathData("M10 10h4")
            addPathData("M12 14v-4")
        }
        return _textResize!!
    }

private var _textResize: ImageVector? = null
