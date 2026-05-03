package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorBoldIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.780 156.530 L 231.780 60.530 C 230.030 46.518 218.121 36.002 204.000 36.000 L 32.000 36.000 C 20.954 36.000 12.000 44.954 12.000 56.000 L 12.000 144.000 C 12.000 155.046 20.954 164.000 32.000 164.000 L 72.580 164.000 L 109.270 237.370 C 111.303 241.433 115.457 243.999 120.000 244.000 C 144.289 243.972 163.972 224.289 164.000 200.000 L 164.000 188.000 L 216.000 188.000 C 224.030 187.999 231.673 184.550 236.987 178.530 C 242.301 172.510 244.775 164.498 243.780 156.530 ZM 68.000 140.000 L 36.000 140.000 L 36.000 60.000 L 68.000 60.000 ZM 219.000 162.650 C 218.240 163.509 217.147 164.001 216.000 164.000 L 152.000 164.000 C 145.373 164.000 140.000 169.373 140.000 176.000 L 140.000 200.000 C 139.999 208.415 134.731 215.930 126.820 218.800 L 92.000 149.170 L 92.000 60.000 L 204.000 60.000 C 206.028 59.984 207.747 61.488 208.000 63.500 L 220.000 159.500 C 220.136 160.645 219.772 161.793 219.000 162.650 Z"),
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
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
