package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ConfettiOff: ImageVector
    get() {
        if (_confettiOff != null) return _confettiOff!!
        _confettiOff = tablerOutlineIcon(
            name = "ConfettiOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5h1")
            addPathData("M5 5v1")
            addPathData("M11.5 4 11 6")
            addPathData("M18 5h2")
            addPathData("M19 4v2")
            addPathData("M15 9l-1 1")
            addPathData("M18 13l2-.5")
            addPathData("M18 19h1")
            addPathData("M19 19v1")
            addPathData("M14 16.518 7.482 10 3.092 19.58c-.178 .381-.098 .833 .199 1.13 .297 .297 .749 .377 1.13 .199L14 16.519")
            addPathData("M3 3 21 21")
        }
        return _confettiOff!!
    }

private var _confettiOff: ImageVector? = null
