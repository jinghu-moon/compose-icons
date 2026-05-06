package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gradient: ImageVector
    get() {
        if (_gradient != null) return _gradient!!
        _gradient = phosphorFillIcon(
            name = "Gradient",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 192c0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM224 184h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM152 184h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM32 168h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM224 152h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM224 56h-192c-4.418 0-8 3.582-8 8v24c0 4.418 3.582 8 8 8h192c4.418 0 8-3.582 8-8v-24c0-4.418-3.582-8-8-8ZM224 112h-192c-4.418 0-8 3.582-8 8v8c0 4.418 3.582 8 8 8h192c4.418 0 8-3.582 8-8v-8c0-4.418-3.582-8-8-8Z"),
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
        return _gradient!!
    }

private var _gradient: ImageVector? = null
