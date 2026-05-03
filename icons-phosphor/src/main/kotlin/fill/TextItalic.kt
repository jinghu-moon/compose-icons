package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextItalic: ImageVector
    get() {
        if (_textItalic != null) return _textItalic!!
        _textItalic = phosphorFillIcon(
            name = "TextItalic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 176.000 80.000 L 153.640 80.000 L 119.350 176.000 L 136.000 176.000 C 140.418 176.000 144.000 179.582 144.000 184.000 C 144.000 188.418 140.418 192.000 136.000 192.000 L 80.000 192.000 C 75.582 192.000 72.000 188.418 72.000 184.000 C 72.000 179.582 75.582 176.000 80.000 176.000 L 102.360 176.000 L 136.650 80.000 L 120.000 80.000 C 115.582 80.000 112.000 76.418 112.000 72.000 C 112.000 67.582 115.582 64.000 120.000 64.000 L 176.000 64.000 C 180.418 64.000 184.000 67.582 184.000 72.000 C 184.000 76.418 180.418 80.000 176.000 80.000 Z"),
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
        return _textItalic!!
    }

private var _textItalic: ImageVector? = null
