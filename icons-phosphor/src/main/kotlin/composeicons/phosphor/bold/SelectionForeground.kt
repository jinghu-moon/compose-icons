package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SelectionForeground: ImageVector
    get() {
        if (_selectionForeground != null) return _selectionForeground!!
        _selectionForeground = phosphorBoldIcon(
            name = "SelectionForeground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M68 216c0 6.627-5.373 12-12 12h-8C36.954 228 28 219.046 28 208v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h4c6.627 0 12 5.373 12 12ZM112 204h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM40 172c6.627 0 12-5.373 12-12v-16c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v16c0 6.627 5.373 12 12 12ZM168 188c-6.627 0-12 5.373-12 12v4h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8c11.046 0 20-8.954 20-20v-8c0-6.627-5.373-12-12-12ZM168 116c6.627 0 12-5.373 12-12v-8C180 84.954 171.046 76 160 76h-8c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h4v4c0 6.627 5.373 12 12 12ZM56 76h-8C36.954 76 28 84.954 28 96v8c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h4c6.627 0 12-5.373 12-12C68 81.373 62.627 76 56 76ZM208 28h-108C88.954 28 80 36.954 80 48v40c-.011 .2-.011 .4 0 .6 .32 6.392 5.6 11.408 12 11.4h20c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-8v-24h100v100h-24v-8c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v20c0 6.627 5.373 12 12 12h40c11.046 0 20-8.954 20-20v-108C228 36.954 219.046 28 208 28Z"),
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
        return _selectionForeground!!
    }

private var _selectionForeground: ImageVector? = null
