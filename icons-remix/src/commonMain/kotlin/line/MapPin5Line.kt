package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MapPin5Line: ImageVector
    get() {
        if (_mapPin5Line != null) return _mapPin5Line!!
        _mapPin5Line = remixIcon(
            name = "MapPin5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 18.485 L 16.243 14.243 C 18.586 11.899 18.586 8.101 16.243 5.757 C 13.899 3.414 10.101 3.414 7.757 5.757 C 5.414 8.101 5.414 11.899 7.757 14.243 L 12.000 18.485 ZM 17.657 15.657 L 12.000 21.314 L 6.343 15.657 C 3.219 12.533 3.219 7.467 6.343 4.343 C 9.467 1.219 14.533 1.219 17.657 4.343 C 20.781 7.467 20.781 12.533 17.657 15.657 ZM 5.000 22.000 L 19.000 22.000 L 19.000 24.000 L 5.000 24.000 L 5.000 22.000 Z"),
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
        return _mapPin5Line!!
    }

private var _mapPin5Line: ImageVector? = null
