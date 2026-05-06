package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Subscript: ImageVector
    get() {
        if (_subscript != null) return _subscript!!
        _subscript = tablerOutlineIcon(
            name = "Subscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 7l8 10M5 17 13 7")
            addPathData("M21 20h-4l3.5-4c.552-.966 .216-2.198-.75-2.75C18.784 12.698 17.552 13.034 17 14")
        }
        return _subscript!!
    }

private var _subscript: ImageVector? = null
