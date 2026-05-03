package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) return _numberSquareThree!!
        _numberSquareThree = phosphorBoldIcon(
            name = "NumberSquareThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 92.000 80.000 C 92.000 73.373 97.373 68.000 104.000 68.000 L 152.000 68.000 C 156.474 68.001 160.576 70.490 162.642 74.458 C 164.708 78.426 164.395 83.214 161.830 86.880 L 143.490 113.080 C 157.176 120.710 165.147 135.628 163.883 151.246 C 162.618 166.864 152.351 180.305 137.616 185.634 C 122.881 190.962 106.391 187.197 95.430 176.000 C 92.311 172.962 91.082 168.472 92.220 164.269 C 93.357 160.066 96.682 156.809 100.908 155.759 C 105.134 154.708 109.597 156.029 112.570 159.210 C 117.655 164.389 125.589 165.496 131.898 161.907 C 138.207 158.318 141.309 150.932 139.456 143.915 C 137.603 136.897 131.258 132.006 124.000 132.000 C 119.526 131.999 115.424 129.510 113.358 125.542 C 111.292 121.574 111.605 116.786 114.170 113.120 L 129.000 92.000 L 104.000 92.000 C 97.373 92.000 92.000 86.627 92.000 80.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
