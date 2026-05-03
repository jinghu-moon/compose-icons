package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleX: ImageVector
    get() {
        if (_circleX != null) return _circleX!!
        _circleX = tablerFilledIcon(
            name = "CircleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 10.511 9.140 C 10.077 8.882 9.520 8.987 9.210 9.386 C 8.900 9.784 8.936 10.351 9.293 10.707 L 10.585 12.000 L 9.293 13.293 L 9.210 13.387 C 8.887 13.804 8.944 14.400 9.340 14.749 C 9.735 15.097 10.334 15.079 10.707 14.707 L 12.000 13.415 L 13.293 14.707 L 13.387 14.790 C 13.804 15.113 14.400 15.056 14.749 14.660 C 15.097 14.265 15.079 13.666 14.707 13.293 L 13.415 12.000 L 14.707 10.707 L 14.790 10.613 C 15.113 10.196 15.056 9.600 14.660 9.251 C 14.265 8.903 13.666 8.921 13.293 9.293 L 12.000 10.585 L 10.707 9.293 L 10.613 9.210 Z"),
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
        return _circleX!!
    }

private var _circleX: ImageVector? = null
