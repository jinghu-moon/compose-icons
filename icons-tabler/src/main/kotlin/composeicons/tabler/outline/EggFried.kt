package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EggFried: ImageVector
    get() {
        if (_eggFried != null) return _eggFried!!
        _eggFried = tablerOutlineIcon(
            name = "EggFried",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M14 3c1.525-0 2.967 .695 3.916 1.889 .949 1.194 1.301 2.755 .956 4.241 1.231 .374 2.087 1.491 2.127 2.777 .04 1.286-.744 2.454-1.949 2.904 .867 .811 1.174 2.057 .783 3.177-.39 1.121-1.405 1.906-2.588 2.003-1.183 .097-2.312-.512-2.88-1.555-1.381 2.392-4.439 3.212-6.831 1.831C5.143 18.887 4.323 15.829 5.704 13.437 3.258 12.154 2.316 9.132 3.599 6.687 4.881 4.241 7.903 3.298 10.349 4.581 11.293 3.568 12.616 2.994 14 2.996v.004")
        }
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
