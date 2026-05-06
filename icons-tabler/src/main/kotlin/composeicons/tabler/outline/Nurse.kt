package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Nurse: ImageVector
    get() {
        if (_nurse != null) return _nurse!!
        _nurse = tablerOutlineIcon(
            name = "Nurse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5c2.941 0 6.685 1.537 9 3L19 19h-14L3 8C5.394 6.487 9.168 4.995 12 5")
            addPathData("M10 12h4")
            addPathData("M12 10v4")
        }
        return _nurse!!
    }

private var _nurse: ImageVector? = null
