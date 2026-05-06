package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorFillIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 96v64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM224 80v96c0 13.255-10.745 24-24 24h-168C18.745 200 8 189.255 8 176v-96C8 66.745 18.745 56 32 56h168c13.255 0 24 10.745 24 24ZM138.81 123.79C137.35 121.432 134.773 119.997 132 120h-19.06L123.16 99.58c1.977-3.954 .374-8.763-3.58-10.74-3.954-1.977-8.763-.374-10.74 3.58l-16 32c-1.241 2.481-1.109 5.428 .35 7.787 1.459 2.359 4.036 3.795 6.81 3.793h19.06l-10.22 20.42c-1.977 3.954-.374 8.763 3.58 10.74 3.954 1.977 8.763 .374 10.74-3.58l16-32c1.242-2.482 1.11-5.43-.35-7.79Z"),
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
