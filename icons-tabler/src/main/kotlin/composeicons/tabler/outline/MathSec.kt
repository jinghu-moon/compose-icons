package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathSec: ImageVector
    get() {
        if (_mathSec != null) return _mathSec!!
        _mathSec = tablerOutlineIcon(
            name = "MathSec",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 15c.345 .6 1.258 1 2 1 1.105 0 2-.895 2-2C7 12.895 6.105 12 5 12 3.895 12 3 11.105 3 10 3 8.895 3.895 8 5 8c.746 0 1.656 .394 2 1")
            addPathData("M21 10C21 8.895 20.105 8 19 8c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M14 8h-4v8h4")
            addPathData("M10 12h2.5")
        }
        return _mathSec!!
    }

private var _mathSec: ImageVector? = null
