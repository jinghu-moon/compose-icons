package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorBoldIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 170.210 60.720 C 176.724 59.499 181.016 53.229 179.795 46.715 C 178.574 40.201 172.304 35.909 165.790 37.130 C 150.500 40.000 137.490 47.200 128.080 57.660 C 116.000 44.000 98.140 36.000 78.000 36.000 C 41.567 36.044 12.044 65.567 12.000 102.000 C 12.000 133.000 30.910 165.000 68.200 196.870 C 84.983 211.147 103.103 223.772 122.310 234.570 C 124.061 235.506 126.015 235.997 128.000 236.000 C 129.985 235.994 131.938 235.492 133.680 234.540 L 133.680 234.540 C 148.217 226.394 162.134 217.189 175.320 207.000 C 180.306 202.880 181.129 195.549 177.181 190.426 C 173.233 185.302 165.935 184.229 160.680 188.000 C 153.200 193.760 146.050 198.720 140.000 202.680 L 140.000 82.550 C 145.430 71.230 156.310 63.320 170.210 60.720 ZM 116.000 202.660 C 104.658 195.259 93.800 187.142 83.490 178.360 C 61.820 159.770 36.000 131.420 36.000 102.000 C 36.000 78.804 54.804 60.000 78.000 60.000 C 95.000 60.000 109.350 68.570 116.000 82.520 ZM 233.000 107.930 C 229.836 108.281 226.662 107.360 224.177 105.370 C 221.692 103.380 220.099 100.484 219.750 97.320 C 218.387 85.011 211.646 73.936 201.340 67.070 C 195.895 63.362 194.458 55.958 198.120 50.482 C 201.781 45.006 209.173 43.505 214.680 47.120 C 230.877 57.918 241.465 75.331 243.600 94.680 C 244.331 101.266 239.586 107.197 233.000 107.930 ZM 234.000 141.350 C 228.160 153.070 219.670 164.980 208.770 176.780 C 204.243 181.510 196.761 181.738 191.954 177.294 C 187.147 172.850 186.789 165.373 191.150 160.490 C 200.510 150.360 207.700 140.320 212.530 130.650 C 214.360 126.675 218.208 124.012 222.572 123.699 C 226.937 123.386 231.125 125.474 233.503 129.147 C 235.881 132.820 236.072 137.496 234.000 141.350 Z"),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
