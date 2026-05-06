package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryWarningVertical: ImageVector
    get() {
        if (_batteryWarningVertical != null) return _batteryWarningVertical!!
        _batteryWarningVertical = phosphorBoldIcon(
            name = "BatteryWarningVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 136v-36c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v36c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM128 160c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM104 24h48c6.627 0 12-5.373 12-12C164 5.373 158.627 0 152 0h-48C97.373 0 92 5.373 92 12c0 6.627 5.373 12 12 12ZM204 60v168c0 15.464-12.536 28-28 28h-96C64.536 256 52 243.464 52 228v-168C52 44.536 64.536 32 80 32h96c15.464 0 28 12.536 28 28ZM180 60c0-2.209-1.791-4-4-4h-96c-2.209 0-4 1.791-4 4v168c0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4Z"),
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
