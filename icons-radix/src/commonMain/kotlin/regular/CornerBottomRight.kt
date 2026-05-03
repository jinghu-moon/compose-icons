package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CornerBottomRight: ImageVector
    get() {
        if (_cornerBottomRight != null) return _cornerBottomRight!!
        _cornerBottomRight = radixIcon(
            name = "CornerBottomRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.500 12.000 C 3.224 12.000 3.000 11.776 3.000 11.500 C 3.000 11.224 3.224 11.000 3.500 11.000 L 5.100 11.000 C 6.228 11.000 7.045 11.000 7.687 10.947 C 8.323 10.895 8.743 10.794 9.089 10.618 C 9.747 10.283 10.283 9.747 10.618 9.089 C 10.794 8.743 10.895 8.323 10.947 7.687 C 11.000 7.045 11.000 6.228 11.000 5.100 L 11.000 3.500 C 11.000 3.224 11.224 3.000 11.500 3.000 C 11.776 3.000 12.000 3.224 12.000 3.500 L 12.000 5.100 C 12.000 6.211 12.000 7.076 11.943 7.768 C 11.886 8.465 11.770 9.033 11.510 9.543 C 11.078 10.390 10.390 11.078 9.543 11.510 C 9.033 11.770 8.465 11.886 7.768 11.943 C 7.076 12.000 6.211 12.000 5.100 12.000 L 3.500 12.000 Z"),
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
        return _cornerBottomRight!!
    }

private var _cornerBottomRight: ImageVector? = null
