package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LeafFill: ImageVector
    get() {
        if (_leafFill != null) return _leafFill!!
        _leafFill = remixIcon(
            name = "LeafFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.998 3v2c0 9.627-5.372 14-12 14L7.096 19c.212-3.012 1.149-4.835 3.598-7.001 1.204-1.065 1.103-1.68 .509-1.327C7.119 13.102 5.091 16.386 5.001 21.63L4.998 22h-2c0-1.363 .116-2.6 .346-3.732C3.113 16.974 2.998 15.218 2.998 13 2.998 7.477 7.475 3 12.998 3c2 0 4 1 8 0Z"),
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
        return _leafFill!!
    }

private var _leafFill: ImageVector? = null
