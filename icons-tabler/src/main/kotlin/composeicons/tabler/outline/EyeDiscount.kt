package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeDiscount: ImageVector
    get() {
        if (_eyeDiscount != null) return _eyeDiscount!!
        _eyeDiscount = tablerOutlineIcon(
            name = "EyeDiscount",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M12 18C8.4 18 5.4 16 3 12 5.4 8 8.4 6 12 6c3.6 0 6.6 2 9 6")
            addPathData("M16 21l5-5")
            addPathData("M21 21v.01")
            addPathData("M16 16v.01")
        }
        return _eyeDiscount!!
    }

private var _eyeDiscount: ImageVector? = null
