package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapRoute: ImageVector
    get() {
        if (_mapRoute != null) return _mapRoute!!
        _mapRoute = tablerOutlineIcon(
            name = "MapRoute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7 9 4l6 3L21 4v13l-6 3L9 17 3 20v-13")
            addPathData("M9 12v.01")
            addPathData("M6 13v.01")
            addPathData("M17 15 13 11")
            addPathData("M13 15l4-4")
        }
        return _mapRoute!!
    }

private var _mapRoute: ImageVector? = null
