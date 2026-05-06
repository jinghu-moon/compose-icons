package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Table: ImageVector
    get() {
        if (_table != null) return _table!!
        _table = phosphorLightIcon(
            name = "Table",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 50h-192c-3.314 0-6 2.686-6 6v136c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-136c0-3.314-2.686-6-6-6ZM38 110h44v36h-44ZM94 110h124v36h-124ZM218 62v36h-180v-36ZM38 192v-34h44v36h-42c-1.105 0-2-.895-2-2ZM216 194h-122v-36h124v34c0 1.105-.895 2-2 2Z"),
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
        return _table!!
    }

private var _table: ImageVector? = null
