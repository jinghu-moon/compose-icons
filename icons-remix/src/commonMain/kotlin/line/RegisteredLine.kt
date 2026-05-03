package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RegisteredLine: ImageVector
    get() {
        if (_registeredLine != null) return _registeredLine!!
        _registeredLine = remixIcon(
            name = "RegisteredLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 12.500 7.000 C 14.433 7.000 16.000 8.567 16.000 10.500 C 16.000 11.767 15.327 12.876 14.319 13.491 L 16.869 17.000 L 14.397 17.000 L 12.217 14.000 L 10.000 14.000 L 10.000 17.000 L 8.000 17.000 L 8.000 7.000 L 12.500 7.000 ZM 12.500 9.000 L 10.000 9.000 L 10.000 12.000 L 12.500 12.000 C 13.280 12.000 13.920 11.405 13.993 10.644 L 14.000 10.500 C 14.000 9.672 13.328 9.000 12.500 9.000 Z"),
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
        return _registeredLine!!
    }

private var _registeredLine: ImageVector? = null
