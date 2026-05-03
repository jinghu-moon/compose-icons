package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorThinIcon(
            name = "FireSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.820 20.920 C 139.819 20.090 138.477 19.799 137.222 20.139 C 135.967 20.480 134.955 21.408 134.510 22.630 L 110.360 88.830 L 81.810 61.130 C 80.989 60.321 79.859 59.906 78.710 59.990 C 77.561 60.075 76.504 60.650 75.810 61.570 C 54.710 89.250 44.000 117.000 44.000 144.000 C 44.000 190.392 81.608 228.000 128.000 228.000 C 174.392 228.000 212.000 190.392 212.000 144.000 C 212.000 86.240 162.220 38.690 140.820 20.920 ZM 128.000 220.000 C 86.045 219.956 52.044 185.955 52.000 144.000 C 52.000 119.930 61.250 95.070 79.500 70.000 L 109.210 98.830 C 110.183 99.777 111.570 100.166 112.893 99.863 C 114.217 99.560 115.296 98.606 115.760 97.330 L 140.060 30.730 C 162.270 50.090 204.000 93.180 204.000 144.000 C 203.956 185.955 169.955 219.956 128.000 220.000 Z"),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
