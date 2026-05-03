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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 18.657 2.000 20.000 3.343 20.000 5.000 L 20.000 7.000 C 20.000 8.657 18.657 10.000 17.000 10.000 C 15.343 10.000 14.000 8.657 14.000 7.000 L 13.000 7.000 L 13.000 17.000 L 14.000 17.000 C 14.000 15.343 15.343 14.000 17.000 14.000 C 18.657 14.000 20.000 15.343 20.000 17.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 C 15.343 22.000 14.000 20.657 14.000 19.000 L 10.000 19.000 C 10.000 20.657 8.657 22.000 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 17.000 C 4.000 15.343 5.343 14.000 7.000 14.000 C 8.657 14.000 10.000 15.343 10.000 17.000 L 11.000 17.000 L 11.000 7.000 L 10.000 7.000 C 10.000 8.657 8.657 10.000 7.000 10.000 C 5.343 10.000 4.000 8.657 4.000 7.000 L 4.000 5.000 C 4.000 3.343 5.343 2.000 7.000 2.000 C 8.657 2.000 10.000 3.343 10.000 5.000 L 14.000 5.000 C 14.000 3.343 15.343 2.000 17.000 2.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _car4Wd!!
    }

private var _car4Wd: ImageVector? = null
