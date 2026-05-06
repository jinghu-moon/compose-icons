package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryVerticalFull: ImageVector
    get() {
        if (_batteryVerticalFull != null) return _batteryVerticalFull!!
        _batteryVerticalFull = phosphorBoldIcon(
            name = "BatteryVerticalFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 12C92 5.373 97.373 0 104 0h48c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-48C97.373 24 92 18.627 92 12ZM204 60v168c0 15.464-12.536 28-28 28h-96C64.536 256 52 243.464 52 228v-168C52 44.536 64.536 32 80 32h96c15.464 0 28 12.536 28 28ZM180 60c0-2.209-1.791-4-4-4h-96c-2.209 0-4 1.791-4 4v168c0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4ZM156 72h-56C93.373 72 88 77.373 88 84c0 6.627 5.373 12 12 12h56c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM156 112h-56c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h56c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM156 152h-56c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h56c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM156 192h-56c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h56c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _batteryVerticalFull!!
    }

private var _batteryVerticalFull: ImageVector? = null
