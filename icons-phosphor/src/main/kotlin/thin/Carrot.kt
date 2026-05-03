package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorThinIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 68.000 L 193.660 68.000 L 226.830 34.830 C 228.393 33.267 228.393 30.733 226.830 29.170 C 225.267 27.607 222.733 27.607 221.170 29.170 L 188.000 62.340 L 188.000 24.000 C 188.000 21.791 186.209 20.000 184.000 20.000 C 181.791 20.000 180.000 21.791 180.000 24.000 L 180.000 64.000 C 156.128 46.097 122.727 48.458 101.610 69.540 L 101.610 69.540 L 101.610 69.540 C 84.490 86.330 67.100 115.260 49.910 155.540 C 37.980 183.540 30.300 207.540 29.320 210.630 C 27.492 214.344 27.699 218.736 29.867 222.262 C 32.035 225.788 35.861 227.955 40.000 228.000 C 41.862 227.995 43.697 227.557 45.360 226.720 C 48.480 225.720 72.490 218.070 100.450 206.130 C 140.740 188.930 169.690 171.520 186.450 154.420 C 207.553 133.301 209.918 99.880 192.000 76.000 L 232.000 76.000 C 234.209 76.000 236.000 74.209 236.000 72.000 C 236.000 69.791 234.209 68.000 232.000 68.000 ZM 180.740 148.790 C 170.980 158.790 157.320 168.180 142.370 176.700 L 114.830 149.170 C 113.250 147.738 110.824 147.798 109.316 149.306 C 107.808 150.814 107.748 153.240 109.180 154.820 L 135.080 180.730 C 92.610 203.550 43.340 219.000 42.640 219.180 C 42.395 219.259 42.158 219.360 41.930 219.480 C 40.377 220.306 38.467 220.021 37.223 218.777 C 35.979 217.533 35.694 215.623 36.520 214.070 C 36.640 213.842 36.741 213.605 36.820 213.360 C 37.110 212.360 66.540 118.360 104.440 78.090 L 141.180 114.820 C 142.741 116.378 145.269 116.378 146.830 114.820 C 148.388 113.259 148.388 110.731 146.830 109.170 L 110.180 72.520 C 131.418 54.511 163.072 56.427 181.982 76.867 C 200.892 97.307 200.344 129.015 180.740 148.790 Z"),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
