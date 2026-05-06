package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = phosphorThinIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.34 190.09 145.88 38.22C142.151 31.887 135.349 27.999 128 27.999c-7.349 0-14.151 3.888-17.88 10.221L22.66 190.09c-3.561 6.088-3.561 13.622 0 19.71 3.676 6.384 10.514 10.285 17.88 10.2h174.92c7.359 .078 14.188-3.822 17.86-10.2 3.567-6.084 3.574-13.619 .02-19.71ZM226.4 205.8c-2.261 3.889-6.442 6.258-10.94 6.2h-174.92c-4.498 .058-8.679-2.311-10.94-6.2-2.151-3.611-2.151-8.109 0-11.72L117.05 42.21c2.304-3.851 6.462-6.209 10.95-6.209 4.488 0 8.646 2.358 10.95 6.209l87.45 151.87c2.151 3.611 2.151 8.109 0 11.72Z"),
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
        return _triangle!!
    }

private var _triangle: ImageVector? = null
