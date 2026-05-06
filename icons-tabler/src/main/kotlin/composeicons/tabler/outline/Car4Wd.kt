package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Car4Wd: ImageVector
    get() {
        if (_car4Wd != null) return _car4Wd!!
        _car4Wd = tablerOutlineIcon(
            name = "Car4Wd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5C5 3.895 5.895 3 7 3c1.105 0 2 .895 2 2v2C9 8.105 8.105 9 7 9 5.895 9 5 8.105 5 7v-2")
            addPathData("M5 17c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2C5.895 21 5 20.105 5 19v-2")
            addPathData("M15 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2C15.895 9 15 8.105 15 7v-2")
            addPathData("M15 17c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-2")
            addPathData("M9 18h6")
            addPathData("M9 6h6")
            addPathData("M12 6.5v-.5 12")
        }
        return _car4Wd!!
    }

private var _car4Wd: ImageVector? = null
