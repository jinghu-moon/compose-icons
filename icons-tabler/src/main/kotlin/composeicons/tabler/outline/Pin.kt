package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pin: ImageVector
    get() {
        if (_pin != null) return _pin!!
        _pin = tablerOutlineIcon(
            name = "Pin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 4.5l-4 4L7 10 5.5 11.5l7 7L14 17l1.5-4 4-4")
            addPathData("M9 15 4.5 19.5")
            addPathData("M14.5 4 20 9.5")
        }
        return _pin!!
    }

private var _pin: ImageVector? = null
