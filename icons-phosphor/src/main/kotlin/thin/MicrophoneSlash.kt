package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) return _microphoneSlash!!
        _microphoneSlash = phosphorThinIcon(
            name = "MicrophoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 211.000 221.310 L 51.000 45.310 C 49.514 43.653 46.967 43.514 45.310 45.000 C 43.653 46.486 43.514 49.033 45.000 50.690 L 84.000 93.550 L 84.000 128.000 C 83.995 143.722 92.379 158.253 105.994 166.116 C 119.608 173.980 136.384 173.981 150.000 166.120 L 166.380 184.120 C 155.097 191.901 141.705 196.046 128.000 196.000 C 90.461 195.961 60.039 165.539 60.000 128.000 C 60.000 125.791 58.209 124.000 56.000 124.000 C 53.791 124.000 52.000 125.791 52.000 128.000 C 52.048 168.399 83.659 201.718 124.000 203.890 L 124.000 240.000 C 124.000 242.209 125.791 244.000 128.000 244.000 C 130.209 244.000 132.000 242.209 132.000 240.000 L 132.000 203.890 C 146.305 203.188 160.111 198.410 171.790 190.120 L 205.000 226.690 C 205.956 227.768 207.417 228.248 208.826 227.948 C 210.235 227.647 211.374 226.613 211.807 225.239 C 212.240 223.865 211.902 222.364 210.920 221.310 ZM 128.000 164.000 C 108.118 164.000 92.000 147.882 92.000 128.000 L 92.000 102.350 L 144.430 160.000 C 139.351 162.625 133.717 163.997 128.000 164.000 ZM 189.120 157.850 C 193.673 148.559 196.027 138.346 196.000 128.000 C 196.000 125.791 197.791 124.000 200.000 124.000 C 202.209 124.000 204.000 125.791 204.000 128.000 C 204.031 139.567 201.396 150.986 196.300 161.370 C 195.290 163.282 192.944 164.046 191.002 163.094 C 189.060 162.142 188.227 159.819 189.120 157.850 ZM 87.630 46.460 C 95.928 27.318 116.529 16.635 136.956 20.881 C 157.383 25.128 172.019 43.136 172.000 64.000 L 172.000 128.000 C 172.000 129.540 171.920 131.079 171.760 132.610 C 171.544 134.654 169.815 136.201 167.760 136.190 L 167.340 136.190 C 166.284 136.082 165.315 135.558 164.645 134.735 C 163.976 133.911 163.661 132.856 163.770 131.800 C 163.912 130.538 163.989 129.270 164.000 128.000 L 164.000 64.000 C 163.978 46.959 152.010 32.268 135.325 28.801 C 118.641 25.333 101.810 34.039 95.000 49.660 C 94.116 51.687 91.757 52.614 89.730 51.730 C 87.703 50.846 86.776 48.487 87.660 46.460 Z"),
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
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
