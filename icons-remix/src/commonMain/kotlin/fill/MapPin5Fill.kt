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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.657 15.657 L 12.000 21.314 L 6.343 15.657 C 3.219 12.533 3.219 7.467 6.343 4.343 C 9.467 1.219 14.533 1.219 17.657 4.343 C 20.781 7.467 20.781 12.533 17.657 15.657 ZM 5.000 22.000 L 19.000 22.000 L 19.000 24.000 L 5.000 24.000 L 5.000 22.000 Z"),
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
        return _mapPin5Fill!!
    }

private var _mapPin5Fill: ImageVector? = null
