package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ThumbDownLine: ImageVector
    get() {
        if (_thumbDownLine != null) return _thumbDownLine!!
        _thumbDownLine = remixIcon(
            name = "ThumbDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.4 16h-6.4C1.895 16 1 15.105 1 14v-2.104c0-.261 .051-.52 .151-.762L4.245 3.619C4.399 3.245 4.764 3 5.17 3h16.83c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-3.482c-.325 0-.63 .158-.817 .423l-5.453 7.726c-.142 .202-.411 .269-.632 .159L9.802 22.401C8.75 21.875 8.207 20.687 8.497 19.548L9.4 16ZM17 13.413v-8.413h-11.161L3 11.896v2.104h6.4c1.305 0 2.26 1.229 1.938 2.493l-.903 3.548c-.058 .228 .051 .465 .261 .571l.661 .33 4.71-6.672c.25-.354 .569-.644 .933-.858ZM19 13h2v-8h-2v8Z"),
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
        return _thumbDownLine!!
    }

private var _thumbDownLine: ImageVector? = null
