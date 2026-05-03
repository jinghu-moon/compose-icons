package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) return _personSimpleThrow!!
        _personSimpleThrow = phosphorFillIcon(
            name = "PersonSimpleThrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 96.000 56.000 C 96.000 38.327 110.327 24.000 128.000 24.000 C 145.673 24.000 160.000 38.327 160.000 56.000 C 160.000 73.673 145.673 88.000 128.000 88.000 C 110.327 88.000 96.000 73.673 96.000 56.000 ZM 221.000 99.360 C 219.500 98.160 183.780 70.360 131.490 105.930 C 86.000 136.840 59.570 126.230 59.320 126.120 C 56.712 124.888 53.642 125.156 51.286 126.821 C 48.931 128.486 47.654 131.290 47.944 134.160 C 48.235 137.030 50.048 139.521 52.690 140.680 C 53.300 140.960 60.180 143.950 72.360 143.950 C 86.570 143.950 108.000 139.840 135.130 122.660 C 132.850 152.070 122.400 206.130 61.700 224.340 C 58.902 225.110 56.740 227.335 56.051 230.155 C 55.362 232.974 56.254 235.945 58.382 237.919 C 60.510 239.893 63.540 240.559 66.300 239.660 C 101.130 229.210 125.750 207.320 139.500 174.580 C 141.455 169.898 143.157 165.114 144.600 160.250 L 166.680 178.650 L 152.410 221.470 C 151.013 225.662 153.278 230.193 157.470 231.590 C 161.662 232.987 166.193 230.722 167.590 226.530 L 183.590 178.530 C 184.633 175.404 183.652 171.958 181.120 169.850 L 148.700 142.850 C 150.414 132.820 151.416 122.681 151.700 112.510 C 187.880 93.940 210.700 111.660 210.980 111.860 C 213.199 113.755 216.273 114.291 219.003 113.260 C 221.732 112.229 223.683 109.793 224.095 106.905 C 224.506 104.016 223.313 101.132 220.980 99.380 ZM 64.000 112.000 C 72.837 112.000 80.000 104.837 80.000 96.000 C 80.000 87.163 72.837 80.000 64.000 80.000 C 55.163 80.000 48.000 87.163 48.000 96.000 C 48.000 104.837 55.163 112.000 64.000 112.000 Z"),
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
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null
