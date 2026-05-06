package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterA: ImageVector
    get() {
        if (_letterA != null) return _letterA!!
        _letterA = tablerOutlineIcon(
            name = "LetterA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 20v-12C7 5.791 8.791 4 11 4h2c2.209 0 4 1.791 4 4v12")
            addPathData("M7 13h10")
        }
        return _letterA!!
    }

private var _letterA: ImageVector? = null
