package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorRegularIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.33 103.67 183.56 29.74C182.558 26.338 179.436 24.002 175.89 24h-95.78c-3.546 .002-6.668 2.338-7.67 5.74L50.67 103.67c-6.968 23.115-.215 48.182 17.42 64.67 14.221 13.336 32.493 21.534 51.91 23.29v40.37h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-32v-40.37c19.416-1.757 37.688-9.955 51.91-23.29 17.635-16.488 24.388-41.555 17.42-64.67ZM86.09 40h83.82L190 108.19c.09 .3 .17 .6 .25 .9-21.42 7.68-45.54-1.6-58.63-8.23C106.43 88.11 86.43 86.49 71.68 88.93ZM177 156.65c-27.567 25.813-70.433 25.813-98 0C65.804 144.283 60.765 125.501 66 108.19l.45-1.52c12-4.06 31.07-5.14 57.93 8.47 11.15 5.65 29.16 12.85 48.43 12.85 6.441 .031 12.853-.844 19.05-2.6-.816 11.926-6.127 23.098-14.86 31.26Z"),
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
