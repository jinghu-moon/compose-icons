package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorLightIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.060 84.000 C 242.696 131.297 225.809 188.052 180.998 215.281 C 136.186 242.509 78.033 231.350 46.483 189.469 C 14.933 147.588 20.252 88.614 58.787 53.054 C 97.323 17.495 156.534 16.922 195.750 51.730 L 219.750 27.730 C 222.100 25.421 225.872 25.438 228.201 27.769 C 230.529 30.100 230.542 33.873 228.230 36.220 L 132.230 132.220 C 130.718 133.755 128.498 134.362 126.415 133.808 C 124.332 133.255 122.706 131.627 122.155 129.543 C 121.604 127.460 122.213 125.241 123.750 123.730 L 153.140 94.330 C 137.365 82.534 115.512 83.286 100.585 96.138 C 85.658 108.989 81.668 130.488 90.988 147.840 C 100.309 165.193 120.436 173.737 139.393 168.388 C 158.350 163.039 171.044 145.235 169.920 125.570 C 169.732 122.256 172.266 119.418 175.580 119.230 C 178.894 119.042 181.732 121.576 181.920 124.890 C 183.404 150.338 166.890 173.357 142.309 180.106 C 117.728 186.855 91.775 175.495 80.056 152.858 C 68.337 130.220 74.045 102.471 93.747 86.296 C 113.449 70.122 141.778 69.927 161.700 85.830 L 187.240 60.280 C 152.480 29.970 100.422 30.876 66.738 62.377 C 33.053 93.879 28.666 145.759 56.583 182.469 C 84.499 219.180 135.665 228.814 175.022 204.771 C 214.378 180.728 229.161 130.805 209.240 89.210 C 207.801 86.222 209.057 82.634 212.045 81.195 C 215.033 79.756 218.621 81.012 220.060 84.000 Z"),
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
        return _target!!
    }

private var _target: ImageVector? = null
