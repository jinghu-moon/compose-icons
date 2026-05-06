package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TimeDuration90: ImageVector
    get() {
        if (_timeDuration90 != null) return _timeDuration90!!
        _timeDuration90 = tablerOutlineIcon(
            name = "TimeDuration90",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 14.25c0 .414 .336 .75 .75 .75h1.5c.414 0 .75-.336 .75-.75v-4.5C11 9.336 10.664 9 10.25 9h-1.5C8.336 9 8 9.336 8 9.75v1.5c0 .414 .336 .75 .75 .75h2.25")
            addPathData("M14 10.5v3c0 .828 .672 1.5 1.5 1.5C16.328 15 17 14.328 17 13.5v-3C17 9.672 16.328 9 15.5 9 14.672 9 14 9.672 14 10.5")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _timeDuration90!!
    }

private var _timeDuration90: ImageVector? = null
