package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BatteryWarningVertical: ImageVector
    get() {
        if (_batteryWarningVertical != null) return _batteryWarningVertical!!
        _batteryWarningVertical = phosphorFillIcon(
            name = "BatteryWarningVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 8.000 C 88.000 3.582 91.582 0.000 96.000 0.000 L 160.000 0.000 C 164.418 0.000 168.000 3.582 168.000 8.000 C 168.000 12.418 164.418 16.000 160.000 16.000 L 96.000 16.000 C 91.582 16.000 88.000 12.418 88.000 8.000 ZM 200.000 56.000 L 200.000 224.000 C 200.000 237.255 189.255 248.000 176.000 248.000 L 80.000 248.000 C 66.745 248.000 56.000 237.255 56.000 224.000 L 56.000 56.000 C 56.000 42.745 66.745 32.000 80.000 32.000 L 176.000 32.000 C 189.255 32.000 200.000 42.745 200.000 56.000 ZM 120.000 136.000 C 120.000 140.418 123.582 144.000 128.000 144.000 C 132.418 144.000 136.000 140.418 136.000 136.000 L 136.000 96.000 C 136.000 91.582 132.418 88.000 128.000 88.000 C 123.582 88.000 120.000 91.582 120.000 96.000 ZM 140.000 172.000 C 140.000 165.373 134.627 160.000 128.000 160.000 C 121.373 160.000 116.000 165.373 116.000 172.000 C 116.000 178.627 121.373 184.000 128.000 184.000 C 134.627 184.000 140.000 178.627 140.000 172.000 Z"),
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
