package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) return _virtualReality!!
        _virtualReality = phosphorBoldIcon(
            name = "VirtualReality",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 127.000 104.730 L 103.000 160.730 C 101.109 165.143 96.771 168.004 91.970 168.004 C 87.169 168.004 82.831 165.143 80.940 160.730 L 56.940 104.730 C 54.328 98.638 57.148 91.582 63.240 88.970 C 69.332 86.358 76.388 89.178 79.000 95.270 L 92.000 125.540 L 105.000 95.270 C 107.874 89.641 114.622 87.207 120.428 89.703 C 126.234 92.200 129.108 98.772 127.000 104.730 ZM 256.000 128.000 C 255.950 174.371 218.371 211.950 172.000 212.000 L 84.000 212.000 C 37.608 212.000 0.000 174.392 0.000 128.000 C -0.000 81.608 37.608 44.000 84.000 44.000 L 172.000 44.000 C 218.371 44.050 255.950 81.629 256.000 128.000 ZM 232.000 128.000 C 231.961 94.879 205.121 68.039 172.000 68.000 L 84.000 68.000 C 50.863 68.000 24.000 94.863 24.000 128.000 C 24.000 161.137 50.863 188.000 84.000 188.000 L 172.000 188.000 C 205.121 187.961 231.961 161.121 232.000 128.000 ZM 200.000 120.000 C 200.005 127.748 197.186 135.231 192.070 141.050 L 197.760 149.050 C 200.383 152.532 200.912 157.162 199.142 161.146 C 197.371 165.129 193.579 167.839 189.236 168.225 C 184.894 168.610 180.684 166.610 178.240 163.000 L 170.330 151.940 C 169.560 151.990 168.780 152.030 168.000 152.030 L 160.000 152.030 L 160.000 156.030 C 160.000 162.657 154.627 168.030 148.000 168.030 C 141.373 168.030 136.000 162.657 136.000 156.030 L 136.000 100.000 C 136.000 93.373 141.373 88.000 148.000 88.000 L 168.000 88.000 C 185.673 88.000 200.000 102.327 200.000 120.000 ZM 160.000 128.000 L 168.000 128.000 C 172.418 128.000 176.000 124.418 176.000 120.000 C 176.000 115.582 172.418 112.000 168.000 112.000 L 160.000 112.000 Z"),
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
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
