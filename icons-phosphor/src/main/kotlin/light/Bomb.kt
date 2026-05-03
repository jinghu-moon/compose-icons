package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = phosphorLightIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 34.000 C 244.686 34.000 242.000 36.686 242.000 40.000 C 241.818 46.082 240.611 52.090 238.430 57.770 C 234.060 68.690 226.720 74.000 216.000 74.000 C 203.090 74.000 194.240 61.620 184.880 48.510 C 174.670 34.210 163.090 18.000 144.000 18.000 C 128.260 18.000 116.650 26.220 110.430 41.770 C 108.408 46.986 107.063 52.441 106.430 58.000 L 88.000 58.000 C 80.268 58.000 74.000 64.268 74.000 72.000 L 74.000 82.830 C 38.109 100.484 19.127 140.551 28.199 179.506 C 37.271 218.461 72.002 246.020 112.000 246.000 L 113.550 246.000 C 153.262 245.316 187.340 217.525 196.000 178.762 C 204.659 139.999 185.646 100.348 150.000 82.830 L 150.000 72.000 C 150.000 64.268 143.732 58.000 136.000 58.000 L 118.530 58.000 C 119.092 53.887 120.149 49.858 121.680 46.000 C 126.060 35.260 133.370 30.000 144.000 30.000 C 156.910 30.000 165.750 42.380 175.120 55.490 C 185.330 69.790 196.910 86.000 216.000 86.000 C 231.740 86.000 243.350 77.780 249.570 62.230 C 252.309 55.128 253.807 47.609 254.000 40.000 C 254.000 36.686 251.314 34.000 248.000 34.000 ZM 138.000 72.000 L 138.000 86.660 C 138.004 89.042 139.416 91.197 141.600 92.150 C 173.716 106.167 191.598 140.788 184.439 175.091 C 177.280 209.394 147.042 233.972 112.000 233.972 C 76.958 233.972 46.720 209.394 39.561 175.091 C 32.402 140.788 50.284 106.167 82.400 92.150 C 84.584 91.197 85.996 89.042 86.000 86.660 L 86.000 72.000 C 86.000 70.895 86.895 70.000 88.000 70.000 L 136.000 70.000 C 137.105 70.000 138.000 70.895 138.000 72.000 ZM 105.000 202.080 C 108.087 202.589 110.264 205.384 110.003 208.502 C 109.741 211.619 107.128 214.012 104.000 214.000 C 103.665 213.998 103.331 213.971 103.000 213.920 C 80.088 209.849 62.151 191.912 58.080 169.000 C 57.528 165.730 59.730 162.632 63.000 162.080 C 66.270 161.528 69.368 163.730 69.920 167.000 C 73.089 184.898 87.102 198.911 105.000 202.080 Z"),
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
