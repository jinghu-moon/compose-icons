package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) return _starAndCrescent!!
        _starAndCrescent = phosphorLightIcon(
            name = "StarAndCrescent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 154.730 201.060 C 127.258 187.060 109.962 158.833 109.962 128.000 C 109.962 97.167 127.258 68.940 154.730 54.940 C 156.739 53.915 158.004 51.850 158.004 49.595 C 158.004 47.340 156.739 45.275 154.730 44.250 C 141.510 37.469 126.858 33.954 112.000 34.000 C 60.085 34.000 18.000 76.085 18.000 128.000 C 18.000 179.915 60.085 222.000 112.000 222.000 C 126.858 222.046 141.510 218.531 154.730 211.750 C 156.739 210.725 158.004 208.660 158.004 206.405 C 158.004 204.150 156.739 202.085 154.730 201.060 ZM 112.000 210.000 C 79.453 209.958 50.012 190.670 36.973 160.849 C 23.935 131.027 29.768 96.318 51.838 72.396 C 73.908 48.475 108.037 39.871 138.810 50.470 C 113.244 67.997 97.962 97.002 97.962 128.000 C 97.962 158.998 113.244 188.003 138.810 205.530 C 130.187 208.512 121.124 210.023 112.000 210.000 ZM 250.380 122.490 L 222.770 110.580 L 220.370 79.580 C 220.183 77.140 218.532 75.058 216.199 74.319 C 213.866 73.580 211.318 74.332 209.760 76.220 L 190.370 99.670 L 161.440 92.510 C 159.095 91.930 156.632 92.813 155.189 94.749 C 153.745 96.686 153.604 99.299 154.830 101.380 L 170.500 128.000 L 154.830 154.620 C 153.604 156.701 153.745 159.314 155.189 161.251 C 156.632 163.187 159.095 164.070 161.440 163.490 L 190.370 156.330 L 209.760 179.820 C 211.318 181.708 213.866 182.460 216.199 181.721 C 218.532 180.982 220.183 178.900 220.370 176.460 L 222.770 145.460 L 250.380 133.550 C 252.568 132.596 253.982 130.437 253.982 128.050 C 253.982 125.663 252.568 123.504 250.380 122.550 ZM 214.690 135.840 C 212.657 136.713 211.269 138.635 211.080 140.840 L 209.550 160.670 L 197.220 145.730 C 196.079 144.349 194.381 143.549 192.590 143.550 C 192.104 143.551 191.621 143.611 191.150 143.730 L 172.410 148.360 L 182.640 131.000 C 183.743 129.123 183.743 126.797 182.640 124.920 L 172.410 107.550 L 191.150 112.180 C 193.390 112.736 195.750 111.958 197.220 110.180 L 209.550 95.240 L 211.080 115.070 C 211.269 117.275 212.657 119.197 214.690 120.070 L 232.860 128.000 Z"),
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
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
