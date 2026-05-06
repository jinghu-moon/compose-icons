package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorDuotoneIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 56v64h-56v-64ZM40 208c0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8v-88h-56Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M216 48h-176c-4.418 0-8 3.582-8 8v152c0 8.837 7.163 16 16 16h40c8.837 0 16-7.163 16-16v-48h48v16c0 8.837 7.163 16 16 16h40c8.837 0 16-7.163 16-16v-120c0-4.418-3.582-8-8-8ZM208 112h-40v-48h40ZM88 64v48h-40v-48ZM88 208h-40v-80h40ZM104 144v-80h48v80ZM168 176v-48h40v48Z"),
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
