package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = phosphorLightIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.350 54.610 C 224.081 41.464 206.907 34.000 188.925 34.000 C 170.943 34.000 153.769 41.464 141.500 54.610 C 135.838 60.562 131.269 67.464 128.000 75.000 C 124.729 67.471 120.160 60.576 114.500 54.630 C 102.231 41.484 85.057 34.020 67.075 34.020 C 49.093 34.020 31.919 41.484 19.650 54.630 C 18.301 56.056 17.735 58.051 18.134 59.972 C 18.533 61.893 19.846 63.499 21.650 64.270 L 83.480 91.170 C 81.630 91.510 79.780 91.910 77.940 92.400 C 60.019 97.093 44.717 108.755 35.440 124.790 C 26.099 140.728 23.575 159.758 28.440 177.580 C 28.960 179.511 30.407 181.056 32.300 181.700 C 32.922 181.910 33.574 182.018 34.230 182.020 C 35.545 182.020 36.824 181.588 37.870 180.790 L 122.000 116.640 L 122.000 224.000 C 122.000 227.314 124.686 230.000 128.000 230.000 C 131.314 230.000 134.000 227.314 134.000 224.000 L 134.000 116.640 L 218.170 180.770 C 219.216 181.568 220.495 182.000 221.810 182.000 C 222.466 181.998 223.118 181.890 223.740 181.680 C 225.633 181.036 227.080 179.491 227.600 177.560 C 232.465 159.738 229.941 140.708 220.600 124.770 C 211.323 108.735 196.021 97.073 178.100 92.380 C 176.260 91.890 174.410 91.490 172.560 91.150 L 234.390 64.250 C 236.194 63.479 237.507 61.873 237.906 59.952 C 238.305 58.031 237.739 56.036 236.390 54.610 ZM 67.080 46.000 C 81.768 46.035 95.786 52.145 105.810 62.880 C 114.082 71.600 119.481 82.646 121.280 94.530 L 34.930 57.000 C 44.134 49.877 55.441 46.008 67.080 46.000 ZM 38.290 165.330 C 37.047 153.317 39.667 141.221 45.770 130.800 C 53.473 117.529 66.155 107.882 81.000 104.000 C 85.932 102.680 91.015 102.007 96.120 102.000 C 103.100 101.997 110.022 103.261 116.550 105.730 ZM 210.230 130.800 C 216.333 141.221 218.953 153.317 217.710 165.330 L 139.470 105.720 C 166.017 95.735 195.897 106.325 210.230 130.800 ZM 134.720 94.530 C 136.519 82.646 141.918 71.600 150.190 62.880 C 160.214 52.145 174.232 46.035 188.920 46.000 C 200.559 46.008 211.866 49.877 221.070 57.000 Z"),
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null
