package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterH: ImageVector
    get() {
        if (_letterH != null) return _letterH!!
        _letterH = tablerOutlineIcon(
            name = "LetterH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 4v16")
            addPathData("M7 12h10")
            addPathData("M7 4v16")
        }
        return _letterH!!
    }

private var _letterH: ImageVector? = null
