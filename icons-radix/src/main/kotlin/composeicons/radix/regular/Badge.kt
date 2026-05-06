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
                pathData = parseSvgPathData("M11.756 5.013C13.016 5.141 14 6.206 14 7.5c0 1.294-.984 2.359-2.244 2.487L11.5 10h-8L3.244 9.987C1.984 9.859 1 8.794 1 7.5 1 6.206 1.984 5.141 3.244 5.013L3.5 5h8l.256 .013ZM3.5 6C2.672 6 2 6.672 2 7.5 2 8.328 2.672 9 3.5 9h8C12.328 9 13 8.328 13 7.5 13 6.672 12.328 6 11.5 6h-8ZM10.5 7c.276 0 .5 .224 .5 .5C11 7.776 10.776 8 10.5 8h-6C4.224 8 4 7.776 4 7.5 4 7.224 4.224 7 4.5 7h6Z"),
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
