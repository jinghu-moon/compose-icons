package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = radixIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 4.000 L 10.000 2.500 C 10.000 2.224 9.776 2.000 9.500 2.000 L 2.500 2.000 C 2.224 2.000 2.000 2.224 2.000 2.500 L 2.000 9.500 C 2.000 9.776 2.224 10.000 2.500 10.000 L 4.000 10.000 L 4.000 5.500 C 4.000 4.672 4.672 4.000 5.500 4.000 L 10.000 4.000 ZM 5.500 5.000 C 5.224 5.000 5.000 5.224 5.000 5.500 L 5.000 12.500 C 5.000 12.776 5.224 13.000 5.500 13.000 L 12.500 13.000 C 12.776 13.000 13.000 12.776 13.000 12.500 L 13.000 5.500 C 13.000 5.224 12.776 5.000 12.500 5.000 L 5.500 5.000 ZM 12.500 4.000 C 13.328 4.000 14.000 4.672 14.000 5.500 L 14.000 12.500 C 14.000 13.328 13.328 14.000 12.500 14.000 L 5.500 14.000 C 4.672 14.000 4.000 13.328 4.000 12.500 L 4.000 11.000 L 2.500 11.000 C 1.672 11.000 1.000 10.328 1.000 9.500 L 1.000 2.500 C 1.000 1.672 1.672 1.000 2.500 1.000 L 9.500 1.000 C 10.328 1.000 11.000 1.672 11.000 2.500 L 11.000 4.000 L 12.500 4.000 Z"),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
