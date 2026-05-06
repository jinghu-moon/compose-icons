package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorBoldIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 128v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-40c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM168.06 126.81l-4 40c-.657 6.594 4.156 12.472 10.75 13.13 .4 0 .81 .06 1.2 .06 6.162-.006 11.319-4.678 11.93-10.81l4-40c.574-6.547-4.225-12.337-10.764-12.989-6.539-.652-12.387 4.078-13.116 10.609ZM87.94 126.81c-.729-6.531-6.577-11.261-13.116-10.609-6.539 .652-11.338 6.442-10.764 12.989l4 40c.611 6.136 5.774 10.81 11.94 10.81 .39 0 .8 0 1.2-.06 6.594-.658 11.407-6.536 10.75-13.13ZM243.94 89.59l-15.07 113C227.542 212.551 219.049 219.993 209 220h-162C36.986 219.971 28.528 212.562 27.18 202.64L12.11 89.64c-.474-3.437 .562-6.91 2.842-9.525C17.231 77.5 20.531 75.999 24 76h42.55L119 16.1c2.279-2.604 5.57-4.097 9.03-4.097 3.46 0 6.751 1.493 9.03 4.097L189.45 76h42.55c3.459 .001 6.749 1.495 9.027 4.098 2.278 2.603 3.321 6.063 2.863 9.492ZM98.45 76h59.1L128 42.22ZM218.29 100h-180.58l12.8 96h155Z"),
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
        return _basket!!
    }

private var _basket: ImageVector? = null
