package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) return _batteryPlus!!
        _batteryPlus = phosphorLightIcon(
            name = "BatteryPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 150.000 128.000 C 150.000 131.314 147.314 134.000 144.000 134.000 L 122.000 134.000 L 122.000 156.000 C 122.000 159.314 119.314 162.000 116.000 162.000 C 112.686 162.000 110.000 159.314 110.000 156.000 L 110.000 134.000 L 88.000 134.000 C 84.686 134.000 82.000 131.314 82.000 128.000 C 82.000 124.686 84.686 122.000 88.000 122.000 L 110.000 122.000 L 110.000 100.000 C 110.000 96.686 112.686 94.000 116.000 94.000 C 119.314 94.000 122.000 96.686 122.000 100.000 L 122.000 122.000 L 144.000 122.000 C 147.314 122.000 150.000 124.686 150.000 128.000 ZM 222.000 80.000 L 222.000 176.000 C 222.000 188.150 212.150 198.000 200.000 198.000 L 32.000 198.000 C 19.850 198.000 10.000 188.150 10.000 176.000 L 10.000 80.000 C 10.000 67.850 19.850 58.000 32.000 58.000 L 200.000 58.000 C 212.150 58.000 222.000 67.850 222.000 80.000 ZM 210.000 80.000 C 210.000 74.477 205.523 70.000 200.000 70.000 L 32.000 70.000 C 26.477 70.000 22.000 74.477 22.000 80.000 L 22.000 176.000 C 22.000 181.523 26.477 186.000 32.000 186.000 L 200.000 186.000 C 205.523 186.000 210.000 181.523 210.000 176.000 ZM 248.000 90.000 C 244.686 90.000 242.000 92.686 242.000 96.000 L 242.000 160.000 C 242.000 163.314 244.686 166.000 248.000 166.000 C 251.314 166.000 254.000 163.314 254.000 160.000 L 254.000 96.000 C 254.000 92.686 251.314 90.000 248.000 90.000 Z"),
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
        return _batteryPlus!!
    }

private var _batteryPlus: ImageVector? = null
