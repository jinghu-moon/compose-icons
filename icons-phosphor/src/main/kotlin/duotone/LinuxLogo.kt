package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) return _linuxLogo!!
        _linuxLogo = phosphorDuotoneIcon(
            name = "LinuxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 208.000 L 168.000 208.000 C 160.000 193.650 145.090 184.000 128.000 184.000 C 110.910 184.000 96.000 193.650 88.000 208.000 L 32.000 208.000 C 32.000 208.000 64.000 168.000 64.000 88.000 C 64.000 52.654 92.654 24.000 128.000 24.000 C 163.346 24.000 192.000 52.654 192.000 88.000 C 192.000 168.000 224.000 208.000 224.000 208.000 Z"),
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
                pathData = parseSvgPathData("M 229.000 214.250 C 225.550 217.007 220.520 216.447 217.760 213.000 C 216.390 211.270 184.000 169.860 184.000 88.000 C 184.000 57.072 158.928 32.000 128.000 32.000 C 97.072 32.000 72.000 57.072 72.000 88.000 C 72.000 169.860 39.630 211.270 38.250 213.000 C 35.489 216.455 30.450 217.016 26.995 214.255 C 23.540 211.494 22.979 206.455 25.740 203.000 C 25.890 202.800 33.430 193.100 40.870 174.260 C 47.770 156.800 56.000 127.640 56.000 88.000 C 56.000 48.235 88.235 16.000 128.000 16.000 C 167.764 16.000 200.000 48.235 200.000 88.000 C 200.000 127.640 208.230 156.800 215.130 174.280 C 222.610 193.220 230.190 202.920 230.270 203.020 C 233.015 206.473 232.447 211.497 229.000 214.250 ZM 100.000 88.000 C 93.373 88.000 88.000 93.373 88.000 100.000 C 88.000 106.627 93.373 112.000 100.000 112.000 C 106.627 112.000 112.000 106.627 112.000 100.000 C 112.000 93.373 106.627 88.000 100.000 88.000 ZM 168.000 100.000 C 168.000 93.373 162.627 88.000 156.000 88.000 C 149.373 88.000 144.000 93.373 144.000 100.000 C 144.000 106.627 149.373 112.000 156.000 112.000 C 162.627 112.000 168.000 106.627 168.000 100.000 ZM 99.580 128.840 C 95.645 126.971 90.938 128.594 88.991 132.490 C 87.044 136.387 88.573 141.126 92.430 143.150 L 124.430 159.150 C 126.678 160.284 129.332 160.284 131.580 159.150 L 163.580 143.150 C 167.532 141.173 169.132 136.367 167.155 132.415 C 165.178 128.463 160.372 126.863 156.420 128.840 L 128.000 143.050 ZM 128.000 176.000 C 108.396 176.156 90.412 186.912 81.000 204.110 C 78.852 207.976 80.244 212.852 84.110 215.000 C 87.976 217.148 92.852 215.756 95.000 211.890 C 101.476 199.673 114.172 192.033 128.000 192.033 C 141.828 192.033 154.524 199.673 161.000 211.890 C 163.148 215.756 168.024 217.148 171.890 215.000 C 175.756 212.852 177.148 207.976 175.000 204.110 C 165.588 186.912 147.604 176.156 128.000 176.000 Z"),
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
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
