package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Clock12: ImageVector
    get() {
        if (_clock12 != null) return _clock12!!
        _clock12 = tablerOutlineIcon(
            name = "Clock12",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9M21 12C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 7v5l.5 .5")
            addPathData("M18 15h2c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-1c-.552 0-1 .448-1 1v1c0 .552 .448 1 1 1h2")
            addPathData("M15 21v-6")
        }
        return _clock12!!
    }

private var _clock12: ImageVector? = null
