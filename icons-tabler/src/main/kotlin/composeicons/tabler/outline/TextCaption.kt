package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextCaption: ImageVector
    get() {
        if (_textCaption != null) return _textCaption!!
        _textCaption = tablerOutlineIcon(
            name = "TextCaption",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 15h16")
            addPathData("M4 5C4 4.448 4.448 4 5 4h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C4.448 10 4 9.552 4 9v-4")
            addPathData("M4 20h12")
        }
        return _textCaption!!
    }

private var _textCaption: ImageVector? = null
