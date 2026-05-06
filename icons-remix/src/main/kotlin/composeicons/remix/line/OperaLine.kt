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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.767 19.509C17.822 18.383 20.001 15.446 20.001 12c0-3.446-2.179-6.383-5.234-7.509 1.946 1.485 3.234 4.443 3.234 7.509 0 3.066-1.289 6.024-3.234 7.509ZM9.235 4.491C6.18 5.617 4.001 8.554 4.001 12c0 3.446 2.179 6.383 5.234 7.509C7.29 18.024 6.001 15.066 6.001 12 6.001 8.934 7.29 5.976 9.235 4.491ZM12.001 22C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM12.001 18.5c2 0 4-3.033 4-6.5 0-3.467-2-6.5-4-6.5-2 0-4 3.033-4 6.5 0 3.467 2 6.5 4 6.5Z"),
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
        return _operaLine!!
    }

private var _operaLine: ImageVector? = null
