package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorBoldIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M255.8 162.93v-.31C254.062 145.419 242.398 130.836 226 125.36L169.38 105.16l-.24-.09c-5.306-1.769-9.629-5.678-11.92-10.78L134.06 40 134 39.84C129.699 30.274 118.754 25.637 108.89 29.2L33.17 56.73C25.276 59.62 20.02 67.124 20 75.53v116.47c0 11.046 8.954 20 20 20h196c11.046 0 20-8.954 20-20v-24.94c0-1.39-.07-2.76-.2-4.13ZM113.53 53.05l6 14-15.63 5.67c-4.116 1.399-7.154 4.915-7.941 9.191-.786 4.276 .802 8.643 4.151 11.415 3.349 2.772 7.936 3.516 11.99 1.944L129 89.14l4.54 10.63-13.6 5c-5.398 2.031-8.588 7.616-7.595 13.297 .993 5.682 5.887 9.853 11.655 9.933 1.399 .002 2.787-.245 4.1-.73l19.57-7.11c4.1 3.36 8.776 5.948 13.8 7.64L218.09 148l.23 .08c2.518 .834 4.844 2.164 6.84 3.91h-181.16v-73.66ZM44 188v-12h188v12Z"),
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
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
