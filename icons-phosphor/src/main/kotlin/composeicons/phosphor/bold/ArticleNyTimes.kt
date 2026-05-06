package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) return _articleNyTimes!!
        _articleNyTimes = phosphorBoldIcon(
            name = "ArticleNyTimes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 92c0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12ZM232 120h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM232 160h-152c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h152c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM232 200h-152c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h152c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM96 144c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-4v-52h24v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-16c0-6.627-5.373-12-12-12h-96C25.373 44 20 49.373 20 56v16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h24v52h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12Z"),
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
