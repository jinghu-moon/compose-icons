package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Home2: ImageVector
    get() {
        if (_home2 != null) return _home2!!
        _home2 = tablerOutlineIcon(
            name = "Home2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h-2L12 3l9 9h-2")
            addPathData("M5 12v7c0 1.105 .895 2 2 2h10c1.105 0 2-.895 2-2v-7")
            addPathData("M10 12h4v4h-4v-4")
        }
        return _home2!!
    }

private var _home2: ImageVector? = null
