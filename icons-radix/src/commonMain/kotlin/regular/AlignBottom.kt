package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) return _alignBottom!!
        _alignBottom = radixIcon(
            name = "AlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 2.000 C 8.552 2.000 9.000 2.448 9.000 3.000 L 9.000 14.000 L 13.500 14.000 C 13.776 14.000 14.000 14.224 14.000 14.500 C 14.000 14.776 13.776 15.000 13.500 15.000 L 1.500 15.000 C 1.224 15.000 1.000 14.776 1.000 14.500 C 1.000 14.224 1.224 14.000 1.500 14.000 L 6.000 14.000 L 6.000 3.000 C 6.000 2.448 6.448 2.000 7.000 2.000 L 8.000 2.000 Z"),
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
        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null
