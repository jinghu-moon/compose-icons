package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) return _sprayBottle!!
        _sprayBottle = phosphorThinIcon(
            name = "SprayBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 76.000 C 202.209 76.000 204.000 74.209 204.000 72.000 C 203.967 43.295 180.705 20.033 152.000 20.000 L 80.000 20.000 C 73.373 20.000 68.000 25.373 68.000 32.000 L 68.000 80.000 C 68.000 95.464 55.464 108.000 40.000 108.000 C 37.791 108.000 36.000 109.791 36.000 112.000 C 36.000 114.209 37.791 116.000 40.000 116.000 C 59.882 116.000 76.000 99.882 76.000 80.000 L 76.000 76.000 L 116.000 76.000 L 116.000 104.620 C 116.020 113.130 112.149 121.182 105.490 126.480 L 89.490 139.270 C 80.935 146.087 75.966 156.441 76.000 167.380 L 76.000 224.000 C 76.000 230.627 81.373 236.000 88.000 236.000 L 192.000 236.000 C 198.627 236.000 204.000 230.627 204.000 224.000 L 204.000 211.470 C 204.010 163.828 191.265 117.052 167.090 76.000 ZM 76.000 32.000 C 76.000 29.791 77.791 28.000 80.000 28.000 L 152.000 28.000 C 174.740 28.027 193.725 45.356 195.820 68.000 L 76.000 68.000 ZM 196.000 211.470 L 196.000 224.000 C 196.000 226.209 194.209 228.000 192.000 228.000 L 88.000 228.000 C 85.791 228.000 84.000 226.209 84.000 224.000 L 84.000 167.380 C 83.980 158.870 87.851 150.818 94.510 145.520 L 110.510 132.730 C 119.065 125.913 124.034 115.559 124.000 104.620 L 124.000 76.000 L 157.760 76.000 C 182.777 116.757 196.013 163.648 196.000 211.470 Z"),
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
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
