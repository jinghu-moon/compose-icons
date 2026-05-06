package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AirBalloon: ImageVector
    get() {
        if (_airBalloon != null) return _airBalloon!!
        _airBalloon = tablerFilledIcon(
            name = "AirBalloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 18c1.105 0 2 .895 2 2v1c0 1.105-.895 2-2 2h-2C9.895 23 9 22.105 9 21v-1c0-1.105 .895-2 2-2Z")
            addPathData("M12 1c3.866 0 7 3.134 7 7 0 4.185-3.297 9-7 9C8.297 17 5 12.185 5 8 5 4.134 8.134 1 12 1")
        }
        return _airBalloon!!
    }

private var _airBalloon: ImageVector? = null
