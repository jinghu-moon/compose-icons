package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Logs: ImageVector
    get() {
        if (_logs != null) return _logs!!
        _logs = tablerOutlineIcon(
            name = "Logs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h.01")
            addPathData("M4 6h.01")
            addPathData("M4 18h.01")
            addPathData("M8 18h2")
            addPathData("M8 12h2")
            addPathData("M8 6h2")
            addPathData("M14 6h6")
            addPathData("M14 12h6")
            addPathData("M14 18h6")
        }
        return _logs!!
    }

private var _logs: ImageVector? = null
