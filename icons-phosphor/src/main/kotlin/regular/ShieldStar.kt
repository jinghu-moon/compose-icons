package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) return _shieldStar!!
        _shieldStar = phosphorRegularIcon(
            name = "ShieldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 80.570 117.000 C 81.363 115.027 82.908 113.451 84.865 112.620 C 86.822 111.789 89.030 111.771 91.000 112.570 L 120.000 124.180 L 120.000 96.000 C 120.000 91.582 123.582 88.000 128.000 88.000 C 132.418 88.000 136.000 91.582 136.000 96.000 L 136.000 124.180 L 165.000 112.570 C 169.103 110.913 173.773 112.897 175.430 117.000 C 177.087 121.103 175.103 125.773 171.000 127.430 L 140.690 139.550 L 158.400 163.200 C 161.051 166.735 160.335 171.749 156.800 174.400 C 153.265 177.051 148.251 176.335 145.600 172.800 L 128.000 149.330 L 110.400 172.800 C 107.749 176.335 102.735 177.051 99.200 174.400 C 95.665 171.749 94.949 166.735 97.600 163.200 L 115.340 139.550 L 85.000 127.430 C 83.027 126.637 81.451 125.092 80.620 123.135 C 79.789 121.178 79.771 118.970 80.570 117.000 ZM 224.000 56.000 L 224.000 112.000 C 224.000 164.720 198.480 196.670 177.070 214.190 C 154.010 233.050 131.070 239.460 130.070 239.720 C 128.695 240.094 127.245 240.094 125.870 239.720 C 124.870 239.460 101.960 233.050 78.870 214.190 C 57.520 196.670 32.000 164.720 32.000 112.000 L 32.000 56.000 C 32.000 47.163 39.163 40.000 48.000 40.000 L 208.000 40.000 C 216.837 40.000 224.000 47.163 224.000 56.000 ZM 208.000 56.000 L 48.000 56.000 L 48.000 112.000 C 48.000 149.300 61.820 179.510 89.070 201.810 C 100.672 211.299 113.849 218.681 128.000 223.620 C 142.339 218.593 155.680 211.078 167.410 201.420 C 194.340 179.160 208.000 149.070 208.000 112.000 Z"),
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
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
