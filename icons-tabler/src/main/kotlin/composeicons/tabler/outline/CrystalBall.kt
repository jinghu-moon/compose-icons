package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CrystalBall: ImageVector
    get() {
        if (_crystalBall != null) return _crystalBall!!
        _crystalBall = tablerOutlineIcon(
            name = "CrystalBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.73 17.018C4.223 14.823 3.339 11.303 4.512 8.184 5.684 5.065 8.668 2.999 12 2.999c3.332 0 6.316 2.066 7.488 5.185 1.173 3.119 .289 6.639-2.218 8.834")
            addPathData("M5 19c0 1.105 .895 2 2 2h10c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2h-10c-1.105 0-2 .895-2 2")
            addPathData("M11 7C9.343 7 8 8.343 8 10")
        }
        return _crystalBall!!
    }

private var _crystalBall: ImageVector? = null
