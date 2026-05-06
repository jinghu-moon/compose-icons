package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FountainOff: ImageVector
    get() {
        if (_fountainOff != null) return _fountainOff!!
        _fountainOff = tablerOutlineIcon(
            name = "FountainOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 16v-5C9 9.895 8.105 9 7 9 5.895 9 5 9.895 5 11")
            addPathData("M15 16v-1M15 11c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
            addPathData("M12 16v-4M12 8v-2C12 4.343 13.343 3 15 3c1.657 0 3 1.343 3 3")
            addPathData("M7.451 3.43c.927-.559 2.083-.575 3.025-.043C11.418 3.919 12 4.918 12 6")
            addPathData("M20 16h1v1M20.129 20.114c-.563 .568-1.329 .887-2.129 .886h-12C4.343 21 3 19.657 3 18v-2h13")
            addPathData("M3 3 21 21")
        }
        return _fountainOff!!
    }

private var _fountainOff: ImageVector? = null
