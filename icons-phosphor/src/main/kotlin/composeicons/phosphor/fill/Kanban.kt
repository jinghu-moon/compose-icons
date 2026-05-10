package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorFillIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 56v96c0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM224 48h-40c-4.418 0-8 3.582-8 8v52c0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4v-52c0-4.418-3.582-8-8-8ZM228 128h-48c-2.209 0-4 1.791-4 4v44c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-44c0-2.209-1.791-4-4-4ZM80 48h-40c-4.418 0-8 3.582-8 8v52c0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4v-52c0-4.418-3.582-8-8-8ZM84 128h-48c-2.209 0-4 1.791-4 4v76c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-76c0-2.209-1.791-4-4-4Z"),
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
        return _kanban!!
    }

private var _kanban: ImageVector? = null
