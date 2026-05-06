package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TimeDuration45: ImageVector
    get() {
        if (_timeDuration45 != null) return _timeDuration45!!
        _timeDuration45 = tablerOutlineIcon(
            name = "TimeDuration45",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 15h2c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1h-2v-3h3")
            addPathData("M7 9v2c0 .552 .448 1 1 1h1")
            addPathData("M10 9v6")
            addPathData("M7.5 4.2v.01")
            addPathData("M4.2 7.5v.01")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3")
        }
        return _timeDuration45!!
    }

private var _timeDuration45: ImageVector? = null
