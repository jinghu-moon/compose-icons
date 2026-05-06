package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Brightness: ImageVector
    get() {
        if (_brightness != null) return _brightness!!
        _brightness = tablerOutlineIcon(
            name = "Brightness",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 3v18")
            addPathData("M12 9 16.65 4.35")
            addPathData("M12 14.3 19.37 6.93")
            addPathData("M12 19.6l8.85-8.85")
        }
        return _brightness!!
    }

private var _brightness: ImageVector? = null
