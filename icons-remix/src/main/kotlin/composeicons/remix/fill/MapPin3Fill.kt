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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 19.945C6.5 19.448 3 15.633 3 11 3 6.029 7.029 2 12 2c4.971 0 9 4.029 9 9 0 4.633-3.5 8.448-8 8.945v4.055h-2v-4.055Z"),
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
        return _mapPin3Fill!!
    }

private var _mapPin3Fill: ImageVector? = null
