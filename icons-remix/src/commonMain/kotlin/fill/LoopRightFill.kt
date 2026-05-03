package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LoopRightFill: ImageVector
    get() {
        if (_loopRightFill != null) return _loopRightFill!!
        _loopRightFill = remixIcon(
            name = "LoopRightFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 4.000 C 14.590 4.000 16.894 5.231 18.357 7.143 L 16.000 9.500 L 22.000 9.500 L 22.000 3.500 L 19.781 5.719 C 17.949 3.452 15.144 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 L 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 ZM 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 9.410 20.000 7.106 18.770 5.643 16.857 L 8.000 14.500 L 2.000 14.500 L 2.000 20.500 L 4.219 18.281 C 6.051 20.548 8.856 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 L 20.000 12.000 Z"),
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
        return _loopRightFill!!
    }

private var _loopRightFill: ImageVector? = null
