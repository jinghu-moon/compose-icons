package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Gradient: ImageVector
    get() {
        if (_gradient != null) return _gradient!!
        _gradient = phosphorDuotoneIcon(
            name = "Gradient",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 64v120h-192v-120Z"),
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
                pathData = parseSvgPathData("M24 104c0-4.418 3.582-8 8-8h80c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-80c-4.418 0-8-3.582-8-8ZM224 96h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM72 136h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM224 136h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM96 144c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8ZM56 176h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM112 176h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM168 176h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM224 176h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM32 72h192c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-192c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8Z"),
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
