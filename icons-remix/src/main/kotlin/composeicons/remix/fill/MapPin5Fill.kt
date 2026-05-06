package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MapPin5Fill: ImageVector
    get() {
        if (_mapPin5Fill != null) return _mapPin5Fill!!
        _mapPin5Fill = remixIcon(
            name = "MapPin5Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.657 15.657 12 21.314 6.343 15.657C3.219 12.533 3.219 7.467 6.343 4.343c3.124-3.124 8.19-3.124 11.314 0 3.124 3.124 3.124 8.19 0 11.314ZM5 22h14v2h-14v-2Z"),
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
        return _mapPin5Fill!!
    }

private var _mapPin5Fill: ImageVector? = null
