package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.OrderPlayFill: ImageVector
    get() {
        if (_orderPlayFill != null) return _orderPlayFill!!
        _orderPlayFill = remixIcon(
            name = "OrderPlayFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 4v-1.932c0-.276 .224-.5 .5-.5 .117 0 .23 .041 .32 .116l4.119 3.432c.212 .177 .241 .492 .064 .704-.095 .114-.236 .18-.384 .18h-19.619v-2h15ZM2 18h20v2h-20v-2ZM2 11h20v2h-20v-2Z"),
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
        return _orderPlayFill!!
    }

private var _orderPlayFill: ImageVector? = null
