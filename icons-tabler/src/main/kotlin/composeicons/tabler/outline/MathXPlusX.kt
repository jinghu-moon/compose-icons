package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathXPlusX: ImageVector
    get() {
        if (_mathXPlusX != null) return _mathXPlusX!!
        _mathXPlusX = tablerOutlineIcon(
            name = "MathXPlusX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 9l6 6")
            addPathData("M2 15 8 9")
            addPathData("M16 9l6 6")
            addPathData("M16 15 22 9")
            addPathData("M10 12h4")
            addPathData("M12 10v4")
        }
        return _mathXPlusX!!
    }

private var _mathXPlusX: ImageVector? = null
