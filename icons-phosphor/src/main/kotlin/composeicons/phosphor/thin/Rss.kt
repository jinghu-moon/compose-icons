package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorThinIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104.08 151.92C116.878 164.641 124.051 181.955 124 200c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C116 166.863 89.137 140 56 140c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 18.045-.051 35.359 7.122 48.08 19.92ZM56 84c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 59.647 0 108 48.353 108 108 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C172 135.935 120.065 84 56 84ZM172 84C141.298 53.147 99.526 35.862 56 36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 41.396-.111 81.117 16.341 110.31 45.69C195.659 118.883 212.111 158.604 212 200c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 .138-43.526-17.147-85.298-48-116ZM60 188c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _rss!!
    }

private var _rss: ImageVector? = null
