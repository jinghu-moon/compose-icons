package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorFillIcon(
            name = "CrosshairSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 136h23.54c-3.782 33.401-30.139 59.758-63.54 63.54v-23.54c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v23.54C86.599 195.758 60.242 169.401 56.46 136h23.54c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-23.54C60.242 86.599 86.599 60.242 120 56.46v23.54c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-23.54c33.401 3.782 59.758 30.139 63.54 63.54h-23.54c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.412 .061 103.939 46.588 104 104ZM216 128C216 79.399 176.601 40 128 40 79.399 40 40 79.399 40 128c0 48.601 39.399 88 88 88 48.578-.055 87.945-39.422 88-88Z"),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
