package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBadgeDown: ImageVector
    get() {
        if (_arrowBadgeDown != null) return _arrowBadgeDown!!
        _arrowBadgeDown = tablerFilledIcon(
            name = "ArrowBadgeDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.375 6.220 L 12.000 9.718 L 7.625 6.218 C 7.325 5.978 6.913 5.931 6.566 6.098 C 6.220 6.264 5.999 6.615 6.000 7.000 L 6.000 13.000 C 6.000 13.303 6.138 13.590 6.375 13.780 L 11.375 17.780 C 11.740 18.073 12.260 18.073 12.625 17.780 L 17.625 13.780 C 17.862 13.590 18.000 13.303 18.000 13.000 L 18.000 7.000 C 18.000 6.616 17.779 6.265 17.433 6.099 C 17.086 5.933 16.675 5.980 16.375 6.220 Z"),
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
        return _arrowBadgeDown!!
    }

private var _arrowBadgeDown: ImageVector? = null
