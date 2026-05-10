package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NotionFill: ImageVector
    get() {
        if (_notionFill != null) return _notionFill!!
        _notionFill = remixIcon(
            name = "NotionFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.104 5.91c.584 .474 .803 .438 1.898 .365L18.334 5.654c.219 0 .037-.219-.036-.255L16.582 4.159c-.329-.255-.767-.548-1.606-.474L4.971 4.414c-.365 .036-.438 .219-.292 .365L6.104 5.91ZM6.724 8.318v10.871c0 .584 .292 .803 .949 .767l11.355-.657c.657-.036 .731-.438 .731-.913v-10.798c0-.474-.182-.729-.585-.693L7.308 7.588c-.438 .037-.584 .256-.584 .73ZM17.934 8.901c.073 .329 0 .657-.329 .694l-.547 .109v8.026c-.475 .255-.913 .401-1.278 .401-.584 0-.731-.182-1.168-.729L11.032 11.783v5.436l1.132 .256c0 0 0 .656-.914 .656l-2.519 .146c-.073-.146 0-.511 .255-.584l.657-.182v-7.187l-.913-.073c-.073-.329 .109-.803 .621-.839l2.702-.182 3.724 5.691v-5.034l-.95-.109c-.073-.402 .219-.694 .584-.73l2.52-.147ZM4.132 3.429 14.538 2.663c1.278-.11 1.607-.036 2.41 .547l3.322 2.335c.548 .401 .731 .511 .731 .948v12.805c0 .802-.292 1.277-1.314 1.35L7.601 21.378c-.767 .037-1.132-.073-1.534-.584L3.621 17.62C3.182 17.036 3 16.599 3 16.087v-11.382C3 4.049 3.292 3.502 4.132 3.429Z"),
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
        return _notionFill!!
    }

private var _notionFill: ImageVector? = null
