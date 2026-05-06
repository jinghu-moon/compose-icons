package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Template: ImageVector
    get() {
        if (_template != null) return _template!!
        _template = tablerOutlineIcon(
            name = "Template",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5C4 4.448 4.448 4 5 4h14c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-14C4.448 8 4 7.552 4 7v-2")
            addPathData("M4 13c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-4C4.448 20 4 19.552 4 19v-6")
            addPathData("M14 12h6")
            addPathData("M14 16h6")
            addPathData("M14 20h6")
        }
        return _template!!
    }

private var _template: ImageVector? = null
