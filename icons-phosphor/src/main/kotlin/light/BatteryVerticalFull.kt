package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryVerticalFull: ImageVector
    get() {
        if (_batteryVerticalFull != null) return _batteryVerticalFull!!
        _batteryVerticalFull = phosphorLightIcon(
            name = "BatteryVerticalFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 90.000 8.000 C 90.000 4.686 92.686 2.000 96.000 2.000 L 160.000 2.000 C 163.314 2.000 166.000 4.686 166.000 8.000 C 166.000 11.314 163.314 14.000 160.000 14.000 L 96.000 14.000 C 92.686 14.000 90.000 11.314 90.000 8.000 ZM 198.000 56.000 L 198.000 224.000 C 198.000 236.150 188.150 246.000 176.000 246.000 L 80.000 246.000 C 67.850 246.000 58.000 236.150 58.000 224.000 L 58.000 56.000 C 58.000 43.850 67.850 34.000 80.000 34.000 L 176.000 34.000 C 188.150 34.000 198.000 43.850 198.000 56.000 ZM 186.000 56.000 C 186.000 50.477 181.523 46.000 176.000 46.000 L 80.000 46.000 C 74.477 46.000 70.000 50.477 70.000 56.000 L 70.000 224.000 C 70.000 229.523 74.477 234.000 80.000 234.000 L 176.000 234.000 C 181.523 234.000 186.000 229.523 186.000 224.000 ZM 160.000 74.000 L 96.000 74.000 C 92.686 74.000 90.000 76.686 90.000 80.000 C 90.000 83.314 92.686 86.000 96.000 86.000 L 160.000 86.000 C 163.314 86.000 166.000 83.314 166.000 80.000 C 166.000 76.686 163.314 74.000 160.000 74.000 ZM 160.000 114.000 L 96.000 114.000 C 92.686 114.000 90.000 116.686 90.000 120.000 C 90.000 123.314 92.686 126.000 96.000 126.000 L 160.000 126.000 C 163.314 126.000 166.000 123.314 166.000 120.000 C 166.000 116.686 163.314 114.000 160.000 114.000 ZM 160.000 154.000 L 96.000 154.000 C 92.686 154.000 90.000 156.686 90.000 160.000 C 90.000 163.314 92.686 166.000 96.000 166.000 L 160.000 166.000 C 163.314 166.000 166.000 163.314 166.000 160.000 C 166.000 156.686 163.314 154.000 160.000 154.000 ZM 160.000 194.000 L 96.000 194.000 C 92.686 194.000 90.000 196.686 90.000 200.000 C 90.000 203.314 92.686 206.000 96.000 206.000 L 160.000 206.000 C 163.314 206.000 166.000 203.314 166.000 200.000 C 166.000 196.686 163.314 194.000 160.000 194.000 Z"),
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
        return _batteryVerticalFull!!
    }

private var _batteryVerticalFull: ImageVector? = null
