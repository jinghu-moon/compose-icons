package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoCircle: ImageVector
    get() {
        if (_photoCircle != null) return _photoCircle!!
        _photoCircle = tablerOutlineIcon(
            name = "PhotoCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M4 15 8 11c.928-.893 2.072-.893 3 0l5 5")
            addPathData("M14 14l1-1c.928-.893 2.072-.893 3 0l2 2")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _photoCircle!!
    }

private var _photoCircle: ImageVector? = null
