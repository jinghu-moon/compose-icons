package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorBoldIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.58 41.42C196.86 23.71 171 16.63 141.81 21.5 114.07 26.12 86.35 41.12 63.73 63.73 41.11 86.34 26.12 114.07 21.5 141.81c-4.87 29.21 2.21 55.05 19.92 72.77C55.48 228.64 74.67 236 96.6 236c5.895-.017 11.778-.518 17.59-1.5 27.74-4.62 55.46-19.62 78.08-42.23 22.62-22.61 37.61-50.34 42.23-78.08C239.37 85 232.29 59.14 214.58 41.42ZM45.17 145.75c3.8-22.84 16.42-45.94 35.53-65C99.81 61.69 122.91 49 145.75 45.17c4.467-.763 8.989-1.154 13.52-1.17 6.173-.045 12.319 .821 18.24 2.57-8.164 3.663-15.85 8.307-22.89 13.83-20 15.77-32.88 37.72-38.38 65.25-8.95 44.73-40.3 61.1-62.07 67.09-8.92-11.91-12.11-28.33-9-46.99ZM210.83 110.25c-3.8 22.84-16.42 45.94-35.53 65.05C156.19 194.41 133.09 207 110.25 210.83c-11.65 1.94-22.4 1.41-31.75-1.42 8.159-3.652 15.839-8.29 22.87-13.81 20-15.77 32.89-37.72 38.39-65.25 9-44.73 40.3-61.1 62.07-67.09 8.92 11.91 12.11 28.33 9 46.99Z"),
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
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
