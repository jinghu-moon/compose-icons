package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitRepositoryLine: ImageVector
    get() {
        if (_gitRepositoryLine != null) return _gitRepositoryLine!!
        _gitRepositoryLine = remixIcon(
            name = "GitRepositoryLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 21v2.5l-3-2-3 2v-2.5h-.5C4.567 21 3 19.433 3 17.5v-12.5C3 3.343 4.343 2 6 2h14c.552 0 1 .448 1 1v17c0 .552-.448 1-1 1h-7ZM13 19h6v-3h-12.5C5.672 16 5 16.672 5 17.5 5 18.328 5.672 19 6.5 19h.5v-2h6v2ZM19 14v-10h-13v10.035C6.163 14.012 6.33 14 6.5 14h12.5ZM7 5h2v2h-2v-2ZM7 8h2v2h-2v-2ZM7 11h2v2h-2v-2Z"),
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
        return _gitRepositoryLine!!
    }

private var _gitRepositoryLine: ImageVector? = null
