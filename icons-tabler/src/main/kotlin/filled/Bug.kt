package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bug: ImageVector
    get() {
        if (_bug != null) return _bug!!
        _bug = tablerFilledIcon(
            name = "Bug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 4.000 C 14.131 4.000 15.888 5.671 15.995 7.800 L 16.000 8.000 C 16.148 8.000 16.294 8.033 16.428 8.096 L 19.461 6.158 C 19.762 5.956 20.149 5.932 20.472 6.096 C 20.796 6.261 21.005 6.587 21.018 6.950 C 21.032 7.312 20.849 7.653 20.539 7.842 L 17.524 9.773 C 17.800 10.485 17.961 11.237 18.000 12.000 L 21.000 12.000 C 21.552 12.000 22.000 12.448 22.000 13.000 C 22.000 13.552 21.552 14.000 21.000 14.000 L 18.000 14.000 L 18.000 15.000 C 18.001 15.515 17.935 16.027 17.805 16.525 L 20.513 18.141 C 20.987 18.424 21.142 19.039 20.859 19.513 C 20.576 19.987 19.961 20.142 19.487 19.859 L 16.973 18.358 C 16.055 19.719 14.619 20.644 13.000 20.918 L 13.000 15.000 C 13.000 14.448 12.552 14.000 12.000 14.000 C 11.448 14.000 11.000 14.448 11.000 15.000 L 11.000 20.917 C 9.381 20.643 7.945 19.718 7.027 18.357 L 4.513 19.860 C 4.039 20.143 3.424 19.988 3.141 19.514 C 2.858 19.040 3.013 18.425 3.487 18.142 L 6.195 16.526 C 6.065 16.028 5.999 15.515 6.000 15.000 L 6.000 14.000 L 3.000 14.000 C 2.448 14.000 2.000 13.552 2.000 13.000 C 2.000 12.448 2.448 12.000 3.000 12.000 L 6.001 12.000 L 6.001 11.945 C 6.042 11.200 6.202 10.466 6.475 9.772 L 3.461 7.842 C 3.151 7.653 2.968 7.312 2.982 6.950 C 2.995 6.587 3.204 6.261 3.528 6.096 C 3.851 5.932 4.238 5.956 4.539 6.158 L 7.571 8.097 L 7.595 8.085 L 7.663 8.058 L 7.682 8.053 L 7.698 8.047 L 7.730 8.039 L 7.770 8.026 L 7.804 8.019 L 7.838 8.015 L 7.883 8.007 L 7.898 8.006 L 7.913 8.004 L 8.000 8.000 C 8.000 5.791 9.791 4.000 12.000 4.000 ZM 12.000 6.000 C 10.895 6.000 10.000 6.895 10.000 8.000 L 14.000 8.000 C 14.000 6.895 13.105 6.000 12.000 6.000 Z"),
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
        return _bug!!
    }

private var _bug: ImageVector? = null
