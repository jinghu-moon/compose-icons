package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InkBottleFill: ImageVector
    get() {
        if (_inkBottleFill != null) return _inkBottleFill!!
        _inkBottleFill = remixIcon(
            name = "InkBottleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 8.997 L 20.371 10.745 C 20.751 10.897 21.000 11.265 21.000 11.674 L 21.000 20.997 C 21.000 21.549 20.552 21.997 20.000 21.997 L 4.000 21.997 C 3.448 21.997 3.000 21.549 3.000 20.997 L 3.000 11.674 C 3.000 11.265 3.249 10.897 3.629 10.745 L 8.000 8.997 L 16.000 8.997 ZM 20.000 13.997 L 8.000 13.997 L 8.000 18.997 L 20.000 18.997 L 20.000 13.997 ZM 16.000 2.997 C 16.552 2.997 17.000 3.444 17.000 3.997 L 17.000 7.997 L 7.000 7.997 L 7.000 3.997 C 7.000 3.444 7.448 2.997 8.000 2.997 L 16.000 2.997 Z"),
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
        return _inkBottleFill!!
    }

private var _inkBottleFill: ImageVector? = null
