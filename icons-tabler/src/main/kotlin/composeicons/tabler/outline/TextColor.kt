package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextColor: ImageVector
    get() {
        if (_textColor != null) return _textColor!!
        _textColor = tablerOutlineIcon(
            name = "TextColor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 15v-7C9 6.343 10.343 5 12 5c1.657 0 3 1.343 3 3v7")
            addPathData("M9 11h6")
            addPathData("M5 19h14")
        }
        return _textColor!!
    }

private var _textColor: ImageVector? = null
