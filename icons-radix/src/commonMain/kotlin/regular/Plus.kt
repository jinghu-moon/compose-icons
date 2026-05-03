package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Plus: ImageVector
    get() {
        if (_plus != null) return _plus!!
        _plus = radixIcon(
            name = "Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.500 2.250 C 7.776 2.250 8.000 2.474 8.000 2.750 L 8.000 7.000 L 12.250 7.000 C 12.526 7.000 12.750 7.224 12.750 7.500 C 12.750 7.776 12.526 8.000 12.250 8.000 L 8.000 8.000 L 8.000 12.250 C 8.000 12.526 7.776 12.750 7.500 12.750 C 7.224 12.750 7.000 12.526 7.000 12.250 L 7.000 8.000 L 2.750 8.000 C 2.474 8.000 2.250 7.776 2.250 7.500 C 2.250 7.224 2.474 7.000 2.750 7.000 L 7.000 7.000 L 7.000 2.750 C 7.000 2.474 7.224 2.250 7.500 2.250 Z"),
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
        return _plus!!
    }

private var _plus: ImageVector? = null
