package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodSad: ImageVector
    get() {
        if (_moodSad != null) return _moodSad!!
        _moodSad = tablerFilledIcon(
            name = "MoodSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 12.000 13.200 C 10.791 13.200 9.632 13.686 8.786 14.550 C 8.530 14.804 8.430 15.176 8.525 15.524 C 8.621 15.872 8.896 16.142 9.245 16.230 C 9.595 16.318 9.965 16.211 10.214 15.950 C 10.684 15.470 11.328 15.199 12.000 15.199 C 12.672 15.199 13.316 15.470 13.786 15.950 C 14.174 16.335 14.800 16.337 15.190 15.954 C 15.580 15.571 15.591 14.946 15.214 14.550 C 14.368 13.686 13.209 13.200 12.000 13.200 ZM 9.010 9.000 L 8.883 9.007 C 8.380 9.067 8.001 9.493 8.001 10.000 C 8.001 10.507 8.380 10.933 8.883 10.993 L 9.000 11.000 L 9.127 10.993 C 9.630 10.933 10.009 10.507 10.009 10.000 C 10.009 9.493 9.630 9.067 9.127 9.007 L 9.010 9.000 ZM 15.010 9.000 L 14.883 9.007 C 14.380 9.067 14.001 9.493 14.001 10.000 C 14.001 10.507 14.380 10.933 14.883 10.993 L 15.000 11.000 L 15.127 10.993 C 15.630 10.933 16.009 10.507 16.009 10.000 C 16.009 9.493 15.630 9.067 15.127 9.007 L 15.010 9.000 Z"),
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
        return _moodSad!!
    }

private var _moodSad: ImageVector? = null
