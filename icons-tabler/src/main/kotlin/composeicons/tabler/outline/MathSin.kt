package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathSin: ImageVector
    get() {
        if (_mathSin != null) return _mathSin!!
        _mathSin = tablerOutlineIcon(
            name = "MathSin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 15c.345 .6 1.258 1 2 1 1.105 0 2-.895 2-2C8 12.895 7.105 12 6 12 4.895 12 4 11.105 4 10 4 8.895 4.895 8 6 8c.746 0 1.656 .394 2 1")
            addPathData("M12 8v8")
            addPathData("M16 16v-8l4 8v-8")
        }
        return _mathSin!!
    }

private var _mathSin: ImageVector? = null
