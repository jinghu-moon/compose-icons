package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DiscLine: ImageVector
    get() {
        if (_discLine != null) return _discLine!!
        _discLine = remixIcon(
            name = "DiscLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 4.582v7.418c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12 9 10.343 10.343 9 12 9c.351 0 .687 .06 1 .171v-7.121c5.053 .502 9 4.765 9 9.951 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.815 5.947 2.551 11 2.049v2.013C7.054 4.554 4 7.92 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 8.643 17.932 5.768 15 4.582Z"),
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
        return _discLine!!
    }

private var _discLine: ImageVector? = null
