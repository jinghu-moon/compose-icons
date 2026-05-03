package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowDown: ImageVector
    get() {
        if (_circleArrowDown != null) return _circleArrowDown!!
        _circleArrowDown = tablerFilledIcon(
            name = "CircleArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 12.000 7.000 C 11.448 7.000 11.000 7.448 11.000 8.000 L 11.000 13.585 L 8.707 11.293 L 8.613 11.210 C 8.196 10.887 7.600 10.944 7.251 11.340 C 6.903 11.735 6.921 12.334 7.293 12.707 L 11.293 16.707 C 11.321 16.735 11.350 16.761 11.387 16.790 L 11.479 16.854 L 11.577 16.906 L 11.658 16.940 L 11.771 16.974 L 11.883 16.994 L 12.000 17.000 L 12.115 16.993 L 12.229 16.973 L 12.371 16.929 L 12.484 16.875 L 12.595 16.804 C 12.635 16.775 12.672 16.742 12.707 16.707 L 16.707 12.707 L 16.790 12.613 C 17.113 12.196 17.056 11.600 16.660 11.251 C 16.265 10.903 15.666 10.921 15.293 11.293 L 13.000 13.584 L 13.000 8.000 L 12.993 7.883 C 12.934 7.380 12.507 7.000 12.000 7.000 Z"),
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
        return _circleArrowDown!!
    }

private var _circleArrowDown: ImageVector? = null
