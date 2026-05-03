package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.File: ImageVector
    get() {
        if (_file != null) return _file!!
        _file = radixIcon(
            name = "File",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.598 1.010 C 8.694 1.029 8.783 1.076 8.854 1.146 L 12.854 5.146 C 12.947 5.240 13.000 5.367 13.000 5.500 L 13.000 12.500 C 13.000 13.328 12.328 14.000 11.500 14.000 L 3.500 14.000 C 2.672 14.000 2.000 13.328 2.000 12.500 L 2.000 2.500 C 2.000 1.672 2.672 1.000 3.500 1.000 L 8.500 1.000 L 8.598 1.010 ZM 3.500 2.000 C 3.224 2.000 3.000 2.224 3.000 2.500 L 3.000 12.500 C 3.000 12.776 3.224 13.000 3.500 13.000 L 11.500 13.000 C 11.776 13.000 12.000 12.776 12.000 12.500 L 12.000 6.000 L 8.500 6.000 C 8.224 6.000 8.000 5.776 8.000 5.500 L 8.000 2.000 L 3.500 2.000 ZM 9.000 5.000 L 11.293 5.000 L 9.000 2.707 L 9.000 5.000 Z"),
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
        return _file!!
    }

private var _file: ImageVector? = null
