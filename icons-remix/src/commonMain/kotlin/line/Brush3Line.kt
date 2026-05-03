package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Brush3Line: ImageVector
    get() {
        if (_brush3Line != null) return _brush3Line!!
        _brush3Line = remixIcon(
            name = "Brush3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 19.997 L 8.000 14.997 L 10.000 14.997 L 10.000 19.997 L 19.000 19.997 L 19.000 12.997 L 5.000 12.997 L 5.000 19.997 L 8.000 19.997 ZM 4.000 10.997 L 20.000 10.997 L 20.000 7.997 L 14.000 7.997 L 14.000 3.997 L 10.000 3.997 L 10.000 7.997 L 4.000 7.997 L 4.000 10.997 ZM 3.000 20.997 L 3.000 12.997 L 2.000 12.997 L 2.000 6.997 C 2.000 6.444 2.448 5.997 3.000 5.997 L 8.000 5.997 L 8.000 2.997 C 8.000 2.444 8.448 1.997 9.000 1.997 L 15.000 1.997 C 15.552 1.997 16.000 2.444 16.000 2.997 L 16.000 5.997 L 21.000 5.997 C 21.552 5.997 22.000 6.444 22.000 6.997 L 22.000 12.997 L 21.000 12.997 L 21.000 20.997 C 21.000 21.549 20.552 21.997 20.000 21.997 L 4.000 21.997 C 3.448 21.997 3.000 21.549 3.000 20.997 Z"),
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
        return _brush3Line!!
    }

private var _brush3Line: ImageVector? = null
