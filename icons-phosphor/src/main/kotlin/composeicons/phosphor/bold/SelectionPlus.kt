package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SelectionPlus: ImageVector
    get() {
        if (_selectionPlus != null) return _selectionPlus!!
        _selectionPlus = phosphorBoldIcon(
            name = "SelectionPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 40c0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12ZM144 204h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM204 52v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-24C228 36.954 219.046 28 208 28h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM216 100c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM40 156c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12ZM72 204h-20v-20c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v24c0 11.046 8.954 20 20 20h24c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM72 28h-24C36.954 28 28 36.954 28 48v24c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20h20c6.627 0 12-5.373 12-12C84 33.373 78.627 28 72 28ZM240 204h-12v-12c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _selectionPlus!!
    }

private var _selectionPlus: ImageVector? = null
