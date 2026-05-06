package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SwipeUp: ImageVector
    get() {
        if (_swipeUp != null) return _swipeUp!!
        _swipeUp = tablerFilledIcon(
            name = "SwipeUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.852 3.011l.058-.007L12 3l.075 .003 .126 .017 .111 .03 .111 .044 .098 .052 .104 .074 .082 .073 3 3c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273L13 6.415l.001 4.685c2.509 .52 4.22 2.852 3.962 5.401C16.705 19.051 14.562 20.993 12 21 9.239 21 7 18.761 7 16l.005-.217C7.104 13.49 8.751 11.559 11 11.1v-4.685L9.707 7.707c-.356 .356-.922 .392-1.32 .083L8.293 7.707c-.39-.39-.39-1.023 0-1.414l3-3q.053-.054 .112-.097l.11-.071 .114-.054 .105-.035Z"),
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
        return _swipeUp!!
    }

private var _swipeUp: ImageVector? = null
