package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BusFill: ImageVector
    get() {
        if (_busFill != null) return _busFill!!
        _busFill = remixIcon(
            name = "BusFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 20h-10v1c0 .552-.448 1-1 1h-1C4.448 22 4 21.552 4 21v-1h-1v-8h-1v-4h1v-3C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v3h1v4h-1v8h-1v1c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-1ZM5 5v9h14v-9h-14ZM5 16v2h4v-2h-4ZM15 16v2h4v-2h-4Z"),
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
        return _busFill!!
    }

private var _busFill: ImageVector? = null
