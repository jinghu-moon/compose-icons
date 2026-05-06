package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorLightIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.77 50.34C226.576 45.247 221.546 41.961 216 42h-176c-5.537 .011-10.548 3.284-12.783 8.35-2.235 5.066-1.273 10.974 2.453 15.07l.06 .07L98 138.38v77.62c.002 5.163 2.846 9.906 7.399 12.34 4.553 2.434 10.076 2.165 14.371-.7l32-21.33c3.894-2.598 6.231-6.969 6.23-11.65v-56.28L226.33 65.38c3.753-4.072 4.713-9.991 2.44-15.04ZM217.51 57.28l-69.89 74.62c-1.041 1.112-1.62 2.577-1.62 4.1v58.66c.002 .671-.332 1.298-.89 1.67l-32 21.33c-.613 .409-1.402 .448-2.052 .101-.65-.347-1.057-1.024-1.058-1.761v-80c-0-1.523-.579-2.988-1.62-4.1L38.53 57.32c-.515-.586-.642-1.417-.326-2.13C38.519 54.477 39.22 54.013 40 54h176c.8-.028 1.531 .448 1.83 1.19 .338 .695 .211 1.528-.32 2.09Z"),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
