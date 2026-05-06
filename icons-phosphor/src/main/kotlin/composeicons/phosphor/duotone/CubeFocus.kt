package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) return _cubeFocus!!
        _cubeFocus = phosphorDuotoneIcon(
            name = "CubeFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 96v64l-56 32L72 160v-64L128 64Z"),
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
                pathData = parseSvgPathData("M232 48v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM72 200h-32v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM224 160c-4.418 0-8 3.582-8 8v32h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8ZM32 96c4.418 0 8-3.582 8-8v-32h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-40c-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8ZM188 167l-56 32c-2.46 1.406-5.48 1.406-7.94 0L68 167c-2.498-1.442-4.026-4.116-4-7v-64c-.026-2.884 1.502-5.558 4-7L124 57c2.46-1.406 5.48-1.406 7.94 0l56 32c2.498 1.442 4.026 4.116 4 7v64c.038 2.871-1.466 5.543-3.94 7ZM88.12 96 128 118.79 167.88 96 128 73.21ZM80 155.36l40 22.85v-45.57L80 109.79ZM176 155.36v-45.57l-40 22.85v45.57Z"),
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
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
