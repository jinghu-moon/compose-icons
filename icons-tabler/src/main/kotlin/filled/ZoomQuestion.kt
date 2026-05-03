package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomQuestion: ImageVector
    get() {
        if (_zoomQuestion != null) return _zoomQuestion!!
        _zoomQuestion = tablerFilledIcon(
            name = "ZoomQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 3.072 C 16.002 4.228 17.406 6.193 17.851 8.461 C 18.296 10.730 17.737 13.080 16.320 14.906 L 21.707 20.293 C 22.086 20.685 22.081 21.309 21.695 21.695 C 21.309 22.081 20.685 22.086 20.293 21.707 L 14.905 16.320 C 12.492 18.192 9.224 18.528 6.481 17.185 C 3.739 15.842 2.000 13.054 2.000 10.000 L 2.005 9.715 C 2.105 6.910 3.668 4.362 6.124 3.002 C 8.580 1.642 11.569 1.668 14.000 3.072M 10.000 12.000 C 9.493 12.000 9.066 12.380 9.007 12.883 L 9.000 13.010 C 9.001 13.539 9.413 13.976 9.941 14.007 C 10.470 14.038 10.931 13.652 10.993 13.127 L 11.000 13.000 C 11.000 12.448 10.552 12.000 10.000 12.000M 8.100 6.877 C 7.759 7.279 7.788 7.876 8.166 8.242 C 8.544 8.609 9.142 8.619 9.533 8.266 L 9.621 8.176 C 9.771 8.000 10.022 7.949 10.229 8.054 C 10.435 8.160 10.542 8.393 10.488 8.618 C 10.433 8.843 10.232 9.001 10.000 9.000 C 9.448 8.999 9.000 9.447 8.999 9.999 C 8.998 10.551 9.446 10.999 9.998 11.000 C 11.154 11.001 12.160 10.209 12.430 9.084 C 12.701 7.960 12.165 6.797 11.134 6.272 C 10.104 5.748 8.849 5.998 8.098 6.877"),
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
        return _zoomQuestion!!
    }

private var _zoomQuestion: ImageVector? = null
