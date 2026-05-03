package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) return _chatsCircle!!
        _chatsCircle = phosphorBoldIcon(
            name = "ChatsCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.340 187.090 C 247.389 163.060 246.475 135.230 233.873 111.977 C 221.272 88.723 198.455 72.763 172.290 68.900 C 152.705 27.104 103.066 8.940 61.130 28.224 C 19.195 47.509 0.676 97.018 19.660 139.090 L 12.820 162.350 C 10.755 169.371 12.690 176.960 17.865 182.135 C 23.040 187.310 30.629 189.245 37.650 187.180 L 60.910 180.340 C 68.139 183.653 75.802 185.923 83.670 187.080 C 103.063 229.221 152.928 247.687 195.090 228.340 L 218.350 235.180 C 225.371 237.245 232.960 235.310 238.135 230.135 C 243.310 224.960 245.245 217.371 243.180 210.350 ZM 62.000 155.500 C 60.852 155.499 59.710 155.664 58.610 155.990 L 37.890 162.080 L 44.000 141.350 C 44.876 138.344 44.542 135.114 43.070 132.350 C 29.008 106.143 36.266 73.590 60.130 55.839 C 83.993 38.089 117.259 40.499 138.314 61.503 C 159.370 82.508 161.861 115.767 144.169 139.674 C 126.477 163.580 93.941 170.918 67.700 156.920 C 65.947 155.982 63.988 155.494 62.000 155.500 ZM 212.890 180.300 C 211.418 183.064 211.084 186.294 211.960 189.300 L 218.050 210.030 L 197.360 204.000 C 194.335 203.107 191.080 203.441 188.300 204.930 C 161.606 219.202 128.462 211.355 111.000 186.630 C 154.248 178.818 184.146 138.967 179.550 95.260 C 196.163 100.983 209.433 113.701 215.856 130.057 C 222.279 146.412 221.210 164.761 212.930 180.260 Z"),
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
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
