package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TimerLine: ImageVector
    get() {
        if (_timerLine != null) return _timerLine!!
        _timerLine = remixIcon(
            name = "TimerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.618 5.968 19.071 4.515l1.414 1.414L19.032 7.382C20.264 8.922 21 10.875 21 13c0 4.971-4.029 9-9 9C7.029 22 3 17.971 3 13 3 8.029 7.029 4 12 4c2.125 0 4.078 .736 5.618 1.968ZM12 20c3.866 0 7-3.134 7-7C19 9.134 15.866 6 12 6 8.134 6 5 9.134 5 13c0 3.866 3.134 7 7 7ZM11 8h2v6h-2v-6ZM8 1h8v2h-8v-2Z"),
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
        return _timerLine!!
    }

private var _timerLine: ImageVector? = null
