package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorThinIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 64c0-2.209 1.791-4 4-4h120c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-120c-2.209 0-4-1.791-4-4ZM216 124h-120c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h120c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM216 188h-120c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h120c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM56 60h-16c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM56 124h-16c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM56 188h-16c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
