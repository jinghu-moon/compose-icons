package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = tablerOutlineIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h4")
            addPathData("M9 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3")
            addPathData("M15 4C13.343 4 12 5.343 12 7v10c0 1.657 1.343 3 3 3")
        }
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
