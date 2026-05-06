package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Car4Wd: ImageVector
    get() {
        if (_car4Wd != null) return _car4Wd!!
        _car4Wd = tablerFilledIcon(
            name = "Car4Wd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3C15.343 10 14 8.657 14 7h-1v10h1c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3h-4c0 1.657-1.343 3-3 3C5.343 22 4 20.657 4 19v-2C4 15.343 5.343 14 7 14c1.657 0 3 1.343 3 3h1v-10h-1c0 1.657-1.343 3-3 3C5.343 10 4 8.657 4 7v-2C4 3.343 5.343 2 7 2c1.657 0 3 1.343 3 3h4C14 3.343 15.343 2 17 2"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _car4Wd!!
    }

private var _car4Wd: ImageVector? = null
