package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) return _chargingStation!!
        _chargingStation = phosphorBoldIcon(
            name = "ChargingStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 137.940 121.270 C 140.173 124.570 140.622 128.762 139.140 132.460 L 123.140 172.460 C 121.317 177.014 116.905 180.000 112.000 180.000 C 110.472 180.003 108.957 179.711 107.540 179.140 C 101.388 176.677 98.397 169.692 100.860 163.540 L 110.280 140.000 L 96.000 140.000 C 92.018 140.000 88.295 138.024 86.062 134.726 C 83.830 131.428 83.380 127.237 84.860 123.540 L 100.860 83.540 C 103.357 77.441 110.307 74.497 116.425 76.947 C 122.544 79.396 125.542 86.322 123.140 92.460 L 113.720 116.000 L 128.000 116.000 C 131.983 115.998 135.706 117.973 137.940 121.270 ZM 256.000 86.630 L 256.000 166.000 C 256.000 182.569 242.569 196.000 226.000 196.000 C 209.431 196.000 196.000 182.569 196.000 166.000 L 196.000 128.000 C 196.000 125.791 194.209 124.000 192.000 124.000 L 180.000 124.000 L 180.000 204.000 L 192.000 204.000 C 198.627 204.000 204.000 209.373 204.000 216.000 C 204.000 222.627 198.627 228.000 192.000 228.000 L 32.000 228.000 C 25.373 228.000 20.000 222.627 20.000 216.000 C 20.000 209.373 25.373 204.000 32.000 204.000 L 44.000 204.000 L 44.000 56.000 C 44.000 40.536 56.536 28.000 72.000 28.000 L 152.000 28.000 C 167.464 28.000 180.000 40.536 180.000 56.000 L 180.000 100.000 L 192.000 100.000 C 207.464 100.000 220.000 112.536 220.000 128.000 L 220.000 166.000 C 220.000 169.314 222.686 172.000 226.000 172.000 C 229.314 172.000 232.000 169.314 232.000 166.000 L 232.000 86.630 C 232.001 85.569 231.580 84.551 230.830 83.800 L 211.510 64.490 C 206.816 59.796 206.816 52.184 211.510 47.490 C 216.204 42.796 223.816 42.796 228.510 47.490 L 247.800 66.830 C 253.069 72.070 256.022 79.200 256.000 86.630 ZM 156.000 204.000 L 156.000 56.000 C 156.000 53.791 154.209 52.000 152.000 52.000 L 72.000 52.000 C 69.791 52.000 68.000 53.791 68.000 56.000 L 68.000 204.000 Z"),
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
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
