package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TransitionTop: ImageVector
    get() {
        if (_transitionTop != null) return _transitionTop!!
        _transitionTop = tablerFilledIcon(
            name = "TransitionTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 6.000 L 12.081 6.003 L 12.201 6.020 L 12.312 6.050 L 12.423 6.094 L 12.521 6.146 L 12.625 6.220 L 12.707 6.293 L 15.707 9.293 C 15.967 9.544 16.071 9.916 15.980 10.266 C 15.888 10.615 15.615 10.888 15.266 10.980 C 14.916 11.071 14.544 10.967 14.293 10.707 L 13.000 9.415 L 13.000 14.000 L 18.000 14.000 C 20.209 14.000 22.000 15.791 22.000 18.000 C 22.000 20.209 20.209 22.000 18.000 22.000 L 6.000 22.000 C 3.791 22.000 2.000 20.209 2.000 18.000 C 2.000 15.791 3.791 14.000 6.000 14.000 L 11.000 14.000 L 11.000 9.415 L 9.707 10.707 C 9.351 11.063 8.785 11.099 8.387 10.790 L 8.293 10.707 C 7.903 10.316 7.903 9.684 8.293 9.293 L 11.293 6.293 L 11.405 6.196 L 11.515 6.125 L 11.577 6.094 L 11.658 6.060 L 11.734 6.036 L 11.852 6.011 L 11.910 6.004 ZM 18.000 2.000 C 20.209 2.000 22.000 3.791 22.000 6.000 C 21.999 6.529 21.587 6.966 21.059 6.997 C 20.530 7.028 20.069 6.642 20.007 6.117 L 20.000 6.000 C 20.000 4.895 19.105 4.000 18.000 4.000 L 6.000 4.000 C 4.895 4.000 4.000 4.895 4.000 6.000 C 4.000 6.552 3.552 7.000 3.000 7.000 C 2.448 7.000 2.000 6.552 2.000 6.000 C 2.000 3.791 3.791 2.000 6.000 2.000 Z"),
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
        return _transitionTop!!
    }

private var _transitionTop: ImageVector? = null
