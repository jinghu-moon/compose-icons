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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.852 3.011 L 11.910 3.004 L 12.000 3.000 L 12.075 3.003 L 12.201 3.020 L 12.312 3.050 L 12.423 3.094 L 12.521 3.146 L 12.625 3.220 L 12.707 3.293 L 15.707 6.293 C 15.967 6.544 16.071 6.916 15.980 7.266 C 15.888 7.615 15.615 7.888 15.266 7.980 C 14.916 8.071 14.544 7.967 14.293 7.707 L 13.000 6.415 L 13.001 11.100 C 15.510 11.620 17.221 13.952 16.963 16.501 C 16.705 19.051 14.562 20.993 12.000 21.000 C 9.239 21.000 7.000 18.761 7.000 16.000 L 7.005 15.783 C 7.104 13.490 8.751 11.559 11.000 11.100 L 11.000 6.415 L 9.707 7.707 C 9.351 8.063 8.785 8.099 8.387 7.790 L 8.293 7.707 C 7.903 7.317 7.903 6.683 8.293 6.293 L 11.293 3.293 Q 11.346 3.239 11.405 3.196 L 11.515 3.125 L 11.629 3.071 L 11.734 3.036 Z"),
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
        return _swipeUp!!
    }

private var _swipeUp: ImageVector? = null
