package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HighlightOff: ImageVector
    get() {
        if (_highlightOff != null) return _highlightOff!!
        _highlightOff = tablerOutlineIcon(
            name = "HighlightOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 9 3 15v4h4l6-6M15 11 17.503 8.497c1.105-1.105 1.105-2.895 0-4-1.105-1.105-2.895-1.105-4 0L11.006 6.994")
            addPathData("M12.5 5.5l4 4")
            addPathData("M4.5 13.5l4 4")
            addPathData("M19 15h2v2M19 19h-6l3-3")
            addPathData("M3 3 21 21")
        }
        return _highlightOff!!
    }

private var _highlightOff: ImageVector? = null
