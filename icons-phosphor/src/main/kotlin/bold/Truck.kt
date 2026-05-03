package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = phosphorBoldIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 255.140 115.540 L 241.140 80.540 C 238.119 72.943 230.756 67.968 222.580 68.000 L 196.000 68.000 L 196.000 64.000 C 196.000 57.373 190.627 52.000 184.000 52.000 L 32.000 52.000 C 20.954 52.000 12.000 60.954 12.000 72.000 L 12.000 184.000 C 12.000 195.046 20.954 204.000 32.000 204.000 L 46.060 204.000 C 51.146 218.382 64.745 227.997 80.000 227.997 C 95.255 227.997 108.854 218.382 113.940 204.000 L 158.060 204.000 C 163.146 218.382 176.745 227.997 192.000 227.997 C 207.255 227.997 220.854 218.382 225.940 204.000 L 236.000 204.000 C 247.046 204.000 256.000 195.046 256.000 184.000 L 256.000 120.000 C 255.870 118.487 255.582 116.992 255.140 115.540 ZM 196.000 92.000 L 219.880 92.000 L 226.280 108.000 L 196.000 108.000 ZM 80.000 204.000 C 73.373 204.000 68.000 198.627 68.000 192.000 C 68.000 185.373 73.373 180.000 80.000 180.000 C 86.627 180.000 92.000 185.373 92.000 192.000 C 92.000 198.627 86.627 204.000 80.000 204.000 ZM 172.000 162.080 C 165.558 166.410 160.672 172.691 158.060 180.000 L 113.940 180.000 C 108.854 165.618 95.255 156.003 80.000 156.003 C 64.745 156.003 51.146 165.618 46.060 180.000 L 36.000 180.000 L 36.000 140.000 L 172.000 140.000 ZM 172.000 116.000 L 36.000 116.000 L 36.000 76.000 L 172.000 76.000 ZM 192.000 204.000 C 185.373 204.000 180.000 198.627 180.000 192.000 C 180.000 185.373 185.373 180.000 192.000 180.000 C 198.627 180.000 204.000 185.373 204.000 192.000 C 204.000 198.627 198.627 204.000 192.000 204.000 ZM 232.000 180.000 L 225.940 180.000 C 221.321 167.008 209.701 157.783 196.000 156.230 L 196.000 132.000 L 232.000 132.000 Z"),
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
        return _truck!!
    }

private var _truck: ImageVector? = null
