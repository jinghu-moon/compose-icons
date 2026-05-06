package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WreckingBall: ImageVector
    get() {
        if (_wreckingBall != null) return _wreckingBall!!
        _wreckingBall = tablerOutlineIcon(
            name = "WreckingBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 13c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M2 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C6 15.895 5.105 15 4 15c-1.105 0-2 .895-2 2")
            addPathData("M11 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M13 19h-9")
            addPathData("M4 15h9")
            addPathData("M8 12v-5h2c1.657 0 3 1.343 3 3v5")
            addPathData("M5 15v-2c0-.552 .448-1 1-1h7")
            addPathData("M19 11v-7l-6 7")
        }
        return _wreckingBall!!
    }

private var _wreckingBall: ImageVector? = null
