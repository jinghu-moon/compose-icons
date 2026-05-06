package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.H1: ImageVector
    get() {
        if (_h1 != null) return _h1!!
        _h1 = tablerOutlineIcon(
            name = "H1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 18v-8l-2 2")
            addPathData("M4 6v12")
            addPathData("M12 6v12")
            addPathData("M11 18h2")
            addPathData("M3 18h2")
            addPathData("M4 12h8")
            addPathData("M3 6h2")
            addPathData("M11 6h2")
        }
        return _h1!!
    }

private var _h1: ImageVector? = null
