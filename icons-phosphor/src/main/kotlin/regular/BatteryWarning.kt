package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BatteryWarning: ImageVector
    get() {
        if (_batteryWarning != null) return _batteryWarning!!
        _batteryWarning = phosphorRegularIcon(
            name = "BatteryWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 256.000 96.000 L 256.000 160.000 C 256.000 164.418 252.418 168.000 248.000 168.000 C 243.582 168.000 240.000 164.418 240.000 160.000 L 240.000 96.000 C 240.000 91.582 243.582 88.000 248.000 88.000 C 252.418 88.000 256.000 91.582 256.000 96.000 ZM 224.000 80.000 L 224.000 176.000 C 224.000 189.255 213.255 200.000 200.000 200.000 L 32.000 200.000 C 18.745 200.000 8.000 189.255 8.000 176.000 L 8.000 80.000 C 8.000 66.745 18.745 56.000 32.000 56.000 L 200.000 56.000 C 213.255 56.000 224.000 66.745 224.000 80.000 ZM 208.000 80.000 C 208.000 75.582 204.418 72.000 200.000 72.000 L 32.000 72.000 C 27.582 72.000 24.000 75.582 24.000 80.000 L 24.000 176.000 C 24.000 180.418 27.582 184.000 32.000 184.000 L 200.000 184.000 C 204.418 184.000 208.000 180.418 208.000 176.000 ZM 116.000 132.000 C 120.418 132.000 124.000 128.418 124.000 124.000 L 124.000 96.000 C 124.000 91.582 120.418 88.000 116.000 88.000 C 111.582 88.000 108.000 91.582 108.000 96.000 L 108.000 124.000 C 108.000 128.418 111.582 132.000 116.000 132.000 ZM 116.000 144.000 C 109.373 144.000 104.000 149.373 104.000 156.000 C 104.000 162.627 109.373 168.000 116.000 168.000 C 122.627 168.000 128.000 162.627 128.000 156.000 C 128.000 149.373 122.627 144.000 116.000 144.000 Z"),
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
