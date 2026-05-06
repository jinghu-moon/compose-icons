package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterSpacing: ImageVector
    get() {
        if (_letterSpacing != null) return _letterSpacing!!
        _letterSpacing = tablerOutlineIcon(
            name = "LetterSpacing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12v-5.5C5 5.119 6.119 4 7.5 4 8.881 4 10 5.119 10 6.5v5.5M10 8h-5")
            addPathData("M13 4l3 8L19 4")
            addPathData("M5 18h14")
            addPathData("M17 20l2-2L17 16")
            addPathData("M7 16 5 18l2 2")
        }
        return _letterSpacing!!
    }

private var _letterSpacing: ImageVector? = null
