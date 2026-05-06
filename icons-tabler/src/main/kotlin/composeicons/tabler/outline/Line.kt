package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Line: ImageVector
    get() {
        if (_line != null) return _line!!
        _line = tablerOutlineIcon(
            name = "Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 16.895 7.105 16 6 16c-1.105 0-2 .895-2 2")
            addPathData("M16 6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 4.895 19.105 4 18 4c-1.105 0-2 .895-2 2")
            addPathData("M7.5 16.5l9-9")
        }
        return _line!!
    }

private var _line: ImageVector? = null
