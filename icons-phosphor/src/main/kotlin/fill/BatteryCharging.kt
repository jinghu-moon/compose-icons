package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorFillIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 256.000 96.000 L 256.000 160.000 C 256.000 164.418 252.418 168.000 248.000 168.000 C 243.582 168.000 240.000 164.418 240.000 160.000 L 240.000 96.000 C 240.000 91.582 243.582 88.000 248.000 88.000 C 252.418 88.000 256.000 91.582 256.000 96.000 ZM 224.000 80.000 L 224.000 176.000 C 224.000 189.255 213.255 200.000 200.000 200.000 L 32.000 200.000 C 18.745 200.000 8.000 189.255 8.000 176.000 L 8.000 80.000 C 8.000 66.745 18.745 56.000 32.000 56.000 L 200.000 56.000 C 213.255 56.000 224.000 66.745 224.000 80.000 ZM 138.810 123.790 C 137.350 121.432 134.773 119.997 132.000 120.000 L 112.940 120.000 L 123.160 99.580 C 125.137 95.626 123.534 90.817 119.580 88.840 C 115.626 86.863 110.817 88.466 108.840 92.420 L 92.840 124.420 C 91.599 126.901 91.731 129.848 93.190 132.207 C 94.649 134.567 97.226 136.002 100.000 136.000 L 119.060 136.000 L 108.840 156.420 C 106.863 160.374 108.466 165.183 112.420 167.160 C 116.374 169.137 121.183 167.534 123.160 163.580 L 139.160 131.580 C 140.402 129.098 140.270 126.150 138.810 123.790 Z"),
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
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
