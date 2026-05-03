package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BorderDashed: ImageVector
    get() {
        if (_borderDashed != null) return _borderDashed!!
        _borderDashed = radixIcon(
            name = "BorderDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 7.000 C 3.276 7.000 3.500 7.224 3.500 7.500 C 3.500 7.776 3.276 8.000 3.000 8.000 L 0.500 8.000 C 0.224 8.000 0.000 7.776 0.000 7.500 C 0.000 7.224 0.224 7.000 0.500 7.000 L 3.000 7.000 ZM 8.750 7.000 C 9.026 7.000 9.250 7.224 9.250 7.500 C 9.250 7.776 9.026 8.000 8.750 8.000 L 6.250 8.000 C 5.974 8.000 5.750 7.776 5.750 7.500 C 5.750 7.224 5.974 7.000 6.250 7.000 L 8.750 7.000 ZM 14.500 7.000 C 14.776 7.000 15.000 7.224 15.000 7.500 C 15.000 7.776 14.776 8.000 14.500 8.000 L 12.000 8.000 C 11.724 8.000 11.500 7.776 11.500 7.500 C 11.500 7.224 11.724 7.000 12.000 7.000 L 14.500 7.000 Z"),
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
        return _borderDashed!!
    }

private var _borderDashed: ImageVector? = null
