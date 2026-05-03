package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CornerTopRight: ImageVector
    get() {
        if (_cornerTopRight != null) return _cornerTopRight!!
        _cornerTopRight = radixIcon(
            name = "CornerTopRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.500 3.000 C 3.224 3.000 3.000 3.224 3.000 3.500 C 3.000 3.776 3.224 4.000 3.500 4.000 L 5.100 4.000 C 6.228 4.000 7.045 4.000 7.687 4.053 C 8.323 4.105 8.743 4.206 9.089 4.382 C 9.747 4.717 10.283 5.253 10.618 5.911 C 10.794 6.257 10.895 6.677 10.947 7.313 C 11.000 7.955 11.000 8.772 11.000 9.900 L 11.000 11.500 C 11.000 11.776 11.224 12.000 11.500 12.000 C 11.776 12.000 12.000 11.776 12.000 11.500 L 12.000 9.900 C 12.000 8.789 12.000 7.924 11.943 7.232 C 11.886 6.535 11.770 5.967 11.510 5.457 C 11.078 4.610 10.390 3.922 9.543 3.490 C 9.033 3.230 8.465 3.114 7.768 3.057 C 7.076 3.000 6.211 3.000 5.100 3.000 L 3.500 3.000 Z"),
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
        return _cornerTopRight!!
    }

private var _cornerTopRight: ImageVector? = null
