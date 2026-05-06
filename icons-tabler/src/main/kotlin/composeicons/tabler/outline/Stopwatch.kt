package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) return _stopwatch!!
        _stopwatch = tablerOutlineIcon(
            name = "Stopwatch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 13c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 9.134 15.866 6 12 6 8.134 6 5 9.134 5 13")
            addPathData("M14.5 10.5 12 13")
            addPathData("M17 8 18 7")
            addPathData("M14 3h-4")
        }
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
