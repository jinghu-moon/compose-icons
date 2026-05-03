package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Confetti: ImageVector
    get() {
        if (_confetti != null) return _confetti!!
        _confetti = phosphorFillIcon(
            name = "Confetti",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 111.490 52.630 C 107.672 48.822 102.174 47.224 96.909 48.392 C 91.644 49.561 87.339 53.334 85.490 58.400 L 33.000 202.780 C 31.250 207.611 31.954 212.991 34.889 217.210 C 37.823 221.428 42.622 223.960 47.760 224.000 C 49.624 223.987 51.472 223.649 53.220 223.000 L 197.590 170.500 C 202.658 168.653 206.433 164.349 207.604 159.084 C 208.774 153.818 207.178 148.320 203.370 144.500 ZM 65.140 161.130 L 84.340 108.340 L 147.660 171.660 L 94.860 190.860 ZM 160.000 72.000 C 160.150 66.592 161.460 61.279 163.840 56.420 C 169.140 45.830 179.140 40.000 192.000 40.000 C 198.700 40.000 203.000 37.710 205.650 32.790 C 207.045 30.037 207.846 27.022 208.000 23.940 C 208.017 19.522 211.612 15.953 216.030 15.970 C 220.448 15.987 224.017 19.582 224.000 24.000 C 224.000 36.860 215.480 56.000 192.000 56.000 C 185.300 56.000 181.000 58.290 178.350 63.210 C 176.955 65.963 176.154 68.978 176.000 72.060 C 175.983 76.478 172.388 80.047 167.970 80.030 C 163.552 80.013 159.983 76.418 160.000 72.000 ZM 136.000 40.000 L 136.000 16.000 C 136.000 11.582 139.582 8.000 144.000 8.000 C 148.418 8.000 152.000 11.582 152.000 16.000 L 152.000 40.000 C 152.000 44.418 148.418 48.000 144.000 48.000 C 139.582 48.000 136.000 44.418 136.000 40.000 ZM 237.660 122.340 C 240.783 125.466 240.781 130.532 237.655 133.655 C 234.529 136.778 229.463 136.776 226.340 133.650 L 210.340 117.650 C 207.214 114.524 207.214 109.456 210.340 106.330 C 213.466 103.204 218.534 103.204 221.660 106.330 ZM 242.530 79.590 L 218.530 87.590 C 214.338 88.987 209.807 86.722 208.410 82.530 C 207.013 78.338 209.278 73.807 213.470 72.410 L 237.470 64.410 C 241.662 63.013 246.193 65.278 247.590 69.470 C 248.987 73.662 246.722 78.193 242.530 79.590 Z"),
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
        return _confetti!!
    }

private var _confetti: ImageVector? = null
