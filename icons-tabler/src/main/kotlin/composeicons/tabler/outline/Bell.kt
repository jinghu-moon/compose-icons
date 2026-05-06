package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = tablerOutlineIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 2.34 1.107 3.879 3.414 4 6v3c.153 1.261 .895 2.374 2 3h-16c1.105-.626 1.847-1.739 2-3v-3C6.121 8.414 7.66 6.107 10 5")
            addPathData("M9 17v1c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-1")
        }
        return _bell!!
    }

private var _bell: ImageVector? = null
