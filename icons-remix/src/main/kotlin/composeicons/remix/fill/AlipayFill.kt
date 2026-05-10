package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlipayFill: ImageVector
    get() {
        if (_alipayFill != null) return _alipayFill!!
        _alipayFill = remixIcon(
            name = "AlipayFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.422 15.358C17.593 14.205 15.367 13.518 14.744 13.296c.568-.976 1.024-2.096 1.32-3.32h-3.264v-1.104h4v-.68h-4v-1.848h-1.536c-.28 0-.312 .248-.312 .248v1.592h-3.752v.68h3.752v1.104h-3.072v.616h6.224c-.224 .776-.528 1.512-.888 2.176-1.408-.464-2.192-.784-3.912-.944C6.048 11.504 5.296 13.296 5.176 14.392 5 16.064 6.48 17.424 8.688 17.424c2.208 0 3.68-1.024 5.08-2.72 1.167 .558 3.338 1.525 6.514 2.902C18.483 20.258 15.445 22 12 22 6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 1.178-.204 2.308-.578 3.358ZM8.432 16.368c-2.336 0-2.704-1.48-2.584-2.096 .12-.616 .8-1.416 2.104-1.416 1.496 0 2.832 .384 4.44 1.16-1.136 1.48-2.52 2.352-3.96 2.352Z"),
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
        return _alipayFill!!
    }

private var _alipayFill: ImageVector? = null
