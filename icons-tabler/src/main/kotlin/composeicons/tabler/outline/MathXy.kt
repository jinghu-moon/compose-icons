package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathXy: ImageVector
    get() {
        if (_mathXy != null) return _mathXy!!
        _mathXy = tablerOutlineIcon(
            name = "MathXy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 9l3 5.063")
            addPathData("M4 9l6 6")
            addPathData("M4 15 10 9")
            addPathData("M20 9l-4.8 9")
        }
        return _mathXy!!
    }

private var _mathXy: ImageVector? = null
