package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowUpRight: ImageVector
    get() {
        if (_circleArrowUpRight != null) return _circleArrowUpRight!!
        _circleArrowUpRight = tablerFilledIcon(
            name = "CircleArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 15.000 8.000 L 9.000 8.000 L 8.883 8.007 C 8.380 8.066 8.000 8.493 8.000 9.000 L 8.007 9.117 C 8.066 9.620 8.493 10.000 9.000 10.000 L 12.584 10.000 L 8.293 14.293 L 8.210 14.387 C 7.887 14.804 7.944 15.400 8.340 15.749 C 8.735 16.097 9.334 16.079 9.707 15.707 L 14.000 11.414 L 14.000 15.000 L 14.007 15.117 C 14.069 15.642 14.530 16.028 15.059 15.997 C 15.587 15.966 15.999 15.529 16.000 15.000 L 16.000 9.000 L 15.993 8.883 L 15.964 8.734 L 15.929 8.629 L 15.875 8.516 L 15.804 8.405 C 15.774 8.365 15.742 8.328 15.707 8.293 L 15.617 8.213 L 15.521 8.146 L 15.423 8.094 L 15.313 8.050 L 15.201 8.020 L 15.075 8.003 L 15.000 8.000 Z"),
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
        return _circleArrowUpRight!!
    }

private var _circleArrowUpRight: ImageVector? = null
