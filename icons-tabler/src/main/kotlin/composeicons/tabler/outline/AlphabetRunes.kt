package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetRunes: ImageVector
    get() {
        if (_alphabetRunes != null) return _alphabetRunes!!
        _alphabetRunes = tablerOutlineIcon(
            name = "AlphabetRunes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 18v-12")
            addPathData("M13 6l4 4L21 6")
            addPathData("M11 18 4 10 8 6l4 4L5 18")
        }
        return _alphabetRunes!!
    }

private var _alphabetRunes: ImageVector? = null
