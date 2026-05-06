package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleMinus2: ImageVector
    get() {
        if (_circleMinus2 != null) return _circleMinus2!!
        _circleMinus2 = tablerOutlineIcon(
            name = "CircleMinus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.475 15.029C21.811 11.29 20.539 7.117 17.344 4.759 14.15 2.402 9.787 2.416 6.608 4.794 3.429 7.173 2.184 11.354 3.544 15.084c1.36 3.73 5.004 6.128 8.969 5.902")
            addPathData("M16 19h6")
        }
        return _circleMinus2!!
    }

private var _circleMinus2: ImageVector? = null
