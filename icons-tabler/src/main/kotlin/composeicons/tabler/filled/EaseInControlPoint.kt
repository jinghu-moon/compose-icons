package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EaseInControlPoint: ImageVector
    get() {
        if (_easeInControlPoint != null) return _easeInControlPoint!!
        _easeInControlPoint = tablerFilledIcon(
            name = "EaseInControlPoint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 16c1.526 0 2.808 1.145 2.98 2.661 .172 1.516-.821 2.92-2.307 3.262C18.187 22.266 16.68 21.438 16.171 20h-1.171c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h1.17c.424-1.199 1.558-2.001 2.83-2M21.53 2.152c.225 .141 .385 .365 .444 .623 .06 .258 .014 .53-.126 .755l-.286 .445-.173 .264c-.411 .619-.831 1.232-1.26 1.839-1.363 1.933-2.824 3.795-4.376 5.58-2.795 3.195-5.544 5.638-8.171 7.04C5.989 19.546 4.459 20 3 20 2.448 20 2 19.552 2 19c0-.552 .448-1 1-1 1.097 0 2.317-.361 3.64-1.068 2.373-1.265 4.958-3.562 7.607-6.59C15.754 8.608 17.173 6.799 18.497 4.922c.341-.481 .675-.966 1.003-1.456l.455-.69q.133-.204 .196-.306c.141-.225 .365-.385 .623-.444 .258-.06 .53-.014 .755 .126M12 18c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-2C9.448 20 9 19.552 9 19c0-.552 .448-1 1-1Z"),
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
        return _easeInControlPoint!!
    }

private var _easeInControlPoint: ImageVector? = null
