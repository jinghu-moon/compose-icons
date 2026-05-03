package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = tablerFilledIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 16.707 7.293 C 16.316 6.903 15.684 6.903 15.293 7.293 L 12.703 9.883 L 12.620 9.977 L 12.552 10.077 C 11.973 9.911 11.351 10.014 10.857 10.358 C 10.363 10.703 10.050 11.251 10.005 11.851 L 10.000 12.000 L 10.005 12.150 C 10.062 12.911 10.548 13.573 11.257 13.857 C 11.965 14.140 12.774 13.996 13.340 13.484 C 13.906 12.972 14.132 12.183 13.922 11.449 C 13.993 11.407 14.059 11.356 14.117 11.297 L 16.707 8.707 L 16.790 8.613 C 17.099 8.215 17.063 7.649 16.707 7.293 ZM 12.000 6.000 C 8.686 6.000 6.000 8.686 6.000 12.000 C 6.000 12.552 6.448 13.000 7.000 13.000 C 7.552 13.000 8.000 12.552 8.000 12.000 C 8.000 9.791 9.791 8.000 12.000 8.000 C 12.552 8.000 13.000 7.552 13.000 7.000 C 13.000 6.448 12.552 6.000 12.000 6.000 Z"),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
