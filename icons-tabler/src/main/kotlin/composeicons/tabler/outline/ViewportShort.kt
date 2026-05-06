package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ViewportShort: ImageVector
    get() {
        if (_viewportShort != null) return _viewportShort!!
        _viewportShort = tablerOutlineIcon(
            name = "ViewportShort",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v7L15 7")
            addPathData("M9 7l3 3")
            addPathData("M12 21v-7l3 3")
            addPathData("M9 17l3-3")
            addPathData("M18 9h1c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-1")
            addPathData("M6 9h-1C3.895 9 3 9.895 3 11v2c0 1.105 .895 2 2 2h1")
        }
        return _viewportShort!!
    }

private var _viewportShort: ImageVector? = null
