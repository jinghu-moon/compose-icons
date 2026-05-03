package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DividerHorizontal: ImageVector
    get() {
        if (_dividerHorizontal != null) return _dividerHorizontal!!
        _dividerHorizontal = radixIcon(
            name = "DividerHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.500 7.000 C 12.776 7.000 13.000 7.224 13.000 7.500 C 13.000 7.776 12.776 8.000 12.500 8.000 L 2.500 8.000 C 2.224 8.000 2.000 7.776 2.000 7.500 C 2.000 7.224 2.224 7.000 2.500 7.000 L 12.500 7.000 Z"),
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
        return _dividerHorizontal!!
    }

private var _dividerHorizontal: ImageVector? = null
