package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartArea: ImageVector
    get() {
        if (_chartArea != null) return _chartArea!!
        _chartArea = tablerFilledIcon(
            name = "ChartArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 18.000 C 20.529 18.001 20.966 18.413 20.997 18.941 C 21.028 19.470 20.642 19.931 20.117 19.993 L 20.000 20.000 L 4.000 20.000 C 3.471 19.999 3.034 19.587 3.003 19.059 C 2.972 18.530 3.358 18.069 3.883 18.007 L 4.000 18.000 L 20.000 18.000 Z"),
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
        pathData = parseSvgPathData("M 15.220 5.375 C 15.561 4.949 16.181 4.876 16.613 5.210 L 16.707 5.293 L 20.707 9.293 C 20.862 9.449 20.962 9.651 20.991 9.869 L 21.000 10.000 L 21.000 15.000 C 21.000 15.507 20.620 15.934 20.117 15.993 L 20.000 16.000 L 3.978 16.000 L 3.868 15.991 L 3.758 15.971 L 3.651 15.937 L 3.546 15.891 L 3.446 15.832 L 3.352 15.762 L 3.292 15.707 L 3.220 15.625 L 3.156 15.536 L 3.102 15.440 L 3.086 15.405 L 3.046 15.302 L 3.019 15.196 L 3.004 15.088 L 3.000 14.978 L 3.009 14.868 L 3.028 14.763 C 3.038 14.723 3.050 14.686 3.063 14.651 L 3.109 14.546 L 3.168 14.446 L 7.168 8.446 C 7.421 8.065 7.901 7.904 8.333 8.056 L 8.447 8.106 L 11.724 9.744 L 15.219 5.375 Z"),
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
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null
