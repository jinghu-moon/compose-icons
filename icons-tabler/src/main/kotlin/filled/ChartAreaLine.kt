package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartAreaLine: ImageVector
    get() {
        if (_chartAreaLine != null) return _chartAreaLine!!
        _chartAreaLine = tablerFilledIcon(
            name = "ChartAreaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.220 9.375 C 15.561 8.949 16.181 8.876 16.613 9.210 L 16.707 9.293 L 20.707 13.293 C 20.862 13.449 20.962 13.651 20.991 13.869 L 21.000 14.000 L 21.000 19.000 C 21.000 19.507 20.620 19.934 20.117 19.993 L 20.000 20.000 L 3.978 20.000 L 3.868 19.991 L 3.758 19.971 L 3.651 19.937 L 3.546 19.891 L 3.446 19.832 L 3.352 19.762 L 3.292 19.707 L 3.220 19.625 L 3.156 19.536 L 3.102 19.440 L 3.086 19.405 L 3.046 19.302 L 3.019 19.196 L 3.004 19.088 L 3.000 18.978 L 3.009 18.868 L 3.028 18.763 C 3.038 18.723 3.050 18.686 3.063 18.651 L 3.109 18.546 L 3.168 18.446 L 7.168 12.446 C 7.421 12.065 7.901 11.904 8.333 12.056 L 8.447 12.106 L 11.724 13.744 L 15.219 9.375 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 15.232 3.360 C 15.577 2.946 16.188 2.879 16.614 3.210 L 16.707 3.293 L 20.707 7.293 C 21.079 7.666 21.097 8.265 20.749 8.660 C 20.400 9.056 19.804 9.113 19.387 8.790 L 19.293 8.707 L 16.067 5.482 L 11.768 10.640 C 11.501 10.961 11.062 11.082 10.668 10.943 L 10.553 10.894 L 7.299 9.268 L 4.800 12.600 C 4.498 13.003 3.943 13.118 3.505 12.869 L 3.400 12.800 C 2.997 12.498 2.882 11.943 3.131 11.505 L 3.200 11.400 L 6.200 7.400 C 6.463 7.049 6.924 6.911 7.337 7.059 L 7.447 7.106 L 10.738 8.751 L 15.232 3.360 Z"),
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
        return _chartAreaLine!!
    }

private var _chartAreaLine: ImageVector? = null
