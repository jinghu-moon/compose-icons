package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorBoldIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 52h-168C12.536 52 0 64.536 0 80v96c0 15.464 12.536 28 28 28h168c15.464 0 28-12.536 28-28v-96C224 64.536 211.464 52 196 52ZM200 176c0 2.209-1.791 4-4 4h-168c-2.209 0-4-1.791-4-4v-96c0-2.209 1.791-4 4-4h168c2.209 0 4 1.791 4 4ZM256 104v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM142.38 122c2.144 3.713 2.144 8.287 0 12l-16 28c-2.097 3.779-6.065 6.138-10.386 6.176-4.322 .038-8.33-2.251-10.494-5.992-2.164-3.741-2.148-8.357 .04-12.084L111.32 140h-11.32c-4.292 .01-8.263-2.273-10.413-5.988C87.437 130.297 87.434 125.717 89.58 122l16-28c3.314-5.755 10.665-7.734 16.42-4.42 5.755 3.314 7.734 10.665 4.42 16.42l-5.74 10h11.32c4.283 .004 8.239 2.291 10.38 6Z"),
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
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
