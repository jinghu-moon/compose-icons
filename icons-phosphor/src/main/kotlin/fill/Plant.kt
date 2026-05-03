package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorFillIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.410 159.070 C 195.819 164.900 184.804 167.966 173.580 167.930 C 164.177 167.855 154.881 165.932 146.220 162.270 C 139.545 171.693 135.973 182.962 136.000 194.510 L 136.000 224.000 C 136.005 226.217 135.090 228.336 133.473 229.853 C 131.856 231.369 129.682 232.147 127.470 232.000 C 123.205 231.629 119.947 228.031 120.000 223.750 L 120.000 211.310 L 81.380 172.690 C 75.639 174.832 69.567 175.952 63.440 176.000 C 55.005 176.021 46.727 173.713 39.520 169.330 C 17.730 156.090 6.000 125.620 8.270 87.790 C 8.507 83.739 11.739 80.507 15.790 80.270 C 53.620 78.040 84.090 89.730 97.290 111.520 C 102.476 120.061 104.740 130.058 103.740 140.000 C 103.613 141.574 102.572 142.925 101.083 143.450 C 99.595 143.975 97.936 143.576 96.850 142.430 L 77.650 122.330 C 74.505 119.342 69.551 119.405 66.483 122.473 C 63.415 125.541 63.352 130.495 66.340 133.640 L 120.220 188.890 C 120.280 188.110 120.350 187.330 120.430 186.560 C 122.179 171.727 128.724 157.872 139.070 147.100 L 189.660 93.640 C 192.786 90.517 192.788 85.451 189.665 82.325 C 186.542 79.199 181.476 79.197 178.350 82.320 L 129.350 134.140 C 128.351 135.198 126.856 135.630 125.447 135.268 C 124.038 134.907 122.936 133.808 122.570 132.400 C 117.830 114.920 119.920 97.520 128.970 82.580 C 146.830 53.100 188.390 37.320 240.150 40.360 C 244.201 40.597 247.433 43.829 247.670 47.880 C 250.670 99.650 234.890 141.210 205.410 159.070 Z"),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
