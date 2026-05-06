package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FootballFill: ImageVector
    get() {
        if (_footballFill != null) return _footballFill!!
        _footballFill = remixIcon(
            name = "FootballFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM13.67 16h-3.34L8.951 17.897l.554 1.706c.785 .258 1.624 .397 2.496 .397 .871 0 1.71-.139 2.496-.397l.553-1.706L13.67 16ZM5.294 10.872l-1.291 .938L4 12c0 1.73 .549 3.331 1.482 4.64l1.91 0L8.715 14.82 7.687 11.65 5.294 10.872ZM18.705 10.872l-2.393 .778-1.028 3.17 1.322 1.82 1.911-0C19.451 15.331 20 13.73 20 12l-.003-.191-1.292-.937ZM14.291 4.333l-1.292 .94v2.517l2.694 1.957 2.239-.727 .554-1.703C17.467 5.907 15.999 4.843 14.291 4.333ZM9.709 4.333C8.001 4.843 6.532 5.907 5.513 7.318l.554 1.702 2.239 .727L11 7.79v-2.517L9.709 4.333Z"),
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
        return _footballFill!!
    }

private var _footballFill: ImageVector? = null
