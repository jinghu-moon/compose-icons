package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RulerOff: ImageVector
    get() {
        if (_rulerOff != null) return _rulerOff!!
        _rulerOff = tablerOutlineIcon(
            name = "RulerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h11c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-4M11.287 11.299c-.184 .187-.287 .439-.287 .701v7c0 .552-.448 1-1 1h-5C4.448 20 4 19.552 4 19v-14c0-.284 .118-.54 .308-.722")
            addPathData("M4 8h2")
            addPathData("M4 12h3")
            addPathData("M4 16h2")
            addPathData("M12 4v3")
            addPathData("M16 4v2")
            addPathData("M3 3 21 21")
        }
        return _rulerOff!!
    }

private var _rulerOff: ImageVector? = null
