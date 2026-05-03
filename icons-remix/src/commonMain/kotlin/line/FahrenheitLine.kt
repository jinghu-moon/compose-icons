package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FahrenheitLine: ImageVector
    get() {
        if (_fahrenheitLine != null) return _fahrenheitLine!!
        _fahrenheitLine = remixIcon(
            name = "FahrenheitLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 12.000 L 19.000 12.000 L 19.000 14.000 L 12.000 14.000 L 12.000 21.000 L 10.000 21.000 L 10.000 8.000 C 10.000 5.791 11.791 4.000 14.000 4.000 L 21.000 4.000 L 21.000 6.000 L 14.000 6.000 C 12.895 6.000 12.000 6.895 12.000 8.000 L 12.000 12.000 ZM 4.500 10.000 C 2.567 10.000 1.000 8.433 1.000 6.500 C 1.000 4.567 2.567 3.000 4.500 3.000 C 6.433 3.000 8.000 4.567 8.000 6.500 C 8.000 8.433 6.433 10.000 4.500 10.000 ZM 4.500 8.000 C 5.328 8.000 6.000 7.328 6.000 6.500 C 6.000 5.672 5.328 5.000 4.500 5.000 C 3.672 5.000 3.000 5.672 3.000 6.500 C 3.000 7.328 3.672 8.000 4.500 8.000 Z"),
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
        return _fahrenheitLine!!
    }

private var _fahrenheitLine: ImageVector? = null
