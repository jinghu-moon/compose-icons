package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Luggage: ImageVector
    get() {
        if (_luggage != null) return _luggage!!
        _luggage = tablerOutlineIcon(
            name = "Luggage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 8C6 6.895 6.895 6 8 6h8c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-8C6.895 20 6 19.105 6 18v-10")
            addPathData("M9 6v-1C9 3.895 9.895 3 11 3h2c1.105 0 2 .895 2 2v1")
            addPathData("M6 10h12")
            addPathData("M6 16h12")
            addPathData("M9 20v1")
            addPathData("M15 20v1")
        }
        return _luggage!!
    }

private var _luggage: ImageVector? = null
