package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterX: ImageVector
    get() {
        if (_letterX != null) return _letterX!!
        _letterX = tablerOutlineIcon(
            name = "LetterX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 4 17 20")
            addPathData("M17 4 7 20")
        }
        return _letterX!!
    }

private var _letterX: ImageVector? = null
