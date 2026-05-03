package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = phosphorRegularIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.670 60.890 C 225.697 53.697 217.148 49.125 207.850 48.150 C 206.234 33.444 195.786 21.224 181.509 17.343 C 167.233 13.462 152.036 18.710 143.197 30.574 C 134.358 42.437 133.677 58.501 141.480 71.070 C 141.484 71.096 141.484 71.124 141.480 71.150 L 71.170 141.510 C 71.170 141.510 71.170 141.510 71.070 141.510 C 58.501 133.707 42.437 134.388 30.574 143.227 C 18.710 152.066 13.462 167.263 17.343 181.539 C 21.224 195.816 33.444 206.264 48.150 207.880 C 49.766 222.586 60.214 234.806 74.491 238.687 C 88.767 242.568 103.964 237.320 112.803 225.456 C 121.642 213.593 122.323 197.529 114.520 184.960 C 114.518 184.933 114.518 184.907 114.520 184.880 L 184.870 114.520 C 184.870 114.520 184.870 114.520 184.970 114.520 C 199.980 123.974 219.640 121.085 231.296 107.711 C 242.951 94.338 243.127 74.468 231.710 60.890 ZM 219.100 97.160 C 212.638 104.559 201.759 106.170 193.430 100.960 C 187.107 96.948 178.848 97.858 173.550 103.150 L 103.150 173.550 C 97.871 178.858 96.978 187.116 101.000 193.430 C 105.680 200.959 104.846 210.670 98.950 217.291 C 93.054 223.911 83.504 225.860 75.485 222.079 C 67.467 218.299 62.894 209.691 64.250 200.930 C 64.613 198.619 63.945 196.265 62.424 194.487 C 60.903 192.710 58.679 191.688 56.340 191.690 C 55.928 191.693 55.517 191.727 55.110 191.790 C 46.359 193.136 37.765 188.567 33.985 180.561 C 30.205 172.554 32.139 163.015 38.739 157.113 C 45.339 151.212 55.034 150.352 62.570 155.000 C 68.893 159.012 77.152 158.102 82.450 152.810 L 152.850 82.410 C 158.108 77.109 159.001 68.875 155.000 62.570 C 150.320 55.041 151.154 45.330 157.050 38.709 C 162.946 32.089 172.496 30.140 180.515 33.921 C 188.533 37.701 193.106 46.309 191.750 55.070 C 191.355 57.595 192.190 60.156 193.997 61.963 C 195.804 63.770 198.365 64.605 200.890 64.210 C 209.235 62.860 217.527 66.902 221.605 74.307 C 225.682 81.712 224.663 90.880 219.060 97.210 Z"),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
