package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleCheck: ImageVector
    get() {
        if (_circleCheck != null) return _circleCheck!!
        _circleCheck = tablerFilledIcon(
            name = "CircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 15.707 9.293 C 15.351 8.937 14.785 8.901 14.387 9.210 L 14.293 9.293 L 11.000 12.585 L 9.707 11.293 L 9.613 11.210 C 9.215 10.901 8.649 10.937 8.293 11.293 C 7.937 11.649 7.901 12.215 8.210 12.613 L 8.293 12.707 L 10.293 14.707 L 10.387 14.790 C 10.748 15.070 11.252 15.070 11.613 14.790 L 11.707 14.707 L 15.707 10.707 L 15.790 10.613 C 16.099 10.215 16.063 9.649 15.707 9.293 Z"),
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
        return _circleCheck!!
    }

private var _circleCheck: ImageVector? = null
