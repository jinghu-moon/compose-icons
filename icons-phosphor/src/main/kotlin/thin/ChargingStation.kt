package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) return _chargingStation!!
        _chargingStation = phosphorThinIcon(
            name = "ChargingStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 131.310 125.760 C 132.054 126.860 132.204 128.257 131.710 129.490 L 115.710 169.490 C 115.102 171.006 113.633 171.999 112.000 172.000 C 111.489 172.002 110.983 171.903 110.510 171.710 C 108.462 170.886 107.468 168.559 108.290 166.510 L 122.090 132.000 L 96.000 132.000 C 94.672 131.999 93.431 131.340 92.688 130.240 C 91.944 129.140 91.795 127.742 92.290 126.510 L 108.290 86.510 C 109.118 84.461 111.451 83.472 113.500 84.300 C 115.549 85.128 116.538 87.461 115.710 89.510 L 101.910 124.000 L 128.000 124.000 C 129.327 124.001 130.567 124.661 131.310 125.760 ZM 244.000 86.630 L 244.000 168.000 C 244.000 179.046 235.046 188.000 224.000 188.000 C 212.954 188.000 204.000 179.046 204.000 168.000 L 204.000 128.000 C 204.000 121.373 198.627 116.000 192.000 116.000 L 172.000 116.000 L 172.000 212.000 L 192.000 212.000 C 194.209 212.000 196.000 213.791 196.000 216.000 C 196.000 218.209 194.209 220.000 192.000 220.000 L 32.000 220.000 C 29.791 220.000 28.000 218.209 28.000 216.000 C 28.000 213.791 29.791 212.000 32.000 212.000 L 52.000 212.000 L 52.000 56.000 C 52.000 44.954 60.954 36.000 72.000 36.000 L 152.000 36.000 C 163.046 36.000 172.000 44.954 172.000 56.000 L 172.000 108.000 L 192.000 108.000 C 203.046 108.000 212.000 116.954 212.000 128.000 L 212.000 168.000 C 212.000 174.627 217.373 180.000 224.000 180.000 C 230.627 180.000 236.000 174.627 236.000 168.000 L 236.000 86.630 C 236.003 83.446 234.740 80.392 232.490 78.140 L 213.170 58.830 C 211.607 57.267 211.607 54.733 213.170 53.170 C 214.733 51.607 217.267 51.607 218.830 53.170 L 238.140 72.490 C 241.905 76.230 244.015 81.323 244.000 86.630 ZM 164.000 212.000 L 164.000 56.000 C 164.000 49.373 158.627 44.000 152.000 44.000 L 72.000 44.000 C 65.373 44.000 60.000 49.373 60.000 56.000 L 60.000 212.000 Z"),
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
