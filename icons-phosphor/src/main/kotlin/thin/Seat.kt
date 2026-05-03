package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorThinIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 232.000 C 220.000 234.209 218.209 236.000 216.000 236.000 L 112.000 236.000 C 109.791 236.000 108.000 234.209 108.000 232.000 C 108.000 229.791 109.791 228.000 112.000 228.000 L 216.000 228.000 C 218.209 228.000 220.000 229.791 220.000 232.000 ZM 220.000 160.000 L 220.000 192.000 C 220.000 198.627 214.627 204.000 208.000 204.000 L 114.110 204.000 C 109.559 204.017 105.394 201.446 103.370 197.370 L 45.260 81.370 C 43.580 77.987 43.580 74.013 45.260 70.630 L 67.380 26.630 C 70.323 20.739 77.463 18.321 83.380 21.210 L 117.160 35.480 L 117.390 35.590 C 120.237 37.013 122.403 39.508 123.410 42.528 C 124.417 45.547 124.183 48.843 122.760 51.690 L 122.700 51.790 L 108.400 78.260 C 107.853 79.373 107.853 80.677 108.400 81.790 L 140.180 145.790 C 140.859 147.138 142.240 147.989 143.750 147.990 L 208.000 147.990 C 211.184 147.990 214.238 149.256 216.489 151.508 C 218.740 153.761 220.003 156.816 220.000 160.000 ZM 212.000 160.000 C 212.000 157.791 210.209 156.000 208.000 156.000 L 143.770 156.000 C 139.208 156.029 135.029 153.456 133.000 149.370 L 101.220 85.370 C 99.535 81.995 99.535 78.025 101.220 74.650 L 101.280 74.540 L 115.550 48.070 C 116.486 46.139 115.731 43.814 113.840 42.800 L 80.130 28.530 L 79.890 28.420 C 79.338 28.141 78.728 27.997 78.110 28.000 C 76.594 27.999 75.208 28.855 74.530 30.210 L 52.410 74.210 C 51.850 75.334 51.850 76.656 52.410 77.780 L 110.520 193.780 C 111.198 195.135 112.584 195.991 114.100 195.990 L 208.000 195.990 C 210.209 195.990 212.000 194.199 212.000 191.990 Z"),
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
        return _seat!!
    }

private var _seat: ImageVector? = null
