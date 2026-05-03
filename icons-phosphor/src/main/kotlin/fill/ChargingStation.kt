package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) return _chargingStation!!
        _chargingStation = phosphorFillIcon(
            name = "ChargingStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 241.000 69.660 L 221.660 50.340 C 218.534 47.214 213.466 47.214 210.340 50.340 C 207.214 53.466 207.214 58.534 210.340 61.660 L 229.660 81.000 C 231.153 82.494 231.994 84.518 232.000 86.630 L 232.000 168.000 C 232.000 172.418 228.418 176.000 224.000 176.000 C 219.582 176.000 216.000 172.418 216.000 168.000 L 216.000 128.000 C 216.000 114.745 205.255 104.000 192.000 104.000 L 176.000 104.000 L 176.000 56.000 C 176.000 42.745 165.255 32.000 152.000 32.000 L 72.000 32.000 C 58.745 32.000 48.000 42.745 48.000 56.000 L 48.000 208.000 L 32.000 208.000 C 27.582 208.000 24.000 211.582 24.000 216.000 C 24.000 220.418 27.582 224.000 32.000 224.000 L 192.000 224.000 C 196.418 224.000 200.000 220.418 200.000 216.000 C 200.000 211.582 196.418 208.000 192.000 208.000 L 176.000 208.000 L 176.000 120.000 L 192.000 120.000 C 196.418 120.000 200.000 123.582 200.000 128.000 L 200.000 168.000 C 200.000 181.255 210.745 192.000 224.000 192.000 C 237.255 192.000 248.000 181.255 248.000 168.000 L 248.000 86.630 C 248.024 80.266 245.504 74.156 241.000 69.660 ZM 135.430 131.000 L 119.430 171.000 C 117.773 175.103 113.103 177.087 109.000 175.430 C 104.897 173.773 102.913 169.103 104.570 165.000 L 116.180 136.000 L 96.000 136.000 C 93.337 136.005 90.847 134.684 89.357 132.478 C 87.866 130.271 87.572 127.468 88.570 125.000 L 104.570 85.000 C 106.227 80.897 110.897 78.913 115.000 80.570 C 119.103 82.227 121.087 86.897 119.430 91.000 L 107.820 120.000 L 128.000 120.000 C 130.663 119.995 133.153 121.316 134.643 123.522 C 136.134 125.729 136.428 128.532 135.430 131.000 Z"),
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
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
