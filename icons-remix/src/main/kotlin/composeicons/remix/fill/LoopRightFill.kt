package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LoopRightFill: ImageVector
    get() {
        if (_loopRightFill != null) return _loopRightFill!!
        _loopRightFill = remixIcon(
            name = "LoopRightFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4c2.59 0 4.894 1.231 6.357 3.143L16 9.5h6v-6L19.781 5.719C17.949 3.452 15.144 2 12 2 6.477 2 2 6.477 2 12h2C4 7.582 7.582 4 12 4ZM20 12c0 4.418-3.582 8-8 8C9.41 20 7.106 18.77 5.643 16.857L8 14.5h-6v6L4.219 18.281C6.051 20.548 8.856 22 12 22c5.523 0 10-4.477 10-10h-2Z"),
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
        return _loopRightFill!!
    }

private var _loopRightFill: ImageVector? = null
