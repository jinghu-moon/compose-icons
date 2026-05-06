package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Notebook: ImageVector
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = phosphorBoldIcon(
            name = "Notebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 108c0-6.627 5.373-12 12-12h56c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-56c-6.627 0-12-5.373-12-12ZM176 136h-56c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h56c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM228 48v160c0 11.046-8.954 20-20 20h-160C36.954 228 28 219.046 28 208v-160C28 36.954 36.954 28 48 28h160c11.046 0 20 8.954 20 20ZM52 204h16v-152h-16ZM204 52h-112v152h112Z"),
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
        return _notebook!!
    }

private var _notebook: ImageVector? = null
