package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorThinIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 128c0-2.209 1.791-4 4-4h72c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-72c-2.209 0-4-1.791-4-4ZM48 68h56c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-56c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM184 188h-136c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h136c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM226.83 85.17l-40-40c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173l-40 40c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L180 57.66v86.34c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-86.34l33.17 33.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66Z"),
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
        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
