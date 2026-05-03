package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = radixIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.776 9.595 C 4.887 9.875 4.950 10.180 4.950 10.500 C 4.950 11.853 3.853 12.950 2.500 12.950 C 1.147 12.950 0.050 11.853 0.050 10.500 C 0.050 9.147 1.147 8.050 2.500 8.050 C 3.172 8.050 3.781 8.321 4.224 8.759 L 6.427 7.287 L 6.680 6.380 C 6.752 6.123 6.923 5.905 7.156 5.776 L 10.231 4.065 C 11.409 3.409 12.708 2.999 14.049 2.858 L 15.000 2.757 L 4.776 9.595 ZM 15.000 12.241 L 14.049 12.140 C 12.708 11.999 11.410 11.588 10.231 10.933 L 7.156 9.222 C 7.152 9.220 7.149 9.216 7.145 9.214 L 8.811 8.100 L 15.000 12.241 ZM 2.500 8.950 C 1.644 8.950 0.950 9.644 0.950 10.500 C 0.951 11.356 1.644 12.050 2.500 12.050 C 3.356 12.050 4.050 11.356 4.050 10.500 C 4.050 9.644 3.356 8.951 2.500 8.950 ZM 2.500 2.035 C 3.853 2.035 4.950 3.132 4.950 4.485 C 4.950 4.808 4.885 5.116 4.772 5.399 L 5.737 6.045 L 5.716 6.113 L 5.563 6.662 L 5.210 6.898 L 4.214 6.233 C 3.772 6.666 3.168 6.935 2.500 6.935 C 1.147 6.935 0.050 5.838 0.050 4.485 C 0.050 3.132 1.147 2.035 2.500 2.035 ZM 2.500 2.935 C 1.644 2.935 0.950 3.629 0.950 4.485 C 0.950 5.341 1.644 6.034 2.500 6.034 C 3.356 6.034 4.050 5.341 4.050 4.485 C 4.050 3.629 3.356 2.935 2.500 2.935 Z"),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
