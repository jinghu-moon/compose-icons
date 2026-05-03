package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorBoldIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 190.000 115.310 L 217.210 89.700 L 217.470 89.440 C 231.334 75.349 231.242 52.714 217.264 38.736 C 203.286 24.758 180.651 24.666 166.560 38.530 C 166.470 38.610 166.390 38.700 166.300 38.790 L 140.690 66.000 L 60.100 36.710 C 55.721 35.119 50.816 36.207 47.520 39.500 L 23.520 63.500 C 20.966 66.041 19.689 69.596 20.041 73.182 C 20.394 76.768 22.339 80.005 25.340 82.000 L 85.170 121.880 L 75.000 132.000 L 56.000 132.000 C 52.820 132.000 49.770 133.263 47.520 135.510 L 23.520 159.510 C 20.670 162.358 19.439 166.447 20.244 170.396 C 21.049 174.344 23.782 177.625 27.520 179.130 L 62.750 193.230 L 76.810 228.370 L 76.900 228.590 C 78.452 232.337 81.792 235.046 85.778 235.792 C 89.764 236.539 93.857 235.221 96.660 232.290 L 120.470 208.480 C 122.725 206.233 123.995 203.183 124.000 200.000 L 124.000 181.000 L 134.130 170.870 L 174.000 230.650 C 175.994 233.642 179.224 235.581 182.802 235.936 C 186.380 236.290 189.928 235.022 192.470 232.480 L 216.470 208.480 C 219.767 205.182 220.855 200.272 219.260 195.890 ZM 185.890 205.160 L 146.000 145.330 C 144.005 142.341 140.776 140.404 137.200 140.050 C 136.801 140.013 136.401 139.996 136.000 140.000 C 132.815 140.000 129.761 141.266 127.510 143.520 L 103.510 167.520 C 101.263 169.770 100.000 172.820 100.000 176.000 L 100.000 195.000 L 92.380 202.620 L 83.140 179.520 C 81.920 176.468 79.502 174.050 76.450 172.830 L 53.350 163.590 L 61.000 156.000 L 80.000 156.000 C 83.180 156.000 86.230 154.737 88.480 152.490 L 112.480 128.490 C 115.031 125.949 116.305 122.397 115.953 118.814 C 115.600 115.231 113.657 111.995 110.660 110.000 L 50.840 70.120 L 59.080 61.870 L 139.910 91.260 C 144.415 92.899 149.463 91.700 152.750 88.210 L 183.640 55.390 C 188.334 50.696 195.946 50.696 200.640 55.390 C 205.334 60.084 205.334 67.696 200.640 72.390 L 167.820 103.280 C 164.326 106.564 163.123 111.613 164.760 116.120 L 194.160 196.940 Z"),
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
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
