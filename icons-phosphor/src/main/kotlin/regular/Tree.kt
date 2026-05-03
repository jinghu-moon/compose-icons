package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorRegularIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.100 62.590 C 186.267 34.337 158.630 15.950 128.000 15.950 C 97.370 15.950 69.733 34.337 57.900 62.590 C 32.377 74.256 16.004 99.737 16.000 127.800 C 15.900 166.000 48.000 199.000 86.140 200.000 C 97.871 200.283 109.494 197.698 120.000 192.470 L 120.000 232.000 C 120.000 236.418 123.582 240.000 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 L 136.000 192.470 C 145.945 197.408 156.896 199.985 168.000 200.000 L 169.820 200.000 C 208.000 199.000 240.110 166.000 240.000 127.800 C 239.996 99.737 223.623 74.256 198.100 62.590 ZM 169.450 184.000 C 157.520 184.311 145.802 180.808 136.000 174.000 L 136.000 133.000 L 179.580 111.220 C 183.534 109.243 185.137 104.434 183.160 100.480 C 181.183 96.526 176.374 94.923 172.420 96.900 L 136.000 115.060 L 136.000 88.000 C 136.000 83.582 132.418 80.000 128.000 80.000 C 123.582 80.000 120.000 83.582 120.000 88.000 L 120.000 139.060 L 83.580 120.840 C 79.626 118.863 74.817 120.466 72.840 124.420 C 70.863 128.374 72.466 133.183 76.420 135.160 L 120.000 156.940 L 120.000 173.940 C 110.201 180.753 98.481 184.256 86.550 183.940 C 56.900 183.230 31.920 157.520 32.000 127.840 C 31.984 105.001 45.896 84.461 67.110 76.000 C 69.213 75.155 70.860 73.458 71.640 71.330 C 80.284 47.658 102.799 31.910 128.000 31.910 C 153.201 31.910 175.716 47.658 184.360 71.330 C 185.140 73.458 186.787 75.155 188.890 76.000 C 210.100 84.465 224.010 105.003 224.000 127.840 C 224.080 157.520 199.100 183.230 169.450 184.000 Z"),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
