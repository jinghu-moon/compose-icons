package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Van: ImageVector
    get() {
        if (_van != null) return _van!!
        _van = phosphorBoldIcon(
            name = "Van",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 253.110 104.180 L 207.540 51.090 C 203.744 46.586 198.151 43.990 192.260 44.000 L 32.000 44.000 C 20.954 44.000 12.000 52.954 12.000 64.000 L 12.000 176.000 C 12.000 187.046 20.954 196.000 32.000 196.000 L 46.060 196.000 C 51.146 210.382 64.745 219.997 80.000 219.997 C 95.255 219.997 108.854 210.382 113.940 196.000 L 154.060 196.000 C 159.146 210.382 172.745 219.997 188.000 219.997 C 203.255 219.997 216.854 210.382 221.940 196.000 L 236.000 196.000 C 247.046 196.000 256.000 187.046 256.000 176.000 L 256.000 112.000 C 255.998 109.132 254.973 106.360 253.110 104.180 ZM 217.890 100.000 L 176.000 100.000 L 176.000 68.000 L 190.420 68.000 ZM 104.000 100.000 L 104.000 68.000 L 152.000 68.000 L 152.000 100.000 ZM 80.000 68.000 L 80.000 100.000 L 36.000 100.000 L 36.000 68.000 ZM 80.000 196.000 C 73.373 196.000 68.000 190.627 68.000 184.000 C 68.000 177.373 73.373 172.000 80.000 172.000 C 86.627 172.000 92.000 177.373 92.000 184.000 C 92.000 190.627 86.627 196.000 80.000 196.000 ZM 188.000 196.000 C 181.373 196.000 176.000 190.627 176.000 184.000 C 176.000 177.373 181.373 172.000 188.000 172.000 C 194.627 172.000 200.000 177.373 200.000 184.000 C 200.000 190.627 194.627 196.000 188.000 196.000 ZM 221.940 172.000 C 216.854 157.618 203.255 148.003 188.000 148.003 C 172.745 148.003 159.146 157.618 154.060 172.000 L 113.940 172.000 C 108.854 157.618 95.255 148.003 80.000 148.003 C 64.745 148.003 51.146 157.618 46.060 172.000 L 36.000 172.000 L 36.000 124.000 L 232.000 124.000 L 232.000 172.000 Z"),
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
        return _van!!
    }

private var _van: ImageVector? = null
