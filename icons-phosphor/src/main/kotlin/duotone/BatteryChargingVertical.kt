package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorDuotoneIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 56.000 L 192.000 224.000 C 192.000 232.837 184.837 240.000 176.000 240.000 L 80.000 240.000 C 71.163 240.000 64.000 232.837 64.000 224.000 L 64.000 56.000 C 64.000 47.163 71.163 40.000 80.000 40.000 L 176.000 40.000 C 184.837 40.000 192.000 47.163 192.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 150.810 131.790 C 152.270 134.150 152.402 137.098 151.160 139.580 L 135.160 171.580 C 133.183 175.534 128.374 177.137 124.420 175.160 C 120.466 173.183 118.863 168.374 120.840 164.420 L 131.060 144.000 L 112.000 144.000 C 109.226 144.002 106.649 142.567 105.190 140.207 C 103.731 137.848 103.599 134.901 104.840 132.420 L 120.840 100.420 C 122.817 96.466 127.626 94.863 131.580 96.840 C 135.534 98.817 137.137 103.626 135.160 107.580 L 124.940 128.000 L 144.000 128.000 C 146.773 127.997 149.350 129.432 150.810 131.790 ZM 96.000 16.000 L 160.000 16.000 C 164.418 16.000 168.000 12.418 168.000 8.000 C 168.000 3.582 164.418 0.000 160.000 0.000 L 96.000 0.000 C 91.582 0.000 88.000 3.582 88.000 8.000 C 88.000 12.418 91.582 16.000 96.000 16.000 ZM 200.000 56.000 L 200.000 224.000 C 200.000 237.255 189.255 248.000 176.000 248.000 L 80.000 248.000 C 66.745 248.000 56.000 237.255 56.000 224.000 L 56.000 56.000 C 56.000 42.745 66.745 32.000 80.000 32.000 L 176.000 32.000 C 189.255 32.000 200.000 42.745 200.000 56.000 ZM 184.000 56.000 C 184.000 51.582 180.418 48.000 176.000 48.000 L 80.000 48.000 C 75.582 48.000 72.000 51.582 72.000 56.000 L 72.000 224.000 C 72.000 228.418 75.582 232.000 80.000 232.000 L 176.000 232.000 C 180.418 232.000 184.000 228.418 184.000 224.000 Z"),
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
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
