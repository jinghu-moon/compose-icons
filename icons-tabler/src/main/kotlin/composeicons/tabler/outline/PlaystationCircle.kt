package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaystationCircle: ImageVector
    get() {
        if (_playstationCircle != null) return _playstationCircle!!
        _playstationCircle = tablerOutlineIcon(
            name = "PlaystationCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21c4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9")
            addPathData("M7.5 12c0 2.485 2.015 4.5 4.5 4.5 2.485 0 4.5-2.015 4.5-4.5C16.5 9.515 14.485 7.5 12 7.5 9.515 7.5 7.5 9.515 7.5 12")
        }
        return _playstationCircle!!
    }

private var _playstationCircle: ImageVector? = null
