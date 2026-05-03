package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) return _numberSquareNine!!
        _numberSquareNine = phosphorBoldIcon(
            name = "NumberSquareNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 108.000 142.640 C 112.597 145.285 117.677 146.985 122.940 147.640 L 109.700 169.850 C 107.374 173.535 107.230 178.192 109.321 182.014 C 111.413 185.837 115.413 188.226 119.771 188.254 C 124.128 188.282 128.159 185.945 130.300 182.150 L 162.640 128.000 C 170.730 113.989 169.583 96.485 159.734 83.649 C 149.886 70.813 133.275 65.174 117.647 69.362 C 102.020 73.549 90.454 86.737 88.342 102.778 C 86.230 118.818 93.989 134.551 108.000 142.640 ZM 114.140 100.000 C 118.558 92.345 128.345 89.722 136.000 94.140 C 143.655 98.558 146.278 108.345 141.860 116.000 L 141.860 116.000 C 137.326 123.393 127.728 125.828 120.218 121.490 C 112.708 117.152 110.022 107.621 114.160 100.000 Z"),
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
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
