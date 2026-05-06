package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Calendar2Line: ImageVector
    get() {
        if (_calendar2Line != null) return _calendar2Line!!
        _calendar2Line = remixIcon(
            name = "Calendar2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 1v2h6v-2h2v2h4c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h4v-2h2ZM20 11h-16v8h16v-8ZM8 13v2h-2v-2h2ZM13 13v2h-2v-2h2ZM18 13v2h-2v-2h2ZM7 5h-3v4h16v-4h-3v2h-2v-2h-6v2h-2v-2Z"),
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
        return _calendar2Line!!
    }

private var _calendar2Line: ImageVector? = null
