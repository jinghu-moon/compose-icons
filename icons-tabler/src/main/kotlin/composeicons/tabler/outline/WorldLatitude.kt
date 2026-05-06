package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldLatitude: ImageVector
    get() {
        if (_worldLatitude != null) return _worldLatitude!!
        _worldLatitude = tablerOutlineIcon(
            name = "WorldLatitude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M4.6 7h14.8")
            addPathData("M3 12h18")
            addPathData("M4.6 17h14.8")
        }
        return _worldLatitude!!
    }

private var _worldLatitude: ImageVector? = null
