package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorFillIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 128.000 C 232.000 184.630 184.620 232.000 128.000 232.000 C 117.304 232.006 106.671 230.356 96.480 227.110 C 95.145 226.689 94.127 225.602 93.796 224.242 C 93.464 222.882 93.868 221.447 94.860 220.460 L 220.460 94.850 C 221.447 93.858 222.882 93.454 224.242 93.786 C 225.602 94.117 226.689 95.135 227.110 96.470 C 230.357 106.665 232.006 117.301 232.000 128.000 ZM 215.840 72.390 C 213.966 69.436 211.944 66.579 209.780 63.830 C 209.069 62.925 208.003 62.371 206.855 62.308 C 205.706 62.244 204.586 62.679 203.780 63.500 L 63.500 203.820 C 62.679 204.626 62.244 205.746 62.308 206.895 C 62.371 208.043 62.925 209.109 63.830 209.820 C 66.579 211.984 69.436 214.006 72.390 215.880 C 73.976 216.901 76.059 216.676 77.390 215.340 L 215.300 77.390 C 216.636 76.059 216.861 73.976 215.840 72.390 ZM 192.170 46.220 C 189.421 44.056 186.564 42.034 183.610 40.160 C 182.024 39.139 179.941 39.364 178.610 40.700 L 40.700 178.620 C 39.364 179.951 39.139 182.034 40.160 183.620 C 42.034 186.574 44.056 189.431 46.220 192.180 C 46.931 193.085 47.997 193.639 49.145 193.702 C 50.294 193.766 51.414 193.331 52.220 192.510 L 192.500 52.180 C 193.307 51.375 193.733 50.264 193.670 49.126 C 193.607 47.988 193.061 46.931 192.170 46.220 ZM 159.530 28.890 C 149.335 25.643 138.699 23.993 128.000 24.000 C 71.380 24.000 24.000 71.370 24.000 128.000 C 23.994 138.699 25.643 149.335 28.890 159.530 C 29.311 160.865 30.398 161.883 31.758 162.214 C 33.118 162.546 34.553 162.142 35.540 161.150 L 161.150 35.540 C 162.142 34.553 162.546 33.118 162.214 31.758 C 161.883 30.398 160.865 29.311 159.530 28.890 Z"),
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
        return _boules!!
    }

private var _boules: ImageVector? = null
