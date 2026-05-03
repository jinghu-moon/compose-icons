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
                pathData = parseSvgPathData("M 108.000 108.000 C 108.000 101.373 113.373 96.000 120.000 96.000 L 176.000 96.000 C 182.627 96.000 188.000 101.373 188.000 108.000 C 188.000 114.627 182.627 120.000 176.000 120.000 L 120.000 120.000 C 113.373 120.000 108.000 114.627 108.000 108.000 ZM 176.000 136.000 L 120.000 136.000 C 113.373 136.000 108.000 141.373 108.000 148.000 C 108.000 154.627 113.373 160.000 120.000 160.000 L 176.000 160.000 C 182.627 160.000 188.000 154.627 188.000 148.000 C 188.000 141.373 182.627 136.000 176.000 136.000 ZM 228.000 48.000 L 228.000 208.000 C 228.000 219.046 219.046 228.000 208.000 228.000 L 48.000 228.000 C 36.954 228.000 28.000 219.046 28.000 208.000 L 28.000 48.000 C 28.000 36.954 36.954 28.000 48.000 28.000 L 208.000 28.000 C 219.046 28.000 228.000 36.954 228.000 48.000 ZM 52.000 204.000 L 68.000 204.000 L 68.000 52.000 L 52.000 52.000 ZM 204.000 52.000 L 92.000 52.000 L 92.000 204.000 L 204.000 204.000 Z"),
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
