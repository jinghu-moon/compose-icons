package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BrainLine: ImageVector
    get() {
        if (_brainLine != null) return _brainLine!!
        _brainLine = remixIcon(
            name = "BrainLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 4.000 C 10.105 4.000 11.000 4.895 11.000 6.000 L 11.000 12.827 C 10.106 12.137 8.966 11.731 7.664 11.514 L 7.336 13.486 C 8.716 13.717 9.597 14.153 10.140 14.741 C 10.670 15.315 11.000 16.167 11.000 17.500 C 11.000 18.881 9.881 20.000 8.500 20.000 C 7.119 20.000 6.000 18.881 6.000 17.500 L 6.000 17.149 C 6.430 17.293 6.876 17.410 7.336 17.486 L 7.664 15.514 C 6.921 15.390 6.175 15.114 5.429 14.760 C 4.582 14.357 4.000 13.499 4.000 12.500 C 4.000 11.665 4.208 11.009 4.559 10.526 C 4.904 10.050 5.442 9.670 6.243 9.470 L 7.000 9.281 L 7.000 6.000 C 7.000 4.895 7.895 4.000 9.000 4.000 ZM 12.000 3.354 C 11.267 2.524 10.195 2.000 9.000 2.000 C 6.791 2.000 5.000 3.791 5.000 6.000 L 5.000 7.774 C 4.149 8.116 3.451 8.648 2.941 9.349 C 2.292 10.241 2.000 11.335 2.000 12.500 C 2.000 14.065 2.796 15.437 4.000 16.242 L 4.000 17.500 C 4.000 19.985 6.015 22.000 8.500 22.000 C 9.914 22.000 11.175 21.348 12.000 20.329 C 12.825 21.348 14.086 22.000 15.500 22.000 C 17.985 22.000 20.000 19.985 20.000 17.500 L 20.000 16.242 C 21.204 15.437 22.000 14.065 22.000 12.500 C 22.000 11.335 21.708 10.241 21.059 9.349 C 20.549 8.648 19.851 8.116 19.000 7.774 L 19.000 6.000 C 19.000 3.791 17.209 2.000 15.000 2.000 C 13.805 2.000 12.733 2.524 12.000 3.354 ZM 18.000 17.149 L 18.000 17.500 C 18.000 18.881 16.881 20.000 15.500 20.000 C 14.119 20.000 13.000 18.881 13.000 17.500 C 13.000 16.167 13.330 15.315 13.860 14.741 C 14.403 14.153 15.284 13.717 16.664 13.486 L 16.336 11.514 C 15.034 11.731 13.894 12.137 13.000 12.827 L 13.000 6.000 C 13.000 4.895 13.895 4.000 15.000 4.000 C 16.105 4.000 17.000 4.895 17.000 6.000 L 17.000 9.281 L 17.757 9.470 C 18.558 9.670 19.096 10.050 19.441 10.526 C 19.792 11.009 20.000 11.665 20.000 12.500 C 20.000 13.499 19.418 14.357 18.571 14.760 C 17.825 15.114 17.079 15.390 16.336 15.514 L 16.664 17.486 C 17.124 17.410 17.570 17.293 18.000 17.149 Z"),
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
        return _brainLine!!
    }

private var _brainLine: ImageVector? = null
