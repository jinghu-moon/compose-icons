package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowDownLeft: ImageVector
    get() {
        if (_circleArrowDownLeft != null) return _circleArrowDownLeft!!
        _circleArrowDownLeft = tablerFilledIcon(
            name = "CircleArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 9.000 8.000 C 8.448 8.000 8.000 8.448 8.000 9.000 L 8.000 15.000 L 8.007 15.117 L 8.036 15.266 L 8.071 15.371 L 8.125 15.484 L 8.196 15.595 C 8.226 15.635 8.257 15.672 8.293 15.707 L 8.383 15.787 L 8.479 15.854 L 8.577 15.906 L 8.687 15.950 L 8.799 15.980 L 8.925 15.997 L 15.000 16.000 L 15.117 15.993 C 15.620 15.934 16.000 15.507 16.000 15.000 L 15.993 14.883 C 15.934 14.380 15.507 14.000 15.000 14.000 L 11.414 14.000 L 15.707 9.707 L 15.790 9.613 C 16.113 9.196 16.056 8.600 15.660 8.251 C 15.265 7.903 14.666 7.921 14.293 8.293 L 10.000 12.584 L 10.000 9.000 L 9.993 8.883 C 9.934 8.380 9.507 8.000 9.000 8.000 Z"),
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
        return _circleArrowDownLeft!!
    }

private var _circleArrowDownLeft: ImageVector? = null
