package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BatteryEmpty: ImageVector
    get() {
        if (_batteryEmpty != null) return _batteryEmpty!!
        _batteryEmpty = phosphorFillIcon(
            name = "BatteryEmpty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 56.000 L 32.000 56.000 C 18.745 56.000 8.000 66.745 8.000 80.000 L 8.000 176.000 C 8.000 189.255 18.745 200.000 32.000 200.000 L 200.000 200.000 C 213.255 200.000 224.000 189.255 224.000 176.000 L 224.000 80.000 C 224.000 66.745 213.255 56.000 200.000 56.000 ZM 208.000 176.000 C 208.000 180.418 204.418 184.000 200.000 184.000 L 32.000 184.000 C 27.582 184.000 24.000 180.418 24.000 176.000 L 24.000 80.000 C 24.000 75.582 27.582 72.000 32.000 72.000 L 200.000 72.000 C 204.418 72.000 208.000 75.582 208.000 80.000 ZM 256.000 96.000 L 256.000 160.000 C 256.000 164.418 252.418 168.000 248.000 168.000 C 243.582 168.000 240.000 164.418 240.000 160.000 L 240.000 96.000 C 240.000 91.582 243.582 88.000 248.000 88.000 C 252.418 88.000 256.000 91.582 256.000 96.000 Z"),
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
