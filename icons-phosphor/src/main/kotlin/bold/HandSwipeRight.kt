package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandSwipeRight: ImageVector
    get() {
        if (_handSwipeRight != null) return _handSwipeRight!!
        _handSwipeRight = phosphorBoldIcon(
            name = "HandSwipeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 148.000 L 220.000 184.000 C 220.000 197.850 218.370 210.520 215.420 219.680 C 213.306 225.878 206.614 229.237 200.382 227.228 C 194.149 225.220 190.677 218.586 192.580 212.320 C 194.720 205.670 196.000 195.080 196.000 184.000 L 196.000 148.000 C 196.000 143.582 192.418 140.000 188.000 140.000 C 183.582 140.000 180.000 143.582 180.000 148.000 L 180.000 152.000 C 180.000 158.627 174.627 164.000 168.000 164.000 C 161.373 164.000 156.000 158.627 156.000 152.000 L 156.000 132.000 C 156.000 127.582 152.418 124.000 148.000 124.000 C 143.582 124.000 140.000 127.582 140.000 132.000 L 140.000 144.000 C 140.000 150.627 134.627 156.000 128.000 156.000 C 121.373 156.000 116.000 150.627 116.000 144.000 L 116.000 76.000 C 116.000 71.582 112.418 68.000 108.000 68.000 C 103.582 68.000 100.000 71.582 100.000 76.000 L 100.000 184.000 C 99.994 189.352 96.444 194.053 91.298 195.524 C 86.152 196.995 80.654 194.880 77.820 190.340 L 59.140 160.340 L 58.930 160.000 C 56.743 156.153 51.852 154.808 48.005 156.995 C 44.158 159.182 42.813 164.073 45.000 167.920 L 70.270 209.800 C 73.691 215.477 71.862 222.854 66.185 226.275 C 60.508 229.696 53.131 227.867 49.710 222.190 L 24.400 180.190 L 24.280 179.990 C 16.054 165.749 19.962 147.592 33.317 137.996 C 46.673 128.400 65.128 130.490 76.000 142.830 L 76.000 76.000 C 76.000 58.327 90.327 44.000 108.000 44.000 C 125.673 44.000 140.000 58.327 140.000 76.000 L 140.000 101.000 C 154.743 97.195 170.126 104.305 176.780 118.000 C 186.611 114.319 197.623 115.695 206.247 121.681 C 214.871 127.667 220.010 137.502 220.000 148.000 ZM 252.480 47.510 L 220.480 15.510 C 215.786 10.816 208.174 10.816 203.480 15.510 C 198.786 20.204 198.786 27.816 203.480 32.510 L 215.000 44.000 L 172.000 44.000 C 165.373 44.000 160.000 49.373 160.000 56.000 C 160.000 62.627 165.373 68.000 172.000 68.000 L 215.000 68.000 L 203.510 79.510 C 198.816 84.204 198.816 91.816 203.510 96.510 C 208.204 101.204 215.816 101.204 220.510 96.510 L 252.510 64.510 C 254.765 62.254 256.030 59.194 256.024 56.004 C 256.019 52.814 254.743 49.758 252.480 47.510 Z"),
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
        return _handSwipeRight!!
    }

private var _handSwipeRight: ImageVector? = null
