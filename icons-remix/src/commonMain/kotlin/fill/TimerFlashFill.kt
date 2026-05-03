package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TimerFlashFill: ImageVector
    get() {
        if (_timerFlashFill != null) return _timerFlashFill!!
        _timerFlashFill = remixIcon(
            name = "TimerFlashFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.382 5.968 C 7.922 4.736 9.875 4.000 12.000 4.000 C 14.125 4.000 16.078 4.736 17.618 5.968 L 19.071 4.515 L 20.485 5.929 L 19.032 7.382 C 20.264 8.922 21.000 10.875 21.000 13.000 C 21.000 17.971 16.971 22.000 12.000 22.000 C 7.029 22.000 3.000 17.971 3.000 13.000 C 3.000 10.875 3.736 8.922 4.968 7.382 L 3.515 5.929 L 4.929 4.515 L 6.382 5.968 ZM 13.000 12.000 L 13.000 7.495 L 8.000 14.000 L 11.000 14.000 L 11.000 18.500 L 16.000 12.000 L 13.000 12.000 ZM 8.000 1.000 L 16.000 1.000 L 16.000 3.000 L 8.000 3.000 L 8.000 1.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _timerFlashFill!!
    }

private var _timerFlashFill: ImageVector? = null
