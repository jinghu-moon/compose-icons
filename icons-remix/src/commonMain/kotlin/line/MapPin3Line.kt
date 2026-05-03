package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MapPin3Line: ImageVector
    get() {
        if (_mapPin3Line != null) return _mapPin3Line!!
        _mapPin3Line = remixIcon(
            name = "MapPin3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 19.945 C 6.500 19.448 3.000 15.633 3.000 11.000 C 3.000 6.029 7.029 2.000 12.000 2.000 C 16.971 2.000 21.000 6.029 21.000 11.000 C 21.000 15.633 17.500 19.448 13.000 19.945 L 13.000 24.000 L 11.000 24.000 L 11.000 19.945 ZM 12.000 18.000 C 15.866 18.000 19.000 14.866 19.000 11.000 C 19.000 7.134 15.866 4.000 12.000 4.000 C 8.134 4.000 5.000 7.134 5.000 11.000 C 5.000 14.866 8.134 18.000 12.000 18.000 Z"),
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
        return _mapPin3Line!!
    }

private var _mapPin3Line: ImageVector? = null
