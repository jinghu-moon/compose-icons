package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) return _stopwatch!!
        _stopwatch = radixIcon(
            name = "Stopwatch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 0.000 C 9.276 0.000 9.500 0.224 9.500 0.500 C 9.500 0.776 9.276 1.000 9.000 1.000 L 8.000 1.000 L 8.000 2.121 C 9.099 2.206 10.119 2.568 10.993 3.138 C 11.012 3.110 11.033 3.083 11.058 3.059 L 11.527 3.527 C 11.528 3.528 11.529 3.529 11.530 3.529 L 11.500 3.500 L 11.058 3.059 L 11.859 2.258 C 12.103 2.014 12.499 2.014 12.743 2.258 C 12.986 2.502 12.986 2.899 12.743 3.143 L 11.966 3.918 C 13.158 5.080 13.900 6.703 13.900 8.500 C 13.900 12.034 11.035 14.899 7.500 14.899 C 3.966 14.899 1.100 12.034 1.100 8.500 C 1.100 5.134 3.700 2.376 7.000 2.121 L 7.000 1.000 L 6.000 1.000 C 5.724 1.000 5.500 0.776 5.500 0.500 C 5.500 0.224 5.724 0.000 6.000 0.000 L 9.000 0.000 ZM 7.500 3.100 C 4.518 3.100 2.100 5.518 2.100 8.500 C 2.100 11.482 4.518 13.899 7.500 13.899 C 10.482 13.899 12.900 11.482 12.900 8.500 C 12.900 5.518 10.482 3.100 7.500 3.100 ZM 7.500 4.000 C 7.776 4.000 8.000 4.224 8.000 4.500 L 8.000 9.500 C 8.000 9.776 7.776 10.000 7.500 10.000 C 7.224 10.000 7.000 9.776 7.000 9.500 L 7.000 4.500 C 7.000 4.224 7.224 4.000 7.500 4.000 Z"),
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
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
