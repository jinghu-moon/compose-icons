package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) return _articleMedium!!
        _articleMedium = phosphorThinIcon(
            name = "ArticleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52 136c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h12v-72h-12c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h16c1.376-.001 2.657 .705 3.39 1.87L80 112.45 116.61 53.88c.731-1.169 2.012-1.879 3.39-1.88h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-12v72h12c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h4v-62L83.39 122.12c-.731 1.168-2.012 1.877-3.39 1.877-1.378 0-2.659-.709-3.39-1.877L44 70v62h4c2.209 0 4 1.791 4 4ZM168 108h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM232 132h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM232 164h-152c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h152c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM232 196h-152c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h152c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _articleMedium!!
    }

private var _articleMedium: ImageVector? = null
