package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BardLine: ImageVector
    get() {
        if (_bardLine != null) return _bardLine!!
        _bardLine = remixIcon(
            name = "BardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.614 17.796c-.337 .773-1.407 .773-1.744 0L7.993 15.785C7.212 13.997 5.806 12.573 4.052 11.794L1.637 10.722C.869 10.381 .869 9.264 1.637 8.923L3.977 7.884C5.776 7.086 7.207 5.609 7.974 3.759L8.863 1.617c.33-.795 1.428-.795 1.758 0l.889 2.142c.768 1.85 2.199 3.327 3.997 4.125l2.34 1.039c.768 .341 .768 1.458 0 1.799l-2.416 1.072c-1.754 .778-3.159 2.202-3.941 3.991l-.878 2.01ZM4.54 9.822c2.286 1.015 4.144 2.682 5.203 4.977 1.058-2.295 2.917-3.963 5.203-4.977C12.632 8.796 10.768 7.046 9.742 4.711 8.717 7.046 6.853 8.796 4.54 9.822ZM19.401 22.69l.247-.566c.44-1.009 1.233-1.812 2.221-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.718-.319c-1.014-.451-1.821-1.283-2.253-2.326l-.253-.611c-.177-.426-.766-.426-.942 0l-.253 .611c-.432 1.043-1.239 1.876-2.253 2.326l-.718 .319c-.411 .183-.411 .78 0 .963l.76 .338c.989 .439 1.781 1.242 2.221 2.251l.247 .566c.181 .414 .754 .414 .935 0ZM18.375 19.047l.562-.559 .551 .559-.551 .543-.562-.543Z"),
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
        return _bardLine!!
    }

private var _bardLine: ImageVector? = null
