package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) return _chatsCircle!!
        _chatsCircle = phosphorRegularIcon(
            name = "ChatsCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.070 186.760 C 243.285 163.498 242.582 136.254 230.182 113.602 C 217.781 90.950 195.209 75.677 169.570 72.590 C 158.125 45.979 133.188 27.634 104.376 24.630 C 75.564 21.625 47.380 34.431 30.690 58.108 C 14.001 81.785 11.415 112.635 23.930 138.760 L 16.660 163.470 C 15.004 169.089 16.552 175.164 20.694 179.306 C 24.836 183.448 30.911 184.996 36.530 183.340 L 61.240 176.070 C 69.174 179.882 77.681 182.365 86.420 183.420 C 95.000 203.523 111.431 219.240 131.895 226.918 C 152.359 234.596 175.074 233.567 194.760 224.070 L 219.470 231.340 C 225.087 232.994 231.159 231.447 235.300 227.308 C 239.441 223.169 240.991 217.098 239.340 211.480 ZM 62.000 159.500 C 61.236 159.502 60.475 159.610 59.740 159.820 L 32.000 168.000 L 40.170 140.240 C 40.751 138.234 40.525 136.081 39.540 134.240 C 24.582 106.267 32.372 71.558 57.849 52.659 C 83.327 33.761 118.803 36.377 141.233 58.807 C 163.663 81.237 166.279 116.713 147.381 142.191 C 128.482 167.668 93.773 175.458 65.800 160.500 C 64.636 159.856 63.330 159.512 62.000 159.500 ZM 215.790 188.230 L 224.000 216.000 L 196.240 207.830 C 194.234 207.249 192.081 207.475 190.240 208.460 C 159.605 224.818 121.515 213.782 104.370 183.580 C 126.514 181.269 146.691 169.826 160.040 152.008 C 173.390 134.190 178.703 111.611 174.700 89.710 C 194.043 94.270 210.171 107.556 218.348 125.669 C 226.525 143.782 225.824 164.666 216.450 182.190 C 215.454 184.042 215.228 186.212 215.820 188.230 Z"),
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
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
