package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) return _batteryPlus!!
        _batteryPlus = phosphorBoldIcon(
            name = "BatteryPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 128.000 C 152.000 134.627 146.627 140.000 140.000 140.000 L 128.000 140.000 L 128.000 152.000 C 128.000 158.627 122.627 164.000 116.000 164.000 C 109.373 164.000 104.000 158.627 104.000 152.000 L 104.000 140.000 L 92.000 140.000 C 85.373 140.000 80.000 134.627 80.000 128.000 C 80.000 121.373 85.373 116.000 92.000 116.000 L 104.000 116.000 L 104.000 104.000 C 104.000 97.373 109.373 92.000 116.000 92.000 C 122.627 92.000 128.000 97.373 128.000 104.000 L 128.000 116.000 L 140.000 116.000 C 146.627 116.000 152.000 121.373 152.000 128.000 ZM 224.000 80.000 L 224.000 176.000 C 224.000 191.464 211.464 204.000 196.000 204.000 L 28.000 204.000 C 12.536 204.000 0.000 191.464 0.000 176.000 L 0.000 80.000 C -0.000 64.536 12.536 52.000 28.000 52.000 L 196.000 52.000 C 211.464 52.000 224.000 64.536 224.000 80.000 ZM 200.000 80.000 C 200.000 77.791 198.209 76.000 196.000 76.000 L 28.000 76.000 C 25.791 76.000 24.000 77.791 24.000 80.000 L 24.000 176.000 C 24.000 178.209 25.791 180.000 28.000 180.000 L 196.000 180.000 C 198.209 180.000 200.000 178.209 200.000 176.000 ZM 244.000 92.000 C 237.373 92.000 232.000 97.373 232.000 104.000 L 232.000 152.000 C 232.000 158.627 237.373 164.000 244.000 164.000 C 250.627 164.000 256.000 158.627 256.000 152.000 L 256.000 104.000 C 256.000 97.373 250.627 92.000 244.000 92.000 Z"),
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
        return _batteryPlus!!
    }

private var _batteryPlus: ImageVector? = null
