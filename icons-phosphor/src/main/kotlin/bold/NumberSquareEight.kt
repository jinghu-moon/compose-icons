package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) return _numberSquareEight!!
        _numberSquareEight = phosphorBoldIcon(
            name = "NumberSquareEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 88.000 152.000 C 87.981 170.228 100.287 186.164 117.928 190.754 C 135.569 195.343 154.082 187.426 162.948 171.500 C 171.815 155.574 168.794 135.667 155.600 123.090 C 167.838 108.477 166.564 86.858 152.696 73.783 C 138.828 60.708 117.172 60.708 103.304 73.783 C 89.436 86.858 88.162 108.477 100.400 123.090 C 92.479 130.620 87.996 141.071 88.000 152.000 ZM 128.000 168.000 C 119.163 168.000 112.000 160.837 112.000 152.000 C 112.000 143.163 119.163 136.000 128.000 136.000 C 136.837 136.000 144.000 143.163 144.000 152.000 C 144.000 160.837 136.837 168.000 128.000 168.000 ZM 116.000 100.000 C 116.000 93.373 121.373 88.000 128.000 88.000 C 134.627 88.000 140.000 93.373 140.000 100.000 C 140.000 106.627 134.627 112.000 128.000 112.000 C 121.373 112.000 116.000 106.627 116.000 100.000 Z"),
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
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
