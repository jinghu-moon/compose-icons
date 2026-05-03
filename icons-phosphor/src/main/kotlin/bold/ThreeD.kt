package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorBoldIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 148.000 C 88.000 139.163 80.837 132.000 72.000 132.000 C 67.526 131.999 63.424 129.510 61.358 125.542 C 59.292 121.574 59.605 116.786 62.170 113.120 L 77.000 92.000 L 52.000 92.000 C 45.373 92.000 40.000 86.627 40.000 80.000 C 40.000 73.373 45.373 68.000 52.000 68.000 L 100.000 68.000 C 104.474 68.001 108.576 70.490 110.642 74.458 C 112.708 78.426 112.395 83.214 109.830 86.880 L 91.490 113.080 C 105.176 120.710 113.147 135.628 111.883 151.246 C 110.618 166.864 100.351 180.305 85.616 185.634 C 70.881 190.962 54.391 187.197 43.430 176.000 C 38.791 171.267 38.867 163.669 43.600 159.030 C 48.333 154.391 55.931 154.467 60.570 159.200 C 65.120 163.845 72.029 165.275 78.048 162.817 C 84.068 160.359 88.002 154.502 88.000 148.000 ZM 164.000 68.000 C 197.137 68.000 224.000 94.863 224.000 128.000 C 224.000 161.137 197.137 188.000 164.000 188.000 L 140.000 188.000 C 133.373 188.000 128.000 182.627 128.000 176.000 L 128.000 80.000 C 128.000 73.373 133.373 68.000 140.000 68.000 ZM 164.000 92.000 L 152.000 92.000 L 152.000 164.000 L 164.000 164.000 C 183.882 164.000 200.000 147.882 200.000 128.000 C 200.000 108.118 183.882 92.000 164.000 92.000 ZM 32.000 56.000 L 224.000 56.000 C 230.627 56.000 236.000 50.627 236.000 44.000 C 236.000 37.373 230.627 32.000 224.000 32.000 L 32.000 32.000 C 25.373 32.000 20.000 37.373 20.000 44.000 C 20.000 50.627 25.373 56.000 32.000 56.000 ZM 224.000 200.000 L 32.000 200.000 C 25.373 200.000 20.000 205.373 20.000 212.000 C 20.000 218.627 25.373 224.000 32.000 224.000 L 224.000 224.000 C 230.627 224.000 236.000 218.627 236.000 212.000 C 236.000 205.373 230.627 200.000 224.000 200.000 Z"),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
