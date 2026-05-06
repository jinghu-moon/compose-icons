package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorRegularIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48h-176c-4.418 0-8 3.582-8 8v152c0 8.837 7.163 16 16 16h40c8.837 0 16-7.163 16-16v-48h48v16c0 8.837 7.163 16 16 16h40c8.837 0 16-7.163 16-16v-120c0-4.418-3.582-8-8-8ZM88 208h-40v-80h40ZM88 112h-40v-48h40ZM152 144h-48v-80h48ZM208 176h-40v-48h40ZM208 112h-40v-48h40Z"),
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
