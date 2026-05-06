package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PhoneLine: ImageVector
    get() {
        if (_phoneLine != null) return _phoneLine!!
        _phoneLine = remixIcon(
            name = "PhoneLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.366 10.682c.936 1.647 2.306 3.016 3.952 3.952l.885-1.238c.294-.412 .849-.539 1.293-.296 1.407 .769 2.962 1.236 4.583 1.364 .52 .041 .921 .475 .921 .997v4.463c0 .513-.388 .942-.898 .995-.53 .055-1.064 .082-1.602 .082C9.94 21 3 14.06 3 5.5 3 4.962 3.027 4.428 3.082 3.898 3.134 3.388 3.564 3 4.077 3h4.463c.522 0 .956 .401 .997 .921 .128 1.622 .595 3.177 1.364 4.583 .243 .444 .115 .999-.296 1.293l-1.238 .885ZM6.844 10.025 8.744 8.668C8.205 7.505 7.836 6.272 7.647 5h-2.638C5.003 5.166 5 5.333 5 5.5 5 12.956 11.044 19 18.5 19c.167 0 .334-.003 .5-.009v-2.638c-1.272-.189-2.505-.558-3.668-1.097l-1.357 1.9c-.549-.213-1.079-.464-1.587-.75l-.058-.033C10.37 15.259 8.741 13.63 7.627 11.671l-.033-.058c-.285-.508-.536-1.038-.75-1.587Z"),
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
        return _phoneLine!!
    }

private var _phoneLine: ImageVector? = null
