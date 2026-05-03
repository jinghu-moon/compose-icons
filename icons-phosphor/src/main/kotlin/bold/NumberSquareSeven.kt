package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareSeven: ImageVector
    get() {
        if (_numberSquareSeven != null) return _numberSquareSeven!!
        _numberSquareSeven = phosphorBoldIcon(
            name = "NumberSquareSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 92.000 88.000 C 92.000 81.373 97.373 76.000 104.000 76.000 L 152.000 76.000 C 155.915 75.999 159.584 77.908 161.830 81.114 C 164.076 84.321 164.618 88.421 163.280 92.100 L 131.280 180.100 C 129.016 186.330 122.130 189.544 115.900 187.280 C 109.670 185.016 106.456 178.130 108.720 171.900 L 134.870 100.000 L 104.000 100.000 C 97.373 100.000 92.000 94.627 92.000 88.000 Z"),
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
        return _numberSquareSeven!!
    }

private var _numberSquareSeven: ImageVector? = null
