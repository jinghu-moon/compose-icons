package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Walk: ImageVector
    get() {
        if (_walk != null) return _walk!!
        _walk = tablerOutlineIcon(
            name = "Walk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4c0 .552 .448 1 1 1 .552 0 1-.448 1-1C14 3.448 13.552 3 13 3c-.552 0-1 .448-1 1")
            addPathData("M7 21l3-4")
            addPathData("M16 21 14 17 11 14 12 8")
            addPathData("M6 12 8 9 12 8l3 3 3 1")
        }
        return _walk!!
    }

private var _walk: ImageVector? = null
