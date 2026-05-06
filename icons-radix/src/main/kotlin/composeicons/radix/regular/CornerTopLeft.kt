package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CornerTopLeft: ImageVector
    get() {
        if (_cornerTopLeft != null) return _cornerTopLeft!!
        _cornerTopLeft = radixIcon(
            name = "CornerTopLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.5 3c.276 0 .5 .224 .5 .5C12 3.776 11.776 4 11.5 4h-1.6C8.772 4 7.955 4 7.313 4.053c-.636 .052-1.057 .153-1.402 .329C5.253 4.717 4.717 5.253 4.382 5.911c-.176 .346-.277 .766-.329 1.402C4 7.955 4 8.772 4 9.9v1.6C4 11.776 3.776 12 3.5 12 3.224 12 3 11.776 3 11.5v-1.6C3 8.789 3 7.924 3.057 7.232c.057-.698 .174-1.265 .434-1.775C3.922 4.61 4.61 3.922 5.457 3.49c.51-.26 1.078-.377 1.775-.434C7.924 3 8.789 3 9.9 3h1.6Z"),
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
        return _cornerTopLeft!!
    }

private var _cornerTopLeft: ImageVector? = null
