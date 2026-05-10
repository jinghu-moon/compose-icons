package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Puzzle2Fill: ImageVector
    get() {
        if (_puzzle2Fill != null) return _puzzle2Fill!!
        _puzzle2Fill = remixIcon(
            name = "Puzzle2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 4C8 2.343 9.343 1 11 1c1.657 0 3 1.343 3 3 0 .351-.06 .687-.171 1h6.171c.552 0 1 .448 1 1v3.126c0 .309-.143 .601-.387 .79-.244 .189-.563 .255-.862 .178C19.512 10.033 19.26 10 19 10c-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3 .26 0 .512-.033 .751-.094 .299-.077 .618-.011 .862 .178 .244 .19 .387 .481 .387 .79v3.126c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-14C3 5.448 3.448 5 4 5h4.171C8.06 4.687 8 4.351 8 4Z"),
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
        return _puzzle2Fill!!
    }

private var _puzzle2Fill: ImageVector? = null
