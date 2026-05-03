package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryMedium: ImageVector
    get() {
        if (_batteryMedium != null) return _batteryMedium!!
        _batteryMedium = phosphorLightIcon(
            name = "BatteryMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 58.000 L 32.000 58.000 C 19.850 58.000 10.000 67.850 10.000 80.000 L 10.000 176.000 C 10.000 188.150 19.850 198.000 32.000 198.000 L 200.000 198.000 C 212.150 198.000 222.000 188.150 222.000 176.000 L 222.000 80.000 C 222.000 67.850 212.150 58.000 200.000 58.000 ZM 210.000 176.000 C 210.000 181.523 205.523 186.000 200.000 186.000 L 32.000 186.000 C 26.477 186.000 22.000 181.523 22.000 176.000 L 22.000 80.000 C 22.000 74.477 26.477 70.000 32.000 70.000 L 200.000 70.000 C 205.523 70.000 210.000 74.477 210.000 80.000 ZM 102.000 96.000 L 102.000 160.000 C 102.000 163.314 99.314 166.000 96.000 166.000 C 92.686 166.000 90.000 163.314 90.000 160.000 L 90.000 96.000 C 90.000 92.686 92.686 90.000 96.000 90.000 C 99.314 90.000 102.000 92.686 102.000 96.000 ZM 62.000 96.000 L 62.000 160.000 C 62.000 163.314 59.314 166.000 56.000 166.000 C 52.686 166.000 50.000 163.314 50.000 160.000 L 50.000 96.000 C 50.000 92.686 52.686 90.000 56.000 90.000 C 59.314 90.000 62.000 92.686 62.000 96.000 ZM 254.000 96.000 L 254.000 160.000 C 254.000 163.314 251.314 166.000 248.000 166.000 C 244.686 166.000 242.000 163.314 242.000 160.000 L 242.000 96.000 C 242.000 92.686 244.686 90.000 248.000 90.000 C 251.314 90.000 254.000 92.686 254.000 96.000 Z"),
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
        return _batteryMedium!!
    }

private var _batteryMedium: ImageVector? = null
