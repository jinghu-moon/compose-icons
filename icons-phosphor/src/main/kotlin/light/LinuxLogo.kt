package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) return _linuxLogo!!
        _linuxLogo = phosphorLightIcon(
            name = "LinuxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.740 212.690 C 225.154 214.750 221.388 214.330 219.320 211.750 C 218.000 210.050 186.000 169.170 186.000 88.000 C 186.000 55.967 160.033 30.000 128.000 30.000 C 95.967 30.000 70.000 55.967 70.000 88.000 C 70.000 169.170 38.050 210.050 36.690 211.750 C 34.622 214.340 30.845 214.763 28.255 212.695 C 25.665 210.627 25.242 206.850 27.310 204.260 C 27.680 203.790 58.000 164.560 58.000 88.000 C 58.000 49.340 89.340 18.000 128.000 18.000 C 166.660 18.000 198.000 49.340 198.000 88.000 C 198.000 164.630 228.380 203.870 228.690 204.260 C 230.755 206.850 230.329 210.624 227.740 212.690 ZM 100.000 90.000 C 94.477 90.000 90.000 94.477 90.000 100.000 C 90.000 105.523 94.477 110.000 100.000 110.000 C 105.523 110.000 110.000 105.523 110.000 100.000 C 110.000 94.477 105.523 90.000 100.000 90.000 ZM 166.000 100.000 C 166.000 94.477 161.523 90.000 156.000 90.000 C 150.477 90.000 146.000 94.477 146.000 100.000 C 146.000 105.523 150.477 110.000 156.000 110.000 C 161.523 110.000 166.000 105.523 166.000 100.000 ZM 98.690 130.630 C 95.724 129.147 92.118 130.349 90.635 133.315 C 89.152 136.281 90.354 139.887 93.320 141.370 L 125.320 157.370 C 126.152 157.785 127.070 158.001 128.000 158.000 C 128.933 158.000 129.854 157.784 130.690 157.370 L 162.690 141.370 C 165.656 139.887 166.858 136.281 165.375 133.315 C 163.892 130.349 160.286 129.147 157.320 130.630 L 128.000 145.290 ZM 128.000 178.000 C 109.127 178.160 91.818 188.521 82.760 205.080 C 81.147 207.977 82.188 211.632 85.085 213.245 C 87.982 214.858 91.637 213.817 93.250 210.920 C 100.068 198.049 113.440 190.000 128.005 190.000 C 142.570 190.000 155.942 198.049 162.760 210.920 C 163.819 212.821 165.824 213.999 168.000 214.000 C 169.019 214.003 170.022 213.741 170.910 213.240 C 172.301 212.467 173.328 211.173 173.765 209.643 C 174.202 208.112 174.013 206.471 173.240 205.080 C 164.179 188.524 146.872 178.165 128.000 178.000 Z"),
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
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
