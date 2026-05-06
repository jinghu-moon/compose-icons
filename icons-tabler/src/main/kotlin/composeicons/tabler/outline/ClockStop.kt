package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockStop: ImageVector
    get() {
        if (_clockStop != null) return _clockStop!!
        _clockStop = tablerOutlineIcon(
            name = "ClockStop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9")
            addPathData("M12 7v5l1 1")
            addPathData("M16 16h6v6h-6v-6")
        }
        return _clockStop!!
    }

private var _clockStop: ImageVector? = null
