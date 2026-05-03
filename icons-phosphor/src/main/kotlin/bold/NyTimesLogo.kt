package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) return _nyTimesLogo!!
        _nyTimesLogo = phosphorBoldIcon(
            name = "NyTimesLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 148.000 C 192.000 156.837 184.837 164.000 176.000 164.000 C 167.163 164.000 160.000 156.837 160.000 148.000 C 160.000 139.163 167.163 132.000 176.000 132.000 C 184.837 132.000 192.000 139.163 192.000 148.000 ZM 188.000 108.000 C 186.247 108.003 184.516 107.617 182.930 106.870 L 118.250 76.690 C 87.577 81.141 63.795 105.770 60.420 136.580 L 126.350 101.410 C 130.070 99.425 134.558 99.537 138.174 101.707 C 141.789 103.876 144.001 107.784 144.000 112.000 L 144.000 210.110 C 163.426 205.451 179.804 192.452 188.750 174.590 C 190.647 170.701 194.491 168.135 198.810 167.873 C 203.129 167.612 207.254 169.695 209.607 173.327 C 211.959 176.959 212.174 181.575 210.170 185.410 C 195.598 214.523 166.660 233.706 134.170 235.790 C 133.454 235.925 132.728 235.995 132.000 236.000 C 131.650 236.000 131.320 236.000 131.000 235.950 C 130.000 235.950 129.000 236.000 128.000 236.000 C 95.868 235.996 66.066 219.228 49.384 191.766 C 32.701 164.304 31.555 130.128 46.360 101.610 C 31.464 91.998 24.672 73.727 29.672 56.718 C 34.672 39.709 50.272 28.021 68.000 28.000 C 69.753 27.997 71.484 28.383 73.070 29.130 L 190.310 83.830 C 198.602 82.612 204.549 75.201 203.942 66.842 C 203.335 58.483 196.381 52.008 188.000 52.000 C 181.373 52.000 176.000 46.627 176.000 40.000 C 176.000 33.373 181.373 28.000 188.000 28.000 C 210.091 28.000 228.000 45.909 228.000 68.000 C 228.000 90.091 210.091 108.000 188.000 108.000 ZM 80.000 192.120 L 80.000 153.330 L 62.610 162.610 C 65.799 173.767 71.785 183.925 80.000 192.120 ZM 120.000 132.000 L 104.000 140.530 L 104.000 207.610 C 109.153 209.562 114.527 210.872 120.000 211.510 ZM 86.500 61.880 L 65.690 52.170 C 58.932 53.163 53.550 58.336 52.291 65.049 C 51.031 71.762 54.172 78.535 60.110 81.910 C 67.622 73.691 76.564 66.905 86.500 61.880 Z"),
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
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
