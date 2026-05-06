package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LineHeight: ImageVector
    get() {
        if (_lineHeight != null) return _lineHeight!!
        _lineHeight = tablerOutlineIcon(
            name = "LineHeight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8 6 5 9 8")
            addPathData("M3 16l3 3L9 16")
            addPathData("M6 5v14")
            addPathData("M13 6h7")
            addPathData("M13 12h7")
            addPathData("M13 18h7")
        }
        return _lineHeight!!
    }

private var _lineHeight: ImageVector? = null
