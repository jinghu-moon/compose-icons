package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShapeFill: ImageVector
    get() {
        if (_shapeFill != null) return _shapeFill!!
        _shapeFill = remixIcon(
            name = "ShapeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 8C3.343 8 2 6.657 2 5 2 3.343 3.343 2 5 2 6.657 2 8 3.343 8 5 8 6.657 6.657 8 5 8ZM19 8C17.343 8 16 6.657 16 5 16 3.343 17.343 2 19 2c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3ZM19 22c-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3ZM5 22C3.343 22 2 20.657 2 19 2 17.343 3.343 16 5 16c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3ZM9 4h6v2h-6v-2ZM9 18h6v2h-6v-2ZM4 9h2v6h-2v-6ZM18 9h2v6h-2v-6Z"),
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
        return _shapeFill!!
    }

private var _shapeFill: ImageVector? = null
