package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) return _chatsCircle!!
        _chatsCircle = phosphorThinIcon(
            name = "ChatsCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.790 186.390 C 239.193 163.905 238.702 137.228 226.482 115.177 C 214.261 93.126 191.901 78.570 166.790 76.320 C 156.519 50.305 132.788 32.034 105.011 28.754 C 77.234 25.475 49.901 37.717 33.854 60.626 C 17.806 83.534 15.638 113.405 28.210 138.390 L 20.500 164.600 C 19.260 168.813 20.421 173.368 23.526 176.474 C 26.632 179.579 31.187 180.740 35.400 179.500 L 61.610 171.790 C 70.224 176.154 79.591 178.836 89.210 179.690 C 97.015 199.656 112.889 215.396 132.919 223.033 C 152.950 230.670 175.274 229.492 194.390 219.790 L 220.600 227.500 C 224.813 228.740 229.368 227.579 232.474 224.474 C 235.579 221.368 236.740 216.813 235.500 212.600 ZM 60.900 163.660 L 33.140 171.830 C 31.724 172.266 30.182 171.883 29.134 170.836 C 28.087 169.788 27.704 168.246 28.140 166.830 L 36.310 139.070 C 36.595 138.067 36.484 136.993 36.000 136.070 C 20.122 106.344 28.412 69.474 55.485 49.404 C 82.558 29.335 120.246 32.123 144.072 55.957 C 167.897 79.791 170.671 117.481 150.593 144.546 C 130.514 171.612 93.640 179.889 63.920 164.000 C 62.995 163.500 61.913 163.378 60.900 163.660 ZM 226.820 218.820 C 225.774 219.868 224.236 220.252 222.820 219.820 L 195.060 211.650 C 194.057 211.365 192.983 211.476 192.060 211.960 C 175.461 220.845 155.921 222.449 138.094 216.392 C 120.268 210.335 105.750 197.158 98.000 180.000 C 121.201 179.387 142.850 168.206 156.781 149.643 C 170.711 131.079 175.396 107.168 169.500 84.720 C 191.485 87.817 210.573 101.453 220.633 121.245 C 230.693 141.037 230.456 164.494 220.000 184.080 C 219.516 185.003 219.405 186.077 219.690 187.080 L 227.860 214.840 C 228.274 216.257 227.875 217.787 226.820 218.820 Z"),
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
