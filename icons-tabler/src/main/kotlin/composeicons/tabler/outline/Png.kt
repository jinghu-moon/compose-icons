package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Png: ImageVector
    get() {
        if (_png != null) return _png!!
        _png = tablerOutlineIcon(
            name = "Png",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 8h-2c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h2v-4h-1")
            addPathData("M3 16v-8h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2")
            addPathData("M10 16v-8l4 8v-8")
        }
        return _png!!
    }

private var _png: ImageVector? = null
