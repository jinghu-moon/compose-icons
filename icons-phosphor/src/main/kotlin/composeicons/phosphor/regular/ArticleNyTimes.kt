package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) return _articleNyTimes!!
        _articleNyTimes = phosphorRegularIcon(
            name = "ArticleNyTimes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 96h104c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-104c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM232 128h-104c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h104c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM232 160h-152c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h152c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM232 192h-152c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h152c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM96 144c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8v-64h32v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16c0-4.418-3.582-8-8-8h-96c-4.418 0-8 3.582-8 8v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h32v64h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8Z"),
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
