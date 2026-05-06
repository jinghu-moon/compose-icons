package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MarkdownOff: ImageVector
    get() {
        if (_markdownOff != null) return _markdownOff!!
        _markdownOff = tablerOutlineIcon(
            name = "MarkdownOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h10c1.105 0 2 .895 2 2v10")
            addPathData("M19 19h-14C3.895 19 3 18.105 3 17v-10C2.997 5.951 3.804 5.079 4.85 5")
            addPathData("M7 15v-6l2 2 1-1M11 11v4")
            addPathData("M17.5 13.5 18 13 16 12v-3")
            addPathData("M3 3 21 21")
        }
        return _markdownOff!!
    }

private var _markdownOff: ImageVector? = null
