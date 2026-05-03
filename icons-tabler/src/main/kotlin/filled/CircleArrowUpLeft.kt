package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowUpLeft: ImageVector
    get() {
        if (_circleArrowUpLeft != null) return _circleArrowUpLeft!!
        _circleArrowUpLeft = tablerFilledIcon(
            name = "CircleArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 15.000 8.000 L 9.000 8.000 L 8.883 8.007 L 8.734 8.036 L 8.629 8.071 L 8.516 8.125 L 8.405 8.196 C 8.365 8.226 8.328 8.258 8.293 8.293 L 8.213 8.383 L 8.146 8.479 L 8.094 8.577 L 8.050 8.687 L 8.020 8.799 L 8.003 8.925 L 8.000 15.000 L 8.007 15.117 C 8.066 15.620 8.493 16.000 9.000 16.000 L 9.117 15.993 C 9.620 15.934 10.000 15.507 10.000 15.000 L 10.000 11.415 L 14.293 15.707 L 14.387 15.790 C 14.804 16.113 15.400 16.056 15.749 15.660 C 16.097 15.265 16.079 14.666 15.707 14.293 L 11.415 10.000 L 15.000 10.000 L 15.117 9.993 C 15.642 9.931 16.028 9.470 15.997 8.941 C 15.966 8.413 15.529 8.001 15.000 8.000 Z"),
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
        return _circleArrowUpLeft!!
    }

private var _circleArrowUpLeft: ImageVector? = null
