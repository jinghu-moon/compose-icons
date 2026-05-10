package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TokenSwapFill: ImageVector
    get() {
        if (_tokenSwapFill != null) return _tokenSwapFill!!
        _tokenSwapFill = remixIcon(
            name = "TokenSwapFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.5 9c0 2.704-1.651 5.022-4 6.002v-.002c0-4.694-3.806-8.5-8.5-8.5h-.002c.98-2.349 3.298-4 6.002-4 3.59 0 6.5 2.91 6.5 6.5ZM7 3C4.791 3 3 4.791 3 7v1.5h2v-1.5C5 5.895 5.895 5 7 5h1.5v-2h-1.5ZM19 15.5v1.5c0 1.105-.895 2-2 2h-1.5v2h1.5c2.209 0 4-1.791 4-4v-1.5h-2ZM9 21.5c3.59 0 6.5-2.91 6.5-6.5C15.5 11.41 12.59 8.5 9 8.5 5.41 8.5 2.5 11.41 2.5 15c0 3.59 2.91 6.5 6.5 6.5ZM9 12.5 11.5 15 9 17.5 6.5 15 9 12.5Z"),
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
        return _tokenSwapFill!!
    }

private var _tokenSwapFill: ImageVector? = null
