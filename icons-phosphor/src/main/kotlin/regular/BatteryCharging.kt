package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorRegularIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 56.000 L 32.000 56.000 C 18.745 56.000 8.000 66.745 8.000 80.000 L 8.000 176.000 C 8.000 189.255 18.745 200.000 32.000 200.000 L 200.000 200.000 C 213.255 200.000 224.000 189.255 224.000 176.000 L 224.000 80.000 C 224.000 66.745 213.255 56.000 200.000 56.000 ZM 208.000 176.000 C 208.000 180.418 204.418 184.000 200.000 184.000 L 32.000 184.000 C 27.582 184.000 24.000 180.418 24.000 176.000 L 24.000 80.000 C 24.000 75.582 27.582 72.000 32.000 72.000 L 200.000 72.000 C 204.418 72.000 208.000 75.582 208.000 80.000 ZM 256.000 96.000 L 256.000 160.000 C 256.000 164.418 252.418 168.000 248.000 168.000 C 243.582 168.000 240.000 164.418 240.000 160.000 L 240.000 96.000 C 240.000 91.582 243.582 88.000 248.000 88.000 C 252.418 88.000 256.000 91.582 256.000 96.000 ZM 138.810 123.790 C 140.270 126.150 140.402 129.098 139.160 131.580 L 123.160 163.580 C 121.183 167.534 116.374 169.137 112.420 167.160 C 108.466 165.183 106.863 160.374 108.840 156.420 L 119.060 136.000 L 100.000 136.000 C 97.226 136.002 94.649 134.567 93.190 132.207 C 91.731 129.848 91.599 126.901 92.840 124.420 L 108.840 92.420 C 110.817 88.466 115.626 86.863 119.580 88.840 C 123.534 90.817 125.137 95.626 123.160 99.580 L 112.940 120.000 L 132.000 120.000 C 134.773 119.997 137.350 121.432 138.810 123.790 Z"),
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
