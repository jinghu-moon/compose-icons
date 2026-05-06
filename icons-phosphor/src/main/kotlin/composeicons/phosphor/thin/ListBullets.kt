package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorThinIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 64c0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4ZM216 124h-128c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h128c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM216 188h-128c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h128c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM44 120c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM44 56c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM44 184c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
