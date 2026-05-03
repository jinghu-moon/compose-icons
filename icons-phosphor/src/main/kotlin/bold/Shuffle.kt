package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shuffle: ImageVector
    get() {
        if (_shuffle != null) return _shuffle!!
        _shuffle = phosphorBoldIcon(
            name = "Shuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.490 175.510 C 242.749 177.762 244.019 180.820 244.019 184.010 C 244.019 187.200 242.749 190.258 240.490 192.510 L 216.490 216.510 C 211.796 221.204 204.184 221.204 199.490 216.510 C 194.796 211.816 194.796 204.204 199.490 199.510 L 203.000 196.000 L 200.910 196.000 C 176.370 195.973 153.345 184.124 139.060 164.170 L 97.380 105.780 C 87.608 92.124 71.852 84.016 55.060 84.000 L 32.000 84.000 C 25.373 84.000 20.000 78.627 20.000 72.000 C 20.000 65.373 25.373 60.000 32.000 60.000 L 55.060 60.000 C 79.600 60.027 102.625 71.876 116.910 91.830 L 158.620 150.220 C 168.392 163.876 184.148 171.984 200.940 172.000 L 203.000 172.000 L 199.480 168.490 C 194.786 163.796 194.786 156.184 199.480 151.490 C 204.174 146.796 211.786 146.796 216.480 151.490 ZM 144.870 102.890 C 149.858 107.252 157.436 106.746 161.800 101.760 C 171.675 90.473 185.943 83.999 200.940 84.000 L 203.000 84.000 L 199.480 87.510 C 194.786 92.204 194.786 99.816 199.480 104.510 C 204.174 109.204 211.786 109.204 216.480 104.510 L 240.480 80.510 C 242.739 78.258 244.009 75.200 244.009 72.010 C 244.009 68.820 242.739 65.762 240.480 63.510 L 216.480 39.510 C 211.786 34.816 204.174 34.816 199.480 39.510 C 194.786 44.204 194.786 51.816 199.480 56.510 L 203.000 60.000 L 200.910 60.000 C 178.986 60.010 158.134 69.489 143.710 86.000 C 139.383 90.990 139.901 98.539 144.870 102.890 ZM 111.130 153.110 C 106.142 148.748 98.564 149.254 94.200 154.240 C 84.325 165.527 70.057 172.001 55.060 172.000 L 32.000 172.000 C 25.373 172.000 20.000 177.373 20.000 184.000 C 20.000 190.627 25.373 196.000 32.000 196.000 L 55.060 196.000 C 76.984 195.990 97.836 186.511 112.260 170.000 C 116.595 165.018 116.090 157.470 111.130 153.110 Z"),
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
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
