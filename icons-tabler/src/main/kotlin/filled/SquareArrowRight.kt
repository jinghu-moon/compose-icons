package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareArrowRight: ImageVector
    get() {
        if (_squareArrowRight != null) return _squareArrowRight!!
        _squareArrowRight = tablerFilledIcon(
            name = "SquareArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 12.613 7.210 C 12.215 6.901 11.649 6.937 11.293 7.293 L 11.210 7.387 C 10.901 7.785 10.937 8.351 11.293 8.707 L 13.585 11.000 L 8.000 11.000 L 7.883 11.007 C 7.358 11.069 6.972 11.530 7.003 12.059 C 7.034 12.587 7.471 12.999 8.000 13.000 L 13.585 13.000 L 11.293 15.293 L 11.210 15.387 C 10.887 15.804 10.944 16.400 11.340 16.749 C 11.735 17.097 12.334 17.079 12.707 16.707 L 16.707 12.707 L 16.780 12.625 L 16.854 12.521 L 16.906 12.423 L 16.950 12.313 L 16.980 12.201 L 16.997 12.075 L 17.000 12.000 L 16.993 11.882 L 16.964 11.734 L 16.929 11.629 L 16.875 11.516 L 16.804 11.405 C 16.774 11.365 16.742 11.328 16.707 11.293 L 12.707 7.293 Z"),
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
        return _squareArrowRight!!
    }

private var _squareArrowRight: ImageVector? = null
