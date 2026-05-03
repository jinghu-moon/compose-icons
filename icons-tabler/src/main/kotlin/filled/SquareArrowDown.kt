package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareArrowDown: ImageVector
    get() {
        if (_squareArrowDown != null) return _squareArrowDown!!
        _squareArrowDown = tablerFilledIcon(
            name = "SquareArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 12.000 7.000 C 11.448 7.000 11.000 7.448 11.000 8.000 L 11.000 13.585 L 8.707 11.293 L 8.613 11.210 C 8.196 10.887 7.600 10.944 7.251 11.340 C 6.903 11.735 6.921 12.334 7.293 12.707 L 11.293 16.707 L 11.387 16.790 L 11.479 16.854 L 11.577 16.906 L 11.687 16.950 L 11.799 16.980 L 11.925 16.997 L 12.000 17.000 L 12.117 16.993 L 12.266 16.964 L 12.371 16.929 L 12.484 16.875 L 12.595 16.804 C 12.635 16.775 12.672 16.742 12.707 16.707 L 16.707 12.707 L 16.790 12.613 C 17.099 12.215 17.063 11.649 16.707 11.293 L 16.613 11.210 C 16.215 10.901 15.649 10.937 15.293 11.293 L 13.000 13.585 L 13.000 8.000 L 12.993 7.883 C 12.934 7.380 12.507 7.000 12.000 7.000 Z"),
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
        return _squareArrowDown!!
    }

private var _squareArrowDown: ImageVector? = null
