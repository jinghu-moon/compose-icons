package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) return _globeHemisphereEast!!
        _globeHemisphereEast = phosphorLightIcon(
            name = "GlobeHemisphereEast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 38.000 C 145.807 37.981 163.216 43.274 178.000 53.200 L 178.000 74.000 C 178.002 74.480 177.832 74.945 177.520 75.310 L 155.350 101.000 C 155.031 101.372 154.586 101.614 154.100 101.680 L 122.630 106.000 C 122.122 106.069 121.606 105.940 121.190 105.640 L 120.950 105.480 L 101.250 92.590 C 98.168 90.412 94.338 89.571 90.628 90.256 C 86.917 90.941 83.640 93.095 81.540 96.230 L 60.540 127.530 C 59.011 129.811 58.190 132.494 58.180 135.240 L 58.000 171.450 C 57.997 172.119 57.659 172.742 57.100 173.110 L 52.100 176.380 C 34.434 148.669 33.277 113.532 49.081 84.719 C 64.885 55.905 95.137 37.997 128.000 38.000 ZM 59.280 186.050 L 63.710 183.150 C 67.621 180.570 69.981 176.205 70.000 171.520 L 70.210 135.290 C 70.213 134.899 70.327 134.518 70.540 134.190 L 91.540 102.890 C 91.842 102.437 92.315 102.127 92.850 102.030 C 93.383 101.936 93.932 102.062 94.370 102.380 L 94.610 102.540 L 114.310 115.430 C 117.210 117.490 120.787 118.363 124.310 117.870 L 155.780 113.610 C 159.172 113.150 162.277 111.464 164.510 108.870 L 186.680 83.110 C 188.836 80.566 190.014 77.335 190.000 74.000 L 190.000 62.820 C 215.871 87.386 224.771 124.925 212.680 158.490 L 194.280 141.670 C 190.265 137.997 184.485 136.983 179.460 139.070 L 149.000 151.730 C 144.470 153.635 141.257 157.761 140.520 162.620 L 138.140 178.810 C 137.101 185.869 141.538 192.580 148.440 194.390 L 169.900 200.000 C 170.244 200.096 170.557 200.279 170.810 200.530 L 174.990 204.710 C 137.113 227.961 87.928 220.029 59.280 186.050 ZM 184.900 197.680 L 179.310 192.070 C 177.552 190.310 175.357 189.050 172.950 188.420 L 151.490 182.790 C 150.503 182.531 149.869 181.570 150.020 180.560 L 152.410 164.370 C 152.511 163.673 152.970 163.081 153.620 162.810 L 184.070 150.150 C 184.788 149.850 185.616 149.995 186.190 150.520 L 207.550 170.060 C 201.903 180.676 194.204 190.064 184.900 197.680 Z"),
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
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
