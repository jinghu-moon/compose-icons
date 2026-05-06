package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Typography: ImageVector
    get() {
        if (_typography != null) return _typography!!
        _typography = tablerOutlineIcon(
            name = "Typography",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h3")
            addPathData("M14 20h7")
            addPathData("M6.9 15h6.9")
            addPathData("M10.2 6.3 16 20")
            addPathData("M5 20 11 4h2l7 16")
        }
        return _typography!!
    }

private var _typography: ImageVector? = null
