package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorFillIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233 135C228.087 116.65 214.775 101.71 197.111 94.723c-17.665-6.987-37.594-5.197-53.731 4.827L159.77 34.11c.834-3.334-.555-6.828-3.45-8.68C137.793 13.731 114.362 13.062 95.198 23.685 76.033 34.307 64.183 54.532 64.286 76.443c.103 21.911 12.141 42.024 31.404 52.467L30.82 147.44c-3.305 .941-5.639 3.888-5.8 7.32-1.268 28.14 17.21 53.374 44.42 60.66 5.094 1.368 10.345 2.064 15.62 2.07 16.239-.043 31.768-6.659 43.049-18.339 11.281-11.68 17.353-27.431 16.831-43.661l48.48 46.92c2.472 2.392 6.197 2.936 9.25 1.35C227.66 190.794 240.274 162.197 233 135ZM130.44 147.85c-8.029 .987-15.862-2.959-19.846-9.999-3.984-7.04-3.336-15.787 1.644-22.162 4.979-6.375 13.309-9.123 21.104-6.962 7.795 2.161 13.522 8.805 14.508 16.834 1.347 10.963-6.447 20.942-17.41 22.29Z"),
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
        return _fan!!
    }

private var _fan: ImageVector? = null
