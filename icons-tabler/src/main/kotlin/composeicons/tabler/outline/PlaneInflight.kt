package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaneInflight: ImageVector
    get() {
        if (_planeInflight != null) return _planeInflight!!
        _planeInflight = tablerOutlineIcon(
            name = "PlaneInflight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11.085h5c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-15l-3-6h3l2 2h3l-2-7h3l4 7")
            addPathData("M3 21h18")
        }
        return _planeInflight!!
    }

private var _planeInflight: ImageVector? = null
