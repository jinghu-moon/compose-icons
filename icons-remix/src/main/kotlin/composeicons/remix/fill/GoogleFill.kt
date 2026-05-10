package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GoogleFill: ImageVector
    get() {
        if (_googleFill != null) return _googleFill!!
        _googleFill = remixIcon(
            name = "GoogleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.064 7.509C4.709 4.241 8.091 2 12 2c2.695 0 4.959 .991 6.691 2.605L15.823 7.473C14.786 6.482 13.468 5.977 12 5.977c-2.605 0-4.809 1.759-5.595 4.123-.2 .6-.314 1.241-.314 1.9 0 .659 .114 1.3 .314 1.9 .786 2.364 2.991 4.123 5.595 4.123 1.345 0 2.491-.354 3.386-.955 1.059-.709 1.764-1.768 1.995-3.018h-5.382v-3.868h9.418c.118 .655 .182 1.336 .182 2.045 0 3.045-1.091 5.609-2.982 7.35C16.964 21.105 14.7 22 12 22 8.091 22 4.709 19.759 3.064 16.491 2.386 15.141 2 13.614 2 12 2 10.386 2.386 8.859 3.064 7.509Z"),
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
        return _googleFill!!
    }

private var _googleFill: ImageVector? = null
