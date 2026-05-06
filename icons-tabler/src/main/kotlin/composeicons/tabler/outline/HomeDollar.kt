package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeDollar: ImageVector
    get() {
        if (_homeDollar != null) return _homeDollar!!
        _homeDollar = tablerOutlineIcon(
            name = "HomeDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 10 12 3 3 12h2v7c0 1.105 .895 2 2 2h6")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.387 0 .748 .11 1.054 .3")
            addPathData("M21 15h-2.5C17.672 15 17 15.672 17 16.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-2.5")
            addPathData("M19 21v1M19 14v1")
        }
        return _homeDollar!!
    }

private var _homeDollar: ImageVector? = null
