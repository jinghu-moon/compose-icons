package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = tablerOutlineIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.028 13.252C3.371 12.28 3 11.174 3 10 3 6.134 7.03 3 12 3c4.97 0 9 3.134 9 7 0 3.866-4.03 7-9 7C10.087 17 8.314 16.536 6.856 15.745")
            addPathData("M3 15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 13.895 6.105 13 5 13c-1.105 0-2 .895-2 2")
            addPathData("M5 17c0 1.42 .316 2.805 1 4")
        }
        return _lasso!!
    }

private var _lasso: ImageVector? = null
