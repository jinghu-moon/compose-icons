package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TimerFlashLine: ImageVector
    get() {
        if (_timerFlashLine != null) return _timerFlashLine!!
        _timerFlashLine = remixIcon(
            name = "TimerFlashLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.382 5.968C7.922 4.736 9.875 4 12 4c2.125 0 4.078 .736 5.618 1.968L19.071 4.515l1.414 1.414L19.032 7.382C20.264 8.922 21 10.875 21 13c0 4.971-4.029 9-9 9C7.029 22 3 17.971 3 13 3 10.875 3.736 8.922 4.968 7.382L3.515 5.929 4.929 4.515 6.382 5.968ZM12 20c3.866 0 7-3.134 7-7C19 9.134 15.866 6 12 6 8.134 6 5 9.134 5 13c0 3.866 3.134 7 7 7ZM13 12h3l-5 6.5v-4.5h-3L13 7.495v4.505ZM8 1h8v2h-8v-2Z"),
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
        return _timerFlashLine!!
    }

private var _timerFlashLine: ImageVector? = null
