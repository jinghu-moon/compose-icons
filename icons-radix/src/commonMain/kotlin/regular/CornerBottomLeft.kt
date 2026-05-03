package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CornerBottomLeft: ImageVector
    get() {
        if (_cornerBottomLeft != null) return _cornerBottomLeft!!
        _cornerBottomLeft = radixIcon(
            name = "CornerBottomLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.500 12.000 C 11.776 12.000 12.000 11.776 12.000 11.500 C 12.000 11.224 11.776 11.000 11.500 11.000 L 9.900 11.000 C 8.772 11.000 7.955 11.000 7.313 10.947 C 6.677 10.895 6.257 10.794 5.911 10.618 C 5.253 10.283 4.717 9.747 4.382 9.089 C 4.206 8.743 4.105 8.323 4.053 7.687 C 4.000 7.045 4.000 6.228 4.000 5.100 L 4.000 3.500 C 4.000 3.224 3.776 3.000 3.500 3.000 C 3.224 3.000 3.000 3.224 3.000 3.500 L 3.000 5.100 C 3.000 6.211 3.000 7.076 3.057 7.768 C 3.114 8.465 3.230 9.033 3.490 9.543 C 3.922 10.390 4.610 11.078 5.457 11.510 C 5.967 11.770 6.535 11.886 7.232 11.943 C 7.924 12.000 8.789 12.000 9.900 12.000 L 11.500 12.000 Z"),
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
        return _cornerBottomLeft!!
    }

private var _cornerBottomLeft: ImageVector? = null
