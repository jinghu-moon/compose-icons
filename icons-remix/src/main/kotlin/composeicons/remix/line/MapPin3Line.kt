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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 19.945C6.5 19.448 3 15.633 3 11 3 6.029 7.029 2 12 2c4.971 0 9 4.029 9 9 0 4.633-3.5 8.448-8 8.945v4.055h-2v-4.055ZM12 18c3.866 0 7-3.134 7-7C19 7.134 15.866 4 12 4 8.134 4 5 7.134 5 11c0 3.866 3.134 7 7 7Z"),
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
        return _mapPin3Line!!
    }

private var _mapPin3Line: ImageVector? = null
