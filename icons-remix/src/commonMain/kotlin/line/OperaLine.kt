package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.OperaLine: ImageVector
    get() {
        if (_operaLine != null) return _operaLine!!
        _operaLine = remixIcon(
            name = "OperaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.767 19.509 C 17.822 18.383 20.001 15.446 20.001 12.000 C 20.001 8.554 17.822 5.617 14.767 4.491 C 16.712 5.976 18.001 8.934 18.001 12.000 C 18.001 15.066 16.712 18.024 14.767 19.509 ZM 9.235 4.491 C 6.180 5.617 4.001 8.554 4.001 12.000 C 4.001 15.446 6.180 18.383 9.235 19.509 C 7.290 18.024 6.001 15.066 6.001 12.000 C 6.001 8.934 7.290 5.976 9.235 4.491 ZM 12.001 22.000 C 6.478 22.000 2.001 17.523 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 ZM 12.001 18.500 C 14.001 18.500 16.001 15.467 16.001 12.000 C 16.001 8.533 14.001 5.500 12.001 5.500 C 10.001 5.500 8.001 8.533 8.001 12.000 C 8.001 15.467 10.001 18.500 12.001 18.500 Z"),
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
        return _operaLine!!
    }

private var _operaLine: ImageVector? = null
