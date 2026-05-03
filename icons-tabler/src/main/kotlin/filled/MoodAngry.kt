package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodAngry: ImageVector
    get() {
        if (_moodAngry != null) return _moodAngry!!
        _moodAngry = tablerFilledIcon(
            name = "MoodAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 12.000 14.000 C 10.791 14.000 9.632 14.486 8.786 15.350 C 8.530 15.604 8.430 15.976 8.525 16.324 C 8.621 16.672 8.896 16.942 9.245 17.030 C 9.595 17.118 9.965 17.011 10.214 16.750 C 10.684 16.270 11.328 15.999 12.000 15.999 C 12.672 15.999 13.316 16.270 13.786 16.750 C 14.174 17.135 14.800 17.137 15.190 16.754 C 15.580 16.371 15.591 15.746 15.214 15.350 C 14.368 14.486 13.209 14.000 12.000 14.000M 8.447 8.105 C 7.957 7.878 7.375 8.082 7.133 8.566 C 6.892 9.049 7.077 9.637 7.553 9.893 L 9.553 10.893 C 10.043 11.120 10.625 10.916 10.867 10.432 C 11.108 9.949 10.923 9.361 10.447 9.105 ZM 16.894 8.552 C 16.647 8.058 16.047 7.858 15.553 8.105 L 13.553 9.105 C 13.077 9.361 12.892 9.949 13.133 10.432 C 13.375 10.916 13.957 11.120 14.447 10.893 L 16.447 9.893 C 16.941 9.646 17.141 9.046 16.894 8.552"),
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
        return _moodAngry!!
    }

private var _moodAngry: ImageVector? = null
