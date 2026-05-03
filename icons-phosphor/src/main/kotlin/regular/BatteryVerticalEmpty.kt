package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BatteryVerticalEmpty: ImageVector
    get() {
        if (_batteryVerticalEmpty != null) return _batteryVerticalEmpty!!
        _batteryVerticalEmpty = phosphorRegularIcon(
            name = "BatteryVerticalEmpty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 8.000 C 88.000 3.582 91.582 0.000 96.000 0.000 L 160.000 0.000 C 164.418 0.000 168.000 3.582 168.000 8.000 C 168.000 12.418 164.418 16.000 160.000 16.000 L 96.000 16.000 C 91.582 16.000 88.000 12.418 88.000 8.000 ZM 200.000 56.000 L 200.000 224.000 C 200.000 237.255 189.255 248.000 176.000 248.000 L 80.000 248.000 C 66.745 248.000 56.000 237.255 56.000 224.000 L 56.000 56.000 C 56.000 42.745 66.745 32.000 80.000 32.000 L 176.000 32.000 C 189.255 32.000 200.000 42.745 200.000 56.000 ZM 184.000 56.000 C 184.000 51.582 180.418 48.000 176.000 48.000 L 80.000 48.000 C 75.582 48.000 72.000 51.582 72.000 56.000 L 72.000 224.000 C 72.000 228.418 75.582 232.000 80.000 232.000 L 176.000 232.000 C 180.418 232.000 184.000 228.418 184.000 224.000 Z"),
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
        return _batteryVerticalEmpty!!
    }

private var _batteryVerticalEmpty: ImageVector? = null
