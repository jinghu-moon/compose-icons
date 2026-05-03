package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = phosphorLightIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 90.000 Q 181.410 90.000 178.840 90.240 C 186.851 67.845 179.266 42.846 160.161 28.678 C 141.057 14.511 114.933 14.511 95.829 28.678 C 76.724 42.846 69.139 67.845 77.150 90.240 C 75.450 90.080 73.730 90.000 72.000 90.000 C 49.185 90.011 28.838 104.360 21.169 125.847 C 13.499 147.335 20.162 171.324 37.813 185.779 C 55.465 200.234 80.297 202.036 99.850 190.280 L 90.250 222.280 C 89.706 224.097 90.054 226.063 91.186 227.584 C 92.319 229.105 94.104 230.001 96.000 230.000 L 160.000 230.000 C 161.896 230.001 163.681 229.105 164.814 227.584 C 165.946 226.063 166.294 224.097 165.750 222.280 L 156.150 190.280 C 175.703 202.036 200.535 200.234 218.187 185.779 C 235.838 171.324 242.501 147.335 234.831 125.847 C 227.162 104.360 206.815 90.011 184.000 90.000 ZM 184.000 186.000 C 169.881 186.015 156.703 178.923 148.940 167.130 C 147.301 164.657 144.101 163.752 141.410 165.003 C 138.719 166.253 137.346 169.282 138.180 172.130 L 151.940 218.000 L 104.060 218.000 L 117.820 172.160 C 118.654 169.312 117.281 166.283 114.590 165.033 C 111.899 163.782 108.699 164.687 107.060 167.160 C 94.997 185.430 70.923 191.370 51.746 180.806 C 32.570 170.243 24.724 146.721 33.720 126.761 C 42.715 106.801 65.535 97.099 86.150 104.470 C 88.591 105.344 91.317 104.552 92.909 102.505 C 94.501 100.458 94.598 97.621 93.150 95.470 C 81.378 77.953 84.434 54.421 100.290 40.491 C 116.145 26.562 139.875 26.562 155.730 40.491 C 171.586 54.421 174.642 77.953 162.870 95.470 C 161.422 97.621 161.519 100.458 163.111 102.505 C 164.702 104.552 167.429 105.344 169.870 104.470 C 185.635 98.811 203.256 103.060 214.709 115.283 C 226.162 127.506 229.257 145.365 222.585 160.729 C 215.913 176.093 200.750 186.024 184.000 186.000 Z"),
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
        return _club!!
    }

private var _club: ImageVector? = null
