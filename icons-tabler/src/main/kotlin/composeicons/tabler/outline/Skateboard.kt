package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Skateboard: ImageVector
    get() {
        if (_skateboard != null) return _skateboard!!
        _skateboard = tablerOutlineIcon(
            name = "Skateboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 13.895 8.105 13 7 13c-1.105 0-2 .895-2 2")
            addPathData("M15 15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M3 9c0 .552 .895 1 2 1h14c1.105 0 2-.448 2-1")
        }
        return _skateboard!!
    }

private var _skateboard: ImageVector? = null
