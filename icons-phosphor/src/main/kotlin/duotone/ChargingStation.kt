package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) return _chargingStation!!
        _chargingStation = phosphorDuotoneIcon(
            name = "ChargingStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 168.000 56.000 L 168.000 216.000 L 56.000 216.000 L 56.000 56.000 C 56.000 47.163 63.163 40.000 72.000 40.000 L 152.000 40.000 C 160.837 40.000 168.000 47.163 168.000 56.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 134.620 123.510 C 136.112 125.708 136.415 128.503 135.430 130.970 L 119.430 170.970 C 117.781 175.073 113.118 177.064 109.015 175.415 C 104.912 173.766 102.921 169.103 104.570 165.000 L 116.180 136.000 L 96.000 136.000 C 93.337 136.005 90.847 134.684 89.357 132.478 C 87.866 130.271 87.572 127.468 88.570 125.000 L 104.570 85.000 C 106.227 80.897 110.897 78.913 115.000 80.570 C 119.103 82.227 121.087 86.897 119.430 91.000 L 107.820 120.000 L 128.000 120.000 C 130.652 120.000 133.132 121.315 134.620 123.510 ZM 248.000 86.630 L 248.000 168.000 C 248.000 181.255 237.255 192.000 224.000 192.000 C 210.745 192.000 200.000 181.255 200.000 168.000 L 200.000 128.000 C 200.000 123.582 196.418 120.000 192.000 120.000 L 176.000 120.000 L 176.000 208.000 L 192.000 208.000 C 196.418 208.000 200.000 211.582 200.000 216.000 C 200.000 220.418 196.418 224.000 192.000 224.000 L 32.000 224.000 C 27.582 224.000 24.000 220.418 24.000 216.000 C 24.000 211.582 27.582 208.000 32.000 208.000 L 48.000 208.000 L 48.000 56.000 C 48.000 42.745 58.745 32.000 72.000 32.000 L 152.000 32.000 C 165.255 32.000 176.000 42.745 176.000 56.000 L 176.000 104.000 L 192.000 104.000 C 205.255 104.000 216.000 114.745 216.000 128.000 L 216.000 168.000 C 216.000 172.418 219.582 176.000 224.000 176.000 C 228.418 176.000 232.000 172.418 232.000 168.000 L 232.000 86.630 C 231.994 84.518 231.153 82.494 229.660 81.000 L 210.340 61.660 C 207.214 58.534 207.214 53.466 210.340 50.340 C 213.466 47.214 218.534 47.214 221.660 50.340 L 241.000 69.660 C 245.504 74.156 248.024 80.266 248.000 86.630 ZM 160.000 208.000 L 160.000 56.000 C 160.000 51.582 156.418 48.000 152.000 48.000 L 72.000 48.000 C 67.582 48.000 64.000 51.582 64.000 56.000 L 64.000 208.000 Z"),
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
