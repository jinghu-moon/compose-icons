package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = tablerOutlineIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4c4.418 0 8 3.358 8 7.5 0 1.901-.755 3.637-2 4.96v2.54c0 .552-.448 1-1 1h-10C6.448 20 6 19.552 6 19v-2.54C4.755 15.138 4 13.402 4 11.5 4 7.358 7.582 4 12 4")
            addPathData("M10 17v3")
            addPathData("M14 17v3")
            addPathData("M8 11c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M14 11c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _skull!!
    }

private var _skull: ImageVector? = null
