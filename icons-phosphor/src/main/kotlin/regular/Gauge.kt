package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorRegularIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 207.060 72.670 C 186.115 51.677 157.654 39.917 128.000 40.000 L 127.600 40.000 C 66.070 40.210 16.000 91.000 16.000 153.130 L 16.000 176.000 C 16.000 184.837 23.163 192.000 32.000 192.000 L 224.000 192.000 C 232.837 192.000 240.000 184.837 240.000 176.000 L 240.000 152.000 C 240.083 122.213 228.217 93.637 207.060 72.670 ZM 224.000 176.000 L 119.710 176.000 L 174.470 100.700 C 177.071 97.127 176.283 92.121 172.710 89.520 C 169.137 86.919 164.131 87.707 161.530 91.280 L 99.920 176.000 L 32.000 176.000 L 32.000 153.130 C 32.000 150.050 32.150 147.010 32.430 144.000 L 56.000 144.000 C 60.418 144.000 64.000 140.418 64.000 136.000 C 64.000 131.582 60.418 128.000 56.000 128.000 L 35.270 128.000 C 45.590 89.140 79.270 59.760 120.000 56.340 L 120.000 80.000 C 120.000 84.418 123.582 88.000 128.000 88.000 C 132.418 88.000 136.000 84.418 136.000 80.000 L 136.000 56.330 C 176.675 59.753 210.754 88.488 221.000 128.000 L 200.000 128.000 C 195.582 128.000 192.000 131.582 192.000 136.000 C 192.000 140.418 195.582 144.000 200.000 144.000 L 223.670 144.000 C 223.880 146.650 224.000 149.310 224.000 152.000 Z"),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
