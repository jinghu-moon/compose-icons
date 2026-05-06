package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TriangleDashed: ImageVector
    get() {
        if (_triangleDashed != null) return _triangleDashed!!
        _triangleDashed = phosphorFillIcon(
            name = "TriangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.8 188.09 149.35 36.22C144.903 28.649 136.78 23.999 128 23.999c-8.78 0-16.903 4.65-21.35 12.221L19.2 188.09c-4.281 7.327-4.281 16.393 0 23.72 4.391 7.623 12.553 12.283 21.35 12.19h174.9c8.79 .086 16.943-4.573 21.33-12.19 4.287-7.324 4.295-16.389 .02-23.72ZM108 200h-47.21c-4.287-.001-8.248-2.288-10.391-6.001-2.143-3.713-2.143-8.287 .001-11.999L74.58 140c2.209-3.83 7.105-5.144 10.935-2.935 3.83 2.209 5.144 7.105 2.935 10.935L67.71 184h40.29c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM106.88 116c-2.209 3.833-7.107 5.149-10.94 2.94C92.107 116.731 90.791 111.833 93 108L117.59 65.3c2.142-3.72 6.107-6.013 10.4-6.013 4.293 0 8.258 2.293 10.4 6.013L163 108c2.209 3.83 .895 8.726-2.935 10.935-3.83 2.209-8.726 .895-10.935-2.935L128 79.31ZM205.6 194c-2.151 3.705-6.106 5.989-10.39 6h-47.21c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40.29L167.55 148c-2.209-3.83-.895-8.726 2.935-10.935 3.83-2.209 8.726-.895 10.935 2.935l24.18 42c2.144 3.713 2.144 8.287 0 12Z"),
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
