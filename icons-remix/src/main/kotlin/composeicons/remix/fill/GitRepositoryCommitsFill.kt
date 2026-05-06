package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitRepositoryCommitsFill: ImageVector
    get() {
        if (_gitRepositoryCommitsFill != null) return _gitRepositoryCommitsFill!!
        _gitRepositoryCommitsFill = remixIcon(
            name = "GitRepositoryCommitsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 17v6h-2v-6h-3l4-5 4 5h-3ZM16 19h3v-3h-.8L13 9.5 7.647 16h-1.147C5.672 16 5 16.672 5 17.5 5 18.328 5.672 19 6.5 19h3.5v2h-3.5C4.567 21 3 19.433 3 17.5v-12.5C3 3.343 4.343 2 6 2h14c.552 0 1 .448 1 1v17c0 .552-.448 1-1 1h-4v-2ZM7 5v2h2v-2h-2ZM7 8v2h2v-2h-2Z"),
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
        return _gitRepositoryCommitsFill!!
    }

private var _gitRepositoryCommitsFill: ImageVector? = null
