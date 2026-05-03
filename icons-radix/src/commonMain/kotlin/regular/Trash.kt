package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = radixIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.500 3.000 C 11.776 3.000 12.000 3.224 12.000 3.500 C 12.000 3.776 11.776 4.000 11.500 4.000 L 11.000 4.000 L 11.000 12.000 L 10.995 12.102 C 10.947 12.573 10.573 12.947 10.102 12.995 L 10.000 13.000 L 5.000 13.000 L 4.897 12.995 C 4.427 12.947 4.053 12.573 4.005 12.102 L 4.000 12.000 L 4.000 4.000 L 3.500 4.000 C 3.224 4.000 3.000 3.776 3.000 3.500 C 3.000 3.224 3.224 3.000 3.500 3.000 L 11.500 3.000 ZM 5.000 12.000 L 10.000 12.000 L 10.000 4.000 L 5.000 4.000 L 5.000 12.000 ZM 9.500 1.000 C 9.776 1.000 10.000 1.224 10.000 1.500 C 10.000 1.776 9.776 2.000 9.500 2.000 L 5.500 2.000 C 5.224 2.000 5.000 1.776 5.000 1.500 C 5.000 1.224 5.224 1.000 5.500 1.000 L 9.500 1.000 Z"),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
