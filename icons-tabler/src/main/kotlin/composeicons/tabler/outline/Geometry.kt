package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Geometry: ImageVector
    get() {
        if (_geometry != null) return _geometry!!
        _geometry = tablerOutlineIcon(
            name = "Geometry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 21 11 9 13 9l1.48 4.439M15.429 16.286 17 21")
            addPathData("M10 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 5.895 13.105 5 12 5c-1.105 0-2 .895-2 2")
            addPathData("M4 12c1.526 2.955 4.588 5 8 5 3.41 0 6.473-2.048 8-5")
            addPathData("M12 5v-2")
        }
        return _geometry!!
    }

private var _geometry: ImageVector? = null
