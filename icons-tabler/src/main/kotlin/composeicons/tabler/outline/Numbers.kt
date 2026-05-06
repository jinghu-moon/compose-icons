package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Numbers: ImageVector
    get() {
        if (_numbers != null) return _numbers!!
        _numbers = tablerOutlineIcon(
            name = "Numbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 10v-7L6 5")
            addPathData("M6 16c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 .591-.601 1.46-1 2L6 21h4")
            addPathData("M15 14c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2 1.105 0 2-.895 2-2C19 8.895 18.105 8 17 8c-1.105 0-2 .895-2 2")
            addPathData("M6.5 10h3")
        }
        return _numbers!!
    }

private var _numbers: ImageVector? = null
