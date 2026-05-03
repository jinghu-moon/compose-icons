package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBadgeRight: ImageVector
    get() {
        if (_arrowBadgeRight != null) return _arrowBadgeRight!!
        _arrowBadgeRight = tablerFilledIcon(
            name = "ArrowBadgeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 6.000 L 6.888 6.006 C 6.526 6.047 6.214 6.281 6.075 6.618 C 5.936 6.955 5.991 7.341 6.219 7.625 L 9.720 12.000 L 6.220 16.375 C 5.980 16.675 5.933 17.086 6.099 17.433 C 6.265 17.779 6.616 18.000 7.000 18.000 L 13.000 18.000 C 13.303 18.000 13.590 17.862 13.780 17.625 L 17.780 12.625 C 18.073 12.260 18.073 11.740 17.780 11.375 L 13.780 6.375 C 13.590 6.138 13.303 6.000 13.000 6.000 L 7.000 6.000 Z"),
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
        return _arrowBadgeRight!!
    }

private var _arrowBadgeRight: ImageVector? = null
