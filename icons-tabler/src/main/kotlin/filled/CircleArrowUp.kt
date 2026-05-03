package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowUp: ImageVector
    get() {
        if (_circleArrowUp != null) return _circleArrowUp!!
        _circleArrowUp = tablerFilledIcon(
            name = "CircleArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 12.020 7.000 L 11.857 7.010 L 11.771 7.026 L 11.629 7.071 L 11.516 7.125 L 11.446 7.168 L 11.351 7.239 L 11.293 7.293 L 7.293 11.293 L 7.210 11.387 C 6.887 11.804 6.944 12.400 7.340 12.749 C 7.735 13.097 8.334 13.079 8.707 12.707 L 11.000 10.414 L 11.000 16.000 L 11.007 16.117 C 11.069 16.642 11.530 17.028 12.059 16.997 C 12.587 16.966 12.999 16.529 13.000 16.000 L 13.000 10.415 L 15.293 12.707 L 15.387 12.790 C 15.804 13.113 16.400 13.056 16.749 12.660 C 17.097 12.265 17.079 11.666 16.707 11.293 L 12.707 7.293 L 12.625 7.220 L 12.536 7.156 L 12.423 7.094 L 12.342 7.060 L 12.229 7.026 L 12.117 7.006 L 12.019 7.000 Z"),
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
        return _circleArrowUp!!
    }

private var _circleArrowUp: ImageVector? = null
