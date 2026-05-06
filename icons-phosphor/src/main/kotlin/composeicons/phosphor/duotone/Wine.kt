package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorDuotoneIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M182.48 162.5c-30.668 28.694-78.332 28.694-109 0C58.147 148.021 52.276 126.14 58.3 105.93l1.57-5.31h0C72.49 95.21 95.2 91.4 128 108c35.86 18.16 59.67 11.89 71.42 5.84h0c2.642 18.013-3.683 36.182-16.94 48.66Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M205.33 103.67 183.56 29.74C182.558 26.338 179.436 24.002 175.89 24h-95.78c-3.546 .002-6.668 2.338-7.67 5.74L50.67 103.67c-6.968 23.115-.215 48.182 17.42 64.67 14.222 13.335 32.494 21.533 51.91 23.29v40.37h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-32v-40.37c19.417-1.756 37.689-9.954 51.91-23.29 17.631-16.491 24.383-41.555 17.42-64.67ZM86.09 40h83.82L190 108.19c.09 .3 .17 .6 .25 .9-21.42 7.68-45.54-1.6-58.63-8.23C106.43 88.11 86.43 86.49 71.68 88.93ZM177 156.65c-27.567 25.813-70.433 25.813-98 0C65.804 144.283 60.765 125.501 66 108.19l.45-1.52c12-4.06 31.07-5.14 57.93 8.47 11.15 5.65 29.16 12.85 48.43 12.85 6.441 .031 12.853-.844 19.05-2.6-.816 11.926-6.127 23.098-14.86 31.26Z"),
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
