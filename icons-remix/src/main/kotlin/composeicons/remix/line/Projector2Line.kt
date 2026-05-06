package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Projector2Line: ImageVector
    get() {
        if (_projector2Line != null) return _projector2Line!!
        _projector2Line = remixIcon(
            name = "Projector2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 19v2h-2v-2h-16v2h-2v-2C1.448 19 1 18.552 1 18v-12C1 5.448 1.448 5 2 5h10.528C13.626 3.773 15.223 3 17 3c1.777 0 3.374 .773 4.472 2h.528c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1ZM11.341 7h-8.341v10h18v-3.528C19.938 14.422 18.537 15 17 15 13.686 15 11 12.314 11 9c0-.701 .12-1.374 .341-2ZM17 13c2.209 0 4-1.791 4-4C21 6.791 19.209 5 17 5 14.791 5 13 6.791 13 9c0 2.209 1.791 4 4 4ZM5 13h2v2h-2v-2ZM8 13h2v2h-2v-2Z"),
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
        return _projector2Line!!
    }

private var _projector2Line: ImageVector? = null
