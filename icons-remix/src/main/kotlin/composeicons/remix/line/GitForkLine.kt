package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitForkLine: ImageVector
    get() {
        if (_gitForkLine != null) return _gitForkLine!!
        _gitForkLine = remixIcon(
            name = "GitForkLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 5C5.448 5 5 5.448 5 6c0 .552 .448 1 1 1C6.552 7 7 6.552 7 6 7 5.448 6.552 5 6 5ZM3 6C3 4.343 4.343 3 6 3 7.657 3 9 4.343 9 6 9 7.306 8.165 8.417 7 8.829v.171c0 1.105 .895 2 2 2h6c1.105 0 2-.895 2-2v-.171C15.835 8.417 15 7.306 15 6 15 4.343 16.343 3 18 3c1.657 0 3 1.343 3 3 0 1.306-.835 2.417-2 2.829v.171c0 2.209-1.791 4-4 4h-2v2.171c1.165 .412 2 1.523 2 2.829 0 1.657-1.343 3-3 3C10.343 21 9 19.657 9 18c0-1.306 .835-2.417 2-2.829v-2.171h-2C6.791 13 5 11.209 5 9v-.171C3.835 8.417 3 7.306 3 6ZM18 5c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1C19 5.448 18.552 5 18 5ZM12 17c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1Z"),
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
        return _gitForkLine!!
    }

private var _gitForkLine: ImageVector? = null
