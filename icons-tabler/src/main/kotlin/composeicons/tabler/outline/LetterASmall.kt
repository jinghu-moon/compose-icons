package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterASmall: ImageVector
    get() {
        if (_letterASmall != null) return _letterASmall!!
        _letterASmall = tablerOutlineIcon(
            name = "LetterASmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16v-6c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v6")
            addPathData("M10 13h4")
        }
        return _letterASmall!!
    }

private var _letterASmall: ImageVector? = null
