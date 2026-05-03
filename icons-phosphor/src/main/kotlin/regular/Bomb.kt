package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = phosphorRegularIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 32.000 L 248.000 32.000 C 243.582 32.000 240.000 35.582 240.000 40.000 C 239.803 45.957 238.596 51.837 236.430 57.390 C 232.380 67.220 225.700 72.000 216.000 72.000 C 204.940 72.000 197.150 62.240 186.510 47.350 C 176.000 32.660 164.120 16.000 144.000 16.000 C 127.610 16.000 115.000 24.890 108.570 41.000 C 106.686 45.830 105.377 50.864 104.670 56.000 L 88.000 56.000 C 79.163 56.000 72.000 63.163 72.000 72.000 L 72.000 81.590 C 35.737 100.065 16.874 140.996 26.385 180.567 C 35.897 220.138 71.302 248.024 112.000 248.000 L 113.590 248.000 C 153.995 247.305 188.734 219.180 197.823 179.804 C 206.911 140.428 188.013 99.923 152.000 81.590 L 152.000 72.000 C 152.000 63.163 144.837 56.000 136.000 56.000 L 120.880 56.000 C 121.448 52.791 122.349 49.651 123.570 46.630 C 127.620 36.780 134.300 32.000 144.000 32.000 C 155.060 32.000 162.850 41.760 173.490 56.650 C 184.000 71.340 195.880 88.000 216.000 88.000 C 232.390 88.000 245.000 79.110 251.430 63.000 C 254.260 55.652 255.806 47.872 256.000 40.000 C 256.000 35.582 252.418 32.000 248.000 32.000 ZM 140.800 94.000 C 172.048 107.638 189.447 141.324 182.481 174.699 C 175.515 208.075 146.095 231.989 112.000 231.989 C 77.905 231.989 48.485 208.075 41.519 174.699 C 34.553 141.324 51.952 107.638 83.200 94.000 C 86.118 92.726 88.003 89.844 88.000 86.660 L 88.000 72.000 L 136.000 72.000 L 136.000 86.660 C 135.997 89.844 137.882 92.726 140.800 94.000 ZM 111.890 209.320 C 111.245 213.175 107.909 216.000 104.000 216.000 C 103.554 215.998 103.110 215.961 102.670 215.890 C 78.913 211.675 60.315 193.077 56.100 169.320 C 55.599 166.488 56.657 163.605 58.870 161.769 C 61.084 159.933 64.112 159.427 66.803 160.442 C 69.493 161.458 71.432 163.839 71.880 166.680 C 74.910 183.731 88.259 197.080 105.310 200.110 C 107.404 200.458 109.275 201.624 110.509 203.351 C 111.743 205.079 112.240 207.226 111.890 209.320 Z"),
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
