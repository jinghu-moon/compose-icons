package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodEmpty: ImageVector
    get() {
        if (_moodEmpty != null) return _moodEmpty!!
        _moodEmpty = tablerFilledIcon(
            name = "MoodEmpty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 15.000 14.000 L 9.000 14.000 L 8.883 14.007 C 8.380 14.067 8.001 14.493 8.001 15.000 C 8.001 15.507 8.380 15.933 8.883 15.993 L 9.000 16.000 L 15.000 16.000 L 15.117 15.993 C 15.620 15.933 15.999 15.507 15.999 15.000 C 15.999 14.493 15.620 14.067 15.117 14.007 L 15.000 14.000 ZM 9.010 9.000 L 8.883 9.007 C 8.380 9.067 8.001 9.493 8.001 10.000 C 8.001 10.507 8.380 10.933 8.883 10.993 L 9.000 11.000 L 9.127 10.993 C 9.630 10.933 10.009 10.507 10.009 10.000 C 10.009 9.493 9.630 9.067 9.127 9.007 L 9.010 9.000 ZM 15.010 9.000 L 14.883 9.007 C 14.380 9.067 14.001 9.493 14.001 10.000 C 14.001 10.507 14.380 10.933 14.883 10.993 L 15.000 11.000 L 15.127 10.993 C 15.630 10.933 16.009 10.507 16.009 10.000 C 16.009 9.493 15.630 9.067 15.127 9.007 L 15.010 9.000 Z"),
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
        return _moodEmpty!!
    }

private var _moodEmpty: ImageVector? = null
