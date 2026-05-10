package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EarthFill: ImageVector
    get() {
        if (_earthFill != null) return _earthFill!!
        _earthFill = remixIcon(
            name = "EarthFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM16.004 12.878c-.345-.524-.595-.903-1.542-.753-1.791 .284-1.989 .598-2.075 1.113l-.024 .157-.024 .165c-.098 .683-.094 .941 .22 1.271 1.265 1.327 2.023 2.284 2.253 2.844 .112 .274 .4 1.101 .202 1.918 1.224-.486 2.302-1.259 3.152-2.237 .11-.374 .19-.839 .19-1.404v-.105c0-.923 0-1.343-.652-1.716-.275-.156-.48-.25-.645-.325-.367-.167-.61-.277-.938-.757-.039-.057-.077-.114-.116-.172ZM12 3.833c-2.317 0-4.409 .965-5.896 2.516 .177 .123 .331 .296 .437 .534 .204 .458 .204 .929 .204 1.345-0 .329-.001 .64 .105 .865 .145 .308 .766 .439 1.316 .554 .196 .041 .398 .083 .582 .134 .506 .141 .898 .595 1.211 .959 .13 .152 .323 .375 .419 .43 .05-.036 .212-.211 .292-.498 .061-.219 .043-.414-.046-.519-.559-.66-.529-1.931-.356-2.399 .272-.739 1.123-.684 1.744-.644 .232 .015 .451 .029 .614 .009 .623-.078 .814-1.024 .949-1.21 .292-.4 1.186-1.003 1.741-1.375C14.302 4.084 13.181 3.833 12 3.833Z"),
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
        return _earthFill!!
    }

private var _earthFill: ImageVector? = null
