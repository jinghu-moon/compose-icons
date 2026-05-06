package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CelsiusLine: ImageVector
    get() {
        if (_celsiusLine != null) return _celsiusLine!!
        _celsiusLine = remixIcon(
            name = "CelsiusLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.5 10C2.567 10 1 8.433 1 6.5 1 4.567 2.567 3 4.5 3 6.433 3 8 4.567 8 6.5 8 8.433 6.433 10 4.5 10ZM4.5 8C5.328 8 6 7.328 6 6.5 6 5.672 5.328 5 4.5 5 3.672 5 3 5.672 3 6.5 3 7.328 3.672 8 4.5 8ZM22 10h-2C20 7.791 18.209 6 16 6c-2.209 0-4 1.791-4 4v5c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4h2c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-5C10 6.686 12.686 4 16 4c3.314 0 6 2.686 6 6Z"),
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
        return _celsiusLine!!
    }

private var _celsiusLine: ImageVector? = null
