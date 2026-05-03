package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.EarSlash: ImageVector
    get() {
        if (_earSlash != null) return _earSlash!!
        _earSlash = phosphorDuotoneIcon(
            name = "EarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 104.000 C 208.000 144.000 193.560 176.000 160.000 216.000 C 151.930 225.770 141.660 232.000 128.000 232.000 C 103.699 232.000 84.000 212.301 84.000 188.000 C 84.000 146.510 48.000 160.000 48.000 104.000 C 48.000 59.817 83.817 24.000 128.000 24.000 C 172.183 24.000 208.000 59.817 208.000 104.000 Z"),
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
                pathData = parseSvgPathData("M 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 167.080 182.930 C 159.799 185.178 151.883 183.835 145.752 179.311 C 139.620 174.787 136.001 167.620 136.000 160.000 C 135.989 156.630 136.395 153.271 137.210 150.000 L 96.000 104.660 C 95.818 109.078 92.088 112.512 87.670 112.330 C 83.252 112.148 79.818 108.418 80.000 104.000 C 79.994 99.095 80.743 94.218 82.220 89.540 L 64.500 70.000 C 58.889 80.452 55.968 92.137 56.000 104.000 C 56.000 130.700 64.530 138.920 73.570 147.640 C 82.210 156.000 92.000 165.410 92.000 188.000 C 92.000 207.882 108.118 224.000 128.000 224.000 C 138.240 224.000 146.450 219.840 153.830 210.910 C 155.629 208.643 158.513 207.524 161.370 207.985 C 164.227 208.446 166.613 210.414 167.608 213.132 C 168.604 215.849 168.054 218.893 166.170 221.090 C 155.810 233.640 143.000 240.000 128.000 240.000 C 99.295 239.967 76.033 216.705 76.000 188.000 C 76.000 172.210 70.320 166.730 62.460 159.160 C 52.460 149.500 40.000 137.500 40.000 104.000 C 39.959 87.606 44.537 71.532 53.210 57.620 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 ZM 91.090 42.170 C 113.340 28.886 141.011 28.582 163.547 41.376 C 186.082 54.170 200.004 78.086 200.000 104.000 C 200.000 108.418 203.582 112.000 208.000 112.000 C 212.418 112.000 216.000 108.418 216.000 104.000 C 216.005 72.324 198.985 43.090 171.437 27.454 C 143.889 11.819 110.063 12.195 82.870 28.440 C 79.079 30.710 77.845 35.624 80.115 39.415 C 82.385 43.206 87.299 44.440 91.090 42.170 ZM 160.320 127.170 C 162.206 128.144 164.401 128.328 166.423 127.683 C 168.444 127.038 170.127 125.616 171.100 123.730 C 174.327 117.655 176.010 110.879 176.000 104.000 C 176.005 88.495 168.520 73.943 155.905 64.929 C 143.289 55.915 127.096 53.551 112.430 58.580 C 108.249 60.013 106.022 64.564 107.455 68.745 C 108.888 72.926 113.439 75.153 117.620 73.720 C 127.398 70.367 138.193 71.944 146.603 77.953 C 155.014 83.962 160.003 93.663 160.000 104.000 C 159.998 108.308 158.926 112.549 156.880 116.340 C 155.906 118.226 155.722 120.421 156.367 122.443 C 157.012 124.464 158.434 126.147 160.320 127.120 Z"),
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
        return _earSlash!!
    }

private var _earSlash: ImageVector? = null
