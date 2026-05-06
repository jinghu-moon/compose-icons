package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitClosePullRequestFill: ImageVector
    get() {
        if (_gitClosePullRequestFill != null) return _gitClosePullRequestFill!!
        _gitClosePullRequestFill = remixIcon(
            name = "GitClosePullRequestFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 6C3 4.343 4.343 3 6 3 7.657 3 9 4.343 9 6 9 7.306 8.165 8.417 7 8.829v6.341c1.165 .412 2 1.523 2 2.829 0 1.657-1.343 3-3 3C4.343 21 3 19.657 3 18c0-1.306 .835-2.417 2-2.829v-6.341C3.835 8.417 3 7.306 3 6ZM15.293 3.293c.391-.391 1.024-.391 1.414 0L18 4.586 19.293 3.293c.39-.391 1.024-.391 1.414 0 .391 .391 .391 1.024 0 1.414L19.414 6l1.293 1.293c.391 .391 .391 1.024 0 1.414-.39 .391-1.024 .391-1.414 0L18 7.414 16.707 8.707c-.39 .391-1.024 .391-1.414 0-.391-.391-.391-1.024 0-1.414L16.586 6 15.293 4.707c-.391-.391-.391-1.024 0-1.414ZM18 10c.552 0 1 .448 1 1v4.171c1.165 .412 2 1.523 2 2.829 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.306 .835-2.417 2-2.829v-4.171c0-.552 .448-1 1-1Z"),
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
        return _gitClosePullRequestFill!!
    }

private var _gitClosePullRequestFill: ImageVector? = null
