package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Exam: ImageVector
    get() {
        if (_exam != null) return _exam!!
        _exam = phosphorFillIcon(
            name = "Exam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 96.000 113.890 L 107.060 136.000 L 84.940 136.000 ZM 232.000 56.000 L 232.000 216.000 C 232.002 218.774 230.567 221.351 228.207 222.810 C 225.848 224.269 222.901 224.401 220.420 223.160 L 192.000 208.940 L 163.580 223.160 C 161.327 224.288 158.673 224.288 156.420 223.160 L 128.000 208.940 L 99.580 223.160 C 97.327 224.288 94.673 224.288 92.420 223.160 L 64.000 208.940 L 35.580 223.160 C 33.099 224.401 30.152 224.269 27.793 222.810 C 25.433 221.351 23.998 218.774 24.000 216.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 135.160 156.420 L 103.160 92.420 C 101.807 89.705 99.034 87.989 96.000 87.989 C 92.966 87.989 90.193 89.705 88.840 92.420 L 56.840 156.420 C 54.863 160.374 56.466 165.183 60.420 167.160 C 64.374 169.137 69.183 167.534 71.160 163.580 L 76.940 152.000 L 115.060 152.000 L 120.840 163.580 C 122.817 167.534 127.626 169.137 131.580 167.160 C 135.534 165.183 137.137 160.374 135.160 156.420 ZM 208.000 128.000 C 208.000 123.582 204.418 120.000 200.000 120.000 L 184.000 120.000 L 184.000 104.000 C 184.000 99.582 180.418 96.000 176.000 96.000 C 171.582 96.000 168.000 99.582 168.000 104.000 L 168.000 120.000 L 152.000 120.000 C 147.582 120.000 144.000 123.582 144.000 128.000 C 144.000 132.418 147.582 136.000 152.000 136.000 L 168.000 136.000 L 168.000 152.000 C 168.000 156.418 171.582 160.000 176.000 160.000 C 180.418 160.000 184.000 156.418 184.000 152.000 L 184.000 136.000 L 200.000 136.000 C 204.418 136.000 208.000 132.418 208.000 128.000 Z"),
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
        return _exam!!
    }

private var _exam: ImageVector? = null
