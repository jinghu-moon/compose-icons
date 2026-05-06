package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) return _articleNyTimes!!
        _articleNyTimes = phosphorThinIcon(
            name = "ArticleNyTimes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 100h104c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-104c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4ZM232 132h-104c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h104c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM232 164h-152c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h152c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM232 196h-152c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h152c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM96 140c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-12v-72h40v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-16c0-2.209-1.791-4-4-4h-96c-2.209 0-4 1.791-4 4v16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h40v72h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4Z"),
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
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
