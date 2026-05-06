package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Leaf2: ImageVector
    get() {
        if (_leaf2 != null) return _leaf2!!
        _leaf2 = tablerOutlineIcon(
            name = "Leaf2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21c.5-4.5 2.5-8 7-10")
            addPathData("M7.5 15Q4 15 3 9c1.161-.106 2.332 .031 3.438 .402C6.412 9.138 6.395 8.874 6.386 8.609 6.386 5.003 9.59 3 9.59 3c0 0 2.003 1.252 2.842 3.557Q15 5 19 5q.396 3.775-1.557 6.568c2.305 .839 3.557 2.842 3.557 2.842 0 0-3 2.59-7 2.59 0 1 0 1 .5 3q-6 0-7-5")
        }
        return _leaf2!!
    }

private var _leaf2: ImageVector? = null
