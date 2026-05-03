package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorFillIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.920 132.110 C 229.830 186.110 186.090 229.830 132.110 231.920 C 100.646 233.146 70.319 220.058 49.626 196.325 C 28.933 172.591 20.099 140.764 25.600 109.760 C 25.874 108.299 26.936 107.111 28.357 106.675 C 29.777 106.238 31.323 106.625 32.370 107.680 L 75.370 150.680 C 69.024 162.457 71.895 177.077 82.224 185.580 C 92.552 194.082 107.452 194.090 117.790 185.600 L 178.890 135.760 C 189.438 127.044 194.134 113.102 191.007 99.780 C 187.879 86.459 177.470 76.062 164.145 72.951 C 150.820 69.839 136.883 74.551 128.180 85.110 L 85.180 137.850 L 35.000 87.670 C 33.787 86.458 33.481 84.608 34.240 83.070 C 55.559 38.605 105.174 15.224 153.038 27.087 C 200.902 38.950 233.854 82.795 231.940 132.070 ZM 121.580 118.550 L 90.770 156.330 C 89.137 158.262 88.166 160.666 88.000 163.190 C 87.832 166.471 88.995 169.681 91.226 172.092 C 93.456 174.504 96.566 175.913 99.850 176.000 C 102.688 176.049 105.449 175.076 107.630 173.260 L 107.630 173.260 L 145.410 142.450 C 134.010 138.903 125.093 129.961 121.580 118.550 ZM 175.900 110.000 C 176.745 101.587 172.209 93.552 164.569 89.929 C 156.929 86.306 147.837 87.879 141.858 93.858 C 135.879 99.837 134.306 108.929 137.929 116.569 C 141.552 124.209 149.587 128.745 158.000 127.900 C 167.464 126.949 174.949 119.464 175.900 110.000 Z"),
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
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
