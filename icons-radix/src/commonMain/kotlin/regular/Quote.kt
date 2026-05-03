package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Quote: ImageVector
    get() {
        if (_quote != null) return _quote!!
        _quote = radixIcon(
            name = "Quote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.425 3.441 C 10.056 3.237 10.784 3.240 11.379 3.546 C 12.753 4.252 13.348 6.072 12.795 8.000 C 12.547 8.865 12.110 9.705 11.186 10.552 C 10.262 11.400 8.980 11.900 8.386 11.900 C 8.173 11.900 8.000 11.732 8.000 11.525 C 8.000 11.318 8.176 11.150 8.386 11.150 C 9.065 11.150 9.672 10.780 10.391 10.236 C 10.941 9.819 11.370 9.286 11.608 8.822 C 12.063 7.934 12.078 6.682 11.343 6.349 C 10.990 6.735 10.530 6.959 9.977 6.959 C 8.777 6.959 8.070 5.994 8.101 5.120 C 8.130 4.285 8.660 3.690 9.425 3.441 ZM 3.425 3.441 C 4.056 3.237 4.784 3.240 5.379 3.546 C 6.753 4.252 7.348 6.072 6.795 8.000 C 6.547 8.865 6.110 9.705 5.186 10.552 C 4.262 11.400 2.980 11.900 2.386 11.900 C 2.173 11.900 2.000 11.732 2.000 11.525 C 2.000 11.318 2.176 11.150 2.386 11.150 C 3.065 11.150 3.672 10.780 4.391 10.236 C 4.941 9.819 5.370 9.286 5.608 8.822 C 6.063 7.934 6.078 6.682 5.343 6.349 C 4.990 6.735 4.529 6.959 3.977 6.959 C 2.777 6.959 2.070 5.994 2.101 5.120 C 2.130 4.285 2.660 3.690 3.425 3.441 Z"),
        pathFillType = PathFillType.EvenOdd,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _quote!!
    }

private var _quote: ImageVector? = null
