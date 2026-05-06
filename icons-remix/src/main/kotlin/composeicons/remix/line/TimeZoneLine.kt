package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TimeZoneLine: ImageVector
    get() {
        if (_timeZoneLine != null) return _timeZoneLine!!
        _timeZoneLine = remixIcon(
            name = "TimeZoneLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 12C4 9.846 4.851 7.891 6.235 6.453c.122 .111 .227 .252 .306 .429 .204 .458 .204 .929 .204 1.345-0 .328-.001 .64 .105 .865 .145 .308 .766 .439 1.316 .554l.02 .004c.19 .04 .385 .081 .563 .13 .506 .141 .898 .595 1.211 .959 .13 .152 .323 .375 .419 .43 .05-.036 .212-.211 .292-.498 .061-.219 .043-.414-.046-.519-.559-.66-.529-1.931-.356-2.399 .272-.739 1.123-.684 1.744-.644l.006 0c.23 .015 .446 .029 .608 .008 .471-.059 .696-.616 .835-.963 .045-.111 .081-.201 .114-.246 .265-.363 1.024-.892 1.577-1.265 2.072 .889 3.693 2.628 4.424 4.779 .853 .29 1.642 .72 2.338 1.263C21.272 5.785 17.078 2 12 2 6.477 2 2 6.477 2 12c0 5.078 3.785 9.272 8.687 9.915-.543-.696-.973-1.485-1.263-2.338C6.269 18.504 4 15.517 4 12ZM17 13c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM11 17c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM16 14v4h4v-2h-2v-2h-2Z"),
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
        return _timeZoneLine!!
    }

private var _timeZoneLine: ImageVector? = null
