package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NewspaperLine: ImageVector
    get() {
        if (_newspaperLine != null) return _newspaperLine!!
        _newspaperLine = remixIcon(
            name = "NewspaperLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 20v-16h-12v15c0 .552 .448 1 1 1h11ZM19 22h-14C3.343 22 2 20.657 2 19v-16C2 2.448 2.448 2 3 2h14c.552 0 1 .448 1 1v7h4v9c0 1.657-1.343 3-3 3ZM18 12v7c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-7h-2ZM6 6h6v6h-6v-6ZM8 8v2h2v-2h-2ZM6 13h8v2h-8v-2ZM6 16h8v2h-8v-2Z"),
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
        return _newspaperLine!!
    }

private var _newspaperLine: ImageVector? = null
