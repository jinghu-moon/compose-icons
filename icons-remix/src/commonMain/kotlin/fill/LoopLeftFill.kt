package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LoopLeftFill: ImageVector
    get() {
        if (_loopLeftFill != null) return _loopLeftFill!!
        _loopLeftFill = remixIcon(
            name = "LoopLeftFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 4.000 C 9.410 4.000 7.106 5.231 5.643 7.143 L 8.000 9.500 L 2.000 9.500 L 2.000 3.500 L 4.219 5.719 C 6.051 3.452 8.856 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 L 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 14.590 20.000 16.894 18.770 18.357 16.857 L 16.000 14.500 L 22.000 14.500 L 22.000 20.500 L 19.781 18.281 C 17.949 20.548 15.144 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 L 4.000 12.000 Z"),
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
        return _loopLeftFill!!
    }

private var _loopLeftFill: ImageVector? = null
