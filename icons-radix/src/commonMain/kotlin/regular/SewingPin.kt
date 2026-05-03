package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SewingPin: ImageVector
    get() {
        if (_sewingPin != null) return _sewingPin!!
        _sewingPin = radixIcon(
            name = "SewingPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.500 1.000 C 8.881 1.000 10.000 2.119 10.000 3.500 C 10.000 4.709 9.141 5.718 8.000 5.949 L 8.000 13.500 C 8.000 13.776 7.776 14.000 7.500 14.000 C 7.224 14.000 7.000 13.776 7.000 13.500 L 7.000 5.949 C 5.859 5.718 5.000 4.709 5.000 3.500 C 5.000 2.119 6.119 1.000 7.500 1.000 ZM 7.500 2.000 C 6.672 2.000 6.000 2.672 6.000 3.500 C 6.000 4.328 6.672 5.000 7.500 5.000 C 8.328 5.000 9.000 4.328 9.000 3.500 C 9.000 2.672 8.328 2.000 7.500 2.000 Z"),
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
        return _sewingPin!!
    }

private var _sewingPin: ImageVector? = null
