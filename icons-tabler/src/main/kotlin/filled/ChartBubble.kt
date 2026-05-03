package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartBubble: ImageVector
    get() {
        if (_chartBubble != null) return _chartBubble!!
        _chartBubble = tablerFilledIcon(
            name = "ChartBubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 12.000 C 8.183 12.000 9.963 13.750 9.999 15.933 C 10.036 18.116 8.315 19.925 6.133 19.998 C 3.951 20.071 2.114 18.380 2.005 16.200 L 2.000 16.000 L 2.005 15.800 C 2.112 13.671 3.869 12.000 6.000 12.000 Z"),
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
        pathData = parseSvgPathData("M 16.000 16.000 C 17.634 16.000 18.967 17.308 18.999 18.941 C 19.031 20.575 17.750 21.934 16.117 21.998 C 14.484 22.062 13.101 20.807 13.005 19.176 L 13.000 19.000 L 13.005 18.824 C 13.098 17.238 14.411 16.000 16.000 16.000 Z"),
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
        pathData = parseSvgPathData("M 14.500 2.000 C 17.509 2.000 19.959 4.418 19.999 7.427 C 20.039 10.435 17.654 12.917 14.647 12.998 C 11.639 13.079 9.125 10.727 9.004 7.721 L 9.000 7.500 L 9.004 7.279 C 9.123 4.330 11.548 2.000 14.500 2.000 Z"),
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
        return _chartBubble!!
    }

private var _chartBubble: ImageVector? = null
