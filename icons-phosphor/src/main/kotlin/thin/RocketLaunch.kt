package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorThinIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 219.860 47.360 C 219.479 41.328 214.672 36.521 208.640 36.140 C 196.640 35.430 165.820 36.520 140.290 62.050 L 134.350 68.000 L 74.350 68.000 C 71.166 67.992 68.112 69.260 65.870 71.520 L 31.520 105.850 C 28.302 109.067 27.180 113.827 28.622 118.142 C 30.065 122.457 33.824 125.586 38.330 126.220 L 78.120 131.770 L 124.230 177.880 L 129.780 217.690 C 130.421 222.192 133.551 225.945 137.866 227.383 C 142.180 228.821 146.936 227.697 150.150 224.480 L 184.490 190.130 C 186.750 187.888 188.018 184.834 188.010 181.650 L 188.010 121.650 L 193.950 115.710 C 219.480 90.180 220.570 59.410 219.860 47.360 ZM 36.210 115.600 C 35.726 114.158 36.115 112.566 37.210 111.510 L 71.530 77.170 C 72.278 76.422 73.292 76.002 74.350 76.000 L 126.350 76.000 L 78.580 123.760 L 39.440 118.300 C 37.932 118.099 36.675 117.048 36.210 115.600 ZM 180.000 181.650 C 180.001 182.711 179.580 183.729 178.830 184.480 L 144.480 218.820 C 143.411 219.892 141.828 220.268 140.390 219.792 C 138.953 219.315 137.908 218.068 137.690 216.570 L 132.230 177.420 L 180.000 129.650 ZM 128.000 170.340 L 85.660 128.000 L 145.940 67.710 C 169.180 44.470 197.190 43.480 208.160 44.130 C 210.162 44.239 211.761 45.838 211.870 47.840 C 212.520 58.840 211.520 86.840 188.290 110.060 ZM 98.210 189.480 C 94.000 198.660 80.000 220.000 40.000 220.000 C 37.791 220.000 36.000 218.209 36.000 216.000 C 36.000 176.000 57.340 162.000 66.520 157.790 C 68.530 156.873 70.903 157.760 71.820 159.770 C 72.737 161.780 71.850 164.153 69.840 165.070 C 62.380 168.480 45.410 179.730 44.080 211.920 C 76.270 210.590 87.520 193.620 90.930 186.160 C 91.847 184.150 94.220 183.263 96.230 184.180 C 98.240 185.097 99.127 187.470 98.210 189.480 Z"),
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
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
