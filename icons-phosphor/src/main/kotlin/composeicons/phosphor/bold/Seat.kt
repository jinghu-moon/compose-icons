package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorBoldIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 232c0 6.627-5.373 12-12 12h-104c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h104c6.627 0 12 5.373 12 12ZM228 160v28c0 11.046-8.954 20-20 20h-95.9c-7.584 .023-14.521-4.266-17.89-11.06L38.1 85c-2.8-5.638-2.8-12.262 0-17.9L60.22 23C65.138 13.164 77.074 9.144 86.94 14l29.81 14.27 .18 .09c9.88 4.938 13.887 16.95 8.95 26.83l-.17 .33L112.5 80.08 142.25 140h65.75c11.046 0 20 8.954 20 20ZM204 164h-64.23c-7.584 .023-14.521-4.266-17.89-11.06l-31.79-64c-2.795-5.625-2.795-12.235 0-17.86 .06-.11 .12-.22 .17-.33L102.46 48.13 79.91 37.3 60.47 76l54.1 108h89.43Z"),
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
        return _seat!!
    }

private var _seat: ImageVector? = null
