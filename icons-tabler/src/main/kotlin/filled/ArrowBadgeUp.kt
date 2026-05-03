package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBadgeUp: ImageVector
    get() {
        if (_arrowBadgeUp != null) return _arrowBadgeUp!!
        _arrowBadgeUp = tablerFilledIcon(
            name = "ArrowBadgeUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.375 6.220 L 6.375 10.220 C 6.138 10.410 6.000 10.697 6.000 11.000 L 6.000 17.000 L 6.006 17.112 C 6.047 17.474 6.281 17.786 6.618 17.925 C 6.955 18.064 7.341 18.009 7.625 17.781 L 12.000 14.280 L 16.375 17.780 C 16.675 18.020 17.086 18.067 17.433 17.901 C 17.779 17.735 18.000 17.384 18.000 17.000 L 18.000 11.000 C 18.000 10.697 17.862 10.410 17.625 10.220 L 12.625 6.220 C 12.260 5.927 11.740 5.927 11.375 6.220 Z"),
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
        return _arrowBadgeUp!!
    }

private var _arrowBadgeUp: ImageVector? = null
