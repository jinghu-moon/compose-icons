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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 17.938C7.054 17.446 4 14.08 4 10 4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8 0 4.08-3.054 7.446-7 7.938v3.062h-2v-3.062ZM5 22h14v2h-14v-2Z"),
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
        return _mapPin4Fill!!
    }

private var _mapPin4Fill: ImageVector? = null
