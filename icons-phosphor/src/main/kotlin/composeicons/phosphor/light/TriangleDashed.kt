package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TriangleDashed: ImageVector
    get() {
        if (_triangleDashed != null) return _triangleDashed!!
        _triangleDashed = phosphorLightIcon(
            name = "TriangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M158 216c0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6ZM235.07 189.09 230.41 181c-1.657-2.872-5.328-3.857-8.2-2.2-2.872 1.657-3.857 5.328-2.2 8.2l4.66 8.09c1.785 2.994 1.785 6.726 0 9.72-1.903 3.272-5.425 5.261-9.21 5.2h-23.46c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h23.45c8.074 .081 15.565-4.196 19.6-11.19 3.93-6.708 3.937-15.014 .02-21.73ZM64 210h-23.45c-3.785 .061-7.307-1.928-9.21-5.2-1.785-2.994-1.785-6.726 0-9.72L36 187c1.657-2.872 .672-6.543-2.2-8.2-2.872-1.657-6.543-.672-8.2 2.2l-4.66 8.08c-3.92 6.71-3.92 15.01 0 21.72 4.034 7.001 11.53 11.282 19.61 11.2h23.45c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM202.18 150c2.144 .001 4.126-1.142 5.199-2.998 1.073-1.857 1.073-4.145 .001-6.002l-23-40c-1.657-2.872-5.328-3.857-8.2-2.2-2.872 1.657-3.857 5.328-2.2 8.2l23 40c1.072 1.858 3.055 3.001 5.2 3ZM147.61 37.22C143.523 30.27 136.062 26.003 128 26.003c-8.062 0-15.523 4.267-19.61 11.217L94.69 61c-1.657 2.872-.672 6.543 2.2 8.2 2.872 1.657 6.543 .672 8.2-2.2L118.79 43.22c1.945-3.23 5.439-5.206 9.21-5.206 3.771 0 7.265 1.975 9.21 5.206L150.91 67c1.657 2.872 5.328 3.857 8.2 2.2 2.872-1.657 3.857-5.328 2.2-8.2ZM79.85 98.8C76.981 97.148 73.315 98.133 71.66 101L48.66 141c-1.304 1.856-1.451 4.288-.378 6.287 1.072 1.999 3.18 3.222 5.448 3.161 2.267-.061 4.307-1.395 5.271-3.448L82 107c1.667-2.859 .705-6.527-2.15-8.2Z"),
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
        return _triangleDashed!!
    }

private var _triangleDashed: ImageVector? = null
