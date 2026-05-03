package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryEmpty: ImageVector
    get() {
        if (_batteryEmpty != null) return _batteryEmpty!!
        _batteryEmpty = phosphorBoldIcon(
            name = "BatteryEmpty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 52.000 L 28.000 52.000 C 12.536 52.000 0.000 64.536 0.000 80.000 L 0.000 176.000 C 0.000 191.464 12.536 204.000 28.000 204.000 L 196.000 204.000 C 211.464 204.000 224.000 191.464 224.000 176.000 L 224.000 80.000 C 224.000 64.536 211.464 52.000 196.000 52.000 ZM 200.000 176.000 C 200.000 178.209 198.209 180.000 196.000 180.000 L 28.000 180.000 C 25.791 180.000 24.000 178.209 24.000 176.000 L 24.000 80.000 C 24.000 77.791 25.791 76.000 28.000 76.000 L 196.000 76.000 C 198.209 76.000 200.000 77.791 200.000 80.000 ZM 256.000 104.000 L 256.000 152.000 C 256.000 158.627 250.627 164.000 244.000 164.000 C 237.373 164.000 232.000 158.627 232.000 152.000 L 232.000 104.000 C 232.000 97.373 237.373 92.000 244.000 92.000 C 250.627 92.000 256.000 97.373 256.000 104.000 Z"),
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
        return _batteryEmpty!!
    }

private var _batteryEmpty: ImageVector? = null
