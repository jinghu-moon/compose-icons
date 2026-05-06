package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Warning: ImageVector
    get() {
        if (_warning != null) return _warning!!
        _warning = phosphorFillIcon(
            name = "Warning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.8 188.09 149.35 36.22h0C144.903 28.649 136.78 23.999 128 23.999c-8.78 0-16.903 4.65-21.35 12.221L19.2 188.09c-4.281 7.327-4.281 16.393 0 23.72 4.392 7.621 12.554 12.281 21.35 12.19h174.9c8.789 .084 16.941-4.575 21.33-12.19 4.287-7.324 4.295-16.389 .02-23.72ZM120 104c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM128 192c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _warning!!
    }

private var _warning: ImageVector? = null
