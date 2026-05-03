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
                pathData = parseSvgPathData("M 22.000 19.000 L 22.000 21.000 L 20.000 21.000 L 20.000 19.000 L 4.000 19.000 L 4.000 21.000 L 2.000 21.000 L 2.000 19.000 C 1.448 19.000 1.000 18.552 1.000 18.000 L 1.000 6.000 C 1.000 5.448 1.448 5.000 2.000 5.000 L 12.528 5.000 C 13.626 3.773 15.223 3.000 17.000 3.000 C 18.777 3.000 20.374 3.773 21.472 5.000 L 22.000 5.000 C 22.552 5.000 23.000 5.448 23.000 6.000 L 23.000 18.000 C 23.000 18.552 22.552 19.000 22.000 19.000 ZM 11.341 7.000 L 3.000 7.000 L 3.000 17.000 L 21.000 17.000 L 21.000 13.472 C 19.938 14.422 18.537 15.000 17.000 15.000 C 13.686 15.000 11.000 12.314 11.000 9.000 C 11.000 8.299 11.120 7.626 11.341 7.000 ZM 17.000 13.000 C 19.209 13.000 21.000 11.209 21.000 9.000 C 21.000 6.791 19.209 5.000 17.000 5.000 C 14.791 5.000 13.000 6.791 13.000 9.000 C 13.000 11.209 14.791 13.000 17.000 13.000 ZM 5.000 13.000 L 7.000 13.000 L 7.000 15.000 L 5.000 15.000 L 5.000 13.000 ZM 8.000 13.000 L 10.000 13.000 L 10.000 15.000 L 8.000 15.000 L 8.000 13.000 Z"),
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
