package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InkBottleLine: ImageVector
    get() {
        if (_inkBottleLine != null) return _inkBottleLine!!
        _inkBottleLine = remixIcon(
            name = "InkBottleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 8.997 L 20.371 10.745 C 20.751 10.897 21.000 11.265 21.000 11.674 L 21.000 20.997 C 21.000 21.549 20.552 21.997 20.000 21.997 L 4.000 21.997 C 3.448 21.997 3.000 21.549 3.000 20.997 L 3.000 11.674 C 3.000 11.265 3.249 10.897 3.629 10.745 L 8.000 8.997 L 16.000 8.997 ZM 15.615 10.997 L 8.385 10.997 L 5.000 12.351 L 5.000 19.997 L 19.000 19.997 L 19.000 18.997 L 8.000 18.997 L 8.000 13.997 L 19.000 13.997 L 19.000 12.351 L 15.615 10.997 ZM 16.000 2.997 C 16.552 2.997 17.000 3.444 17.000 3.997 L 17.000 7.997 L 7.000 7.997 L 7.000 3.997 C 7.000 3.444 7.448 2.997 8.000 2.997 L 16.000 2.997 ZM 15.000 4.997 L 9.000 4.997 L 9.000 5.997 L 15.000 5.997 L 15.000 4.997 Z"),
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
        return _inkBottleLine!!
    }

private var _inkBottleLine: ImageVector? = null
