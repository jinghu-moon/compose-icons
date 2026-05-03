package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Exchange: ImageVector
    get() {
        if (_exchange != null) return _exchange!!
        _exchange = tablerFilledIcon(
            name = "Exchange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 3.000 C 20.463 2.998 21.714 4.051 21.961 5.493 C 22.209 6.935 21.380 8.345 20.000 8.830 L 20.000 13.000 C 20.000 16.314 17.314 19.000 14.000 19.000 L 13.415 19.000 L 14.707 20.293 C 15.063 20.649 15.099 21.215 14.790 21.613 L 14.707 21.707 C 14.316 22.097 13.684 22.097 13.293 21.707 L 10.334 18.748 C 10.234 18.658 10.153 18.550 10.096 18.428 L 10.058 18.337 L 10.030 18.243 C 9.951 17.941 10.020 17.619 10.217 17.377 L 10.293 17.293 L 13.293 14.293 C 13.685 13.914 14.309 13.919 14.695 14.305 C 15.081 14.691 15.086 15.315 14.707 15.707 L 13.414 17.000 L 14.000 17.000 C 16.131 17.000 17.888 15.329 17.995 13.200 L 18.000 13.000 L 18.000 8.829 C 16.801 8.405 16.000 7.272 16.000 6.000 L 16.005 5.824 C 16.098 4.238 17.411 3.000 19.000 3.000M 10.707 2.293 L 13.707 5.293 C 13.959 5.539 14.060 5.902 13.970 6.243 L 13.960 6.274 L 13.957 6.292 L 13.949 6.310 L 13.942 6.337 L 13.926 6.372 L 13.916 6.404 L 13.909 6.414 L 13.904 6.428 C 13.848 6.548 13.769 6.655 13.672 6.744 L 10.707 9.707 C 10.351 10.063 9.785 10.099 9.387 9.790 L 9.293 9.707 C 8.903 9.316 8.903 8.684 9.293 8.293 L 10.584 7.000 L 10.000 7.000 C 7.869 7.000 6.112 8.671 6.005 10.800 L 6.000 11.000 L 6.000 15.171 C 7.439 15.679 8.268 17.187 7.925 18.674 C 7.583 20.162 6.178 21.155 4.662 20.983 C 3.145 20.810 2.000 19.526 2.000 18.000 L 2.005 17.824 C 2.075 16.618 2.861 15.573 4.000 15.170 L 4.000 11.000 C 4.000 7.686 6.686 5.000 10.000 5.000 L 10.585 5.000 L 9.293 3.707 C 8.937 3.351 8.901 2.785 9.210 2.387 L 9.293 2.293 C 9.684 1.903 10.316 1.903 10.707 2.293"),
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
        return _exchange!!
    }

private var _exchange: ImageVector? = null
