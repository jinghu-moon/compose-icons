package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeLock: ImageVector
    get() {
        if (_homeLock != null) return _homeLock!!
        _homeLock = tablerOutlineIcon(
            name = "HomeLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h-2L12 3l8 8")
            addPathData("M5 12v7c0 1.105 .895 2 2 2h6")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.688 0 1.294 .347 1.654 .875")
            addPathData("M17 19c0-.552 .448-1 1-1h3c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-3c-.552 0-1-.448-1-1v-2")
            addPathData("M18 18v-1.5C18 15.672 18.672 15 19.5 15c.828 0 1.5 .672 1.5 1.5v1.5")
        }
        return _homeLock!!
    }

private var _homeLock: ImageVector? = null
