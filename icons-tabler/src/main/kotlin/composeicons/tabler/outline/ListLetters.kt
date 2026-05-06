package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ListLetters: ImageVector
    get() {
        if (_listLetters != null) return _listLetters!!
        _listLetters = tablerOutlineIcon(
            name = "ListLetters",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 6h9")
            addPathData("M11 12h9")
            addPathData("M11 18h9")
            addPathData("M4 10v-4.5C4 4.672 4.672 4 5.5 4 6.328 4 7 4.672 7 5.5v4.5")
            addPathData("M4 8h3")
            addPathData("M4 20h1.5C6.328 20 7 19.328 7 18.5 7 17.672 6.328 17 5.5 17h-1.5 1.5C6.328 17 7 16.328 7 15.5 7 14.672 6.328 14 5.5 14h-1.5v6")
        }
        return _listLetters!!
    }

private var _listLetters: ImageVector? = null
