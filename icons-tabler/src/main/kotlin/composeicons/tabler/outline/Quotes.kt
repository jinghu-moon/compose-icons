package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = tablerOutlineIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12C2.667 10.146 2.667 7.854 4 6")
            addPathData("M8 12C6.667 10.146 6.667 7.854 8 6")
            addPathData("M16 18c1.333-1.854 1.333-4.146 0-6")
            addPathData("M20 18c1.333-1.854 1.333-4.146 0-6")
        }
        return _quotes!!
    }

private var _quotes: ImageVector? = null
