package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorFillIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M71.22 190.47c-10.711 4.861-22.139 7.955-33.84 9.16-1.579 .164-3.105-.621-3.89-2C24.82 182.35 21.97 163.34 25.49 142.48 29.98 115.56 44.58 88.61 66.61 66.58c22.03-22.03 49-36.63 75.9-41.12 22.79-3.79 43.37 0 59.29 10.6 1.331 .874 2.017 2.455 1.746 4.025-.271 1.57-1.448 2.829-2.996 3.205-7.494 1.786-14.801 4.284-21.82 7.46-21.77 9.9-49.6 31.06-58.52 75.7-6.11 30.28-22.58 51.82-48.99 64.02ZM222.51 58.38c-.784-1.376-2.305-2.16-3.88-2-11.705 1.198-23.138 4.291-33.85 9.16-26.41 12.2-42.88 33.74-48.94 64-8.93 44.64-36.75 65.8-58.52 75.7-7.019 3.176-14.326 5.674-21.82 7.46-1.584 .357-2.794 1.636-3.064 3.237-.27 1.601 .455 3.206 1.834 4.063 11.87 7.92 26.32 12 42.35 12 5.67-.016 11.329-.498 16.92-1.44 26.91-4.49 53.87-19.09 75.9-41.12 22.03-22.03 36.63-49 41.12-75.9C234 92.68 231.18 73.66 222.51 58.38Z"),
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
