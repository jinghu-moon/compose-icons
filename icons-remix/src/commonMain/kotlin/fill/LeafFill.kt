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
                pathData = parseSvgPathData("M 20.998 3.000 L 20.998 5.000 C 20.998 14.627 15.625 19.000 8.998 19.000 L 7.096 19.000 C 7.308 15.988 8.245 14.165 10.694 11.999 C 11.898 10.934 11.797 10.319 11.203 10.672 C 7.119 13.102 5.091 16.386 5.001 21.630 L 4.998 22.000 L 2.998 22.000 C 2.998 20.637 3.114 19.400 3.344 18.268 C 3.113 16.974 2.998 15.218 2.998 13.000 C 2.998 7.477 7.475 3.000 12.998 3.000 C 14.998 3.000 16.998 4.000 20.998 3.000 Z"),
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
