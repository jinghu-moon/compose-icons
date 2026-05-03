package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodKid: ImageVector
    get() {
        if (_moodKid != null) return _moodKid!!
        _moodKid = tablerFilledIcon(
            name = "MoodKid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.143 7.410 4.973 3.702 9.051 2.444 C 8.885 3.322 9.120 4.228 9.690 4.915 C 10.260 5.603 11.107 6.000 12.000 6.000 C 12.552 6.000 13.000 5.552 13.000 5.000 C 13.000 4.448 12.552 4.000 12.000 4.000 L 11.883 3.993 C 11.358 3.931 10.972 3.470 11.003 2.941 C 11.034 2.413 11.471 2.001 12.000 2.000 C 13.726 2.000 15.453 2.447 17.000 3.340 ZM 15.200 14.286 C 14.806 13.899 14.173 13.906 13.786 14.300 C 13.316 14.780 12.672 15.051 12.000 15.051 C 11.328 15.051 10.684 14.780 10.214 14.300 C 9.826 13.915 9.200 13.913 8.810 14.296 C 8.420 14.679 8.409 15.304 8.786 15.700 C 9.632 16.564 10.791 17.050 12.000 17.050 C 13.209 17.050 14.368 16.564 15.214 15.700 C 15.601 15.306 15.594 14.673 15.200 14.286 ZM 9.010 9.000 L 8.883 9.007 C 8.358 9.069 7.972 9.530 8.003 10.059 C 8.034 10.587 8.471 10.999 9.000 11.000 L 9.127 10.993 C 9.652 10.931 10.038 10.470 10.007 9.941 C 9.976 9.413 9.539 9.001 9.010 9.000 ZM 15.010 9.000 L 14.883 9.007 C 14.358 9.069 13.972 9.530 14.003 10.059 C 14.034 10.587 14.471 10.999 15.000 11.000 L 15.127 10.993 C 15.652 10.931 16.038 10.470 16.007 9.941 C 15.976 9.413 15.539 9.001 15.010 9.000 Z"),
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
        return _moodKid!!
    }

private var _moodKid: ImageVector? = null
