package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = tablerOutlineIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3 4.629 6.749C4.249 6.901 4 7.268 4 7.677v11.323c0 .552 .448 1 1 1h14c.552 0 1-.448 1-1v-11C20 7.448 19.552 7 19 7h-14.5")
            addPathData("M4 12h16")
            addPathData("M7 12v-2")
            addPathData("M17 16v.01")
            addPathData("M13 16v.01")
        }
        return _radio!!
    }

private var _radio: ImageVector? = null
