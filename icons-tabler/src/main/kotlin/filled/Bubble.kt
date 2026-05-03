package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bubble: ImageVector
    get() {
        if (_bubble != null) return _bubble!!
        _bubble = tablerFilledIcon(
            name = "Bubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.400 2.000 C 14.667 1.999 16.761 3.210 17.891 5.176 L 17.981 5.338 L 18.107 5.365 C 20.888 6.015 22.890 8.445 22.996 11.299 L 23.000 11.533 C 23.000 13.213 22.333 14.824 21.145 16.012 C 19.958 17.200 18.347 17.867 16.667 17.867 L 16.632 17.865 L 16.597 17.915 C 15.653 19.162 14.202 19.925 12.639 19.995 L 12.400 20.000 Q 11.678 20.000 10.996 19.810 L 10.949 19.796 L 7.515 21.857 C 7.224 22.032 6.863 22.048 6.558 21.897 C 6.253 21.747 6.045 21.452 6.006 21.114 L 6.000 21.000 L 6.000 18.566 L 5.879 18.506 C 4.744 17.902 4.008 16.748 3.939 15.464 L 3.933 15.267 Q 3.933 14.902 4.003 14.550 L 4.016 14.492 L 3.903 14.402 C 2.638 13.356 1.876 11.823 1.805 10.184 L 1.800 9.934 C 1.800 6.731 4.397 4.134 7.600 4.134 L 7.658 4.135 L 7.808 3.972 C 8.940 2.778 10.492 2.072 12.136 2.005 Z"),
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
        return _bubble!!
    }

private var _bubble: ImageVector? = null
