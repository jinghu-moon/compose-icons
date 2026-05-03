package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LoopLeftLine: ImageVector
    get() {
        if (_loopLeftLine != null) return _loopLeftLine!!
        _loopLeftLine = remixIcon(
            name = "LoopLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 4.000 C 9.251 4.000 6.825 5.386 5.384 7.500 L 8.000 7.500 L 8.000 9.500 L 2.000 9.500 L 2.000 3.500 L 4.000 3.500 L 4.000 5.999 C 5.824 3.572 8.728 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 L 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 14.749 20.000 17.175 18.614 18.616 16.500 L 16.000 16.500 L 16.000 14.500 L 22.000 14.500 L 22.000 20.500 L 20.000 20.500 L 20.000 18.001 C 18.176 20.428 15.272 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 L 4.000 12.000 Z"),
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
        return _loopLeftLine!!
    }

private var _loopLeftLine: ImageVector? = null
