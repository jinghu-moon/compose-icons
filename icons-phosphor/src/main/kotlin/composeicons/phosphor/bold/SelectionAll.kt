package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SelectionAll: ImageVector
    get() {
        if (_selectionAll != null) return _selectionAll!!
        _selectionAll = phosphorBoldIcon(
            name = "SelectionAll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 40c0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12ZM144 204h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM208 28h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-24C228 36.954 219.046 28 208 28ZM216 100c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM216 172c-6.627 0-12 5.373-12 12v20h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h24c11.046 0 20-8.954 20-20v-24c0-6.627-5.373-12-12-12ZM40 156c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12ZM72 204h-20v-20c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v24c0 11.046 8.954 20 20 20h24c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM40 84c6.627 0 12-5.373 12-12v-20h20c6.627 0 12-5.373 12-12C84 33.373 78.627 28 72 28h-24C36.954 28 28 36.954 28 48v24c0 6.627 5.373 12 12 12ZM80 68h96c6.627 0 12 5.373 12 12v96c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12v-96C68 73.373 73.373 68 80 68ZM92 164h72v-72h-72Z"),
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
        return _selectionAll!!
    }

private var _selectionAll: ImageVector? = null
