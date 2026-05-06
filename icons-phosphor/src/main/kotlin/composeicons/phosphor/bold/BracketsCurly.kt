package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorBoldIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M54.8 119.49c-1.489 3.104-3.426 5.971-5.75 8.51 2.324 2.539 4.261 5.406 5.75 8.51C60 147.24 60 159.83 60 172c0 25.94 1.84 32 20 32 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C60.86 228 47.8 221.1 41.2 207.49 36 196.76 36 184.17 36 172 36 146.06 34.16 140 16 140 9.373 140 4 134.627 4 128c0-6.627 5.373-12 12-12 18.16 0 20-6.06 20-32C36 71.83 36 59.24 41.2 48.51 47.8 34.9 60.86 28 80 28c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C61.84 52 60 58.06 60 84c0 12.17 0 24.76-5.2 35.49ZM240 116c-18.16 0-20-6.06-20-32 0-12.17 0-24.76-5.2-35.49C208.2 34.9 195.14 28 176 28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 18.16 0 20 6.06 20 32 0 12.17 0 24.76 5.2 35.49 1.504 3.107 3.458 5.974 5.8 8.51-2.324 2.539-4.261 5.406-5.75 8.51C196 147.24 196 159.83 196 172c0 25.94-1.84 32-20 32-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 19.14 0 32.2-6.9 38.8-20.51C220 196.76 220 184.17 220 172c0-25.94 1.84-32 20-32 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
