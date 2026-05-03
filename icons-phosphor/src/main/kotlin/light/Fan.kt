package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorLightIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.060 135.520 C 226.244 117.500 213.056 102.896 195.619 96.274 C 178.181 89.652 158.624 91.820 143.060 102.100 C 142.370 101.690 141.650 101.300 140.920 100.950 L 157.780 33.630 C 158.407 31.131 157.368 28.511 155.200 27.120 C 137.130 15.592 114.175 14.969 95.507 25.501 C 76.839 36.032 65.501 56.001 66.022 77.429 C 66.544 98.857 78.841 118.250 98.000 127.860 L 98.000 128.000 C 98.000 128.770 98.000 129.540 98.100 130.300 L 31.370 149.360 C 28.884 150.059 27.123 152.270 27.000 154.850 C 26.199 176.178 37.175 196.223 55.577 207.035 C 73.978 217.847 96.831 217.679 115.072 206.598 C 133.313 195.517 143.994 175.314 142.880 154.000 C 143.580 153.600 144.270 153.170 144.940 152.710 L 194.810 201.000 C 196.668 202.791 199.462 203.194 201.750 202.000 C 225.922 189.460 238.115 161.792 231.060 135.490 ZM 110.000 128.000 C 110.000 118.059 118.059 110.000 128.000 110.000 C 137.941 110.000 146.000 118.059 146.000 128.000 C 146.000 137.941 137.941 146.000 128.000 146.000 C 118.059 146.000 110.000 137.941 110.000 128.000 ZM 78.000 76.000 C 77.995 59.953 86.352 45.064 100.053 36.710 C 113.754 28.357 130.818 27.746 145.080 35.100 L 129.320 98.000 Q 128.660 98.000 128.000 98.000 C 116.212 98.006 105.519 104.915 100.670 115.660 C 86.595 107.415 77.962 92.312 78.000 76.000 ZM 108.000 197.300 C 94.104 205.347 77.017 205.565 62.920 197.875 C 48.823 190.185 39.757 175.700 39.000 159.660 L 101.390 141.840 C 106.552 151.768 116.810 157.997 128.000 158.000 C 129.002 158.001 130.003 157.951 131.000 157.850 C 130.893 174.154 122.136 189.175 108.000 197.300 ZM 214.900 173.540 C 211.227 179.897 206.083 185.281 199.900 189.240 L 153.270 144.120 C 159.887 133.784 159.518 120.455 152.340 110.500 C 170.390 100.279 193.047 103.402 207.658 118.125 C 222.269 132.849 225.219 155.529 214.860 173.500 Z"),
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
        return _fan!!
    }

private var _fan: ImageVector? = null
