package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RssFill: ImageVector
    get() {
        if (_rssFill != null) return _rssFill!!
        _rssFill = remixIcon(
            name = "RssFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3c9.941 0 18 8.059 18 18h-3C18 12.716 11.284 6 3 6v-3ZM3 10c6.075 0 11 4.925 11 11h-3C11 16.582 7.418 13 3 13v-3ZM3 17c2.209 0 4 1.791 4 4h-4v-4Z"),
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
        return _rssFill!!
    }

private var _rssFill: ImageVector? = null
