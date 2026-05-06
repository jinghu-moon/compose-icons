package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ClapperboardAiLine: ImageVector
    get() {
        if (_clapperboardAiLine != null) return _clapperboardAiLine!!
        _clapperboardAiLine = remixIcon(
            name = "ClapperboardAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.467 8.694l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.717-.319C21.962 3.807 21.156 2.974 20.724 1.931l-.253-.611c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.988 .439 1.779 1.242 2.219 2.251l.247 .566c.181 .414 .753 .414 .934 0ZM14.307 3h.034C14.12 3.626 14 4.299 14 5c0 .701 .12 1.374 .341 2h-2.343L14.307 3ZM20 11v8h-16v-12.539L5.998 3h-3.006C2.455 3 2 3.445 2 3.993v16.013c0 .549 .444 .993 .992 .993h18.016c.537 0 .992-.445 .992-.993v-9.007h-2ZM8.307 3 5.998 7h3.691L11.998 3h-3.691Z"),
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
        return _clapperboardAiLine!!
    }

private var _clapperboardAiLine: ImageVector? = null
