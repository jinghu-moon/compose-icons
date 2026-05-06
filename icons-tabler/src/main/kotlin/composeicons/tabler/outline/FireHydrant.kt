package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FireHydrant: ImageVector
    get() {
        if (_fireHydrant != null) return _fireHydrant!!
        _fireHydrant = tablerOutlineIcon(
            name = "FireHydrant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21h14")
            addPathData("M17 21v-5h1c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-1v-4C17 5.239 14.761 3 12 3 9.239 3 7 5.239 7 8v4h-1c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h1v5")
            addPathData("M10 14c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M6 8h12")
        }
        return _fireHydrant!!
    }

private var _fireHydrant: ImageVector? = null
