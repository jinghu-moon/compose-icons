package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LoopLeftAiFill: ImageVector
    get() {
        if (_loopLeftAiFill != null) return _loopLeftAiFill!!
        _loopLeftAiFill = remixIcon(
            name = "LoopLeftAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 12c0 4.418 3.582 8 8 8 2.59 0 4.894-1.23 6.357-3.143L16 14.5h6v6L19.781 18.281C17.949 20.548 15.144 22 12 22 6.477 22 2 17.523 2 12h2ZM11.529 8.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .566c-.18 .414-.753 .414-.934 0l-.246-.566C10.848 14.119 10.055 13.316 9.067 12.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611ZM12 2c5.523 0 10 4.477 10 10h-2C20 7.582 16.418 4 12 4 9.41 4 7.106 5.23 5.643 7.143L8 9.5h-6v-6L4.219 5.719C6.051 3.452 8.856 2 12 2Z"),
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
        return _loopLeftAiFill!!
    }

private var _loopLeftAiFill: ImageVector? = null
