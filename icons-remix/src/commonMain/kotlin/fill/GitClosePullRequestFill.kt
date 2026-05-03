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
                pathData = parseSvgPathData("M 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 C 7.657 3.000 9.000 4.343 9.000 6.000 C 9.000 7.306 8.165 8.417 7.000 8.829 L 7.000 15.171 C 8.165 15.583 9.000 16.694 9.000 18.000 C 9.000 19.657 7.657 21.000 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 C 3.000 16.694 3.835 15.583 5.000 15.171 L 5.000 8.829 C 3.835 8.417 3.000 7.306 3.000 6.000 ZM 15.293 3.293 C 15.683 2.902 16.317 2.902 16.707 3.293 L 18.000 4.586 L 19.293 3.293 C 19.683 2.902 20.317 2.902 20.707 3.293 C 21.098 3.683 21.098 4.317 20.707 4.707 L 19.414 6.000 L 20.707 7.293 C 21.098 7.683 21.098 8.317 20.707 8.707 C 20.317 9.098 19.683 9.098 19.293 8.707 L 18.000 7.414 L 16.707 8.707 C 16.317 9.098 15.683 9.098 15.293 8.707 C 14.902 8.317 14.902 7.683 15.293 7.293 L 16.586 6.000 L 15.293 4.707 C 14.902 4.317 14.902 3.683 15.293 3.293 ZM 18.000 10.000 C 18.552 10.000 19.000 10.448 19.000 11.000 L 19.000 15.171 C 20.165 15.583 21.000 16.694 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 C 16.343 21.000 15.000 19.657 15.000 18.000 C 15.000 16.694 15.835 15.583 17.000 15.171 L 17.000 11.000 C 17.000 10.448 17.448 10.000 18.000 10.000 Z"),
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
