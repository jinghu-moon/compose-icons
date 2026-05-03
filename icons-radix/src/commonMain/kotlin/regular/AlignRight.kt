package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AlignRight: ImageVector
    get() {
        if (_alignRight != null) return _alignRight!!
        _alignRight = radixIcon(
            name = "AlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 13.500 C 15.000 13.776 14.776 14.000 14.500 14.000 C 14.224 14.000 14.000 13.776 14.000 13.500 L 14.000 9.000 L 3.000 9.000 C 2.448 9.000 2.000 8.552 2.000 8.000 L 2.000 7.000 C 2.000 6.448 2.448 6.000 3.000 6.000 L 14.000 6.000 L 14.000 1.500 C 14.000 1.224 14.224 1.000 14.500 1.000 C 14.776 1.000 15.000 1.224 15.000 1.500 L 15.000 13.500 Z"),
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
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
