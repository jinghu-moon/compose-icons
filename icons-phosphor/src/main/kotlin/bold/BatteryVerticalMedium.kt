package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryVerticalMedium: ImageVector
    get() {
        if (_batteryVerticalMedium != null) return _batteryVerticalMedium!!
        _batteryVerticalMedium = phosphorBoldIcon(
            name = "BatteryVerticalMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 12.000 C 92.000 5.373 97.373 0.000 104.000 0.000 L 152.000 0.000 C 158.627 0.000 164.000 5.373 164.000 12.000 C 164.000 18.627 158.627 24.000 152.000 24.000 L 104.000 24.000 C 97.373 24.000 92.000 18.627 92.000 12.000 ZM 204.000 60.000 L 204.000 228.000 C 204.000 243.464 191.464 256.000 176.000 256.000 L 80.000 256.000 C 64.536 256.000 52.000 243.464 52.000 228.000 L 52.000 60.000 C 52.000 44.536 64.536 32.000 80.000 32.000 L 176.000 32.000 C 191.464 32.000 204.000 44.536 204.000 60.000 ZM 180.000 60.000 C 180.000 57.791 178.209 56.000 176.000 56.000 L 80.000 56.000 C 77.791 56.000 76.000 57.791 76.000 60.000 L 76.000 228.000 C 76.000 230.209 77.791 232.000 80.000 232.000 L 176.000 232.000 C 178.209 232.000 180.000 230.209 180.000 228.000 ZM 156.000 152.000 L 100.000 152.000 C 93.373 152.000 88.000 157.373 88.000 164.000 C 88.000 170.627 93.373 176.000 100.000 176.000 L 156.000 176.000 C 162.627 176.000 168.000 170.627 168.000 164.000 C 168.000 157.373 162.627 152.000 156.000 152.000 ZM 156.000 192.000 L 100.000 192.000 C 93.373 192.000 88.000 197.373 88.000 204.000 C 88.000 210.627 93.373 216.000 100.000 216.000 L 156.000 216.000 C 162.627 216.000 168.000 210.627 168.000 204.000 C 168.000 197.373 162.627 192.000 156.000 192.000 Z"),
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
        return _batteryVerticalMedium!!
    }

private var _batteryVerticalMedium: ImageVector? = null
