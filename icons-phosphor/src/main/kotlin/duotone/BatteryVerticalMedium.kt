package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BatteryVerticalMedium: ImageVector
    get() {
        if (_batteryVerticalMedium != null) return _batteryVerticalMedium!!
        _batteryVerticalMedium = phosphorDuotoneIcon(
            name = "BatteryVerticalMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 192.000 56.000 L 192.000 224.000 C 192.000 232.837 184.837 240.000 176.000 240.000 L 80.000 240.000 C 71.163 240.000 64.000 232.837 64.000 224.000 L 64.000 56.000 C 64.000 47.163 71.163 40.000 80.000 40.000 L 176.000 40.000 C 184.837 40.000 192.000 47.163 192.000 56.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 88.000 8.000 C 88.000 3.582 91.582 0.000 96.000 0.000 L 160.000 0.000 C 164.418 0.000 168.000 3.582 168.000 8.000 C 168.000 12.418 164.418 16.000 160.000 16.000 L 96.000 16.000 C 91.582 16.000 88.000 12.418 88.000 8.000 ZM 200.000 56.000 L 200.000 224.000 C 200.000 237.255 189.255 248.000 176.000 248.000 L 80.000 248.000 C 66.745 248.000 56.000 237.255 56.000 224.000 L 56.000 56.000 C 56.000 42.745 66.745 32.000 80.000 32.000 L 176.000 32.000 C 189.255 32.000 200.000 42.745 200.000 56.000 ZM 184.000 56.000 C 184.000 51.582 180.418 48.000 176.000 48.000 L 80.000 48.000 C 75.582 48.000 72.000 51.582 72.000 56.000 L 72.000 224.000 C 72.000 228.418 75.582 232.000 80.000 232.000 L 176.000 232.000 C 180.418 232.000 184.000 228.418 184.000 224.000 ZM 160.000 152.000 L 96.000 152.000 C 91.582 152.000 88.000 155.582 88.000 160.000 C 88.000 164.418 91.582 168.000 96.000 168.000 L 160.000 168.000 C 164.418 168.000 168.000 164.418 168.000 160.000 C 168.000 155.582 164.418 152.000 160.000 152.000 ZM 160.000 192.000 L 96.000 192.000 C 91.582 192.000 88.000 195.582 88.000 200.000 C 88.000 204.418 91.582 208.000 96.000 208.000 L 160.000 208.000 C 164.418 208.000 168.000 204.418 168.000 200.000 C 168.000 195.582 164.418 192.000 160.000 192.000 Z"),
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
        return _batteryVerticalMedium!!
    }

private var _batteryVerticalMedium: ImageVector? = null
