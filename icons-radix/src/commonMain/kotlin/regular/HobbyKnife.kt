package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.HobbyKnife: ImageVector
    get() {
        if (_hobbyKnife != null) return _hobbyKnife!!
        _hobbyKnife = radixIcon(
            name = "HobbyKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.225 13.918 C 12.419 14.046 12.683 14.024 12.854 13.854 L 14.354 12.354 L 14.418 12.275 C 14.528 12.109 14.528 11.891 14.418 11.725 L 14.354 11.646 L 8.604 5.897 C 8.573 5.865 8.537 5.841 8.500 5.819 L 8.500 5.500 C 8.500 5.359 8.441 5.225 8.336 5.130 L 2.936 0.230 C 2.767 0.076 2.515 0.057 2.325 0.183 C 2.134 0.309 2.052 0.549 2.127 0.765 L 4.528 7.664 L 4.559 7.736 C 4.645 7.897 4.814 8.000 5.000 8.000 L 6.319 8.000 C 6.340 8.037 6.365 8.072 6.397 8.104 L 12.147 13.854 L 12.225 13.918 ZM 3.716 2.289 L 7.500 5.722 L 7.500 5.793 L 6.293 7.000 L 5.355 7.000 L 3.716 2.289 ZM 7.457 7.750 L 8.250 6.957 L 13.293 12.000 L 12.500 12.793 L 7.457 7.750 Z"),
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
        return _hobbyKnife!!
    }

private var _hobbyKnife: ImageVector? = null
