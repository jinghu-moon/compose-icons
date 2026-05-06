package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Warning: ImageVector
    get() {
        if (_warning != null) return _warning!!
        _warning = phosphorRegularIcon(
            name = "Warning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.8 188.09 149.35 36.22h0C144.903 28.649 136.78 23.999 128 23.999c-8.78 0-16.903 4.65-21.35 12.221L19.2 188.09c-4.281 7.327-4.281 16.393 0 23.72 4.392 7.621 12.554 12.281 21.35 12.19h174.9c8.789 .084 16.941-4.575 21.33-12.19 4.287-7.324 4.295-16.389 .02-23.72ZM222.93 203.8c-1.552 2.648-4.411 4.253-7.48 4.2h-174.9c-3.069 .053-5.928-1.552-7.48-4.2-1.406-2.381-1.406-5.339 0-7.72L120.52 44.21c1.582-2.633 4.429-4.243 7.5-4.243 3.071 0 5.918 1.61 7.5 4.243l87.45 151.87c1.394 2.388 1.379 5.346-.04 7.72ZM120 144v-40c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM140 180c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
