package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Blockquote: ImageVector
    get() {
        if (_blockquote != null) return _blockquote!!
        _blockquote = tablerOutlineIcon(
            name = "Blockquote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 15h15")
            addPathData("M21 19h-15")
            addPathData("M15 11h6")
            addPathData("M21 7h-6")
            addPathData("M9 9h1c.552 0 1 .448 1 1 0 .552-.448 1-1 1C9.448 11 9 10.552 9 10v-2.5c0-1.105 .895-2 2-2")
            addPathData("M3 9h1c.552 0 1 .448 1 1 0 .552-.448 1-1 1C3.448 11 3 10.552 3 10v-2.5c0-1.105 .895-2 2-2")
        }
        return _blockquote!!
    }

private var _blockquote: ImageVector? = null
