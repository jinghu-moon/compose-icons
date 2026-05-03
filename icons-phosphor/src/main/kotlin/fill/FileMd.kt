package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileMd: ImageVector
    get() {
        if (_fileMd != null) return _fileMd!!
        _fileMd = phosphorFillIcon(
            name = "FileMd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 116.000 C 40.000 118.209 41.791 120.000 44.000 120.000 L 196.000 120.000 C 198.209 120.000 200.000 121.791 200.000 124.000 L 200.000 224.000 C 200.000 226.329 201.016 228.543 202.781 230.062 C 204.547 231.582 206.887 232.256 209.190 231.910 C 213.165 231.248 216.060 227.780 216.000 223.750 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 152.000 88.000 L 152.000 44.000 L 196.000 88.000 ZM 144.000 144.000 L 128.000 144.000 C 123.582 144.000 120.000 147.582 120.000 152.000 L 120.000 208.000 C 120.000 212.418 123.582 216.000 128.000 216.000 L 143.320 216.000 C 162.980 216.000 179.530 200.520 179.990 180.870 C 180.224 171.174 176.537 161.794 169.762 154.853 C 162.987 147.913 153.699 144.000 144.000 144.000 ZM 143.510 200.000 L 136.000 200.000 L 136.000 160.000 L 144.000 160.000 C 149.440 159.996 154.648 162.208 158.421 166.127 C 162.195 170.046 164.209 175.334 164.000 180.770 C 163.580 191.590 154.340 200.000 143.510 200.000 ZM 104.000 152.000 L 104.000 207.730 C 104.068 212.021 100.805 215.633 96.530 216.000 C 94.318 216.147 92.144 215.369 90.527 213.853 C 88.910 212.336 87.995 210.217 88.000 208.000 L 88.000 177.380 L 74.680 196.380 C 73.666 197.875 72.191 198.999 70.480 199.580 C 67.147 200.659 63.499 199.443 61.480 196.580 L 48.000 177.380 L 48.000 207.730 C 48.068 212.021 44.805 215.633 40.530 216.000 C 38.318 216.147 36.144 215.369 34.527 213.853 C 32.910 212.336 31.995 210.217 32.000 208.000 L 32.000 152.310 C 31.947 149.132 33.719 146.205 36.560 144.780 C 40.088 143.095 44.317 144.208 46.560 147.410 L 68.000 178.050 L 89.270 147.660 C 91.052 145.027 94.185 143.648 97.330 144.110 C 101.181 144.759 104.001 148.094 104.000 152.000 Z"),
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
        return _fileMd!!
    }

private var _fileMd: ImageVector? = null
