package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdjustmentsHorizontal: ImageVector
    get() {
        if (_adjustmentsHorizontal != null) return _adjustmentsHorizontal!!
        _adjustmentsHorizontal = tablerOutlineIcon(
            name = "AdjustmentsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C16 4.895 15.105 4 14 4c-1.105 0-2 .895-2 2")
            addPathData("M4 6h8")
            addPathData("M16 6h4")
            addPathData("M6 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C10 10.895 9.105 10 8 10c-1.105 0-2 .895-2 2")
            addPathData("M4 12h2")
            addPathData("M10 12h10")
            addPathData("M15 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M4 18h11")
            addPathData("M19 18h1")
        }
        return _adjustmentsHorizontal!!
    }

private var _adjustmentsHorizontal: ImageVector? = null
