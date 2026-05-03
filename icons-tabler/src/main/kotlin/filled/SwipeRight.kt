package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) return _swipeRight!!
        _swipeRight = tablerFilledIcon(
            name = "SwipeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 7.000 C 10.376 7.000 12.425 8.672 12.900 11.000 L 17.585 11.000 L 16.293 9.707 C 15.937 9.351 15.901 8.785 16.210 8.387 L 16.293 8.293 C 16.684 7.903 17.316 7.903 17.707 8.293 L 20.707 11.293 Q 20.761 11.346 20.804 11.405 L 20.875 11.515 L 20.929 11.629 L 20.964 11.734 L 20.994 11.882 L 21.000 12.000 L 20.997 12.075 L 20.980 12.201 L 20.950 12.312 L 20.906 12.423 L 20.854 12.521 L 20.780 12.625 L 20.707 12.707 L 17.707 15.707 C 17.315 16.086 16.691 16.081 16.305 15.695 C 15.919 15.309 15.914 14.685 16.293 14.293 L 17.584 13.000 L 12.900 13.001 C 12.380 15.510 10.048 17.221 7.499 16.963 C 4.949 16.705 3.007 14.562 3.000 12.000 C 3.000 9.239 5.239 7.000 8.000 7.000"),
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
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
