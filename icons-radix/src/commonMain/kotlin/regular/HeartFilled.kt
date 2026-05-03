package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.HeartFilled: ImageVector
    get() {
        if (_heartFilled != null) return _heartFilled!!
        _heartFilled = radixIcon(
            name = "HeartFilled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.106 1.352 C 12.064 1.352 13.647 2.945 13.647 4.905 C 13.647 6.740 12.601 8.505 11.400 9.970 C 10.263 11.356 8.922 12.551 8.006 13.366 C 7.946 13.419 7.889 13.471 7.833 13.520 C 7.643 13.690 7.357 13.690 7.167 13.520 C 7.111 13.471 7.054 13.419 6.994 13.366 C 6.078 12.551 4.737 11.356 3.600 9.970 C 2.399 8.505 1.352 6.740 1.352 4.905 C 1.353 2.945 2.936 1.352 4.893 1.352 C 6.258 1.352 6.860 1.923 7.500 2.935 C 8.139 1.923 8.742 1.353 10.106 1.352 Z"),
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
        return _heartFilled!!
    }

private var _heartFilled: ImageVector? = null
