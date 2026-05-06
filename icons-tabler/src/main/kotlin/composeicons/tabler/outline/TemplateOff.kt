package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TemplateOff: ImageVector
    get() {
        if (_templateOff != null) return _templateOff!!
        _templateOff = tablerOutlineIcon(
            name = "TemplateOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h11c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-7M8 8h-3C4.448 8 4 7.552 4 7v-2c0-.271 .108-.517 .283-.697")
            addPathData("M4 13c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-4C4.448 20 4 19.552 4 19v-6")
            addPathData("M16 12h4")
            addPathData("M14 16h2")
            addPathData("M14 20h6")
            addPathData("M3 3 21 21")
        }
        return _templateOff!!
    }

private var _templateOff: ImageVector? = null
