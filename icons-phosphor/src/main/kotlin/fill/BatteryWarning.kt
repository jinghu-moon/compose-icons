package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BatteryWarning: ImageVector
    get() {
        if (_batteryWarning != null) return _batteryWarning!!
        _batteryWarning = phosphorFillIcon(
            name = "BatteryWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 56.000 L 32.000 56.000 C 18.745 56.000 8.000 66.745 8.000 80.000 L 8.000 176.000 C 8.000 189.255 18.745 200.000 32.000 200.000 L 200.000 200.000 C 213.255 200.000 224.000 189.255 224.000 176.000 L 224.000 80.000 C 224.000 66.745 213.255 56.000 200.000 56.000 ZM 108.000 88.000 C 108.000 83.582 111.582 80.000 116.000 80.000 C 120.418 80.000 124.000 83.582 124.000 88.000 L 124.000 128.000 C 124.000 132.418 120.418 136.000 116.000 136.000 C 111.582 136.000 108.000 132.418 108.000 128.000 ZM 116.000 176.000 C 109.373 176.000 104.000 170.627 104.000 164.000 C 104.000 157.373 109.373 152.000 116.000 152.000 C 122.627 152.000 128.000 157.373 128.000 164.000 C 128.000 170.627 122.627 176.000 116.000 176.000 ZM 256.000 96.000 L 256.000 160.000 C 256.000 164.418 252.418 168.000 248.000 168.000 C 243.582 168.000 240.000 164.418 240.000 160.000 L 240.000 96.000 C 240.000 91.582 243.582 88.000 248.000 88.000 C 252.418 88.000 256.000 91.582 256.000 96.000 Z"),
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
        return _batteryWarning!!
    }

private var _batteryWarning: ImageVector? = null
