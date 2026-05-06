package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterXSmall: ImageVector
    get() {
        if (_letterXSmall != null) return _letterXSmall!!
        _letterXSmall = tablerOutlineIcon(
            name = "LetterXSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8l4 8")
            addPathData("M10 16 14 8")
        }
        return _letterXSmall!!
    }

private var _letterXSmall: ImageVector? = null
