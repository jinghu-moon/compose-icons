package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) return _chatsCircle!!
        _chatsCircle = phosphorLightIcon(
            name = "ChatsCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.930 186.580 C 241.249 163.699 240.656 136.727 228.341 114.366 C 216.026 92.005 193.548 77.085 168.160 74.420 C 157.342 48.032 132.985 29.652 104.641 26.488 C 76.298 23.325 48.488 35.883 32.118 59.236 C 15.748 82.589 13.429 113.015 26.070 138.580 L 18.580 164.000 C 17.108 168.929 18.458 174.267 22.095 177.905 C 25.733 181.542 31.071 182.892 36.000 181.420 L 61.460 173.930 C 69.736 178.015 78.671 180.598 87.850 181.560 C 96.049 201.593 112.205 217.319 132.452 224.974 C 152.699 232.630 175.217 231.527 194.620 221.930 L 220.000 229.420 C 224.929 230.892 230.267 229.542 233.905 225.905 C 237.542 222.267 238.892 216.929 237.420 212.000 ZM 62.000 161.500 C 61.428 161.500 60.859 161.581 60.310 161.740 L 32.540 169.910 C 31.839 170.114 31.082 169.921 30.566 169.404 C 30.049 168.888 29.856 168.131 30.060 167.430 L 38.230 139.660 C 38.669 138.146 38.501 136.521 37.760 135.130 C 22.335 106.283 30.368 70.489 56.641 51.000 C 82.915 31.511 119.499 34.208 142.631 57.339 C 165.762 80.471 168.459 117.055 148.970 143.329 C 129.481 169.602 93.687 177.635 64.840 162.210 C 63.966 161.742 62.991 161.499 62.000 161.500 ZM 217.710 187.660 L 225.880 215.430 C 226.084 216.131 225.891 216.888 225.374 217.404 C 224.858 217.921 224.101 218.114 223.400 217.910 L 195.630 209.740 C 194.116 209.302 192.491 209.470 191.100 210.210 C 175.437 218.582 157.062 220.289 140.125 214.945 C 123.188 209.600 109.120 197.656 101.100 181.810 C 123.805 180.333 144.729 169.005 158.379 150.802 C 172.030 132.599 177.042 109.339 172.100 87.130 C 192.776 90.996 210.372 104.486 219.473 123.450 C 228.573 142.415 228.090 164.581 218.170 183.130 C 217.443 184.527 217.288 186.152 217.740 187.660 Z"),
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
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
