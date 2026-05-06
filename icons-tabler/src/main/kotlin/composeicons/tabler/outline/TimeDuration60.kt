package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TimeDuration60: ImageVector
    get() {
        if (_timeDuration60 != null) return _timeDuration60!!
        _timeDuration60 = tablerOutlineIcon(
            name = "TimeDuration60",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 10.5v3c0 .828 .672 1.5 1.5 1.5C16.328 15 17 14.328 17 13.5v-3C17 9.672 16.328 9 15.5 9 14.672 9 14 9.672 14 10.5")
            addPathData("M11 9h-2C8.448 9 8 9.448 8 10v4c0 .552 .448 1 1 1h1c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1h-2")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _timeDuration60!!
    }

private var _timeDuration60: ImageVector? = null
