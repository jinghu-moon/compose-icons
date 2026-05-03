package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = radixIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.261 2.233 C 8.431 2.075 8.695 2.053 8.892 2.194 C 9.088 2.334 9.151 2.591 9.057 2.803 L 9.006 2.891 L 2.474 12.000 L 13.500 12.000 L 13.601 12.010 C 13.828 12.057 14.000 12.259 14.000 12.500 C 14.000 12.742 13.828 12.943 13.601 12.990 L 13.500 13.000 L 1.500 13.000 C 1.313 13.000 1.141 12.895 1.056 12.728 C 0.970 12.561 0.985 12.361 1.094 12.208 L 8.193 2.309 L 8.261 2.233 ZM 13.400 10.000 C 13.676 10.001 13.900 10.224 13.900 10.500 C 13.900 10.776 13.676 11.000 13.400 11.000 C 13.124 11.000 12.901 10.776 12.900 10.500 C 12.900 10.224 13.124 10.000 13.400 10.000 ZM 12.600 8.000 C 12.876 8.000 13.100 8.224 13.100 8.500 C 13.099 8.776 12.876 9.000 12.600 9.000 C 12.324 9.000 12.100 8.776 12.100 8.500 C 12.100 8.224 12.324 8.001 12.600 8.000 ZM 11.600 6.000 C 11.876 6.000 12.100 6.224 12.100 6.500 C 12.099 6.776 11.876 7.000 11.600 7.000 C 11.324 7.000 11.100 6.776 11.100 6.500 C 11.100 6.224 11.324 6.001 11.600 6.000 ZM 10.400 4.000 C 10.676 4.001 10.900 4.224 10.900 4.500 C 10.900 4.776 10.676 5.000 10.400 5.000 C 10.124 5.000 9.901 4.776 9.900 4.500 C 9.900 4.224 10.124 4.000 10.400 4.000 Z"),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
