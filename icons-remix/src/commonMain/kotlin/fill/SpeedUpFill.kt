package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpeedUpFill: ImageVector
    get() {
        if (_speedUpFill != null) return _speedUpFill!!
        _speedUpFill = remixIcon(
            name = "SpeedUpFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 13.000 C 20.000 15.209 19.105 17.209 17.657 18.657 L 19.071 20.071 C 20.881 18.261 22.000 15.761 22.000 13.000 C 22.000 7.477 17.523 3.000 12.000 3.000 C 6.477 3.000 2.000 7.477 2.000 13.000 C 2.000 15.761 3.119 18.261 4.929 20.071 L 6.343 18.657 C 4.895 17.209 4.000 15.209 4.000 13.000 C 4.000 8.582 7.582 5.000 12.000 5.000 C 16.418 5.000 20.000 8.582 20.000 13.000 ZM 15.293 8.293 L 10.500 12.500 L 12.500 14.500 L 16.707 9.707 L 15.293 8.293 Z"),
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
        return _speedUpFill!!
    }

private var _speedUpFill: ImageVector? = null
