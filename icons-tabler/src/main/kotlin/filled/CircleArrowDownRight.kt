package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowDownRight: ImageVector
    get() {
        if (_circleArrowDownRight != null) return _circleArrowDownRight!!
        _circleArrowDownRight = tablerFilledIcon(
            name = "CircleArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 15.000 8.000 L 14.883 8.007 C 14.380 8.066 14.000 8.493 14.000 9.000 L 14.000 12.585 L 9.707 8.293 L 9.613 8.210 C 9.196 7.887 8.600 7.944 8.251 8.340 C 7.903 8.735 7.921 9.334 8.293 9.707 L 12.585 14.000 L 9.000 14.000 L 8.883 14.007 C 8.358 14.069 7.972 14.530 8.003 15.059 C 8.034 15.587 8.471 15.999 9.000 16.000 L 15.034 16.001 C 15.097 15.999 15.159 15.990 15.220 15.976 L 15.273 15.962 L 15.339 15.942 L 15.469 15.883 L 15.562 15.828 C 15.839 15.644 16.004 15.332 16.000 15.000 L 16.000 9.000 L 15.993 8.883 C 15.934 8.380 15.507 8.000 15.000 8.000 Z"),
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
        return _circleArrowDownRight!!
    }

private var _circleArrowDownRight: ImageVector? = null
