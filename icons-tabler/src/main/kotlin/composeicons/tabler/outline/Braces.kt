package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Braces: ImageVector
    get() {
        if (_braces != null) return _braces!!
        _braces = tablerOutlineIcon(
            name = "Braces",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 4C5.895 4 5 4.895 5 6v3c0 1.657-.895 3-2 3 1.105 0 2 1.343 2 3v3c0 1.105 .895 2 2 2")
            addPathData("M17 4c1.105 0 2 .895 2 2v3c0 1.657 .895 3 2 3-1.105 0-2 1.343-2 3v3c0 1.105-.895 2-2 2")
        }
        return _braces!!
    }

private var _braces: ImageVector? = null
