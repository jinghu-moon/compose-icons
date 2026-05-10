package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorFillIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.33 103.67 183.56 29.74C182.558 26.338 179.436 24.002 175.89 24h-95.78c-3.546 .002-6.668 2.338-7.67 5.74L50.67 103.67c-6.968 23.115-.215 48.182 17.42 64.67 14.222 13.335 32.494 21.533 51.91 23.29v40.37h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-32v-40.37c19.417-1.756 37.689-9.954 51.91-23.29 17.631-16.491 24.383-41.555 17.42-64.67ZM86.09 40h83.82L190 108.19c.09 .3 .17 .6 .25 .9-21.42 7.68-45.54-1.6-58.63-8.23C106.43 88.11 86.43 86.49 71.68 88.93Z"),
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
        return _wine!!
    }

private var _wine: ImageVector? = null
