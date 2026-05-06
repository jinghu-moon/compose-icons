package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorFillIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 96c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM196 72c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM224.66 128c-4.401-.363-8.264 2.909-8.63 7.31-3.984 46.542-43.595 81.889-90.288 80.569C79.048 214.559 41.497 177.032 40.148 130.339 38.799 83.646 74.12 44.013 120.66 40c4.418-.365 7.704-4.242 7.34-8.66-.365-4.418-4.242-7.705-8.66-7.34C64.352 28.73 22.607 75.546 24.186 130.715c1.578 55.169 45.931 99.521 101.1 101.1C180.454 233.393 227.27 191.648 232 136.66c.182-2.123-.49-4.232-1.868-5.857-1.378-1.626-3.348-2.635-5.472-2.803ZM128 56c39.764 0 72 32.235 72 72 0 39.764-32.236 72-72 72C88.235 200 56 167.764 56 128 56.044 88.254 88.254 56.044 128 56ZM120 128c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-40v-40c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8ZM160 48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12Z"),
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
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
