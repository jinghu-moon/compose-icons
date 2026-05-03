package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryWarningVertical: ImageVector
    get() {
        if (_batteryWarningVertical != null) return _batteryWarningVertical!!
        _batteryWarningVertical = phosphorLightIcon(
            name = "BatteryWarningVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 122.000 136.000 L 122.000 96.000 C 122.000 92.686 124.686 90.000 128.000 90.000 C 131.314 90.000 134.000 92.686 134.000 96.000 L 134.000 136.000 C 134.000 139.314 131.314 142.000 128.000 142.000 C 124.686 142.000 122.000 139.314 122.000 136.000 ZM 128.000 162.000 C 122.477 162.000 118.000 166.477 118.000 172.000 C 118.000 177.523 122.477 182.000 128.000 182.000 C 133.523 182.000 138.000 177.523 138.000 172.000 C 138.000 166.477 133.523 162.000 128.000 162.000 ZM 96.000 14.000 L 160.000 14.000 C 163.314 14.000 166.000 11.314 166.000 8.000 C 166.000 4.686 163.314 2.000 160.000 2.000 L 96.000 2.000 C 92.686 2.000 90.000 4.686 90.000 8.000 C 90.000 11.314 92.686 14.000 96.000 14.000 ZM 198.000 56.000 L 198.000 224.000 C 198.000 236.150 188.150 246.000 176.000 246.000 L 80.000 246.000 C 67.850 246.000 58.000 236.150 58.000 224.000 L 58.000 56.000 C 58.000 43.850 67.850 34.000 80.000 34.000 L 176.000 34.000 C 188.150 34.000 198.000 43.850 198.000 56.000 ZM 186.000 56.000 C 186.000 50.477 181.523 46.000 176.000 46.000 L 80.000 46.000 C 74.477 46.000 70.000 50.477 70.000 56.000 L 70.000 224.000 C 70.000 229.523 74.477 234.000 80.000 234.000 L 176.000 234.000 C 181.523 234.000 186.000 229.523 186.000 224.000 Z"),
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
        return _batteryWarningVertical!!
    }

private var _batteryWarningVertical: ImageVector? = null
