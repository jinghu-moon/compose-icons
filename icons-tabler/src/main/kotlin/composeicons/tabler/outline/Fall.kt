package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Fall: ImageVector
    get() {
        if (_fall != null) return _fall!!
        _fall = tablerOutlineIcon(
            name = "Fall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 21l1-5L11 12 8 8h4L15 5")
            addPathData("M6 16 5 12 8 8")
            addPathData("M5 5c0 .552 .448 1 1 1C6.552 6 7 5.552 7 5 7 4.448 6.552 4 6 4 5.448 4 5 4.448 5 5")
            addPathData("M13.5 12h2.5l4 2")
        }
        return _fall!!
    }

private var _fall: ImageVector? = null
