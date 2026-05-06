package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextColumns: ImageVector
    get() {
        if (_textColumns != null) return _textColumns!!
        _textColumns = phosphorBoldIcon(
            name = "TextColumns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 64c0 6.627-5.373 12-12 12h-68C33.373 76 28 70.627 28 64 28 57.373 33.373 52 40 52h68c6.627 0 12 5.373 12 12ZM108 92h-68c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h68c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM108 132h-68c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h68c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM108 172h-68c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h68c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM148 76h68c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-68c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM216 92h-68c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h68c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM216 132h-68c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h68c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM216 172h-68c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h68c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _textColumns!!
    }

private var _textColumns: ImageVector? = null
