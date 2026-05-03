package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AlignCenterVertically: ImageVector
    get() {
        if (_alignCenterVertically != null) return _alignCenterVertically!!
        _alignCenterVertically = radixIcon(
            name = "AlignCenterVertically",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 1.000 C 8.552 1.000 9.000 1.448 9.000 2.000 L 9.000 7.000 L 13.500 7.000 C 13.776 7.000 14.000 7.224 14.000 7.500 C 14.000 7.776 13.776 8.000 13.500 8.000 L 9.000 8.000 L 9.000 13.000 C 9.000 13.552 8.552 14.000 8.000 14.000 L 7.000 14.000 C 6.448 14.000 6.000 13.552 6.000 13.000 L 6.000 8.000 L 1.500 8.000 C 1.224 8.000 1.000 7.776 1.000 7.500 C 1.000 7.224 1.224 7.000 1.500 7.000 L 6.000 7.000 L 6.000 2.000 C 6.000 1.448 6.448 1.000 7.000 1.000 L 8.000 1.000 Z"),
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
        return _alignCenterVertically!!
    }

private var _alignCenterVertically: ImageVector? = null
