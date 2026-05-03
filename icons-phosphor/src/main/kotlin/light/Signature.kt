package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = phosphorLightIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 170.000 L 60.600 170.000 C 63.940 163.460 67.330 156.650 70.660 149.710 C 72.082 149.943 73.520 150.060 74.960 150.060 C 89.190 150.060 106.050 138.940 125.290 116.840 C 126.290 119.840 127.490 123.090 128.970 126.400 C 135.860 141.850 144.650 149.790 155.110 150.000 L 155.500 150.000 C 164.310 150.000 173.210 144.230 182.500 132.420 C 188.330 140.680 201.620 150.000 232.000 150.000 C 235.314 150.000 238.000 147.314 238.000 144.000 C 238.000 140.686 235.314 138.000 232.000 138.000 C 192.310 138.000 190.120 121.390 190.000 119.940 C 190.098 117.287 188.392 114.903 185.850 114.140 C 183.235 113.366 180.425 114.424 178.970 116.730 C 166.810 135.400 158.900 138.060 155.340 138.000 C 144.560 137.790 136.230 114.320 133.880 103.000 C 133.411 100.719 131.664 98.915 129.400 98.373 C 127.135 97.831 124.761 98.649 123.310 100.470 C 104.640 123.860 88.000 137.000 76.180 137.920 C 100.000 85.840 107.230 52.700 98.230 36.780 C 95.440 31.860 89.660 26.000 77.910 26.000 C 62.910 26.000 50.910 40.620 45.090 66.100 C 38.280 95.940 42.120 132.000 59.620 145.000 C 55.470 153.640 51.220 162.080 47.100 170.000 L 24.000 170.000 C 20.686 170.000 18.000 172.686 18.000 176.000 C 18.000 179.314 20.686 182.000 24.000 182.000 L 40.760 182.000 C 28.650 204.580 19.000 220.660 18.860 220.910 C 17.678 222.749 17.590 225.086 18.630 227.009 C 19.671 228.932 21.675 230.137 23.861 230.154 C 26.048 230.171 28.070 228.997 29.140 227.090 C 29.300 226.830 40.700 207.820 54.350 182.000 L 232.000 182.000 C 235.314 182.000 238.000 179.314 238.000 176.000 C 238.000 172.686 235.314 170.000 232.000 170.000 ZM 56.790 68.770 C 61.050 50.080 69.340 38.000 77.910 38.000 C 84.310 38.000 86.550 40.510 87.780 42.690 C 91.780 49.690 93.780 70.840 64.900 133.690 C 54.590 123.390 50.730 95.300 56.790 68.770 Z"),
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
        return _signature!!
    }

private var _signature: ImageVector? = null
