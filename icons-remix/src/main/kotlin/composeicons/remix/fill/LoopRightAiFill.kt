package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LoopRightAiFill: ImageVector
    get() {
        if (_loopRightAiFill != null) return _loopRightAiFill!!
        _loopRightAiFill = remixIcon(
            name = "LoopRightAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12c0 5.523-4.477 10-10 10C8.856 22 6.051 20.548 4.219 18.281L2 20.5v-6h6L5.643 16.857C7.106 18.77 9.41 20 12 20c4.418 0 8-3.582 8-8h2ZM11.529 8.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .566c-.18 .414-.753 .414-.934 0l-.246-.566C10.848 14.119 10.055 13.316 9.067 12.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611ZM12 2c3.144 0 5.949 1.452 7.781 3.719L22 3.5v6h-6L18.357 7.143C16.894 5.23 14.59 4 12 4 7.582 4 4 7.582 4 12h-2C2 6.477 6.477 2 12 2Z"),
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
        return _loopRightAiFill!!
    }

private var _loopRightAiFill: ImageVector? = null
