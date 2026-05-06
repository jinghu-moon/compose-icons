package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ThumbDownFill: ImageVector
    get() {
        if (_thumbDownFill != null) return _thumbDownFill!!
        _thumbDownFill = remixIcon(
            name = "ThumbDownFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 15h-3v-12h3c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1ZM16.707 16.293l-6.401 6.4c-.176 .176-.454 .196-.654 .046l-.853-.639c-.485-.364-.703-.983-.554-1.57L9.4 16h-6.4C1.895 16 1 15.105 1 14v-2.104c0-.261 .051-.52 .151-.762L4.245 3.619C4.399 3.245 4.764 3 5.17 3h10.83c.552 0 1 .448 1 1v11.586c0 .265-.105 .52-.293 .707Z"),
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
        return _thumbDownFill!!
    }

private var _thumbDownFill: ImageVector? = null
