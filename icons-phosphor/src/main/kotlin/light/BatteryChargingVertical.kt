package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorLightIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 149.100 132.850 C 150.193 134.616 150.295 136.821 149.370 138.680 L 133.370 170.680 C 131.890 173.646 128.286 174.850 125.320 173.370 C 122.354 171.890 121.150 168.286 122.630 165.320 L 134.290 142.000 L 112.000 142.000 C 109.921 142.001 107.990 140.925 106.896 139.157 C 105.802 137.389 105.701 135.180 106.630 133.320 L 122.630 101.320 C 124.110 98.354 127.714 97.150 130.680 98.630 C 133.646 100.110 134.850 103.714 133.370 106.680 L 121.710 130.000 L 144.000 130.000 C 146.079 130.002 148.009 131.081 149.100 132.850 ZM 96.000 14.000 L 160.000 14.000 C 163.314 14.000 166.000 11.314 166.000 8.000 C 166.000 4.686 163.314 2.000 160.000 2.000 L 96.000 2.000 C 92.686 2.000 90.000 4.686 90.000 8.000 C 90.000 11.314 92.686 14.000 96.000 14.000 ZM 198.000 56.000 L 198.000 224.000 C 198.000 236.150 188.150 246.000 176.000 246.000 L 80.000 246.000 C 67.850 246.000 58.000 236.150 58.000 224.000 L 58.000 56.000 C 58.000 43.850 67.850 34.000 80.000 34.000 L 176.000 34.000 C 188.150 34.000 198.000 43.850 198.000 56.000 ZM 186.000 56.000 C 186.000 50.477 181.523 46.000 176.000 46.000 L 80.000 46.000 C 74.477 46.000 70.000 50.477 70.000 56.000 L 70.000 224.000 C 70.000 229.523 74.477 234.000 80.000 234.000 L 176.000 234.000 C 181.523 234.000 186.000 229.523 186.000 224.000 Z"),
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
