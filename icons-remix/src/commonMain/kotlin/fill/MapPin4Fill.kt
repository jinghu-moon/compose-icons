package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MapPin4Fill: ImageVector
    get() {
        if (_mapPin4Fill != null) return _mapPin4Fill!!
        _mapPin4Fill = remixIcon(
            name = "MapPin4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 17.938 C 7.054 17.446 4.000 14.080 4.000 10.000 C 4.000 5.582 7.582 2.000 12.000 2.000 C 16.418 2.000 20.000 5.582 20.000 10.000 C 20.000 14.080 16.946 17.446 13.000 17.938 L 13.000 21.000 L 11.000 21.000 L 11.000 17.938 ZM 5.000 22.000 L 19.000 22.000 L 19.000 24.000 L 5.000 24.000 L 5.000 22.000 Z"),
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
        return _mapPin4Fill!!
    }

private var _mapPin4Fill: ImageVector? = null
