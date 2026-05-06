package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = tablerOutlineIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 20h-10.5L4.29 15.7c-.388-.39-.388-1.02 0-1.41l10-10c.39-.388 1.02-.388 1.41 0l5 5c.388 .39 .388 1.02 0 1.41L11.5 20")
            addPathData("M18 13.3 11.7 7")
        }
        return _eraser!!
    }

private var _eraser: ImageVector? = null
