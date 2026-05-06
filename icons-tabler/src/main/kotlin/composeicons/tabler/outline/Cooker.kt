package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cooker: ImageVector
    get() {
        if (_cooker != null) return _cooker!!
        _cooker = tablerOutlineIcon(
            name = "Cooker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7h.01")
            addPathData("M15 7h.01")
            addPathData("M9 7h.01")
            addPathData("M5 5C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14")
            addPathData("M9 15h6")
            addPathData("M5 11h14")
        }
        return _cooker!!
    }

private var _cooker: ImageVector? = null
