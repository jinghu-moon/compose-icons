package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Helicopter: ImageVector
    get() {
        if (_helicopter != null) return _helicopter!!
        _helicopter = tablerOutlineIcon(
            name = "Helicopter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10l1 2h6")
            addPathData("M12 9c-1.105 0-2 .895-2 2v3c0 1.1 .9 2 2 2h7c1.105 0 2-.895 2-2C21 10.69 17.87 9 14 9h-2")
            addPathData("M13 9v-3")
            addPathData("M5 6h15")
            addPathData("M15 9.1v3.9h5.5")
            addPathData("M15 19v-3")
            addPathData("M19 19h-8")
        }
        return _helicopter!!
    }

private var _helicopter: ImageVector? = null
