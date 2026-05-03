package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FontSize: ImageVector
    get() {
        if (_fontSize != null) return _fontSize!!
        _fontSize = radixIcon(
            name = "FontSize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.500 2.100 C 2.606 2.100 2.708 2.142 2.783 2.217 L 4.783 4.217 L 4.834 4.281 C 4.936 4.436 4.920 4.647 4.783 4.784 C 4.647 4.920 4.435 4.936 4.280 4.834 L 4.217 4.784 L 2.900 3.467 L 2.900 11.533 L 4.217 10.217 C 4.373 10.061 4.627 10.061 4.783 10.217 C 4.939 10.373 4.939 10.627 4.783 10.783 L 2.783 12.783 C 2.708 12.858 2.606 12.901 2.500 12.901 C 2.394 12.901 2.292 12.858 2.217 12.783 L 0.217 10.783 L 0.166 10.720 C 0.063 10.565 0.080 10.354 0.217 10.217 C 0.353 10.080 0.564 10.064 0.720 10.166 L 0.783 10.217 L 2.099 11.533 L 2.099 3.467 L 0.783 4.784 C 0.627 4.940 0.373 4.939 0.217 4.784 C 0.060 4.627 0.060 4.373 0.217 4.217 L 2.217 2.217 L 2.278 2.167 C 2.343 2.124 2.420 2.100 2.500 2.100 ZM 7.971 11.740 C 7.877 11.999 7.590 12.134 7.330 12.040 C 7.071 11.947 6.936 11.660 7.029 11.401 L 7.971 11.740 ZM 10.500 2.750 C 10.710 2.750 10.899 2.882 10.970 3.080 L 13.970 11.401 C 14.064 11.660 13.929 11.947 13.670 12.040 C 13.410 12.134 13.123 11.999 13.029 11.740 L 12.047 9.016 L 8.953 9.016 L 7.971 11.740 L 7.500 11.570 L 7.029 11.401 L 10.029 3.080 L 10.061 3.009 C 10.148 2.851 10.316 2.750 10.500 2.750 ZM 9.259 8.166 L 11.741 8.166 L 10.500 4.725 L 9.259 8.166 Z"),
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
        return _fontSize!!
    }

private var _fontSize: ImageVector? = null
