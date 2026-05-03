package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Badge: ImageVector
    get() {
        if (_badge != null) return _badge!!
        _badge = radixIcon(
            name = "Badge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.756 5.013 C 13.016 5.141 14.000 6.206 14.000 7.500 C 14.000 8.794 13.016 9.859 11.756 9.987 L 11.500 10.000 L 3.500 10.000 L 3.244 9.987 C 1.984 9.859 1.000 8.794 1.000 7.500 C 1.000 6.206 1.984 5.141 3.244 5.013 L 3.500 5.000 L 11.500 5.000 L 11.756 5.013 ZM 3.500 6.000 C 2.672 6.000 2.000 6.672 2.000 7.500 C 2.000 8.328 2.672 9.000 3.500 9.000 L 11.500 9.000 C 12.328 9.000 13.000 8.328 13.000 7.500 C 13.000 6.672 12.328 6.000 11.500 6.000 L 3.500 6.000 ZM 10.500 7.000 C 10.776 7.000 11.000 7.224 11.000 7.500 C 11.000 7.776 10.776 8.000 10.500 8.000 L 4.500 8.000 C 4.224 8.000 4.000 7.776 4.000 7.500 C 4.000 7.224 4.224 7.000 4.500 7.000 L 10.500 7.000 Z"),
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
        return _badge!!
    }

private var _badge: ImageVector? = null
