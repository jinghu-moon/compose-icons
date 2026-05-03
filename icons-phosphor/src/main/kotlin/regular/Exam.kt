package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Exam: ImageVector
    get() {
        if (_exam != null) return _exam!!
        _exam = phosphorRegularIcon(
            name = "Exam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 216.000 C 23.998 218.774 25.433 221.351 27.793 222.810 C 30.152 224.269 33.099 224.401 35.580 223.160 L 64.000 208.940 L 92.420 223.160 C 94.673 224.288 97.327 224.288 99.580 223.160 L 128.000 208.940 L 156.420 223.160 C 158.673 224.288 161.327 224.288 163.580 223.160 L 192.000 208.940 L 220.420 223.160 C 222.901 224.401 225.848 224.269 228.207 222.810 C 230.567 221.351 232.002 218.774 232.000 216.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 216.000 203.060 L 195.580 192.840 C 193.327 191.712 190.673 191.712 188.420 192.840 L 160.000 207.060 L 131.580 192.840 C 129.327 191.712 126.673 191.712 124.420 192.840 L 96.000 207.060 L 67.580 192.840 C 65.327 191.712 62.673 191.712 60.420 192.840 L 40.000 203.060 L 40.000 56.000 L 216.000 56.000 ZM 60.420 167.160 C 62.319 168.111 64.518 168.268 66.532 167.596 C 68.547 166.925 70.212 165.480 71.160 163.580 L 76.940 152.000 L 115.060 152.000 L 120.840 163.580 C 122.817 167.534 127.626 169.137 131.580 167.160 C 135.534 165.183 137.137 160.374 135.160 156.420 L 103.160 92.420 C 101.807 89.705 99.034 87.989 96.000 87.989 C 92.966 87.989 90.193 89.705 88.840 92.420 L 56.840 156.420 C 55.889 158.319 55.732 160.518 56.404 162.532 C 57.075 164.547 58.520 166.212 60.420 167.160 ZM 96.000 113.890 L 107.060 136.000 L 84.940 136.000 ZM 136.000 128.000 C 136.000 123.582 139.582 120.000 144.000 120.000 L 160.000 120.000 L 160.000 104.000 C 160.000 99.582 163.582 96.000 168.000 96.000 C 172.418 96.000 176.000 99.582 176.000 104.000 L 176.000 120.000 L 192.000 120.000 C 196.418 120.000 200.000 123.582 200.000 128.000 C 200.000 132.418 196.418 136.000 192.000 136.000 L 176.000 136.000 L 176.000 152.000 C 176.000 156.418 172.418 160.000 168.000 160.000 C 163.582 160.000 160.000 156.418 160.000 152.000 L 160.000 136.000 L 144.000 136.000 C 139.582 136.000 136.000 132.418 136.000 128.000 Z"),
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
        return _exam!!
    }

private var _exam: ImageVector? = null
