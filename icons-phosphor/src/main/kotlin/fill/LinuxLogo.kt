package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) return _linuxLogo!!
        _linuxLogo = phosphorFillIcon(
            name = "LinuxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 161.220 209.740 C 162.060 210.966 162.150 212.556 161.456 213.870 C 160.761 215.183 159.396 216.004 157.910 216.000 L 98.100 216.000 C 96.614 216.004 95.249 215.183 94.554 213.870 C 93.860 212.556 93.950 210.966 94.790 209.740 C 102.218 198.670 114.674 192.028 128.005 192.028 C 141.336 192.028 153.792 198.670 161.220 209.740 ZM 230.150 213.110 C 228.543 214.982 226.187 216.041 223.720 216.000 L 184.560 216.000 C 182.873 215.998 181.369 214.938 180.800 213.350 C 172.887 190.979 151.734 176.023 128.005 176.023 C 104.276 176.023 83.123 190.979 75.210 213.350 C 74.641 214.938 73.137 215.998 71.450 216.000 L 32.230 216.000 C 29.758 216.041 27.399 214.965 25.810 213.070 C 23.415 210.149 23.390 205.950 25.750 203.000 C 25.810 202.930 33.390 193.220 40.870 174.280 C 47.770 156.800 56.000 127.640 56.000 88.000 C 56.000 48.235 88.235 16.000 128.000 16.000 C 167.764 16.000 200.000 48.235 200.000 88.000 C 200.000 127.640 208.230 156.800 215.130 174.280 C 222.610 193.220 230.190 202.930 230.260 203.020 C 232.617 205.985 232.571 210.197 230.150 213.110 ZM 88.000 100.000 C 88.000 106.627 93.373 112.000 100.000 112.000 C 106.627 112.000 112.000 106.627 112.000 100.000 C 112.000 93.373 106.627 88.000 100.000 88.000 C 93.373 88.000 88.000 93.373 88.000 100.000 ZM 167.160 132.420 C 165.185 128.469 160.382 126.867 156.430 128.840 L 128.000 143.060 L 99.580 128.840 C 95.626 126.866 90.819 128.471 88.845 132.425 C 86.871 136.379 88.476 141.186 92.430 143.160 L 124.430 159.160 C 126.681 160.284 129.329 160.284 131.580 159.160 L 163.580 143.160 C 165.480 142.212 166.925 140.547 167.596 138.532 C 168.268 136.518 168.111 134.319 167.160 132.420 ZM 168.000 100.000 C 168.000 93.373 162.627 88.000 156.000 88.000 C 149.373 88.000 144.000 93.373 144.000 100.000 C 144.000 106.627 149.373 112.000 156.000 112.000 C 162.627 112.000 168.000 106.627 168.000 100.000 Z"),
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
