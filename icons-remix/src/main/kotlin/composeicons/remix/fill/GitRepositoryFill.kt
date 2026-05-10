package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitRepositoryFill: ImageVector
    get() {
        if (_gitRepositoryFill != null) return _gitRepositoryFill!!
        _gitRepositoryFill = remixIcon(
            name = "GitRepositoryFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 21v2.5l-3-2-3 2v-2.5h-.5C4.567 21 3 19.433 3 17.5v-12.5C3 3.343 4.343 2 6 2h14c.552 0 1 .448 1 1v17c0 .552-.448 1-1 1h-7ZM7 19v-2h6v2h6v-3h-12.5C5.672 16 5 16.672 5 17.5 5 18.328 5.672 19 6.5 19h.5ZM7 5v2h2v-2h-2ZM7 8v2h2v-2h-2ZM7 11v2h2v-2h-2Z"),
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
        return _gitRepositoryFill!!
    }

private var _gitRepositoryFill: ImageVector? = null
