package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorBoldIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v152c0 11.046 8.954 20 20 20h40c11.046 0 20-8.954 20-20v-44h40v12c0 11.046 8.954 20 20 20h40c11.046 0 20-8.954 20-20v-120c0-6.627-5.373-12-12-12ZM204 108h-32v-40h32ZM84 68v40h-32v-40ZM84 204h-32v-72h32ZM108 140v-72h40v72ZM172 172v-40h32v40Z"),
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
