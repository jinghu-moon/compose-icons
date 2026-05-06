package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PilcrowLeft: ImageVector
    get() {
        if (_pilcrowLeft != null) return _pilcrowLeft!!
        _pilcrowLeft = tablerOutlineIcon(
            name = "PilcrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 9h-2C7.343 9 6 7.657 6 6 6 4.343 7.343 3 9 3h7")
            addPathData("M11 3v11")
            addPathData("M15 3v11")
            addPathData("M3 18h18")
            addPathData("M6 15 3 18l3 3")
        }
        return _pilcrowLeft!!
    }

private var _pilcrowLeft: ImageVector? = null
