package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorBoldIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 252.000 120.000 C 251.967 91.295 228.705 68.033 200.000 68.000 L 160.320 68.000 C 156.880 67.790 107.720 64.000 60.860 24.700 C 54.909 19.704 46.602 18.606 39.558 21.886 C 32.514 25.166 28.007 32.230 28.000 40.000 L 28.000 200.000 C 27.951 207.783 32.466 214.873 39.540 218.120 C 46.583 221.445 54.919 220.346 60.860 215.310 C 84.845 195.147 113.381 181.129 144.000 174.470 L 144.000 200.670 C 143.999 207.356 147.339 213.600 152.900 217.310 C 153.344 217.609 153.808 217.876 154.290 218.110 L 168.730 225.170 C 174.142 228.410 180.764 228.907 186.599 226.511 C 192.434 224.115 196.796 219.108 198.370 213.000 L 209.460 171.180 C 234.115 166.590 251.995 145.078 252.000 120.000 ZM 52.000 191.630 L 52.000 48.400 C 88.170 76.470 124.170 86.500 144.000 90.060 L 144.000 150.000 C 124.170 153.520 88.170 163.550 52.000 191.630 ZM 176.390 202.200 L 168.000 198.100 L 168.000 172.000 L 184.400 172.000 ZM 200.000 148.000 L 168.000 148.000 L 168.000 92.000 L 200.000 92.000 C 215.464 92.000 228.000 104.536 228.000 120.000 C 228.000 135.464 215.464 148.000 200.000 148.000 Z"),
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
