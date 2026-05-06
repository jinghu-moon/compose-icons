package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextOrientation: ImageVector
    get() {
        if (_textOrientation != null) return _textOrientation!!
        _textOrientation = tablerOutlineIcon(
            name = "TextOrientation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 15 4 10C2.633 8.633 2.633 6.367 4 5 5.367 3.633 7.633 3.633 9 5l5 5")
            addPathData("M5.5 11.5l5-5")
            addPathData("M21 12l-9 9")
            addPathData("M21 12v4")
            addPathData("M21 12h-4")
        }
        return _textOrientation!!
    }

private var _textOrientation: ImageVector? = null
