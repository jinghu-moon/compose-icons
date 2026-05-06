package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = phosphorDuotoneIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.46 216h-174.92C27.92 216 20 202.79 26.13 192.09L113.59 40.22c6.3-11 22.52-11 28.82 0l87.46 151.87C236 202.79 228.08 216 215.46 216Z"),
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
                pathData = parseSvgPathData("M236.8 188.09 149.35 36.22C144.903 28.649 136.78 23.999 128 23.999c-8.78 0-16.903 4.65-21.35 12.221L19.2 188.09c-4.281 7.327-4.281 16.393 0 23.72 4.391 7.623 12.553 12.283 21.35 12.19h174.9c8.79 .086 16.943-4.573 21.33-12.19 4.287-7.324 4.295-16.389 .02-23.72ZM222.93 203.8c-1.552 2.648-4.411 4.253-7.48 4.2h-174.9c-3.069 .053-5.928-1.552-7.48-4.2-1.406-2.381-1.406-5.339 0-7.72L120.52 44.21c1.582-2.633 4.429-4.243 7.5-4.243 3.071 0 5.918 1.61 7.5 4.243l87.45 151.87c1.394 2.388 1.379 5.346-.04 7.72Z"),
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
