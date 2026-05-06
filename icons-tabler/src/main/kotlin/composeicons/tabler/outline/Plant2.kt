package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Plant2: ImageVector
    get() {
        if (_plant2 != null) return _plant2!!
        _plant2 = tablerOutlineIcon(
            name = "Plant2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 9c0 5.523 4.477 10 10 10C17.523 19 22 14.523 22 9")
            addPathData("M12 19C12 13.477 16.477 9 22 9")
            addPathData("M2 9c5.523 0 10 4.477 10 10")
            addPathData("M12 4c2.039 1.947 3.131 4.684 2.99 7.5")
            addPathData("M9.01 11.5C8.869 8.684 9.961 5.947 12 4")
        }
        return _plant2!!
    }

private var _plant2: ImageVector? = null
