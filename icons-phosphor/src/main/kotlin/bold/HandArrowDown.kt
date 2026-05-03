package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandArrowDown: ImageVector
    get() {
        if (_handArrowDown != null) return _handArrowDown!!
        _handArrowDown = phosphorBoldIcon(
            name = "HandArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.760 137.880 C 225.755 132.514 216.652 130.710 208.130 133.000 L 172.000 141.260 C 172.000 140.840 172.000 140.420 172.000 140.000 C 172.000 122.327 157.673 108.000 140.000 108.000 L 89.940 108.000 C 80.390 107.974 71.226 111.769 64.490 118.540 L 43.000 140.000 L 20.000 140.000 C 8.954 140.000 0.000 148.954 0.000 160.000 L 0.000 200.000 C 0.000 211.046 8.954 220.000 20.000 220.000 L 120.000 220.000 C 120.981 220.001 121.959 219.880 122.910 219.640 L 186.910 203.640 C 187.522 203.490 188.121 203.289 188.700 203.040 L 227.520 186.500 C 227.750 186.410 227.970 186.310 228.190 186.200 C 237.016 181.785 242.943 173.132 243.872 163.307 C 244.802 153.482 240.602 143.872 232.760 137.880 ZM 24.000 164.000 L 36.000 164.000 L 36.000 196.000 L 24.000 196.000 ZM 217.680 164.610 L 180.170 180.610 L 118.520 196.000 L 60.000 196.000 L 60.000 157.000 L 81.460 135.540 C 83.701 133.275 86.754 132.000 89.940 132.000 L 140.000 132.000 C 144.418 132.000 148.000 135.582 148.000 140.000 C 148.000 144.418 144.418 148.000 140.000 148.000 L 112.000 148.000 C 105.373 148.000 100.000 153.373 100.000 160.000 C 100.000 166.627 105.373 172.000 112.000 172.000 L 144.000 172.000 C 144.905 172.000 145.807 171.900 146.690 171.700 L 213.690 156.290 L 214.160 156.170 C 215.544 155.793 217.025 156.083 218.166 156.953 C 219.307 157.823 219.977 159.175 219.980 160.610 C 219.990 162.260 219.111 163.788 217.680 164.610 ZM 151.510 80.490 C 146.816 75.796 146.816 68.184 151.510 63.490 C 156.204 58.796 163.816 58.796 168.510 63.490 L 180.000 75.000 L 180.000 24.000 C 180.000 17.373 185.373 12.000 192.000 12.000 C 198.627 12.000 204.000 17.373 204.000 24.000 L 204.000 75.000 L 215.510 63.480 C 220.204 58.786 227.816 58.786 232.510 63.480 C 237.204 68.174 237.204 75.786 232.510 80.480 L 200.510 112.480 C 198.258 114.739 195.200 116.009 192.010 116.009 C 188.820 116.009 185.762 114.739 183.510 112.480 Z"),
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
        return _handArrowDown!!
    }

private var _handArrowDown: ImageVector? = null
