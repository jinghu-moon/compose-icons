package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodCrazyHappy: ImageVector
    get() {
        if (_moodCrazyHappy != null) return _moodCrazyHappy!!
        _moodCrazyHappy = tablerFilledIcon(
            name = "MoodCrazyHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 15.200 14.286 C 14.806 13.899 14.173 13.906 13.786 14.300 C 13.316 14.780 12.672 15.051 12.000 15.051 C 11.328 15.051 10.684 14.780 10.214 14.300 C 9.826 13.915 9.200 13.913 8.810 14.296 C 8.420 14.679 8.409 15.304 8.786 15.700 C 9.632 16.564 10.791 17.050 12.000 17.050 C 13.209 17.050 14.368 16.564 15.214 15.700 C 15.601 15.306 15.594 14.673 15.200 14.286M 7.707 7.793 C 7.315 7.414 6.691 7.419 6.305 7.805 C 5.919 8.191 5.914 8.815 6.293 9.207 L 7.085 10.000 L 6.293 10.793 C 5.914 11.185 5.919 11.809 6.305 12.195 C 6.691 12.581 7.315 12.586 7.707 12.207 L 8.500 11.415 L 9.293 12.207 C 9.544 12.467 9.916 12.571 10.266 12.480 C 10.615 12.388 10.888 12.115 10.980 11.766 C 11.071 11.416 10.967 11.044 10.707 10.793 L 9.915 10.000 L 10.707 9.207 C 10.967 8.956 11.071 8.584 10.980 8.234 C 10.888 7.885 10.615 7.612 10.266 7.520 C 9.916 7.429 9.544 7.533 9.293 7.793 L 8.500 8.585 ZM 14.707 7.793 C 14.315 7.414 13.691 7.419 13.305 7.805 C 12.919 8.191 12.914 8.815 13.293 9.207 L 14.085 10.000 L 13.293 10.793 C 12.914 11.185 12.919 11.809 13.305 12.195 C 13.691 12.581 14.315 12.586 14.707 12.207 L 15.500 11.415 L 16.293 12.207 C 16.685 12.586 17.309 12.581 17.695 12.195 C 18.081 11.809 18.086 11.185 17.707 10.793 L 16.915 10.000 L 17.707 9.207 C 17.967 8.956 18.071 8.584 17.980 8.234 C 17.888 7.885 17.615 7.612 17.266 7.520 C 16.916 7.429 16.544 7.533 16.293 7.793 L 15.500 8.585 Z"),
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
        return _moodCrazyHappy!!
    }

private var _moodCrazyHappy: ImageVector? = null
