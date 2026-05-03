package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Sun: ImageVector
    get() {
        if (_sun != null) return _sun!!
        _sun = radixIcon(
            name = "Sun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 12.000 C 7.776 12.000 8.000 12.224 8.000 12.500 L 8.000 14.500 C 8.000 14.776 7.776 15.000 7.500 15.000 C 7.224 15.000 7.000 14.776 7.000 14.500 L 7.000 12.500 C 7.000 12.224 7.224 12.000 7.500 12.000 ZM 3.611 10.682 C 3.807 10.487 4.123 10.486 4.318 10.682 C 4.514 10.877 4.513 11.193 4.318 11.389 L 2.903 12.804 C 2.708 12.998 2.391 12.999 2.196 12.804 C 2.001 12.609 2.001 12.292 2.196 12.097 L 3.611 10.682 ZM 10.682 10.682 C 10.877 10.486 11.193 10.487 11.389 10.682 L 12.804 12.097 C 12.998 12.292 12.999 12.609 12.804 12.804 C 12.609 12.999 12.292 12.998 12.097 12.804 L 10.682 11.389 C 10.487 11.193 10.486 10.877 10.682 10.682 ZM 7.500 4.500 C 9.157 4.500 10.500 5.843 10.500 7.500 C 10.500 9.157 9.157 10.500 7.500 10.500 C 5.843 10.500 4.500 9.157 4.500 7.500 C 4.500 5.843 5.843 4.500 7.500 4.500 ZM 7.500 5.500 C 6.395 5.500 5.500 6.395 5.500 7.500 C 5.500 8.605 6.395 9.500 7.500 9.500 C 8.605 9.500 9.500 8.605 9.500 7.500 C 9.500 6.395 8.605 5.500 7.500 5.500 ZM 2.500 7.000 C 2.776 7.000 3.000 7.224 3.000 7.500 C 3.000 7.776 2.776 8.000 2.500 8.000 L 0.500 8.000 C 0.224 8.000 0.000 7.776 0.000 7.500 C 0.000 7.224 0.224 7.000 0.500 7.000 L 2.500 7.000 ZM 14.500 7.000 C 14.776 7.000 15.000 7.224 15.000 7.500 C 15.000 7.776 14.776 8.000 14.500 8.000 L 12.500 8.000 C 12.224 8.000 12.000 7.776 12.000 7.500 C 12.000 7.224 12.224 7.000 12.500 7.000 L 14.500 7.000 ZM 2.196 2.196 C 2.391 2.001 2.708 2.001 2.903 2.196 L 4.318 3.611 C 4.513 3.807 4.514 4.123 4.318 4.318 C 4.123 4.514 3.807 4.513 3.611 4.318 L 2.196 2.903 C 2.001 2.708 2.001 2.391 2.196 2.196 ZM 12.097 2.196 C 12.292 2.001 12.609 2.001 12.804 2.196 C 12.999 2.391 12.998 2.708 12.804 2.903 L 11.389 4.318 C 11.193 4.513 10.877 4.514 10.682 4.318 C 10.486 4.123 10.487 3.807 10.682 3.611 L 12.097 2.196 ZM 7.500 0.000 C 7.776 0.000 8.000 0.224 8.000 0.500 L 8.000 2.500 C 8.000 2.776 7.776 3.000 7.500 3.000 C 7.224 3.000 7.000 2.776 7.000 2.500 L 7.000 0.500 C 7.000 0.224 7.224 0.000 7.500 0.000 Z"),
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
        return _sun!!
    }

private var _sun: ImageVector? = null
