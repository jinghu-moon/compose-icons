package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = phosphorBoldIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 44C74.981 44 32 86.981 32 140c0 53.019 42.981 96 96 96 53.019 0 96-42.981 96-96C223.939 87.006 180.994 44.061 128 44ZM128 212C88.235 212 56 179.764 56 140 56 100.235 88.235 68 128 68c39.764 0 72 32.235 72 72-.044 39.746-32.254 71.956-72 72ZM164.49 99.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-28 28c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l28-28c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529ZM92 16C92 9.373 97.373 4 104 4h48c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-48C97.373 28 92 22.627 92 16Z"),
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
        return _timer!!
    }

private var _timer: ImageVector? = null
