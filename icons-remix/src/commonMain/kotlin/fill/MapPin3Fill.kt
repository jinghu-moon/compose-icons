package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MapPin3Fill: ImageVector
    get() {
        if (_mapPin3Fill != null) return _mapPin3Fill!!
        _mapPin3Fill = remixIcon(
            name = "MapPin3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 19.945 C 6.500 19.448 3.000 15.633 3.000 11.000 C 3.000 6.029 7.029 2.000 12.000 2.000 C 16.971 2.000 21.000 6.029 21.000 11.000 C 21.000 15.633 17.500 19.448 13.000 19.945 L 13.000 24.000 L 11.000 24.000 L 11.000 19.945 Z"),
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
        return _mapPin3Fill!!
    }

private var _mapPin3Fill: ImageVector? = null
