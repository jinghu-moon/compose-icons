package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorThinIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 57.830 56.760 C 25.835 88.263 18.760 137.229 40.530 176.500 L 28.630 212.190 C 27.192 216.502 28.314 221.257 31.528 224.472 C 34.743 227.686 39.498 228.808 43.810 227.370 L 79.500 215.470 C 115.706 235.539 160.535 231.225 192.250 204.620 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 128.000 220.000 C 111.825 220.005 95.934 215.745 81.930 207.650 C 80.938 207.077 79.747 206.956 78.660 207.320 L 41.280 219.780 C 39.843 220.259 38.258 219.885 37.186 218.814 C 36.115 217.742 35.741 216.157 36.220 214.720 L 48.680 177.340 C 49.044 176.253 48.923 175.062 48.350 174.070 C 27.424 137.877 33.532 92.126 63.220 62.690 L 186.860 198.690 C 170.345 212.474 149.511 220.016 128.000 220.000 ZM 228.000 128.000 C 227.996 144.526 223.909 160.795 216.100 175.360 C 215.400 176.657 214.044 177.464 212.570 177.460 C 211.910 177.462 211.259 177.297 210.680 176.980 C 209.745 176.478 209.047 175.624 208.742 174.608 C 208.436 173.591 208.547 172.495 209.050 171.560 C 227.538 137.210 222.354 94.935 196.113 66.071 C 169.872 37.207 128.281 28.029 92.330 43.170 C 90.303 43.994 87.989 43.036 87.138 41.020 C 86.287 39.003 87.215 36.677 89.220 35.800 C 120.100 22.835 155.419 26.181 183.315 44.714 C 211.211 63.247 227.983 94.509 228.000 128.000 Z"),
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
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
