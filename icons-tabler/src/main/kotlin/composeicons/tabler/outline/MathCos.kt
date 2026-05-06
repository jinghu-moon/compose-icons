package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathCos: ImageVector
    get() {
        if (_mathCos != null) return _mathCos!!
        _mathCos = tablerOutlineIcon(
            name = "MathCos",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 10C7 8.895 6.105 8 5 8 3.895 8 3 8.895 3 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M12 8c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-4c0-1.105 .895-2 2-2")
            addPathData("M17 15c.345 .6 1.258 1 2 1 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 .746 0 1.656 .394 2 1")
        }
        return _mathCos!!
    }

private var _mathCos: ImageVector? = null
