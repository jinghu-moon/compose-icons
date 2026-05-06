package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gradient: ImageVector
    get() {
        if (_gradient != null) return _gradient!!
        _gradient = phosphorBoldIcon(
            name = "Gradient",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 108c0-6.627 5.373-12 12-12h76c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-76c-6.627 0-12-5.373-12-12ZM224 96h-76c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h76c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM68 136h-36c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h36c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM224 136h-36c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h36c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM96 148c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-40c-6.627 0-12 5.373-12 12ZM52 176h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM108 176h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM164 176h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM224 176h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM32 80h192c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-192C25.373 56 20 61.373 20 68c0 6.627 5.373 12 12 12Z"),
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
