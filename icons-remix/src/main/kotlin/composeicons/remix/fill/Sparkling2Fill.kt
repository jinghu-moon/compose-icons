package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Sparkling2Fill: ImageVector
    get() {
        if (_sparkling2Fill != null) return _sparkling2Fill!!
        _sparkling2Fill = remixIcon(
            name = "Sparkling2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.001 1.208l1.319 2.473 2.473 1.319L18.319 6.319 17.001 8.792 15.682 6.319 13.209 5 15.682 3.681 17.001 1.208ZM8.001 4.333l2.667 5 5 2.667-5 2.667L8.001 19.667 5.334 14.667 .334 12 5.334 9.333l2.667-5ZM19.667 16.333 18.001 13.208l-1.667 3.125-3.125 1.667 3.125 1.667 1.667 3.125 1.667-3.125 3.125-1.667L19.667 16.333Z"),
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
        return _sparkling2Fill!!
    }

private var _sparkling2Fill: ImageVector? = null
