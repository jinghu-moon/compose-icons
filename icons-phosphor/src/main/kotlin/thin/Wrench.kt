package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorThinIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 223.050 70.500 C 222.557 69.283 221.499 68.385 220.217 68.097 C 218.936 67.810 217.595 68.170 216.630 69.060 L 174.810 107.660 L 153.000 103.000 L 148.320 81.210 L 186.920 39.390 C 187.815 38.425 188.177 37.081 187.890 35.797 C 187.602 34.512 186.701 33.451 185.480 32.960 C 159.339 22.375 129.376 29.026 110.168 49.677 C 90.960 70.328 86.493 100.692 98.940 126.000 L 36.400 180.000 L 36.190 180.200 C 25.255 191.135 25.255 208.865 36.190 219.800 C 47.125 230.735 64.855 230.735 75.790 219.800 L 75.990 219.590 L 129.990 157.050 C 151.072 167.418 176.012 166.170 195.953 153.749 C 215.894 141.328 228.010 119.493 228.000 96.000 C 228.016 87.260 226.335 78.599 223.050 70.500 ZM 160.000 156.000 C 149.857 156.001 139.880 153.431 131.000 148.530 C 129.335 147.595 127.240 147.968 126.000 149.420 L 70.000 214.250 C 62.098 221.410 49.969 221.111 42.429 213.571 C 34.889 206.031 34.590 193.902 41.750 186.000 L 106.570 130.000 C 108.022 128.760 108.395 126.665 107.460 125.000 C 95.684 103.704 97.937 77.404 113.164 58.421 C 128.392 39.439 153.576 31.534 176.920 38.410 L 141.050 77.290 C 140.158 78.240 139.785 79.564 140.050 80.840 L 145.710 107.190 C 146.041 108.728 147.242 109.929 148.780 110.260 L 175.130 115.920 C 176.406 116.185 177.730 115.812 178.680 114.920 L 217.550 79.050 C 222.870 97.190 219.338 116.776 208.016 131.915 C 196.694 147.054 178.904 155.977 160.000 156.000 Z"),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
