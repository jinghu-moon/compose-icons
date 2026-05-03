package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorBoldIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 117.180 188.740 C 119.439 190.992 120.709 194.050 120.709 197.240 C 120.709 200.430 119.439 203.488 117.180 205.740 L 112.060 210.860 C 101.082 221.879 86.154 228.050 70.600 228.000 L 70.600 228.000 C 46.885 228.008 25.501 213.725 16.424 191.815 C 7.348 169.906 12.367 144.686 29.140 127.920 L 63.890 93.170 C 78.942 78.121 100.966 72.409 121.435 78.246 C 141.903 84.084 157.601 100.555 162.450 121.280 C 163.523 125.492 162.235 129.955 159.082 132.948 C 155.929 135.940 151.405 136.993 147.254 135.701 C 143.104 134.409 139.977 130.973 139.080 126.720 C 136.203 114.486 126.927 104.769 114.841 101.327 C 102.754 97.885 89.751 101.257 80.860 110.140 L 46.110 144.890 C 36.204 154.788 33.236 169.678 38.591 182.617 C 43.945 195.556 56.567 203.996 70.570 204.000 L 70.570 204.000 C 79.760 204.026 88.578 200.375 95.060 193.860 L 100.170 188.740 C 102.422 186.477 105.483 185.206 108.675 185.206 C 111.867 185.206 114.928 186.477 117.180 188.740 ZM 226.830 45.170 C 203.927 22.275 166.803 22.275 143.900 45.170 L 138.790 50.280 C 134.096 54.974 134.096 62.586 138.790 67.280 C 143.484 71.974 151.096 71.974 155.790 67.280 L 160.910 62.160 C 174.441 48.629 196.379 48.629 209.910 62.160 C 223.441 75.691 223.441 97.629 209.910 111.160 L 175.100 145.860 C 168.620 152.377 159.800 156.028 150.610 156.000 L 150.610 156.000 C 134.541 155.989 120.590 144.924 116.920 129.280 C 115.418 122.824 108.966 118.808 102.510 120.310 C 96.054 121.812 92.038 128.264 93.540 134.720 C 99.739 161.215 123.350 179.964 150.560 180.000 L 150.610 180.000 C 166.171 180.043 181.103 173.860 192.080 162.830 L 226.830 128.080 C 237.826 117.086 244.004 102.174 244.004 86.625 C 244.004 71.076 237.826 56.164 226.830 45.170 Z"),
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
        return _link!!
    }

private var _link: ImageVector? = null
