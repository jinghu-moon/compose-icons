package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorThinIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.39 92.29C233.835 87.319 229.209 83.952 224 84h-64L139.42 20.47c-1.527-5.026-6.162-8.463-11.415-8.463-5.253 0-9.888 3.436-11.415 8.463L96 84h-64c-5.196 .016-9.791 3.374-11.384 8.319-1.594 4.945 .176 10.354 4.384 13.401L76.82 143 57 204.25c-1.661 4.942 .11 10.389 4.36 13.41 4.181 3.112 9.909 3.112 14.09 0L128 179.83l52.58 37.83c4.205 3.057 9.899 3.058 14.106 .004 4.207-3.054 5.968-8.469 4.364-13.414L179.18 143 231 105.7c4.261-3.013 6.044-8.461 4.39-13.41ZM124.21 22.88c.462-1.716 2.018-2.909 3.795-2.909 1.777 0 3.333 1.193 3.795 2.909L151.62 84h-47.24ZM29.67 99.23C28.277 98.212 27.693 96.415 28.222 94.773 28.751 93.131 30.274 92.013 32 92h61.37l-14 43ZM70.67 211.23c-1.402 1.013-3.296 1.011-4.695-.006-1.399-1.017-1.986-2.818-1.455-4.464h0L83.6 147.96l37.51 27ZM86.19 139.97 101.78 92h52.44l15.55 47.93L128 170ZM191.4 206.76c.536 1.651-.055 3.459-1.462 4.476-1.407 1.017-3.309 1.01-4.708-.016L134.85 174.9l37.51-27ZM226.3 99.26 176.59 135l-14-43h61.41c1.725 .006 3.253 1.117 3.789 2.757 .536 1.64-.04 3.439-1.429 4.463Z"),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
