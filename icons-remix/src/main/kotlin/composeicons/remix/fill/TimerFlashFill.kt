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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.382 5.968C7.922 4.736 9.875 4 12 4c2.125 0 4.078 .736 5.618 1.968L19.071 4.515l1.414 1.414L19.032 7.382C20.264 8.922 21 10.875 21 13c0 4.971-4.029 9-9 9C7.029 22 3 17.971 3 13 3 10.875 3.736 8.922 4.968 7.382L3.515 5.929 4.929 4.515 6.382 5.968ZM13 12v-4.505L8 14h3v4.5L16 12h-3ZM8 1h8v2h-8v-2Z"),
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
        return _timerFlashFill!!
    }

private var _timerFlashFill: ImageVector? = null
