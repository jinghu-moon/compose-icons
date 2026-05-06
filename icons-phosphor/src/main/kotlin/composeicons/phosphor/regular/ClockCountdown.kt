package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorRegularIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 136.66c-4.73 54.988-51.546 96.733-106.715 95.154C70.117 230.236 25.764 185.883 24.186 130.715 22.607 75.546 64.352 28.73 119.34 24c4.418-.365 8.295 2.922 8.66 7.34 .365 4.418-2.922 8.295-7.34 8.66C74.119 43.999 38.785 83.62 40.119 130.314c1.334 46.693 38.873 84.232 85.567 85.567 46.693 1.334 86.315-34 90.314-80.541 .365-4.418 4.242-7.705 8.66-7.34 4.418 .365 7.704 4.242 7.34 8.66ZM120 72v56c0 4.418 3.582 8 8 8h56c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48v-48c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8ZM160 48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM196 72c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM220 108c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12Z"),
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
