package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryWarning: ImageVector
    get() {
        if (_batteryWarning != null) return _batteryWarning!!
        _batteryWarning = phosphorBoldIcon(
            name = "BatteryWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 52.000 L 28.000 52.000 C 12.536 52.000 0.000 64.536 0.000 80.000 L 0.000 176.000 C 0.000 191.464 12.536 204.000 28.000 204.000 L 196.000 204.000 C 211.464 204.000 224.000 191.464 224.000 176.000 L 224.000 80.000 C 224.000 64.536 211.464 52.000 196.000 52.000 ZM 200.000 176.000 C 200.000 178.209 198.209 180.000 196.000 180.000 L 28.000 180.000 C 25.791 180.000 24.000 178.209 24.000 176.000 L 24.000 80.000 C 24.000 77.791 25.791 76.000 28.000 76.000 L 196.000 76.000 C 198.209 76.000 200.000 77.791 200.000 80.000 ZM 256.000 104.000 L 256.000 152.000 C 256.000 158.627 250.627 164.000 244.000 164.000 C 237.373 164.000 232.000 158.627 232.000 152.000 L 232.000 104.000 C 232.000 97.373 237.373 92.000 244.000 92.000 C 250.627 92.000 256.000 97.373 256.000 104.000 ZM 100.000 116.000 L 100.000 100.000 C 100.000 93.373 105.373 88.000 112.000 88.000 C 118.627 88.000 124.000 93.373 124.000 100.000 L 124.000 116.000 C 124.000 122.627 118.627 128.000 112.000 128.000 C 105.373 128.000 100.000 122.627 100.000 116.000 ZM 128.000 152.000 C 128.000 160.837 120.837 168.000 112.000 168.000 C 103.163 168.000 96.000 160.837 96.000 152.000 C 96.000 143.163 103.163 136.000 112.000 136.000 C 120.837 136.000 128.000 143.163 128.000 152.000 Z"),
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
        return _batteryWarning!!
    }

private var _batteryWarning: ImageVector? = null
