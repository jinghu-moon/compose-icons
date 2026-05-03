package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Memory: ImageVector
    get() {
        if (_memory != null) return _memory!!
        _memory = phosphorBoldIcon(
            name = "Memory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 52.000 L 24.000 52.000 C 12.954 52.000 4.000 60.954 4.000 72.000 L 4.000 200.000 C 4.000 206.627 9.373 212.000 16.000 212.000 C 22.627 212.000 28.000 206.627 28.000 200.000 L 28.000 188.000 L 48.000 188.000 L 48.000 200.000 C 48.000 206.627 53.373 212.000 60.000 212.000 C 66.627 212.000 72.000 206.627 72.000 200.000 L 72.000 188.000 L 92.000 188.000 L 92.000 200.000 C 92.000 206.627 97.373 212.000 104.000 212.000 C 110.627 212.000 116.000 206.627 116.000 200.000 L 116.000 188.000 L 140.000 188.000 L 140.000 200.000 C 140.000 206.627 145.373 212.000 152.000 212.000 C 158.627 212.000 164.000 206.627 164.000 200.000 L 164.000 188.000 L 184.000 188.000 L 184.000 200.000 C 184.000 206.627 189.373 212.000 196.000 212.000 C 202.627 212.000 208.000 206.627 208.000 200.000 L 208.000 188.000 L 228.000 188.000 L 228.000 200.000 C 228.000 206.627 233.373 212.000 240.000 212.000 C 246.627 212.000 252.000 206.627 252.000 200.000 L 252.000 72.000 C 252.000 60.954 243.046 52.000 232.000 52.000 ZM 28.000 76.000 L 228.000 76.000 L 228.000 164.000 L 28.000 164.000 ZM 120.000 140.000 L 120.000 100.000 C 120.000 93.373 114.627 88.000 108.000 88.000 L 56.000 88.000 C 49.373 88.000 44.000 93.373 44.000 100.000 L 44.000 140.000 C 44.000 146.627 49.373 152.000 56.000 152.000 L 108.000 152.000 C 114.627 152.000 120.000 146.627 120.000 140.000 ZM 96.000 128.000 L 68.000 128.000 L 68.000 112.000 L 96.000 112.000 ZM 148.000 152.000 L 200.000 152.000 C 206.627 152.000 212.000 146.627 212.000 140.000 L 212.000 100.000 C 212.000 93.373 206.627 88.000 200.000 88.000 L 148.000 88.000 C 141.373 88.000 136.000 93.373 136.000 100.000 L 136.000 140.000 C 136.000 146.627 141.373 152.000 148.000 152.000 ZM 160.000 112.000 L 188.000 112.000 L 188.000 128.000 L 160.000 128.000 Z"),
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
        return _memory!!
    }

private var _memory: ImageVector? = null
