package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorRegularIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 185.330 114.210 L 214.470 86.790 L 214.640 86.620 C 227.138 74.122 227.138 53.858 214.640 41.360 C 202.142 28.862 181.878 28.862 169.380 41.360 C 169.380 41.420 169.270 41.470 169.210 41.530 L 141.790 70.670 L 58.790 40.470 C 55.869 39.408 52.598 40.133 50.400 42.330 L 26.400 66.330 C 24.707 68.025 23.862 70.389 24.098 72.774 C 24.334 75.158 25.627 77.311 27.620 78.640 L 91.510 121.230 L 76.690 136.000 L 56.000 136.000 C 53.881 136.001 51.849 136.843 50.350 138.340 L 26.350 162.340 C 24.449 164.237 23.626 166.960 24.159 169.592 C 24.692 172.224 26.511 174.413 29.000 175.420 L 65.820 190.150 L 80.520 226.900 L 80.580 227.060 C 81.613 229.561 83.841 231.370 86.500 231.869 C 89.160 232.367 91.891 231.487 93.760 229.530 L 117.630 205.650 C 119.138 204.156 119.991 202.123 120.000 200.000 L 120.000 179.310 L 134.760 164.550 L 177.350 228.440 C 178.679 230.433 180.832 231.726 183.216 231.962 C 185.601 232.198 187.965 231.353 189.660 229.660 L 213.660 205.660 C 215.857 203.462 216.582 200.191 215.520 197.270 ZM 185.260 211.440 L 142.670 147.560 C 141.348 145.551 139.192 144.244 136.800 144.000 C 136.530 144.000 136.270 144.000 136.010 144.000 C 133.886 144.001 131.850 144.846 130.350 146.350 L 106.350 170.350 C 104.849 171.847 104.004 173.880 104.000 176.000 L 104.000 196.690 L 90.930 209.760 L 79.430 181.000 C 78.617 178.982 77.018 177.383 75.000 176.570 L 46.260 165.070 L 59.320 152.000 L 80.000 152.000 C 82.122 152.002 84.158 151.160 85.660 149.660 L 109.660 125.660 C 111.357 123.965 112.204 121.598 111.968 119.211 C 111.732 116.824 110.437 114.669 108.440 113.340 L 44.560 70.740 L 58.060 57.250 L 141.280 87.510 C 144.277 88.611 147.641 87.825 149.840 85.510 L 180.780 52.600 C 187.055 46.509 197.058 46.584 203.241 52.769 C 209.423 58.954 209.494 68.958 203.400 75.230 L 170.530 106.160 C 168.215 108.359 167.429 111.723 168.530 114.720 L 198.790 197.940 Z"),
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
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
