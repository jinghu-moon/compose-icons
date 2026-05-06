package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListPlus: ImageVector
    get() {
        if (_listPlus != null) return _listPlus!!
        _listPlus = phosphorThinIcon(
            name = "ListPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M36 64c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4ZM40 132h176c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-176c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM144 188h-104c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h104c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM232 188h-20v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _listPlus!!
    }

private var _listPlus: ImageVector? = null
