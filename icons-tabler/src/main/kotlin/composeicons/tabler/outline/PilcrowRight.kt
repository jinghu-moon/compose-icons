package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PilcrowRight: ImageVector
    get() {
        if (_pilcrowRight != null) return _pilcrowRight!!
        _pilcrowRight = tablerOutlineIcon(
            name = "PilcrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 9h-2C7.343 9 6 7.657 6 6 6 4.343 7.343 3 9 3h7")
            addPathData("M11 3v11")
            addPathData("M15 3v11")
            addPathData("M21 18h-18")
            addPathData("M18 15l3 3-3 3")
        }
        return _pilcrowRight!!
    }

private var _pilcrowRight: ImageVector? = null
