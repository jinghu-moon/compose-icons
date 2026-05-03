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
                pathData = parseSvgPathData("M 17.618 5.968 L 19.071 4.515 L 20.485 5.929 L 19.032 7.382 C 20.264 8.922 21.000 10.875 21.000 13.000 C 21.000 17.971 16.971 22.000 12.000 22.000 C 7.029 22.000 3.000 17.971 3.000 13.000 C 3.000 8.029 7.029 4.000 12.000 4.000 C 14.125 4.000 16.078 4.736 17.618 5.968 ZM 12.000 20.000 C 15.866 20.000 19.000 16.866 19.000 13.000 C 19.000 9.134 15.866 6.000 12.000 6.000 C 8.134 6.000 5.000 9.134 5.000 13.000 C 5.000 16.866 8.134 20.000 12.000 20.000 ZM 11.000 8.000 L 13.000 8.000 L 13.000 14.000 L 11.000 14.000 L 11.000 8.000 ZM 8.000 1.000 L 16.000 1.000 L 16.000 3.000 L 8.000 3.000 L 8.000 1.000 Z"),
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
