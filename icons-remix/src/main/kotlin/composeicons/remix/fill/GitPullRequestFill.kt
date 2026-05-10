package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitPullRequestFill: ImageVector
    get() {
        if (_gitPullRequestFill != null) return _gitPullRequestFill!!
        _gitPullRequestFill = remixIcon(
            name = "GitPullRequestFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 5h2c1.105 0 2 .895 2 2v8.171c1.165 .412 2 1.523 2 2.829 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.306 .835-2.417 2-2.829v-8.171h-2v3L10.5 6 15 2v3ZM5 8.829C3.835 8.417 3 7.306 3 6 3 4.343 4.343 3 6 3 7.657 3 9 4.343 9 6 9 7.306 8.165 8.417 7 8.829v6.341c1.165 .412 2 1.523 2 2.829 0 1.657-1.343 3-3 3C4.343 21 3 19.657 3 18c0-1.306 .835-2.417 2-2.829v-6.341Z"),
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
        return _gitPullRequestFill!!
    }

private var _gitPullRequestFill: ImageVector? = null
