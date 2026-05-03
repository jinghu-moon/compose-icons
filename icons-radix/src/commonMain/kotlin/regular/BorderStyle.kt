package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BorderStyle: ImageVector
    get() {
        if (_borderStyle != null) return _borderStyle!!
        _borderStyle = radixIcon(
            name = "BorderStyle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 1.500 11.000 C 1.776 11.000 2.000 11.224 2.000 11.500 C 2.000 11.776 1.776 12.000 1.500 12.000 C 1.224 12.000 1.000 11.776 1.000 11.500 C 1.000 11.224 1.224 11.000 1.500 11.000 ZM 3.500 11.000 C 3.776 11.000 4.000 11.224 4.000 11.500 C 4.000 11.776 3.776 12.000 3.500 12.000 C 3.224 12.000 3.000 11.776 3.000 11.500 C 3.000 11.224 3.224 11.000 3.500 11.000 ZM 5.500 11.000 C 5.776 11.000 6.000 11.224 6.000 11.500 C 6.000 11.776 5.776 12.000 5.500 12.000 C 5.224 12.000 5.000 11.776 5.000 11.500 C 5.000 11.224 5.224 11.000 5.500 11.000 ZM 7.500 11.000 C 7.776 11.000 8.000 11.224 8.000 11.500 C 8.000 11.776 7.776 12.000 7.500 12.000 C 7.224 12.000 7.000 11.776 7.000 11.500 C 7.000 11.224 7.224 11.000 7.500 11.000 ZM 9.500 11.000 C 9.776 11.000 10.000 11.224 10.000 11.500 C 10.000 11.776 9.776 12.000 9.500 12.000 C 9.224 12.000 9.000 11.776 9.000 11.500 C 9.000 11.224 9.224 11.000 9.500 11.000 ZM 11.500 11.000 C 11.776 11.000 12.000 11.224 12.000 11.500 C 12.000 11.776 11.776 12.000 11.500 12.000 C 11.224 12.000 11.000 11.776 11.000 11.500 C 11.000 11.224 11.224 11.000 11.500 11.000 ZM 13.500 11.000 C 13.776 11.000 14.000 11.224 14.000 11.500 C 14.000 11.776 13.776 12.000 13.500 12.000 C 13.224 12.000 13.000 11.776 13.000 11.500 C 13.000 11.224 13.224 11.000 13.500 11.000 ZM 3.500 7.000 C 3.776 7.000 4.000 7.224 4.000 7.500 C 4.000 7.776 3.776 8.000 3.500 8.000 L 1.500 8.000 C 1.224 8.000 1.000 7.776 1.000 7.500 C 1.000 7.224 1.224 7.000 1.500 7.000 L 3.500 7.000 ZM 8.500 7.000 C 8.776 7.000 9.000 7.224 9.000 7.500 C 9.000 7.776 8.776 8.000 8.500 8.000 L 6.500 8.000 C 6.224 8.000 6.000 7.776 6.000 7.500 C 6.000 7.224 6.224 7.000 6.500 7.000 L 8.500 7.000 ZM 13.500 7.000 C 13.776 7.000 14.000 7.224 14.000 7.500 C 14.000 7.776 13.776 8.000 13.500 8.000 L 11.500 8.000 C 11.224 8.000 11.000 7.776 11.000 7.500 C 11.000 7.224 11.224 7.000 11.500 7.000 L 13.500 7.000 ZM 13.500 3.000 C 13.776 3.000 14.000 3.224 14.000 3.500 C 14.000 3.776 13.776 4.000 13.500 4.000 L 1.500 4.000 C 1.224 4.000 1.000 3.776 1.000 3.500 C 1.000 3.224 1.224 3.000 1.500 3.000 L 13.500 3.000 Z"),
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
        return _borderStyle!!
    }

private var _borderStyle: ImageVector? = null
