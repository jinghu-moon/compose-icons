package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CommandFill: ImageVector
    get() {
        if (_commandFill != null) return _commandFill!!
        _commandFill = remixIcon(
            name = "CommandFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 8.000 L 14.000 8.000 L 14.000 6.500 C 14.000 4.567 15.567 3.000 17.500 3.000 C 19.433 3.000 21.000 4.567 21.000 6.500 C 21.000 8.433 19.433 10.000 17.500 10.000 L 16.000 10.000 L 16.000 14.000 L 17.500 14.000 C 19.433 14.000 21.000 15.567 21.000 17.500 C 21.000 19.433 19.433 21.000 17.500 21.000 C 15.567 21.000 14.000 19.433 14.000 17.500 L 14.000 16.000 L 10.000 16.000 L 10.000 17.500 C 10.000 19.433 8.433 21.000 6.500 21.000 C 4.567 21.000 3.000 19.433 3.000 17.500 C 3.000 15.567 4.567 14.000 6.500 14.000 L 8.000 14.000 L 8.000 10.000 L 6.500 10.000 C 4.567 10.000 3.000 8.433 3.000 6.500 C 3.000 4.567 4.567 3.000 6.500 3.000 C 8.433 3.000 10.000 4.567 10.000 6.500 L 10.000 8.000 ZM 8.000 8.000 L 8.000 6.500 C 8.000 5.672 7.328 5.000 6.500 5.000 C 5.672 5.000 5.000 5.672 5.000 6.500 C 5.000 7.328 5.672 8.000 6.500 8.000 L 8.000 8.000 ZM 8.000 16.000 L 6.500 16.000 C 5.672 16.000 5.000 16.672 5.000 17.500 C 5.000 18.328 5.672 19.000 6.500 19.000 C 7.328 19.000 8.000 18.328 8.000 17.500 L 8.000 16.000 ZM 16.000 8.000 L 17.500 8.000 C 18.328 8.000 19.000 7.328 19.000 6.500 C 19.000 5.672 18.328 5.000 17.500 5.000 C 16.672 5.000 16.000 5.672 16.000 6.500 L 16.000 8.000 ZM 16.000 16.000 L 16.000 17.500 C 16.000 18.328 16.672 19.000 17.500 19.000 C 18.328 19.000 19.000 18.328 19.000 17.500 C 19.000 16.672 18.328 16.000 17.500 16.000 L 16.000 16.000 ZM 10.000 10.000 L 10.000 14.000 L 14.000 14.000 L 14.000 10.000 L 10.000 10.000 Z"),
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
        return _commandFill!!
    }

private var _commandFill: ImageVector? = null
