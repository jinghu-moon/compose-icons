package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryPlusVertical: ImageVector
    get() {
        if (_batteryPlusVertical != null) return _batteryPlusVertical!!
        _batteryPlusVertical = phosphorBoldIcon(
            name = "BatteryPlusVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 12.000 C 92.000 5.373 97.373 0.000 104.000 0.000 L 152.000 0.000 C 158.627 0.000 164.000 5.373 164.000 12.000 C 164.000 18.627 158.627 24.000 152.000 24.000 L 104.000 24.000 C 97.373 24.000 92.000 18.627 92.000 12.000 ZM 204.000 60.000 L 204.000 228.000 C 204.000 243.464 191.464 256.000 176.000 256.000 L 80.000 256.000 C 64.536 256.000 52.000 243.464 52.000 228.000 L 52.000 60.000 C 52.000 44.536 64.536 32.000 80.000 32.000 L 176.000 32.000 C 191.464 32.000 204.000 44.536 204.000 60.000 ZM 180.000 60.000 C 180.000 57.791 178.209 56.000 176.000 56.000 L 80.000 56.000 C 77.791 56.000 76.000 57.791 76.000 60.000 L 76.000 228.000 C 76.000 230.209 77.791 232.000 80.000 232.000 L 176.000 232.000 C 178.209 232.000 180.000 230.209 180.000 228.000 ZM 152.000 128.000 L 140.000 128.000 L 140.000 116.000 C 140.000 109.373 134.627 104.000 128.000 104.000 C 121.373 104.000 116.000 109.373 116.000 116.000 L 116.000 128.000 L 104.000 128.000 C 97.373 128.000 92.000 133.373 92.000 140.000 C 92.000 146.627 97.373 152.000 104.000 152.000 L 116.000 152.000 L 116.000 164.000 C 116.000 170.627 121.373 176.000 128.000 176.000 C 134.627 176.000 140.000 170.627 140.000 164.000 L 140.000 152.000 L 152.000 152.000 C 158.627 152.000 164.000 146.627 164.000 140.000 C 164.000 133.373 158.627 128.000 152.000 128.000 Z"),
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
        return _batteryPlusVertical!!
    }

private var _batteryPlusVertical: ImageVector? = null
