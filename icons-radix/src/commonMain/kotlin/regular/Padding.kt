package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Padding: ImageVector
    get() {
        if (_padding != null) return _padding!!
        _padding = radixIcon(
            name = "Padding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.333 1.010 C 13.269 1.105 14.000 1.896 14.000 2.857 L 14.000 12.143 L 13.990 12.333 C 13.901 13.207 13.207 13.901 12.333 13.990 L 12.143 14.000 L 2.857 14.000 L 2.667 13.990 C 1.793 13.901 1.099 13.207 1.010 12.333 L 1.000 12.143 L 1.000 2.857 C 1.000 1.896 1.731 1.105 2.667 1.010 L 2.857 1.000 L 12.143 1.000 L 12.333 1.010 ZM 2.857 2.000 C 2.384 2.000 2.000 2.384 2.000 2.857 L 2.000 12.143 C 2.000 12.616 2.384 13.000 2.857 13.000 L 12.143 13.000 C 12.616 13.000 13.000 12.616 13.000 12.143 L 13.000 2.857 C 13.000 2.384 12.616 2.000 12.143 2.000 L 2.857 2.000 ZM 4.500 10.000 C 4.776 10.000 5.000 10.224 5.000 10.500 C 5.000 10.776 4.776 11.000 4.500 11.000 C 4.224 11.000 4.000 10.776 4.000 10.500 C 4.000 10.224 4.224 10.000 4.500 10.000 ZM 7.500 10.000 C 7.776 10.000 8.000 10.224 8.000 10.500 C 8.000 10.776 7.776 11.000 7.500 11.000 C 7.224 11.000 7.000 10.776 7.000 10.500 C 7.000 10.224 7.224 10.000 7.500 10.000 ZM 10.500 10.000 C 10.776 10.000 11.000 10.224 11.000 10.500 C 11.000 10.776 10.776 11.000 10.500 11.000 C 10.224 11.000 10.000 10.776 10.000 10.500 C 10.000 10.224 10.224 10.000 10.500 10.000 ZM 4.500 7.000 C 4.776 7.000 5.000 7.224 5.000 7.500 C 5.000 7.776 4.776 8.000 4.500 8.000 C 4.224 8.000 4.000 7.776 4.000 7.500 C 4.000 7.224 4.224 7.000 4.500 7.000 ZM 10.500 7.000 C 10.776 7.000 11.000 7.224 11.000 7.500 C 11.000 7.776 10.776 8.000 10.500 8.000 C 10.224 8.000 10.000 7.776 10.000 7.500 C 10.000 7.224 10.224 7.000 10.500 7.000 ZM 4.500 4.000 C 4.776 4.000 5.000 4.224 5.000 4.500 C 5.000 4.776 4.776 5.000 4.500 5.000 C 4.224 5.000 4.000 4.776 4.000 4.500 C 4.000 4.224 4.224 4.000 4.500 4.000 ZM 7.500 4.000 C 7.776 4.000 8.000 4.224 8.000 4.500 C 8.000 4.776 7.776 5.000 7.500 5.000 C 7.224 5.000 7.000 4.776 7.000 4.500 C 7.000 4.224 7.224 4.000 7.500 4.000 ZM 10.500 4.000 C 10.776 4.000 11.000 4.224 11.000 4.500 C 11.000 4.776 10.776 5.000 10.500 5.000 C 10.224 5.000 10.000 4.776 10.000 4.500 C 10.000 4.224 10.224 4.000 10.500 4.000 Z"),
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
        return _padding!!
    }

private var _padding: ImageVector? = null
