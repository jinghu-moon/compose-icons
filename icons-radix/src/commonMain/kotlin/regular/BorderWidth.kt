package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BorderWidth: ImageVector
    get() {
        if (_borderWidth != null) return _borderWidth!!
        _borderWidth = radixIcon(
            name = "BorderWidth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 12.750 L 1.000 12.750 L 1.000 10.250 L 14.000 10.250 L 14.000 12.750 ZM 14.000 8.000 L 1.000 8.000 L 1.000 6.000 L 14.000 6.000 L 14.000 8.000 ZM 14.000 4.000 L 1.000 4.000 L 1.000 3.000 L 14.000 3.000 L 14.000 4.000 Z"),
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
        return _borderWidth!!
    }

private var _borderWidth: ImageVector? = null
