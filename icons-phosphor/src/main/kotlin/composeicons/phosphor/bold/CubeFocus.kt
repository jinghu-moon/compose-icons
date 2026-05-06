package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) return _cubeFocus!!
        _cubeFocus = phosphorBoldIcon(
            name = "CubeFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 48v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-28h-28c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12ZM72 196h-28v-28c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v40c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM224 156c-6.627 0-12 5.373-12 12v28h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12ZM32 100c6.627 0 12-5.373 12-12v-28h28c6.627 0 12-5.373 12-12C84 41.373 78.627 36 72 36h-40C25.373 36 20 41.373 20 48v40c0 6.627 5.373 12 12 12ZM190 170.42l-56 32c-3.687 2.105-8.213 2.105-11.9 0l-56-32C62.34 168.297 60.011 164.318 60 160v-64c-.01-4.297 2.279-8.271 6-10.42l56-32c3.687-2.105 8.213-2.105 11.9 0l56 32c3.76 2.123 6.089 6.102 6.1 10.42v64c.01 4.297-2.279 8.271-6 10.42ZM96.19 96 128 114.18 159.81 96 128 77.82ZM84 153l32 18.28v-36.28L84 116.68ZM172 153v-36.32L140 135v36.36Z"),
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
