package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dimensions: ImageVector
    get() {
        if (_dimensions != null) return _dimensions!!
        _dimensions = tablerOutlineIcon(
            name = "Dimensions",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5h11")
            addPathData("M12 7 14 5 12 3")
            addPathData("M5 3 3 5 5 7")
            addPathData("M19 10v11")
            addPathData("M17 19l2 2 2-2")
            addPathData("M21 12 19 10l-2 2")
            addPathData("M3 12c0-1.105 .895-2 2-2h7c1.105 0 2 .895 2 2v7c0 1.105-.895 2-2 2h-7C3.895 21 3 20.105 3 19v-7")
        }
        return _dimensions!!
    }

private var _dimensions: ImageVector? = null
