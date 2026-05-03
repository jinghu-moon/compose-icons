package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorLightIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 58.000 L 32.000 58.000 C 19.850 58.000 10.000 67.850 10.000 80.000 L 10.000 176.000 C 10.000 188.150 19.850 198.000 32.000 198.000 L 200.000 198.000 C 212.150 198.000 222.000 188.150 222.000 176.000 L 222.000 80.000 C 222.000 67.850 212.150 58.000 200.000 58.000 ZM 210.000 176.000 C 210.000 181.523 205.523 186.000 200.000 186.000 L 32.000 186.000 C 26.477 186.000 22.000 181.523 22.000 176.000 L 22.000 80.000 C 22.000 74.477 26.477 70.000 32.000 70.000 L 200.000 70.000 C 205.523 70.000 210.000 74.477 210.000 80.000 ZM 254.000 96.000 L 254.000 160.000 C 254.000 163.314 251.314 166.000 248.000 166.000 C 244.686 166.000 242.000 163.314 242.000 160.000 L 242.000 96.000 C 242.000 92.686 244.686 90.000 248.000 90.000 C 251.314 90.000 254.000 92.686 254.000 96.000 ZM 137.100 124.850 C 138.193 126.616 138.295 128.821 137.370 130.680 L 121.370 162.680 C 119.890 165.646 116.286 166.850 113.320 165.370 C 110.354 163.890 109.150 160.286 110.630 157.320 L 122.290 134.000 L 100.000 134.000 C 97.921 134.001 95.990 132.925 94.896 131.157 C 93.802 129.389 93.701 127.180 94.630 125.320 L 110.630 93.320 C 112.110 90.354 115.714 89.150 118.680 90.630 C 121.646 92.110 122.850 95.714 121.370 98.680 L 109.710 122.000 L 132.000 122.000 C 134.079 122.002 136.009 123.081 137.100 124.850 Z"),
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
