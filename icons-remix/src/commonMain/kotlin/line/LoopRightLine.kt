package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LoopRightLine: ImageVector
    get() {
        if (_loopRightLine != null) return _loopRightLine!!
        _loopRightLine = remixIcon(
            name = "LoopRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 4.000 C 14.749 4.000 17.175 5.386 18.616 7.500 L 16.000 7.500 L 16.000 9.500 L 22.000 9.500 L 22.000 3.500 L 20.000 3.500 L 20.000 5.999 C 18.176 3.572 15.272 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 L 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 ZM 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 9.251 20.000 6.825 18.614 5.384 16.500 L 8.000 16.500 L 8.000 14.500 L 2.000 14.500 L 2.000 20.500 L 4.000 20.500 L 4.000 18.001 C 5.824 20.428 8.728 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 L 20.000 12.000 Z"),
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
        return _loopRightLine!!
    }

private var _loopRightLine: ImageVector? = null
