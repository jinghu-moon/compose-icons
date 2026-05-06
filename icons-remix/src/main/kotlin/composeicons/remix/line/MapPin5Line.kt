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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 18.485l4.243-4.243c2.343-2.343 2.343-6.142 0-8.485C13.899 3.414 10.101 3.414 7.757 5.757c-2.343 2.343-2.343 6.142 0 8.485L12 18.485ZM17.657 15.657 12 21.314 6.343 15.657C3.219 12.533 3.219 7.467 6.343 4.343c3.124-3.124 8.19-3.124 11.314 0 3.124 3.124 3.124 8.19 0 11.314ZM5 22h14v2h-14v-2Z"),
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
        return _mapPin5Line!!
    }

private var _mapPin5Line: ImageVector? = null
