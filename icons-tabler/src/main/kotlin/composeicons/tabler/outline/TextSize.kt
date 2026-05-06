package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextSize: ImageVector
    get() {
        if (_textSize != null) return _textSize!!
        _textSize = tablerOutlineIcon(
            name = "TextSize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7v-2h13v2")
            addPathData("M10 5v14")
            addPathData("M12 19h-4")
            addPathData("M15 13v-1h6v1")
            addPathData("M18 12v7")
            addPathData("M17 19h2")
        }
        return _textSize!!
    }

private var _textSize: ImageVector? = null
