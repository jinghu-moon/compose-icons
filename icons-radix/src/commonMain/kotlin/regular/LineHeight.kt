package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LineHeight: ImageVector
    get() {
        if (_lineHeight != null) return _lineHeight!!
        _lineHeight = radixIcon(
            name = "LineHeight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.500 2.100 C 3.606 2.100 3.708 2.142 3.783 2.217 L 5.783 4.217 L 5.834 4.281 C 5.936 4.436 5.920 4.647 5.783 4.784 C 5.647 4.920 5.435 4.936 5.280 4.834 L 5.217 4.784 L 3.900 3.467 L 3.900 11.534 L 5.217 10.217 C 5.373 10.061 5.627 10.061 5.783 10.217 C 5.939 10.373 5.939 10.627 5.783 10.784 L 3.783 12.784 C 3.708 12.858 3.606 12.901 3.500 12.901 C 3.394 12.901 3.292 12.858 3.217 12.784 L 1.217 10.784 L 1.166 10.720 C 1.064 10.565 1.080 10.354 1.217 10.217 C 1.353 10.081 1.564 10.064 1.720 10.166 L 1.783 10.217 L 3.099 11.534 L 3.099 3.467 L 1.783 4.784 C 1.627 4.940 1.373 4.939 1.217 4.784 C 1.060 4.627 1.060 4.373 1.217 4.217 L 3.217 2.217 L 3.278 2.167 C 3.343 2.124 3.420 2.100 3.500 2.100 ZM 14.500 10.000 C 14.776 10.000 15.000 10.224 15.000 10.500 C 15.000 10.776 14.776 11.000 14.500 11.000 L 8.500 11.000 C 8.224 11.000 8.000 10.776 8.000 10.500 C 8.000 10.224 8.224 10.000 8.500 10.000 L 14.500 10.000 ZM 14.500 7.000 C 14.776 7.000 15.000 7.224 15.000 7.500 C 15.000 7.776 14.776 8.000 14.500 8.000 L 8.500 8.000 C 8.224 8.000 8.000 7.776 8.000 7.500 C 8.000 7.224 8.224 7.000 8.500 7.000 L 14.500 7.000 ZM 14.500 4.000 C 14.776 4.000 15.000 4.224 15.000 4.500 C 15.000 4.776 14.776 5.000 14.500 5.000 L 8.500 5.000 C 8.224 5.000 8.000 4.776 8.000 4.500 C 8.000 4.224 8.224 4.000 8.500 4.000 L 14.500 4.000 Z"),
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
        return _lineHeight!!
    }

private var _lineHeight: ImageVector? = null
