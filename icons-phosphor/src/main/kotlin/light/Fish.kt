package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Fish: ImageVector
    get() {
        if (_fish != null) return _fish!!
        _fish = phosphorLightIcon(
            name = "Fish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 166.000 76.000 C 166.000 81.523 161.523 86.000 156.000 86.000 C 150.477 86.000 146.000 81.523 146.000 76.000 C 146.000 70.477 150.477 66.000 156.000 66.000 C 161.523 66.000 166.000 70.477 166.000 76.000 ZM 215.000 142.670 C 195.830 177.210 159.890 195.750 108.150 197.810 L 85.620 250.360 C 84.675 252.569 82.503 254.001 80.100 254.000 L 79.720 254.000 C 77.186 253.840 75.027 252.101 74.330 249.660 L 59.220 196.770 L 6.350 181.630 C 3.905 180.934 2.164 178.773 2.005 176.236 C 1.845 173.699 3.302 171.337 5.640 170.340 L 58.200 147.850 C 60.280 96.130 78.810 60.200 113.330 41.000 C 159.560 15.340 219.000 30.000 222.090 31.780 C 222.963 32.293 223.693 33.019 224.210 33.890 C 226.000 36.940 240.670 96.380 215.000 142.650 ZM 167.000 172.310 C 145.871 166.619 130.886 147.864 130.000 126.000 C 108.147 125.096 89.407 110.117 83.710 89.000 C 75.250 105.930 70.710 127.000 70.080 152.000 C 70.026 154.352 68.603 156.455 66.440 157.380 L 25.880 174.740 L 65.730 186.150 C 67.723 186.720 69.280 188.277 69.850 190.270 L 81.230 230.120 L 98.620 189.560 C 99.543 187.400 101.642 185.978 103.990 185.920 C 129.000 185.330 150.050 180.760 167.000 172.290 ZM 218.000 77.780 C 217.985 65.704 216.691 53.664 214.140 41.860 C 202.347 39.309 190.316 38.015 178.250 38.000 L 178.000 38.000 C 159.480 38.000 133.000 41.220 111.330 56.470 C 104.880 60.997 99.102 66.414 94.170 72.560 C 93.151 83.821 97.201 94.951 105.217 102.925 C 113.233 110.899 124.385 114.888 135.640 113.810 C 137.423 113.641 139.188 114.276 140.454 115.544 C 141.719 116.811 142.352 118.577 142.180 120.360 C 141.103 131.619 145.098 142.773 153.079 150.789 C 161.060 158.804 172.196 162.848 183.460 161.820 C 189.596 156.918 195.007 151.171 199.530 144.750 C 214.870 123.000 218.050 96.310 218.000 77.760 Z"),
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
        return _fish!!
    }

private var _fish: ImageVector? = null
