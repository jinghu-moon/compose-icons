package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareArrowUp: ImageVector
    get() {
        if (_squareArrowUp != null) return _squareArrowUp!!
        _squareArrowUp = tablerFilledIcon(
            name = "SquareArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 12.000 7.000 L 11.910 7.004 L 11.852 7.011 L 11.734 7.036 L 11.629 7.071 L 11.516 7.125 L 11.405 7.196 C 11.365 7.226 11.328 7.258 11.293 7.293 L 7.293 11.293 L 7.210 11.387 C 6.901 11.785 6.937 12.351 7.293 12.707 L 7.387 12.790 C 7.785 13.099 8.351 13.063 8.707 12.707 L 11.000 10.415 L 11.000 16.000 L 11.007 16.117 C 11.069 16.642 11.530 17.028 12.059 16.997 C 12.587 16.966 12.999 16.529 13.000 16.000 L 13.000 10.415 L 15.293 12.707 L 15.387 12.790 C 15.804 13.113 16.400 13.056 16.749 12.660 C 17.097 12.265 17.079 11.666 16.707 11.293 L 12.707 7.293 L 12.625 7.220 L 12.521 7.146 L 12.423 7.094 L 12.313 7.050 L 12.201 7.020 L 12.075 7.003 L 12.000 7.000 Z"),
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
        return _squareArrowUp!!
    }

private var _squareArrowUp: ImageVector? = null
