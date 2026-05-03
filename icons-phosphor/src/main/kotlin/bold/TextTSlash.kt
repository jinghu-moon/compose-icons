package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorBoldIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.070 224.880 C 211.166 229.336 203.577 228.974 199.120 224.070 L 140.000 159.000 L 140.000 188.000 L 160.000 188.000 C 166.627 188.000 172.000 193.373 172.000 200.000 C 172.000 206.627 166.627 212.000 160.000 212.000 L 96.000 212.000 C 89.373 212.000 84.000 206.627 84.000 200.000 C 84.000 193.373 89.373 188.000 96.000 188.000 L 116.000 188.000 L 116.000 132.640 L 68.000 79.840 L 68.000 88.000 C 68.000 94.627 62.627 100.000 56.000 100.000 C 49.373 100.000 44.000 94.627 44.000 88.000 L 44.000 56.000 C 44.000 55.224 44.077 54.451 44.230 53.690 L 39.120 48.070 C 36.175 44.907 35.159 40.405 36.459 36.284 C 37.759 32.162 41.175 29.058 45.401 28.157 C 49.628 27.256 54.012 28.697 56.880 31.930 L 216.880 207.930 C 221.336 212.834 220.974 220.423 216.070 224.880 ZM 116.000 68.000 L 116.000 68.570 C 116.000 75.197 121.373 80.570 128.000 80.570 C 134.627 80.570 140.000 75.197 140.000 68.570 L 140.000 68.000 L 188.000 68.000 L 188.000 88.000 C 188.000 94.627 193.373 100.000 200.000 100.000 C 206.627 100.000 212.000 94.627 212.000 88.000 L 212.000 56.000 C 212.000 49.373 206.627 44.000 200.000 44.000 L 116.600 44.000 C 109.973 43.834 104.466 49.073 104.300 55.700 C 104.134 62.327 109.373 67.834 116.000 68.000 Z"),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
