package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CornerTopLeft: ImageVector
    get() {
        if (_cornerTopLeft != null) return _cornerTopLeft!!
        _cornerTopLeft = radixIcon(
            name = "CornerTopLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.500 3.000 C 11.776 3.000 12.000 3.224 12.000 3.500 C 12.000 3.776 11.776 4.000 11.500 4.000 L 9.900 4.000 C 8.772 4.000 7.955 4.000 7.313 4.053 C 6.677 4.105 6.257 4.206 5.911 4.382 C 5.253 4.717 4.717 5.253 4.382 5.911 C 4.206 6.257 4.105 6.677 4.053 7.313 C 4.000 7.955 4.000 8.772 4.000 9.900 L 4.000 11.500 C 4.000 11.776 3.776 12.000 3.500 12.000 C 3.224 12.000 3.000 11.776 3.000 11.500 L 3.000 9.900 C 3.000 8.789 3.000 7.924 3.057 7.232 C 3.114 6.535 3.230 5.967 3.490 5.457 C 3.922 4.610 4.610 3.922 5.457 3.490 C 5.967 3.230 6.535 3.114 7.232 3.057 C 7.924 3.000 8.789 3.000 9.900 3.000 L 11.500 3.000 Z"),
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
        return _cornerTopLeft!!
    }

private var _cornerTopLeft: ImageVector? = null
