package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) return _shieldStar!!
        _shieldStar = phosphorThinIcon(
            name = "ShieldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 171.710 118.510 C 172.532 120.559 171.538 122.886 169.490 123.710 L 134.330 137.780 L 155.200 165.600 C 156.525 167.367 156.167 169.875 154.400 171.200 C 152.633 172.525 150.125 172.167 148.800 170.400 L 128.000 142.670 L 107.200 170.400 C 105.875 172.167 103.367 172.525 101.600 171.200 C 99.833 169.875 99.475 167.367 100.800 165.600 L 121.670 137.780 L 86.510 123.710 C 84.461 122.882 83.472 120.549 84.300 118.500 C 85.128 116.451 87.461 115.462 89.510 116.290 L 124.000 130.090 L 124.000 96.000 C 124.000 93.791 125.791 92.000 128.000 92.000 C 130.209 92.000 132.000 93.791 132.000 96.000 L 132.000 130.090 L 166.510 116.290 C 168.559 115.468 170.886 116.462 171.710 118.510 ZM 220.000 56.000 L 220.000 112.000 C 220.000 163.160 195.270 194.120 174.530 211.100 C 152.130 229.420 129.980 235.600 129.050 235.860 C 128.362 236.047 127.638 236.047 126.950 235.860 C 126.020 235.600 103.870 229.420 81.470 211.100 C 60.730 194.120 36.000 163.160 36.000 112.000 L 36.000 56.000 C 36.000 49.373 41.373 44.000 48.000 44.000 L 208.000 44.000 C 214.627 44.000 220.000 49.373 220.000 56.000 ZM 212.000 56.000 C 212.000 53.791 210.209 52.000 208.000 52.000 L 48.000 52.000 C 45.791 52.000 44.000 53.791 44.000 56.000 L 44.000 112.000 C 44.000 150.440 58.230 181.630 86.290 204.710 C 98.678 214.877 112.811 222.708 128.000 227.820 C 143.187 222.703 157.319 214.873 169.710 204.710 C 197.770 181.630 212.000 150.440 212.000 112.000 Z"),
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
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
