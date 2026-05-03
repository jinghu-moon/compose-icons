package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodHappy: ImageVector
    get() {
        if (_moodHappy != null) return _moodHappy!!
        _moodHappy = tablerFilledIcon(
            name = "MoodHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 15.000 13.000 L 9.000 13.000 C 8.448 13.000 8.000 13.448 8.000 14.000 L 8.000 14.050 C 8.000 16.168 9.661 17.914 11.777 18.020 L 12.004 18.025 C 14.125 18.010 15.870 16.352 15.994 14.235 L 16.000 14.029 C 16.008 13.759 15.906 13.497 15.718 13.303 C 15.529 13.109 15.270 13.000 15.000 13.000 ZM 9.010 8.000 L 8.883 8.007 C 8.358 8.069 7.972 8.530 8.003 9.059 C 8.034 9.587 8.471 9.999 9.000 10.000 L 9.127 9.993 C 9.652 9.931 10.038 9.470 10.007 8.941 C 9.976 8.413 9.539 8.001 9.010 8.000 ZM 15.010 8.000 L 14.883 8.007 C 14.358 8.069 13.972 8.530 14.003 9.059 C 14.034 9.587 14.471 9.999 15.000 10.000 L 15.127 9.993 C 15.652 9.931 16.038 9.470 16.007 8.941 C 15.976 8.413 15.539 8.001 15.010 8.000 Z"),
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
        return _moodHappy!!
    }

private var _moodHappy: ImageVector? = null
