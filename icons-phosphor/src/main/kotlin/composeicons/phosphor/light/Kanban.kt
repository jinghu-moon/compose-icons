package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorLightIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 50h-176c-3.314 0-6 2.686-6 6v152c0 7.732 6.268 14 14 14h40c7.732 0 14-6.268 14-14v-50h52v18c0 7.732 6.268 14 14 14h40c7.732 0 14-6.268 14-14v-120c0-3.314-2.686-6-6-6ZM210 114h-44v-52h44ZM90 62v52h-44v-52ZM90 208c0 1.105-.895 2-2 2h-40c-1.105 0-2-.895-2-2v-82h44ZM102 146v-84h52v84ZM208 178h-40c-1.105 0-2-.895-2-2v-50h44v50c0 1.105-.895 2-2 2Z"),
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
