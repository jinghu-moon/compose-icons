package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextPlus: ImageVector
    get() {
        if (_textPlus != null) return _textPlus!!
        _textPlus = tablerOutlineIcon(
            name = "TextPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 10h-14")
            addPathData("M5 6h14")
            addPathData("M14 14h-9")
            addPathData("M5 18h6")
            addPathData("M18 15v6")
            addPathData("M15 18h6")
        }
        return _textPlus!!
    }

private var _textPlus: ImageVector? = null
