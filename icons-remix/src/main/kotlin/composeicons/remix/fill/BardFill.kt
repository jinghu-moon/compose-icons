package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BardFill: ImageVector
    get() {
        if (_bardFill != null) return _bardFill!!
        _bardFill = remixIcon(
            name = "BardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.614 17.796l.878-2.01c.781-1.789 2.187-3.213 3.941-3.991l2.416-1.072c.768-.341 .768-1.458 0-1.799L15.508 7.884C13.709 7.086 12.278 5.609 11.51 3.759L10.622 1.617C10.292 .822 9.193 .822 8.863 1.617L7.974 3.759C7.207 5.609 5.776 7.086 3.977 7.884L1.637 8.923c-.768 .341-.768 1.458 0 1.799l2.416 1.072c1.754 .778 3.159 2.202 3.94 3.991l.878 2.01c.337 .773 1.407 .773 1.744 0ZM19.401 22.69l.247-.566c.44-1.009 1.233-1.812 2.221-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.718-.319c-1.014-.451-1.821-1.283-2.253-2.326l-.253-.611c-.177-.426-.766-.426-.942 0l-.253 .611c-.432 1.043-1.239 1.876-2.253 2.326l-.718 .319c-.411 .183-.411 .78 0 .963l.76 .338c.989 .439 1.781 1.242 2.221 2.251l.247 .566c.181 .414 .754 .414 .935 0Z"),
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
        return _bardFill!!
    }

private var _bardFill: ImageVector? = null
