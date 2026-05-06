package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorThinIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 52h-176c-2.209 0-4 1.791-4 4v152c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-52h56v20c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-120c0-2.209-1.791-4-4-4ZM92 208c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4v-84h48ZM92 116h-48v-56h48ZM156 148h-56v-88h56ZM212 176c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4v-52h48ZM212 116h-48v-56h48Z"),
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
