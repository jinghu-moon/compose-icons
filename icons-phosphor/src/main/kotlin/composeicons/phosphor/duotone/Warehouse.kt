package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = phosphorDuotoneIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 128v64h-112v-64Z"),
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
                pathData = parseSvgPathData("M240 184h-8v-126.1l9.67-2.08c2.857-.536 5.199-2.579 6.116-5.338 .918-2.758 .267-5.797-1.7-7.938-1.967-2.141-4.94-3.046-7.766-2.364l-224 48c-3.996 .862-6.7 4.599-6.268 8.665 .432 4.066 3.859 7.151 7.948 7.155 .568-.001 1.134-.061 1.69-.18L24 102.47v81.53h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h224c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM40 99 216 61.33v122.67h-24v-56c0-4.418-3.582-8-8-8h-112c-4.418 0-8 3.582-8 8v56h-24ZM176 152h-96v-16h96ZM80 168h96v16h-96Z"),
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
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
