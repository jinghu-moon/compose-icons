package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorFillIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 32.000 L 80.000 32.000 C 66.745 32.000 56.000 42.745 56.000 56.000 L 56.000 224.000 C 56.000 237.255 66.745 248.000 80.000 248.000 L 176.000 248.000 C 189.255 248.000 200.000 237.255 200.000 224.000 L 200.000 56.000 C 200.000 42.745 189.255 32.000 176.000 32.000 ZM 151.160 139.580 L 135.160 171.580 C 133.183 175.534 128.374 177.137 124.420 175.160 C 120.466 173.183 118.863 168.374 120.840 164.420 L 131.060 144.000 L 112.000 144.000 C 109.226 144.002 106.649 142.567 105.190 140.207 C 103.731 137.848 103.599 134.901 104.840 132.420 L 120.840 100.420 C 122.817 96.466 127.626 94.863 131.580 96.840 C 135.534 98.817 137.137 103.626 135.160 107.580 L 124.940 128.000 L 144.000 128.000 C 146.774 127.998 149.351 129.433 150.810 131.793 C 152.269 134.152 152.401 137.099 151.160 139.580 ZM 88.000 8.000 C 88.000 3.582 91.582 0.000 96.000 0.000 L 160.000 0.000 C 164.418 0.000 168.000 3.582 168.000 8.000 C 168.000 12.418 164.418 16.000 160.000 16.000 L 96.000 16.000 C 91.582 16.000 88.000 12.418 88.000 8.000 Z"),
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
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
