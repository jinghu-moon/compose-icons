package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DvFill: ImageVector
    get() {
        if (_dvFill != null) return _dvFill!!
        _dvFill = remixIcon(
            name = "DvFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 14.745C2.187 13.48 1 11.379 1 9 1 5.134 4.134 2 8 2c3.866 0 7 3.134 7 7 0 2.379-1.186 4.48-3 5.745v6.255c0 .552-.448 1-1 1h-6C4.448 22 4 21.552 4 21v-6.255ZM8 14c2.761 0 5-2.239 5-5C13 6.239 10.761 4 8 4 5.239 4 3 6.239 3 9c0 2.761 2.239 5 5 5ZM7 18v2h2v-2h-2ZM8 12C6.343 12 5 10.657 5 9 5 7.343 6.343 6 8 6c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3ZM14 17v-1.292C15.841 14.06 17 11.665 17 9 17 6.695 16.133 4.592 14.708 3h6.292c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-7ZM18 7v2h2v-2h-2Z"),
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
        return _dvFill!!
    }

private var _dvFill: ImageVector? = null
