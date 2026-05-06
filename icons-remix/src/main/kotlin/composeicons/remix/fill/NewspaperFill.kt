package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NewspaperFill: ImageVector
    get() {
        if (_newspaperFill != null) return _newspaperFill!!
        _newspaperFill = remixIcon(
            name = "NewspaperFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 22h-14C3.343 22 2 20.657 2 19v-16C2 2.448 2.448 2 3 2h14c.552 0 1 .448 1 1v7h4v9c0 1.657-1.343 3-3 3ZM18 12v7c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-7h-2ZM5 6v6h6v-6h-6ZM5 13v2h10v-2h-10ZM5 16v2h10v-2h-10ZM7 8h2v2h-2v-2Z"),
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
        return _newspaperFill!!
    }

private var _newspaperFill: ImageVector? = null
