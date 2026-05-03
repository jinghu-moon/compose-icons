package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Pilcrow: ImageVector
    get() {
        if (_pilcrow != null) return _pilcrow!!
        _pilcrow = radixIcon(
            name = "Pilcrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 5.500 C 3.000 7.983 4.992 9.000 7.000 9.000 L 7.000 12.500 C 7.000 12.776 7.224 13.000 7.500 13.000 C 7.776 13.000 8.000 12.776 8.000 12.500 L 8.000 9.000 L 8.000 3.100 L 9.000 3.100 L 9.000 12.500 C 9.000 12.776 9.224 13.000 9.500 13.000 C 9.776 13.000 10.000 12.776 10.000 12.500 L 10.000 3.100 L 11.500 3.100 L 11.611 3.089 C 11.862 3.038 12.050 2.816 12.050 2.550 C 12.050 2.284 11.862 2.062 11.611 2.011 L 11.500 2.000 L 9.514 2.000 C 9.509 2.000 9.505 2.000 9.500 2.000 C 9.495 2.000 9.491 2.000 9.486 2.000 L 8.000 2.000 L 8.000 2.000 L 7.500 2.000 L 7.000 2.000 C 4.992 2.000 3.000 3.017 3.000 5.500 Z"),
        pathFillType = PathFillType.EvenOdd,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _pilcrow!!
    }

private var _pilcrow: ImageVector? = null
