package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Drone: ImageVector
    get() {
        if (_drone != null) return _drone!!
        _drone = tablerOutlineIcon(
            name = "Drone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10h4v4h-4v-4")
            addPathData("M10 10 6.5 6.5")
            addPathData("M9.96 6C9.705 4.213 8.132 2.914 6.33 2.999 4.527 3.085 3.085 4.527 2.999 6.33 2.914 8.132 4.213 9.705 6 9.96")
            addPathData("M14 10 17.5 6.5")
            addPathData("M18 9.96c1.787-.255 3.086-1.828 3.001-3.63C20.915 4.527 19.473 3.085 17.67 2.999 15.868 2.914 14.295 4.213 14.04 6")
            addPathData("M14 14l3.5 3.5")
            addPathData("M14.04 18c.255 1.787 1.828 3.086 3.63 3.001 1.803-.085 3.245-1.528 3.331-3.331C21.086 15.868 19.787 14.295 18 14.04")
            addPathData("M10 14 6.5 17.5")
            addPathData("M6 14.04c-1.787 .255-3.086 1.828-3.001 3.63 .085 1.803 1.528 3.245 3.331 3.331C8.132 21.086 9.705 19.787 9.96 18")
        }
        return _drone!!
    }

private var _drone: ImageVector? = null
