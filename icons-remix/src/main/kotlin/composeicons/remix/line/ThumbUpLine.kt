package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ThumbUpLine: ImageVector
    get() {
        if (_thumbUpLine != null) return _thumbUpLine!!
        _thumbUpLine = remixIcon(
            name = "ThumbUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.6 8h6.4c1.105 0 2 .895 2 2v2.104c0 .261-.051 .52-.151 .762l-3.094 7.515c-.154 .375-.519 .619-.925 .619h-16.83c-.552 0-1-.448-1-1v-10c0-.552 .448-1 1-1h3.482c.325 0 .63-.158 .817-.423L11.752 .851c.142-.202 .411-.269 .632-.159l1.814 .907c1.052 .526 1.595 1.713 1.305 2.853l-.903 3.548ZM7 10.588v8.412h11.161L21 12.105v-2.104h-6.4c-1.305 0-2.26-1.229-1.938-2.493l.903-3.548c.058-.228-.051-.465-.261-.571l-.661-.331L7.933 9.73c-.25 .354-.569 .644-.933 .857ZM5 11h-2v8h2v-8Z"),
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
        return _thumbUpLine!!
    }

private var _thumbUpLine: ImageVector? = null
