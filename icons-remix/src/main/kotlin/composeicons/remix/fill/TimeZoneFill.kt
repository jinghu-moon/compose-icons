package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TimeZoneFill: ImageVector
    get() {
        if (_timeZoneFill != null) return _timeZoneFill!!
        _timeZoneFill = remixIcon(
            name = "TimeZoneFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.078 0 9.272 3.785 9.915 8.687C20.559 9.63 18.853 9 17 9 12.582 9 9 12.582 9 17c0 1.853 .63 3.559 1.687 4.915C5.785 21.272 2 17.078 2 12 2 6.477 6.477 2 12 2ZM12 3.833c-2.317 0-4.409 .965-5.896 2.516 .177 .123 .331 .296 .437 .534 .204 .458 .204 .929 .204 1.345-0 .328-.001 .64 .105 .865 .145 .308 .766 .439 1.316 .554l.02 .004c.19 .04 .385 .081 .563 .13 .506 .141 .898 .595 1.211 .959 .13 .152 .323 .375 .419 .43 .05-.036 .212-.211 .292-.498 .061-.219 .043-.414-.046-.519-.559-.66-.529-1.931-.356-2.399 .272-.739 1.123-.684 1.744-.644l.006 0c.23 .015 .446 .029 .608 .008 .471-.059 .696-.616 .835-.963 .045-.111 .081-.201 .114-.246 .292-.4 1.186-1.003 1.741-1.375C14.302 4.084 13.181 3.833 12 3.833ZM23 17c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM16 18h4v-2h-2v-2h-2v4Z"),
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
        return _timeZoneFill!!
    }

private var _timeZoneFill: ImageVector? = null
