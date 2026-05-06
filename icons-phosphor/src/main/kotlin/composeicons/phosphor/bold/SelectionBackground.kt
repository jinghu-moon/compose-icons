package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorBoldIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 80h-108C36.954 80 28 88.954 28 100v108c0 11.046 8.954 20 20 20h108c11.046 0 20-8.954 20-20v-108C176 88.954 167.046 80 156 80ZM152 204h-100v-100h100ZM132 40c0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12ZM228 48v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-4c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h8c11.046 0 20 8.954 20 20ZM228 96v16c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-16c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM228 152v8c0 11.046-8.954 20-20 20h-8c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h4v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM76 56v-8C76 36.954 84.954 28 96 28h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-4v4c0 6.627-5.373 12-12 12C81.373 68 76 62.627 76 56Z"),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
