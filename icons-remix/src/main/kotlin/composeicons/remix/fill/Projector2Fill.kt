package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Projector2Fill: ImageVector
    get() {
        if (_projector2Fill != null) return _projector2Fill!!
        _projector2Fill = remixIcon(
            name = "Projector2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 19v2h-2v-2h-16v2h-2v-2C1.448 19 1 18.552 1 18v-12C1 5.448 1.448 5 2 5h9.81C12.993 3.767 14.657 3 16.5 3c1.843 0 3.507 .767 4.69 2h.81c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1ZM16.5 14C18.985 14 21 11.985 21 9.5 21 7.015 18.985 5 16.5 5 14.015 5 12 7.015 12 9.5 12 11.985 14.015 14 16.5 14ZM16.5 12C15.119 12 14 10.881 14 9.5 14 8.119 15.119 7 16.5 7 17.881 7 19 8.119 19 9.5 19 10.881 17.881 12 16.5 12ZM4 13v2h2v-2h-2ZM8 13v2h2v-2h-2Z"),
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
        return _projector2Fill!!
    }

private var _projector2Fill: ImageVector? = null
