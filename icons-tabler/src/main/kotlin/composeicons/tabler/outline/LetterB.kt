package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterB: ImageVector
    get() {
        if (_letterB != null) return _letterB!!
        _letterB = tablerOutlineIcon(
            name = "LetterB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 20v-16h6c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4 2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-6")
            addPathData("M7 12h6")
        }
        return _letterB!!
    }

private var _letterB: ImageVector? = null
