package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TransitionRight: ImageVector
    get() {
        if (_transitionRight != null) return _transitionRight!!
        _transitionRight = tablerFilledIcon(
            name = "TransitionRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 2.000 C 20.209 2.000 22.000 3.791 22.000 6.000 L 22.000 18.000 C 22.000 20.209 20.209 22.000 18.000 22.000 C 17.471 21.999 17.034 21.587 17.003 21.059 C 16.972 20.530 17.358 20.069 17.883 20.007 L 18.000 20.000 C 19.105 20.000 20.000 19.105 20.000 18.000 L 20.000 6.000 C 20.000 4.895 19.105 4.000 18.000 4.000 C 17.448 4.000 17.000 3.552 17.000 3.000 C 17.000 2.448 17.448 2.000 18.000 2.000M 10.000 18.000 C 10.000 20.209 8.209 22.000 6.000 22.000 C 3.791 22.000 2.000 20.209 2.000 18.000 L 2.000 6.000 C 2.000 3.791 3.791 2.000 6.000 2.000 C 8.209 2.000 10.000 3.791 10.000 6.000 L 10.000 11.000 L 14.585 11.000 L 13.293 9.707 C 12.937 9.351 12.901 8.785 13.210 8.387 L 13.293 8.293 C 13.684 7.903 14.316 7.903 14.707 8.293 L 17.707 11.293 L 17.804 11.405 L 17.875 11.515 L 17.906 11.577 L 17.940 11.658 L 17.964 11.734 L 17.994 11.882 L 18.000 12.000 L 17.996 12.085 L 17.980 12.201 L 17.950 12.312 L 17.906 12.423 L 17.854 12.521 L 17.780 12.625 L 17.707 12.707 L 14.707 15.707 C 14.315 16.086 13.691 16.081 13.305 15.695 C 12.919 15.309 12.914 14.685 13.293 14.293 L 14.585 13.000 L 10.000 13.000 Z"),
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
        return _transitionRight!!
    }

private var _transitionRight: ImageVector? = null
