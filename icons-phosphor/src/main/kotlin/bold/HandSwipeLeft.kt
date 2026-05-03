package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandSwipeLeft: ImageVector
    get() {
        if (_handSwipeLeft != null) return _handSwipeLeft!!
        _handSwipeLeft = phosphorBoldIcon(
            name = "HandSwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 256.000 56.000 C 256.000 62.627 250.627 68.000 244.000 68.000 L 201.000 68.000 L 212.510 79.510 C 217.204 84.204 217.204 91.816 212.510 96.510 C 207.816 101.204 200.204 101.204 195.510 96.510 L 163.510 64.510 C 161.251 62.258 159.981 59.200 159.981 56.010 C 159.981 52.820 161.251 49.762 163.510 47.510 L 195.510 15.510 C 200.204 10.816 207.816 10.816 212.510 15.510 C 217.204 20.204 217.204 27.816 212.510 32.510 L 201.000 44.000 L 244.000 44.000 C 250.627 44.000 256.000 49.373 256.000 56.000 ZM 188.000 116.000 C 184.170 115.987 180.369 116.664 176.780 118.000 C 170.126 104.305 154.743 97.195 140.000 101.000 L 140.000 76.000 C 140.000 58.327 125.673 44.000 108.000 44.000 C 90.327 44.000 76.000 58.327 76.000 76.000 L 76.000 142.830 C 65.131 130.473 46.661 128.375 33.297 137.979 C 19.933 147.584 16.033 165.758 24.280 180.000 L 24.400 180.200 L 49.710 222.200 C 53.134 227.877 60.513 229.704 66.190 226.280 C 71.867 222.856 73.694 215.477 70.270 209.800 L 45.000 167.920 C 42.813 164.076 44.156 159.187 48.000 157.000 C 51.844 154.813 56.733 156.156 58.920 160.000 L 59.130 160.340 L 77.810 190.340 C 80.640 194.890 86.144 197.013 91.297 195.541 C 96.449 194.069 100.001 189.359 100.000 184.000 L 100.000 76.000 C 100.000 71.582 103.582 68.000 108.000 68.000 C 112.418 68.000 116.000 71.582 116.000 76.000 L 116.000 144.000 C 116.000 150.627 121.373 156.000 128.000 156.000 C 134.627 156.000 140.000 150.627 140.000 144.000 L 140.000 132.000 C 140.000 127.582 143.582 124.000 148.000 124.000 C 152.418 124.000 156.000 127.582 156.000 132.000 L 156.000 152.000 C 156.000 158.627 161.373 164.000 168.000 164.000 C 174.627 164.000 180.000 158.627 180.000 152.000 L 180.000 148.000 C 180.000 143.582 183.582 140.000 188.000 140.000 C 192.418 140.000 196.000 143.582 196.000 148.000 L 196.000 184.000 C 196.000 195.080 194.720 205.670 192.580 212.320 C 191.181 216.424 192.104 220.963 194.994 224.194 C 197.885 227.425 202.294 228.846 206.527 227.910 C 210.761 226.975 214.160 223.829 215.420 219.680 C 218.420 210.520 220.000 197.850 220.000 184.000 L 220.000 148.000 C 220.000 130.327 205.673 116.000 188.000 116.000 Z"),
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
        return _handSwipeLeft!!
    }

private var _handSwipeLeft: ImageVector? = null
