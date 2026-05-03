package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) return _linuxLogo!!
        _linuxLogo = phosphorThinIcon(
            name = "LinuxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.490 211.120 C 224.768 212.493 222.261 212.216 220.880 210.500 C 219.540 208.820 188.000 168.480 188.000 88.000 C 188.000 54.863 161.137 28.000 128.000 28.000 C 94.863 28.000 68.000 54.863 68.000 88.000 C 68.000 168.480 36.470 208.820 35.120 210.500 C 33.739 212.226 31.221 212.506 29.495 211.125 C 27.769 209.744 27.489 207.226 28.870 205.500 C 29.180 205.110 60.000 165.450 60.000 88.000 C 60.000 50.445 90.445 20.000 128.000 20.000 C 165.555 20.000 196.000 50.445 196.000 88.000 C 196.000 128.480 204.470 158.270 211.570 176.140 C 219.260 195.490 227.050 205.410 227.130 205.500 C 228.505 207.229 228.218 209.745 226.490 211.120 ZM 100.000 92.000 C 95.582 92.000 92.000 95.582 92.000 100.000 C 92.000 104.418 95.582 108.000 100.000 108.000 C 104.418 108.000 108.000 104.418 108.000 100.000 C 108.000 95.582 104.418 92.000 100.000 92.000 ZM 164.000 100.000 C 164.000 95.582 160.418 92.000 156.000 92.000 C 151.582 92.000 148.000 95.582 148.000 100.000 C 148.000 104.418 151.582 108.000 156.000 108.000 C 160.418 108.000 164.000 104.418 164.000 100.000 ZM 97.790 132.420 C 95.813 131.431 93.409 132.233 92.420 134.210 C 91.431 136.187 92.233 138.591 94.210 139.580 L 126.210 155.580 C 127.337 156.144 128.663 156.144 129.790 155.580 L 161.790 139.580 C 163.767 138.591 164.569 136.187 163.580 134.210 C 162.591 132.233 160.187 131.431 158.210 132.420 L 128.000 147.530 ZM 128.000 180.000 C 109.853 180.156 93.212 190.124 84.510 206.050 C 83.436 207.983 84.132 210.421 86.065 211.495 C 87.998 212.569 90.436 211.873 91.510 209.940 C 98.687 196.444 112.725 188.010 128.010 188.010 C 143.295 188.010 157.333 196.444 164.510 209.940 C 165.214 211.209 166.549 211.997 168.000 212.000 C 168.680 212.000 169.348 211.825 169.940 211.490 C 171.870 210.416 172.564 207.980 171.490 206.050 C 162.785 190.127 146.146 180.161 128.000 180.000 Z"),
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
