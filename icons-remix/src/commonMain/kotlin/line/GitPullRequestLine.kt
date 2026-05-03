package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitPullRequestLine: ImageVector
    get() {
        if (_gitPullRequestLine != null) return _gitPullRequestLine!!
        _gitPullRequestLine = remixIcon(
            name = "GitPullRequestLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 5.000 L 17.000 5.000 C 18.105 5.000 19.000 5.895 19.000 7.000 L 19.000 15.171 C 20.165 15.583 21.000 16.694 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 C 16.343 21.000 15.000 19.657 15.000 18.000 C 15.000 16.694 15.835 15.583 17.000 15.171 L 17.000 7.000 L 15.000 7.000 L 15.000 10.000 L 10.500 6.000 L 15.000 2.000 L 15.000 5.000 ZM 5.000 8.829 C 3.835 8.417 3.000 7.306 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 C 7.657 3.000 9.000 4.343 9.000 6.000 C 9.000 7.306 8.165 8.417 7.000 8.829 L 7.000 15.171 C 8.165 15.583 9.000 16.694 9.000 18.000 C 9.000 19.657 7.657 21.000 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 C 3.000 16.694 3.835 15.583 5.000 15.171 L 5.000 8.829 ZM 6.000 7.000 C 6.552 7.000 7.000 6.552 7.000 6.000 C 7.000 5.448 6.552 5.000 6.000 5.000 C 5.448 5.000 5.000 5.448 5.000 6.000 C 5.000 6.552 5.448 7.000 6.000 7.000 ZM 6.000 19.000 C 6.552 19.000 7.000 18.552 7.000 18.000 C 7.000 17.448 6.552 17.000 6.000 17.000 C 5.448 17.000 5.000 17.448 5.000 18.000 C 5.000 18.552 5.448 19.000 6.000 19.000 ZM 18.000 19.000 C 18.552 19.000 19.000 18.552 19.000 18.000 C 19.000 17.448 18.552 17.000 18.000 17.000 C 17.448 17.000 17.000 17.448 17.000 18.000 C 17.000 18.552 17.448 19.000 18.000 19.000 Z"),
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
        return _gitPullRequestLine!!
    }

private var _gitPullRequestLine: ImageVector? = null
