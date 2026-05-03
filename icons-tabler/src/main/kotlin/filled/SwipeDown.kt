package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SwipeDown: ImageVector
    get() {
        if (_swipeDown != null) return _swipeDown!!
        _swipeDown = tablerFilledIcon(
            name = "SwipeDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 14.569 2.997 16.722 4.941 16.981 7.497 C 17.239 10.053 15.519 12.389 13.001 12.900 L 13.000 17.584 L 14.293 16.293 C 14.649 15.937 15.215 15.901 15.613 16.210 L 15.707 16.293 C 16.097 16.684 16.097 17.316 15.707 17.707 L 12.707 20.707 C 12.672 20.742 12.635 20.774 12.595 20.804 L 12.485 20.875 L 12.371 20.929 L 12.266 20.964 L 12.117 20.994 L 12.000 21.000 L 11.925 20.997 L 11.799 20.980 L 11.688 20.950 L 11.577 20.906 L 11.479 20.854 L 11.383 20.787 L 11.293 20.707 L 8.293 17.707 C 7.914 17.315 7.919 16.691 8.305 16.305 C 8.691 15.919 9.315 15.914 9.707 16.293 L 11.000 17.585 L 11.000 12.900 C 8.491 12.380 6.780 10.049 7.038 7.499 C 7.295 4.950 9.438 3.007 12.000 3.000"),
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
        return _swipeDown!!
    }

private var _swipeDown: ImageVector? = null
