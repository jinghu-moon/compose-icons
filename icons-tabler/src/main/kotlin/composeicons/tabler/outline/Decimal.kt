package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Decimal: ImageVector
    get() {
        if (_decimal != null) return _decimal!!
        _decimal = tablerOutlineIcon(
            name = "Decimal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 8c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-4c0-1.105 .895-2 2-2")
            addPathData("M10 8c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2C8.895 16 8 15.105 8 14v-4C8 8.895 8.895 8 10 8")
            addPathData("M5 16h.01")
        }
        return _decimal!!
    }

private var _decimal: ImageVector? = null
