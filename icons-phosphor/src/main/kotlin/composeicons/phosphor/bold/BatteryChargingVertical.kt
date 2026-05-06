package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorBoldIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M154.21 133.69c2.186 3.54 2.383 7.96 .52 11.68l-16 32c-1.881 3.899-5.716 6.482-10.035 6.761-4.32 .279-8.455-1.791-10.821-5.415-2.366-3.625-2.597-8.243-.604-12.085L124.58 152h-12.58c-4.159-0-8.022-2.155-10.208-5.693-2.186-3.539-2.384-7.957-.522-11.677l16-32c1.881-3.899 5.716-6.482 10.035-6.761 4.32-.279 8.455 1.791 10.821 5.415 2.366 3.625 2.597 8.243 .604 12.085L131.42 128h12.58c4.159-.001 8.023 2.152 10.21 5.69ZM104 24h48c6.627 0 12-5.373 12-12C164 5.373 158.627 0 152 0h-48C97.373 0 92 5.373 92 12c0 6.627 5.373 12 12 12ZM204 60v168c0 15.464-12.536 28-28 28h-96C64.536 256 52 243.464 52 228v-168C52 44.536 64.536 32 80 32h96c15.464 0 28 12.536 28 28ZM180 60c0-2.209-1.791-4-4-4h-96c-2.209 0-4 1.791-4 4v168c0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4Z"),
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
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
