package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GrainsSlash: ImageVector
    get() {
        if (_grainsSlash != null) return _grainsSlash!!
        _grainsSlash = phosphorDuotoneIcon(
            name = "GrainsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 64.000 L 208.000 120.000 C 163.817 120.000 128.000 155.817 128.000 200.000 C 128.000 155.817 92.183 120.000 48.000 120.000 L 48.000 64.000 C 60.525 63.990 72.876 66.933 84.050 72.590 L 84.050 72.590 C 95.620 40.190 128.000 24.000 128.000 24.000 C 128.000 24.000 160.390 40.190 172.000 72.580 L 172.000 72.580 C 183.159 66.931 195.493 63.992 208.000 64.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 51.810 56.090 Q 49.910 56.000 48.000 56.000 C 43.582 56.000 40.000 59.582 40.000 64.000 L 40.000 144.000 C 40.002 179.333 61.136 211.238 93.669 225.023 C 126.202 238.807 163.825 231.796 189.210 207.220 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 120.000 215.560 C 83.578 211.442 56.042 180.654 56.000 144.000 L 56.000 128.440 C 92.422 132.558 119.958 163.346 120.000 200.000 ZM 56.000 112.370 L 56.000 72.440 C 60.470 72.939 64.883 73.860 69.180 75.190 L 136.290 149.000 C 133.081 153.519 130.306 158.330 128.000 163.370 C 114.845 134.719 87.393 115.273 56.000 112.370 ZM 136.000 215.560 L 136.000 200.000 C 136.006 186.244 139.948 172.778 147.360 161.190 L 178.440 195.380 C 166.955 206.674 152.009 213.781 136.000 215.560 ZM 216.000 64.000 L 216.000 144.000 C 216.004 151.906 214.945 159.777 212.850 167.400 C 211.896 170.872 208.740 173.278 205.140 173.280 C 204.417 173.286 203.697 173.192 203.000 173.000 C 198.743 171.827 196.241 167.428 197.410 163.170 C 199.125 156.924 199.996 150.477 200.000 144.000 L 200.000 128.430 C 191.437 129.365 183.115 131.848 175.440 135.760 C 172.881 137.158 169.764 137.053 167.305 135.487 C 164.846 133.920 163.434 131.139 163.620 128.229 C 163.806 125.319 165.561 122.741 168.200 121.500 C 178.114 116.439 188.911 113.336 200.000 112.360 L 200.000 72.450 C 179.842 74.742 161.573 85.395 149.650 101.810 C 147.057 105.400 142.045 106.208 138.455 103.615 C 134.865 101.022 134.057 96.010 136.650 92.420 C 143.431 83.081 151.979 75.165 161.810 69.120 C 152.620 49.800 135.450 37.740 128.000 33.200 C 119.217 38.598 111.323 45.325 104.600 53.140 C 101.711 56.365 96.780 56.705 93.475 53.909 C 90.169 51.112 89.689 46.194 92.390 42.810 C 101.361 32.243 112.210 23.428 124.390 16.810 C 126.643 15.682 129.297 15.682 131.550 16.810 C 132.870 17.470 161.820 32.240 176.140 61.960 C 186.299 58.016 197.102 55.995 208.000 56.000 C 212.418 56.000 216.000 59.582 216.000 64.000 Z"),
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
        return _grainsSlash!!
    }

private var _grainsSlash: ImageVector? = null
